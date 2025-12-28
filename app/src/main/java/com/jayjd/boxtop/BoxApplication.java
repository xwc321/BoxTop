package com.jayjd.boxtop;

import android.content.Context;

import androidx.multidex.MultiDexApplication;

import com.jayjd.boxtop.nanohttpd.ControlManager;
import com.jayjd.boxtop.utils.PurchaseManager;
import com.jayjd.boxtop.utils.VerifyUtils;

public class BoxApplication extends MultiDexApplication {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        VerifyUtils.initVerify(this);
        PurchaseManager.getInstance().init(this);
        ControlManager.init(this);
    }
}
