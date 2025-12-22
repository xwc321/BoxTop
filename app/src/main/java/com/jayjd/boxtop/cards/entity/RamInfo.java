package com.jayjd.boxtop.cards.entity;

public class RamInfo {
    public final long totalMB;
    public final long usedMB;
    public final long availMB;
    public final int usedPercent;

    public RamInfo(long totalMB, long usedMB, long availMB, int usedPercent) {
        this.totalMB = totalMB;
        this.usedMB = usedMB;
        this.availMB = availMB;
        this.usedPercent = usedPercent;
    }
}