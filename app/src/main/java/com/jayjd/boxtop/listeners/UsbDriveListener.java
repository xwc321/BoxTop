package com.jayjd.boxtop.listeners;

import android.net.Uri;

public interface UsbDriveListener {
    void onUsbDriveStateChanged(boolean isConnected, Uri data);

}
