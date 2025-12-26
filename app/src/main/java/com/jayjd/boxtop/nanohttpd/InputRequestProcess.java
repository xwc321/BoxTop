package com.jayjd.boxtop.nanohttpd;


import android.util.Log;

import com.jayjd.boxtop.nanohttpd.interfas.DataReceiver;
import com.jayjd.boxtop.nanohttpd.interfas.RequestProcess;

import java.util.Map;

import fi.iki.elonen.NanoHTTPD;

/**
 * @author pj567
 * @date :2021/1/5
 * @description: 响应按键和输入
 */

public class InputRequestProcess implements RequestProcess {
    private final RemoteServer remoteServer;
    private final String TAG = InputRequestProcess.class.getSimpleName();

    public InputRequestProcess(RemoteServer remoteServer) {
        this.remoteServer = remoteServer;
    }

    @Override
    public boolean isRequest(NanoHTTPD.IHTTPSession session, String fileName) {
        if (session.getMethod() == NanoHTTPD.Method.POST) {
            return fileName.equals("/api/push/wallpaper") || fileName.equals("/api/push/app");
        } else if (session.getMethod() == NanoHTTPD.Method.GET) {
            return fileName.equals("/api/getDeviceId");
        }
        return false;
    }

    @Override
    public NanoHTTPD.Response doResponse(NanoHTTPD.IHTTPSession session, String uri, Map<String, String> params, Map<String, String> files) {
        DataReceiver mDataReceiver = remoteServer.getDataReceiver();
        if (session.getMethod() == NanoHTTPD.Method.POST) {
            String type = params.get("type");      // apk / wallpaper
            String source = params.get("source");  // local / url
            String url = params.get("url");  // local / url
            Log.d(TAG, "doResponse: " + uri + " - " + type + " - " + source);
            try {
                if ("apk".equals(type)) {
                    if ("local".equals(source)) {
                        mDataReceiver.onLocalInstallApk(params.get("localPath"));
                    } else {
                        mDataReceiver.onDownloadApk(type, url);
                    }
                } else {
                    if ("local".equals(source)) {
                        mDataReceiver.onLocalWallpaper(params.get("localPath"));
                    } else {
                        mDataReceiver.onDownloadWallpaper(type, url);
                    }
                }
                return RemoteServer.createPlainTextResponse(NanoHTTPD.Response.Status.OK, "推送成功");
            } catch (Exception e) {
                return RemoteServer.createPlainTextResponse(NanoHTTPD.Response.Status.INTERNAL_ERROR, e.getMessage());
            }
        } else if (session.getMethod() == NanoHTTPD.Method.GET) {
            if (uri.equals("/api/getDeviceId")) {
                String deviceId = mDataReceiver.getDeviceId();
                Log.d(TAG, "doResponse: " + deviceId);
                return RemoteServer.createPlainTextResponse(NanoHTTPD.Response.Status.OK, deviceId);
            } else {
                return RemoteServer.createPlainTextResponse(NanoHTTPD.Response.Status.NOT_FOUND, "404");
            }
        } else {
            return RemoteServer.createPlainTextResponse(NanoHTTPD.Response.Status.NOT_FOUND, "404");
        }

    }
}
