package com.jayjd.boxtop.utils.cpu;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CpuMonitor {
    
    private static final Map<String, CoreStats> previousCoreStatsMap = new HashMap<>();
    private static CpuMonitor instance;
    // 存储上一次的数据
    private static CpuStats previousSystemStats = null;
    private static AppCpuStats previousAppStats = null;
    private Context context;
    private CpuUsageListener listener;
    private Timer timer;
    private Handler mainHandler;
    private boolean isMonitoring = false;
    private ScheduledExecutorService executor;
    
    private CpuMonitor(Context context) {
        this.context = context.getApplicationContext();
        this.mainHandler = new Handler(Looper.getMainLooper());
    }
    
    public static synchronized CpuMonitor getInstance(Context context) {
        if (instance == null) {
            instance = new CpuMonitor(context);
        }
        return instance;
    }
    
    /**
     * 开始监控CPU使用率
     * @param intervalMs 监控间隔（毫秒）
     * @param listener 监控回调
     */
    public void startMonitoring(int intervalMs, CpuUsageListener listener) {
        if (isMonitoring) {
            stopMonitoring();
        }

        this.listener = listener;
        this.isMonitoring = true;

        // 使用ScheduledExecutorService替代Timer
        executor = Executors.newSingleThreadScheduledExecutor();
        executor.scheduleAtFixedRate(() -> {
            if (isMonitoring) {
                updateCpuUsage();
            }
        }, 0, intervalMs, TimeUnit.MILLISECONDS);

        Log.d("CpuMonitor", "CPU监控已启动，间隔：" + intervalMs + "ms");
    }
    
    /**
     * 停止监控
     */
    public void stopMonitoring() {
        isMonitoring = false;
        if (executor != null) {
            executor.shutdown();
            executor = null;
        }
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
        Log.d("CpuMonitor", "CPU监控已停止");
    }
    
    /**
     * 更新CPU使用率
     */
    private void updateCpuUsage() {
        try {
            CpuInfo cpuInfo = new CpuInfo();

            // 获取系统CPU使用率
            cpuInfo.systemCpuUsage = getSystemCpuUsage();

            // 获取应用CPU使用率
            cpuInfo.appCpuUsage = getAppCpuUsage();

            // 获取每个核心的使用率
            cpuInfo.perCoreUsage = getPerCoreCpuUsage();

            // 获取CPU核心数
            cpuInfo.cpuCores = Runtime.getRuntime().availableProcessors();

            // 获取CPU型号
            cpuInfo.cpuModel = getCpuModel();

            // 获取CPU频率
            cpuInfo.cpuFrequencies = getCpuFrequencies();

            // 获取内存信息
            getMemoryInfo(cpuInfo);

            cpuInfo.timestamp = System.currentTimeMillis();

            // 回调到主线程
            if (listener != null) {
                mainHandler.post(() -> {
                    listener.onSystemCpuUsage(cpuInfo.systemCpuUsage);
                    listener.onAppCpuUsage(cpuInfo.appCpuUsage);
                    listener.onPerCoreCpuUsage(cpuInfo.perCoreUsage);
                });
            }

        } catch (Exception e) {
            Log.e("CpuMonitor", "更新CPU使用率失败", e);
        }
    }
    
    /**
     * 获取系统总CPU使用率
     */
    private float getSystemCpuUsage() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/proc/stat"));
            String line = reader.readLine();
            reader.close();

            if (line != null && line.startsWith("cpu ")) {
                String[] parts = line.split("\\s+");

                long user = Long.parseLong(parts[1]);
                long nice = Long.parseLong(parts[2]);
                long system = Long.parseLong(parts[3]);
                long idle = Long.parseLong(parts[4]);
                long iowait = Long.parseLong(parts[5]);
                long irq = Long.parseLong(parts[6]);
                long softirq = Long.parseLong(parts[7]);
                long steal = parts.length > 8 ? Long.parseLong(parts[8]) : 0;

                long totalIdle = idle + iowait;
                long totalNonIdle = user + nice + system + irq + softirq + steal;
                long total = totalIdle + totalNonIdle;

                // 获取上一次的数据
                CpuStats previous = getPreviousSystemStats();

                // 保存当前数据
                saveSystemStats(totalIdle, total);

                if (previous != null && total > previous.total) {
                    long totalDiff = total - previous.total;
                    long idleDiff = totalIdle - previous.idle;

                    if (totalDiff > 0) {
                        float cpuUsage = 100.0f * (totalDiff - idleDiff) / totalDiff;
                        return Math.min(100, Math.max(0, cpuUsage));
                    }
                }
            }
        } catch (Exception e) {
            Log.e("CpuMonitor", "获取系统CPU使用率失败", e);
        }
        return 0f;
    }
    
    /**
     * 获取应用CPU使用率
     */
    private float getAppCpuUsage() {
        int pid = Process.myPid();
        try {
            BufferedReader reader = new BufferedReader(
                new FileReader("/proc/" + pid + "/stat")
            );
            String line = reader.readLine();
            reader.close();

            if (line != null) {
                String[] parts = line.split("\\s+");

                long utime = Long.parseLong(parts[13]);
                long stime = Long.parseLong(parts[14]);
                long cutime = Long.parseLong(parts[15]);
                long cstime = Long.parseLong(parts[16]);

                long processCpuTime = utime + stime + cutime + cstime;
                long systemCpuTime = getSystemTotalCpuTime();

                // 获取上一次的数据
                AppCpuStats previous = getPreviousAppStats(pid);

                // 保存当前数据
                saveAppStats(pid, processCpuTime, systemCpuTime);

                if (previous != null && systemCpuTime > previous.systemCpuTime) {
                    long processDiff = processCpuTime - previous.processCpuTime;
                    long systemDiff = systemCpuTime - previous.systemCpuTime;

                    if (systemDiff > 0) {
                        int cpuCores = Runtime.getRuntime().availableProcessors();
                        float cpuUsage = 100.0f * processDiff / systemDiff * cpuCores;
                        return Math.min(100, Math.max(0, cpuUsage));
                    }
                }
            }
        } catch (Exception e) {
            Log.e("CpuMonitor", "获取应用CPU使用率失败", e);
        }
        return 0f;
    }
    
    /**
     * 获取系统总CPU时间
     */
    private long getSystemTotalCpuTime() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/proc/stat"));
            String line = reader.readLine();
            reader.close();

            if (line != null && line.startsWith("cpu ")) {
                String[] parts = line.split("\\s+");
                long total = 0;
                for (int i = 1; i < parts.length; i++) {
                    total += Long.parseLong(parts[i]);
                }
                return total;
            }
        } catch (Exception e) {
            Log.e("CpuMonitor", "获取系统总CPU时间失败", e);
        }
        return 0;
    }
    
    /**
     * 获取每个CPU核心的使用率
     */
    private List<Float> getPerCoreCpuUsage() {
        List<Float> usages = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/proc/stat"));
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("cpu") && !line.startsWith("cpu ")) {
                    String[] parts = line.split("\\s+");
                    if (parts.length >= 8) {
                        long user = Long.parseLong(parts[1]);
                        long nice = Long.parseLong(parts[2]);
                        long system = Long.parseLong(parts[3]);
                        long idle = Long.parseLong(parts[4]);
                        long iowait = Long.parseLong(parts[5]);
                        long irq = Long.parseLong(parts[6]);
                        long softirq = Long.parseLong(parts[7]);

                        long totalIdle = idle + iowait;
                        long totalNonIdle = user + nice + system + irq + softirq;
                        long total = totalIdle + totalNonIdle;

                        // 获取上一次的数据
                        CoreStats previous = getPreviousCoreStats(line.substring(0, 4));

                        // 保存当前数据
                        saveCoreStats(line.substring(0, 4), totalIdle, total);

                        if (previous != null && total > previous.total) {
                            long totalDiff = total - previous.total;
                            long idleDiff = totalIdle - previous.idle;

                            if (totalDiff > 0) {
                                float cpuUsage = 100.0f * (totalDiff - idleDiff) / totalDiff;
                                usages.add(Math.min(100, Math.max(0, cpuUsage)));
                            } else {
                                usages.add(0f);
                            }
                        } else {
                            usages.add(0f);
                        }
                    }
                }
            }
            reader.close();
        } catch (Exception e) {
            Log.e("CpuMonitor", "获取核心CPU使用率失败", e);
        }
        return usages;
    }
    
    /**
     * 获取CPU型号
     */
    private String getCpuModel() {
        try {
            BufferedReader reader = new BufferedReader(
                new FileReader("/proc/cpuinfo")
            );
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Hardware") || line.startsWith("model name")) {
                    String[] parts = line.split(":");
                    if (parts.length > 1) {
                        reader.close();
                        return parts[1].trim();
                    }
                }
            }
            reader.close();
        } catch (Exception e) {
            Log.e("CpuMonitor", "获取CPU型号失败", e);
        }
        return "Unknown";
    }
    
    /**
     * 获取CPU频率
     */
    private long[] getCpuFrequencies() {
        int cores = Runtime.getRuntime().availableProcessors();
        long[] frequencies = new long[cores];

        for (int i = 0; i < cores; i++) {
            try {
                String path = "/sys/devices/system/cpu/cpu" + i + "/cpufreq/scaling_cur_freq";
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String line = reader.readLine();
                reader.close();

                if (line != null) {
                    frequencies[i] = Long.parseLong(line.trim()) / 1000; // 转换为MHz
                }
            } catch (Exception e) {
                frequencies[i] = 0;
            }
        }
        return frequencies;
    }
    
    /**
     * 获取内存信息
     */
    @SuppressLint("NewApi")
    private void getMemoryInfo(CpuInfo cpuInfo) {
        try {
            ActivityManager am = (ActivityManager)
                context.getSystemService(Context.ACTIVITY_SERVICE);
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            am.getMemoryInfo(memoryInfo);

            cpuInfo.totalMemory = memoryInfo.totalMem;
            cpuInfo.usedMemory = memoryInfo.totalMem - memoryInfo.availMem;

        } catch (Exception e) {
            Log.e("CpuMonitor", "获取内存信息失败", e);
        }
    }
    
    private synchronized CpuStats getPreviousSystemStats() {
        return previousSystemStats;
    }
    
    private synchronized void saveSystemStats(long idle, long total) {
        previousSystemStats = new CpuStats();
        previousSystemStats.idle = idle;
        previousSystemStats.total = total;
    }
    
    private synchronized AppCpuStats getPreviousAppStats(int pid) {
        if (previousAppStats != null && previousAppStats.pid == pid) {
            return previousAppStats;
        }
        return null;
    }

    private synchronized void saveAppStats(int pid, long processCpuTime, long systemCpuTime) {
        previousAppStats = new AppCpuStats();
        previousAppStats.pid = pid;
        previousAppStats.processCpuTime = processCpuTime;
        previousAppStats.systemCpuTime = systemCpuTime;
    }

    private synchronized CoreStats getPreviousCoreStats(String coreName) {
        return previousCoreStatsMap.get(coreName);
    }
    
    private synchronized void saveCoreStats(String coreName, long idle, long total) {
        CoreStats stats = new CoreStats();
        stats.coreName = coreName;
        stats.idle = idle;
        stats.total = total;
        previousCoreStatsMap.put(coreName, stats);
    }
    
    /**
     * 获取一次性的CPU信息
     */
    public CpuInfo getCpuInfo() {
        CpuInfo cpuInfo = new CpuInfo();

        cpuInfo.systemCpuUsage = getSystemCpuUsage();
        cpuInfo.appCpuUsage = getAppCpuUsage();
        cpuInfo.perCoreUsage = getPerCoreCpuUsage();
        cpuInfo.cpuCores = Runtime.getRuntime().availableProcessors();
        cpuInfo.cpuModel = getCpuModel();
        cpuInfo.cpuFrequencies = getCpuFrequencies();
        getMemoryInfo(cpuInfo);
        cpuInfo.timestamp = System.currentTimeMillis();

        return cpuInfo;
    }
    
    /**
     * 清理资源
     */
    public void release() {
        stopMonitoring();
        instance = null;
    }
    
    public interface CpuUsageListener {
        void onSystemCpuUsage(float usage);
        void onAppCpuUsage(float usage);
        void onPerCoreCpuUsage(List<Float> usages);
    }
    
    // CPU信息数据结构
    public static class CpuInfo {
        public float systemCpuUsage;      // 系统总CPU使用率
        public float appCpuUsage;         // 应用CPU使用率
        public List<Float> perCoreUsage;  // 每个核心使用率
        public int cpuCores;              // CPU核心数
        public String cpuModel;           // CPU型号
        public long[] cpuFrequencies;     // 每个核心的频率
        public long totalMemory;          // 总内存
        public long usedMemory;           // 已用内存
        public long timestamp;            // 时间戳

        @Override
        public String toString() {
            return String.format(
                "CPU信息: 系统使用率=%.1f%%, 应用使用率=%.1f%%, 核心数=%d, 时间=%d",
                systemCpuUsage, appCpuUsage, cpuCores, timestamp
            );
        }
    }
    
    // 数据存储类
    private static class CpuStats {
        long idle;
        long total;
    }
    
    private static class AppCpuStats {
        int pid;
        long processCpuTime;
        long systemCpuTime;
    }
    
    private static class CoreStats {
        String coreName;
        long idle;
        long total;
    }
}