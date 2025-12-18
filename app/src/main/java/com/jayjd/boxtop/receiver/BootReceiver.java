package com.jayjd.boxtop.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.jayjd.boxtop.listeners.PackageInfoCallback;

import lombok.Setter;

public class BootReceiver extends BroadcastReceiver {
    @Setter
    private static PackageInfoCallback callback;

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getData() == null) return;
        String pkg = intent.getData().getSchemeSpecificPart();
        String action = intent.getAction();

        if (Intent.ACTION_PACKAGE_ADDED.equals(action)) {
            if (!intent.getBooleanExtra(Intent.EXTRA_REPLACING, false)) {
                if (callback != null) callback.onInstalled(pkg);
            }

        } else if (Intent.ACTION_PACKAGE_REMOVED.equals(action)) {
            if (!intent.getBooleanExtra(Intent.EXTRA_REPLACING, false)) {
                if (callback != null) callback.onUninstalled(pkg);
            }

        } else if (Intent.ACTION_PACKAGE_REPLACED.equals(action)) {
            if (callback != null) callback.onUpdated(pkg);
        }
    }


}
