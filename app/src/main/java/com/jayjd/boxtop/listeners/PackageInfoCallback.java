package com.jayjd.boxtop.listeners;

public interface PackageInfoCallback {
    void onInstalled(String pkg);

    void onUninstalled(String pkg);

    void onUpdated(String pkg);
}
