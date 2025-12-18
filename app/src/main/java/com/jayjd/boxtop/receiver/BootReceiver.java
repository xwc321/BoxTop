package com.jayjd.boxtop.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (Intent.ACTION_MEDIA_MOUNTED.equals(action)) {
            // U盘插入
            showUsbIcon(true);
        } else if (Intent.ACTION_MEDIA_UNMOUNTED.equals(action) || Intent.ACTION_MEDIA_REMOVED.equals(action) || Intent.ACTION_MEDIA_EJECT.equals(action)) {
            // U盘拔出
            showUsbIcon(false);
        }
    }

    private void showUsbIcon(boolean show) {
        // 显示或隐藏U盘图标
    }
}
