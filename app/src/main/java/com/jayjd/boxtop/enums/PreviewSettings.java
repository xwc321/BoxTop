package com.jayjd.boxtop.enums;

import lombok.Getter;

@Getter
public enum PreviewSettings {
    START("启动软件"),
    VIEW("查看信息"),
    MOVE("移动软件"),
    DELETE("删除软件"),
    UNINSTALL("卸载软件");
    private final String displayName;

    PreviewSettings(String displayName) {
        this.displayName = displayName;
    }

    public static PreviewSettings[] getFavoriteSettings() {
        return new PreviewSettings[]{START, VIEW, MOVE, DELETE, UNINSTALL};
    }

    public static PreviewSettings[] getAllAppsSettings() {
        return new PreviewSettings[]{START, VIEW, UNINSTALL};
    }


}
