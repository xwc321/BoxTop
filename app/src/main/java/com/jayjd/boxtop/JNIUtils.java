package com.jayjd.boxtop;

import android.content.Context;

public class JNIUtils {
    public static native void initVerify(Context activity);

    public static native String getDecodePwd();
}
