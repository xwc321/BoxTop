package com.jayjd.boxtop.listeners;

import android.content.Context;

public interface UsbDriveListener {
    void onUsbDriveStateChanged(boolean isConnected);

    void onBluetoothStateChanged(boolean isConnected);

    void onInstalled(Context context, String pkg);

    void onUninstalled(Context context, String pkg);

    void onUpdated(Context context, String pkg);
}
