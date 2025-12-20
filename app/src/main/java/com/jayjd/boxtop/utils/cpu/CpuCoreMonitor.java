package com.jayjd.boxtop.utils.cpu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CpuCoreMonitor {
    
    private static final java.util.Map<String, CoreCpuStats> coreStatsMap =
        new java.util.HashMap<>();
    
    /**
     * 获取CPU核心数量
     */
    public static int getCpuCoreCount() {
        // 方法1：通过Runtime
        int cores = Runtime.getRuntime().availableProcessors();

        // 方法2：读取/sys/devices/system/cpu/
        if (cores <= 0) {
            cores = getCpuCoreCountFromSys();
        }

        return Math.max(1, cores);
    }
    
    private static int getCpuCoreCountFromSys() {
        int count = 0;
        try {
            // 读取CPU核心文件
            for (int i = 0; i < 100; i++) {  // 假设最多100个核心
                String path = "/sys/devices/system/cpu/cpu" + i;
                if (new java.io.File(path).exists()) {
                    count++;
                } else {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Math.max(1, count);
    }
    
    /**
     * 获取每个CPU核心的使用率
     * @return 每个核心的使用率列表，0-100
     */
    public static List<Float> getPerCoreCpuUsage() {
        List<Float> coreUsages = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("/proc/stat"));
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("cpu") && !line.startsWith("cpu ")) {
                    // 解析每个CPU核心的数据
                    String[] parts = line.split("\\s+");
                    if (parts.length >= 8) {
                        long user = Long.parseLong(parts[1]);
                        long nice = Long.parseLong(parts[2]);
                        long system = Long.parseLong(parts[3]);
                        long idle = Long.parseLong(parts[4]);
                        long iowait = Long.parseLong(parts[5]);
                        long irq = Long.parseLong(parts[6]);
                        long softirq = Long.parseLong(parts[7]);
                        long steal = parts.length > 8 ? Long.parseLong(parts[8]) : 0;
                        long guest = parts.length > 9 ? Long.parseLong(parts[9]) : 0;
                        long guestNice = parts.length > 10 ? Long.parseLong(parts[10]) : 0;

                        long totalIdle = idle + iowait;
                        long totalNonIdle = user + nice + system + irq + softirq + steal;
                        long total = totalIdle + totalNonIdle;

                        // 获取上一次的数据
                        CoreCpuStats previous = getPreviousCoreStats(line.substring(0, 4));

                        // 保存当前数据
                        saveCoreStats(line.substring(0, 4), totalIdle, total);

                        if (previous != null && total > previous.total) {
                            long totalDiff = total - previous.total;
                            long idleDiff = totalIdle - previous.idle;

                            if (totalDiff > 0) {
                                float cpuUsage = 100.0f * (totalDiff - idleDiff) / totalDiff;
                                coreUsages.add(Math.min(100, Math.max(0, cpuUsage)));
                            }
                        } else {
                            coreUsages.add(0f);
                        }
                    }
                }
            }
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return coreUsages;
    }
    
    private static synchronized CoreCpuStats getPreviousCoreStats(String coreName) {
        return coreStatsMap.get(coreName);
    }
    
    private static synchronized void saveCoreStats(String coreName, long idle, long total) {
        coreStatsMap.put(coreName, new CoreCpuStats(coreName, idle, total));
    }
    
    private static class CoreCpuStats {
        String coreName;
        long idle;
        long total;

        CoreCpuStats(String coreName, long idle, long total) {
            this.coreName = coreName;
            this.idle = idle;
            this.total = total;
        }
    }
}