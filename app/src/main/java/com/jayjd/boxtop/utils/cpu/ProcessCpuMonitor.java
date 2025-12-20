package com.jayjd.boxtop.utils.cpu;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;

import java.io.BufferedReader;
import java.io.FileReader;

public class ProcessCpuMonitor {
    
    /**
     * 获取当前应用进程的CPU使用率
     * @param context 上下文
     * @return CPU使用率百分比
     */
//    public static float getAppCpuUsage(Context context) {
//        int pid = Process.myPid();
//        return getProcessCpuUsage(context, pid);
//    }
    
    private static ProcessCpuStats previousProcessStats = null;
    
    /**
     * 获取指定进程的CPU使用率
     * @param context 上下文
     * @param pid 进程ID
     * @return CPU使用率百分比
     */
    public static float getProcessCpuUsage(Context context, int pid) {
        try {
            // 方法1：通过/proc/[pid]/stat读取
            float cpuFromProc = getProcessCpuFromProcStat(pid);
            if (cpuFromProc >= 0) {
                return cpuFromProc;
            }

            // 方法2：通过ActivityManager获取
            return getProcessCpuFromActivityManager(context, pid);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0f;
    }
    
    /**
     * 通过/proc/[pid]/stat文件获取进程CPU
     */
    private static float getProcessCpuFromProcStat(int pid) {
        try {
            BufferedReader reader = new BufferedReader(
                new FileReader("/proc/" + pid + "/stat")
            );
            String line = reader.readLine();
            reader.close();

            if (line != null) {
                String[] parts = line.split("\\s+");

                // 第14-17个字段是CPU时间
                long utime = Long.parseLong(parts[13]);  // 用户态时间
                long stime = Long.parseLong(parts[14]);  // 内核态时间
                long cutime = Long.parseLong(parts[15]); // 子进程用户态时间
                long cstime = Long.parseLong(parts[16]); // 子进程内核态时间

                long processCpuTime = utime + stime + cutime + cstime;

                // 获取系统总CPU时间
                long systemCpuTime = getSystemCpuTime();

                // 保存上一次的值
                ProcessCpuStats previous = getPreviousProcessStats(pid);

                // 保存当前值
                saveProcessStats(pid, processCpuTime, systemCpuTime);

                if (previous != null && systemCpuTime > previous.systemCpuTime) {
                    long processDiff = processCpuTime - previous.processCpuTime;
                    long systemDiff = systemCpuTime - previous.systemCpuTime;

                    if (systemDiff > 0) {
                        // 获取CPU核心数
                        int cpuCores = Runtime.getRuntime().availableProcessors();
                        float cpuUsage = 100.0f * processDiff / systemDiff * cpuCores;
                        return Math.min(100, Math.max(0, cpuUsage));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    /**
     * 获取系统总CPU时间
     */
    private static long getSystemCpuTime() {
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
            e.printStackTrace();
        }
        return 0;
    }
    
    private static synchronized ProcessCpuStats getPreviousProcessStats(int pid) {
        if (previousProcessStats != null && previousProcessStats.pid == pid) {
            return previousProcessStats;
        }
        return null;
    }
    
    private static synchronized void saveProcessStats(int pid, long processCpuTime, long systemCpuTime) {
        previousProcessStats = new ProcessCpuStats(pid, processCpuTime, systemCpuTime);
    }
    
    /**
     * 通过ActivityManager获取进程CPU
     */
    private static float getProcessCpuFromActivityManager(Context context, int pid) {
        try {
            ActivityManager am = (ActivityManager)
                context.getSystemService(Context.ACTIVITY_SERVICE);

            // 获取所有运行进程的信息
            String packageName = context.getPackageName();
            Debug.MemoryInfo[] memoryInfo = am.getProcessMemoryInfo(new int[]{pid});

            if (memoryInfo != null && memoryInfo.length > 0) {
                // 注意：这个方法在不同Android版本上可能返回不同的值
                // 通常需要自己计算
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0f;
    }
    
    private static class ProcessCpuStats {
        int pid;
        long processCpuTime;
        long systemCpuTime;

        ProcessCpuStats(int pid, long processCpuTime, long systemCpuTime) {
            this.pid = pid;
            this.processCpuTime = processCpuTime;
            this.systemCpuTime = systemCpuTime;
        }
    }
}