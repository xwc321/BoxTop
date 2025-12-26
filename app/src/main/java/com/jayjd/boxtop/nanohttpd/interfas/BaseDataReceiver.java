package com.jayjd.boxtop.nanohttpd.interfas;

import android.content.Context;

import com.jayjd.boxtop.utils.SPUtils;

public class BaseDataReceiver implements DataReceiver {
    @Override
    public void onDownloadApk(String type, String url) {

    }

    @Override
    public void onDownloadWallpaper(String type, String url) {

    }

    @Override
    public void onLocalInstallApk(String absoluteFile) {

    }

    @Override
    public void onLocalWallpaper(String absolutePath) {

    }

    @Override
    public String getDeviceId(Context context) {
        return (String) SPUtils.get(context, "deviceId", "");
    }
}
