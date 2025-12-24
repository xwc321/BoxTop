package com.jayjd.boxtop;

import android.app.Application;

import com.jayjd.boxtop.utils.PurchaseManager;

public class BoxApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        PurchaseManager.getInstance().init(this);
    }
}
