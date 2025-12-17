package com.jayjd.boxtop.enums;

public enum PreviewSettings {
    START("启动"),
    VIEW("查看"),
    MOVE("移动"),
    DELETE("删除"),
    UNINSTALL("卸载");
    private final String displayName;

    PreviewSettings(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
