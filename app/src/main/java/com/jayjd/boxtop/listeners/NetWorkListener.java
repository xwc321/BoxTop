package com.jayjd.boxtop.listeners;

import android.content.Context;

public interface NetWorkListener {
    void onNetworkTypeChanged(Context context, int networkType);

    void onNetworkLost(Context context);

}
