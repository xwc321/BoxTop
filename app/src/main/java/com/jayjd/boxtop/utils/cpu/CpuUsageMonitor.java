package com.jayjd.boxtop.utils.cpu;

import android.util.Log;

import java.io.BufferedReader;
import java.io.FileReader;

public class CpuUsageMonitor {
    
    private static CpuStats previousCpuStats = null;
    
    /**
     * 获取系统总CPU使用率
     * @return CPU使用率百分比，0-100
     */
    public static float getSystemCpuUsage() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/proc/stat"));
            String line = reader.readLine();
            reader.close();

            if (line != null && line.startsWith("cpu ")) {
                String[] parts = line.split("\\s+");

                // CPU时间计算
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

                // 计算总时间和空闲时间
                long totalIdle = idle + iowait;
                long totalNonIdle = user + nice + system + irq + softirq + steal;
                long total = totalIdle + totalNonIdle;

                // 读取上一次的值
                CpuStats previousStats = getPreviousCpuStats();

                // 保存当前值
                saveCurrentCpuStats(totalIdle, total);

                if (previousStats != null) {
                    long totalDiff = total - previousStats.total;
                    long idleDiff = totalIdle - previousStats.idle;

                    if (totalDiff > 0) {
                        float cpuUsage = 100.0f * (totalDiff - idleDiff) / totalDiff;
                        return Math.min(100, Math.max(0, cpuUsage));
                    }
                }
            }
        } catch (Exception e) {
            Log.e("CpuUsageMonitor", "获取系统CPU使用率失败", e);
        }
        return 0f;
    }
    
    private static synchronized CpuStats getPreviousCpuStats() {
        return previousCpuStats;
    }
    
    private static synchronized void saveCurrentCpuStats(long idle, long total) {
        previousCpuStats = new CpuStats(idle, total);
    }
    
    private static class CpuStats {
        long idle;
        long total;

        CpuStats(long idle, long total) {
            this.idle = idle;
            this.total = total;
        }
    }
}