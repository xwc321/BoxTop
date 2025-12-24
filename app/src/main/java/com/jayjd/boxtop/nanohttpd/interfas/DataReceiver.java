package com.jayjd.boxtop.nanohttpd.interfas;

import android.content.Context;

public interface DataReceiver {
    void onDownloadApk(String url);

    void onDownloadWallpaper(Context context, String url);

    void onInstallApk(Context context, String absoluteFile, String tmpFileItem);

    void onSetWallpaper(Context context, String absolutePath);
}