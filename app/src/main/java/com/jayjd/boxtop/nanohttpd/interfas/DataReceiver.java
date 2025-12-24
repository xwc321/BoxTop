package com.jayjd.boxtop.nanohttpd.interfas;

public interface DataReceiver {
    void onDownloadApk(String url);

    void onDownloadWallpaper(String url);

    void onLocalInstallApk(String absoluteFile);

    void onLocalWallpaper(String absolutePath);
}