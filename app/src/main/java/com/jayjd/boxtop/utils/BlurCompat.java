package com.jayjd.boxtop.utils;

import android.graphics.Color;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class BlurCompat {

    /**
     * 给 ImageView 设置毛玻璃效果
     *
     * @param imageView        目标 ImageView
     * @param allAppsContainer 原图 LinearLayout
     * @param radius           高版本毛玻璃半径，低版本无效
     */
    public static void setBlur(ImageView imageView, LinearLayout allAppsContainer, float radius) {
        if (imageView == null || allAppsContainer == null) return;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            // Android 12+：GPU RenderEffect
            RenderEffect blurEffect = RenderEffect.createBlurEffect(
                    radius, radius, Shader.TileMode.CLAMP
            );
            imageView.setRenderEffect(blurEffect);
            allAppsContainer.setBackgroundColor(Color.argb(0, 255, 255, 255));
        }
    }

    /**
     * 取消毛玻璃效果，恢复原图
     *
     * @param imageView 目标 ImageView
     */
    public static void cancelBlur(ImageView imageView) {
        if (imageView == null) return;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            imageView.setRenderEffect(null);
        }
    }
}
