package com.jayjd.boxtop.enums;

public enum AppType {
    VIDEO("视频"),
    GAME("游戏"),
    MUSIC("音乐"),
    LIVE("直播"),
    TOOL("工具"),
    SYSTEM("系统"),
    KIDS("儿童"),
    EDUCATION("教育"),
    SOCIAL("社交"),
    UNKNOWN("未知");

    private final String displayName;

    AppType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
