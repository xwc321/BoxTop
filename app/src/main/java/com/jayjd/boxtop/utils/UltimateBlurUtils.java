package com.jayjd.boxtop.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;

import jp.wasabeef.blurry.Blurry;

public class UltimateBlurUtils {

    // 添加常量
    private static final int NO_BLUR = 0;
    private static final String BLUR_TYPE_NATIVE = "native";
    private static final String BLUR_TYPE_RENDERSCRIPT = "renderscript";
    private static final String BLUR_TYPE_THIRDPARTY = "thirdparty";
    private static final String BLUR_TYPE_FALLBACK = "fallback";

    // 记录当前模糊状态
    private static String currentBlurType = "";
    private static float currentBlurRadius = 0f;
    private static int currentOverlayColor = 0;
    private static Bitmap originalBackgroundBitmap = null;
    private static int originalBackgroundColor = 0;
    private static Object originalBackgroundDrawable = null;

    /**
     * 终极兼容方案，结合多种实现
     */
    public static void applyUltimateBlur(ImageView view, float radius, int overlayColor) {
        if (view == null) return;

        // 保存原始背景状态
        saveOriginalBackground(view);

        // 记录当前参数
        currentBlurRadius = radius;
        currentOverlayColor = overlayColor;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            // Android 12+ 原生实现
            currentBlurType = BLUR_TYPE_NATIVE;
            applyNativeBlur(view, radius, overlayColor);
        } else if (hasRenderScript()) {
            // 有RenderScript支持
            currentBlurType = BLUR_TYPE_RENDERSCRIPT;
            applyRenderScriptBlur(view, radius, overlayColor);
        } else if (hasThirdPartyLib()) {
            // 使用第三方库
            currentBlurType = BLUR_TYPE_THIRDPARTY;
            applyThirdPartyBlur(view, radius, overlayColor);
        } else {
            // 降级方案
            currentBlurType = BLUR_TYPE_FALLBACK;
            applyFallbackBlur(view, radius, overlayColor);
        }
    }

    /**
     * 保存原始背景状态
     */
    private static void saveOriginalBackground(View view) {
        if (view == null) return;

        // 保存背景颜色
        originalBackgroundColor = 0; // 这里可以扩展获取实际背景色

        // 保存背景Drawable
        originalBackgroundDrawable = view.getBackground();

        // 保存背景Bitmap（如果有）
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            originalBackgroundBitmap = getViewBitmap(view);
        }
    }

    /**
     * 取消模糊效果 - 通用方法
     */
    public static void removeUltimateBlur(View view) {
        if (view == null) return;

        // 根据当前的模糊类型使用对应的清除方法
        switch (currentBlurType) {
            case BLUR_TYPE_NATIVE:
                removeNativeBlur(view);
                break;
            case BLUR_TYPE_RENDERSCRIPT:
                removeRenderScriptBlur(view);
                break;
            case BLUR_TYPE_THIRDPARTY:
                removeThirdPartyBlur(view);
                break;
            case BLUR_TYPE_FALLBACK:
                removeFallbackBlur(view);
                break;
            default:
                // 通用清除
                clearBlurEffects(view);
                break;
        }

        // 恢复原始背景
        restoreOriginalBackground(view);

        // 重置状态
        resetBlurState();
    }

    /**
     * 清除原生模糊效果 (Android 12+)
     */
    @RequiresApi(api = Build.VERSION_CODES.S)
    private static void removeNativeBlur(View view) {
        try {
            // 1. 清除RenderEffect
            view.setRenderEffect(null);

            // 2. 清除背景色
            if (currentOverlayColor != 0) {
                view.setBackgroundColor(Color.TRANSPARENT);
            }

            // 3. 清理硬件层
            view.setLayerType(View.LAYER_TYPE_NONE, null);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 清除RenderScript模糊效果
     */
    private static void removeRenderScriptBlur(View view) {
        try {
            // 1. 清除背景
            view.setBackground(null);

            // 2. 清除缓存
            clearBitmapCache();

            // 3. 重置背景
            view.setBackgroundColor(Color.TRANSPARENT);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 清除第三方库模糊效果
     */
    private static void removeThirdPartyBlur(View view) {
        try {
            // 这里可以根据实际使用的第三方库来清除
            // 例如如果是Blurry库：
            // if (currentBlurType.equals(BLUR_TYPE_THIRDPARTY)) {
            //     Blurry.delete((ViewGroup) view.getParent());
            // }

            // 通用清除
            clearBlurEffects(view);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 清除降级方案的模糊效果
     */
    private static void removeFallbackBlur(View view) {
        try {
            // 1. 清除背景色
            view.setBackgroundColor(Color.TRANSPARENT);

            // 2. 清除阴影效果
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                view.setElevation(0f);
                view.setTranslationZ(0f);
            }

            // 3. 清除可能的View状态
            view.invalidate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 通用清除方法
     */
    private static void clearBlurEffects(View view) {
        if (view == null) return;

        try {
            // 1. 清除Android 12+的RenderEffect
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                view.setRenderEffect(null);
            }

            // 2. 清除背景
            view.setBackground(null);

            // 3. 清除背景色
            view.setBackgroundColor(Color.TRANSPARENT);

            // 4. 清除硬件层
            view.setLayerType(View.LAYER_TYPE_NONE, null);

            // 5. 清除阴影效果
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                view.setElevation(0f);
                view.setTranslationZ(0f);
            }

            // 6. 清除动画
            view.clearAnimation();

            // 7. 清除View状态
            view.refreshDrawableState();

            // 8. 请求重绘
            view.invalidate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 恢复原始背景
     */
    private static void restoreOriginalBackground(View view) {
        if (view == null) return;

        try {
            // 恢复背景Drawable
            if (originalBackgroundDrawable != null) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    view.setBackground((android.graphics.drawable.Drawable) originalBackgroundDrawable);
                }
            }
            // 恢复背景颜色
            else if (originalBackgroundColor != 0) {
                view.setBackgroundColor(originalBackgroundColor);
            }
            // 恢复背景Bitmap
            else if (originalBackgroundBitmap != null && !originalBackgroundBitmap.isRecycled()) {
                view.setBackground(new android.graphics.drawable.BitmapDrawable(
                        view.getResources(), originalBackgroundBitmap
                ));
            }
            // 默认设置为透明
            else {
                view.setBackgroundColor(Color.TRANSPARENT);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 重置模糊状态
     */
    private static void resetBlurState() {
        currentBlurType = "";
        currentBlurRadius = NO_BLUR;
        currentOverlayColor = 0;

        // 清理Bitmap缓存
        clearBitmapCache();
    }

    /**
     * 清理Bitmap缓存
     */
    private static void clearBitmapCache() {
        if (originalBackgroundBitmap != null && !originalBackgroundBitmap.isRecycled()) {
            originalBackgroundBitmap.recycle();
            originalBackgroundBitmap = null;
        }
    }

    /**
     * 取消模糊并设置新的背景
     */
    public static void removeBlurAndSetBackground(View view, android.graphics.drawable.Drawable newBackground) {
        removeUltimateBlur(view);
        if (view != null && newBackground != null) {
            view.setBackground(newBackground);
        }
    }

    /**
     * 取消模糊并设置新的背景颜色
     */
    public static void removeBlurAndSetBackgroundColor(View view, int color) {
        removeUltimateBlur(view);
        if (view != null) {
            view.setBackgroundColor(color);
        }
    }

    /**
     * 取消模糊并设置为透明
     */
    public static void removeBlurAndSetTransparent(ImageView view) {
        removeUltimateBlur(view);
        if (view != null) {
            view.setBackgroundColor(Color.TRANSPARENT);
        }
    }

    /**
     * 判断是否有模糊效果
     */
    public static boolean hasBlurEffect() {
        return currentBlurRadius > NO_BLUR && !currentBlurType.isEmpty();
    }

    /**
     * 获取当前模糊半径
     */
    public static float getCurrentBlurRadius() {
        return currentBlurRadius;
    }

    /**
     * 获取当前模糊类型
     */
    public static String getCurrentBlurType() {
        return currentBlurType;
    }

    /**
     * 暂停模糊效果（临时取消）
     */
    public static void pauseBlurEffect(View view) {
        if (hasBlurEffect()) {
            clearBlurEffects(view);
        }
    }

    /**
     * 恢复模糊效果
     */
    public static void resumeBlurEffect(ImageView view) {
        if (hasBlurEffect() && view != null) {
            applyUltimateBlur(view, currentBlurRadius, currentOverlayColor);
        }
    }

    /**
     * 动态调整模糊强度
     */
    public static void updateBlurRadius(ImageView view, float newRadius) {
        if (view != null && hasBlurEffect()) {
            // 保存当前状态
            int currentColor = currentOverlayColor;
            String currentType = currentBlurType;

            // 应用新的模糊强度
            currentBlurRadius = newRadius;
            applyUltimateBlur(view, newRadius, currentColor);

            // 保持模糊类型
            currentBlurType = currentType;
        }
    }

    /**
     * 动态调整覆盖颜色
     */
    public static void updateOverlayColor(ImageView view, int newColor) {
        if (view != null && hasBlurEffect()) {
            // 保存当前状态
            float currentRadius = currentBlurRadius;
            String currentType = currentBlurType;

            // 应用新的颜色
            currentOverlayColor = newColor;
            applyUltimateBlur(view, currentRadius, newColor);

            // 保持模糊类型
            currentBlurType = currentType;
        }
    }

    /**
     * 安全回收Bitmap
     */
    private static void safeRecycleBitmap(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    // 以下是你原有的方法，保持不动...
    @RequiresApi(api = Build.VERSION_CODES.S)
    private static void applyNativeBlur(View view, float radius, int overlayColor) {
        RenderEffect blurEffect = RenderEffect.createBlurEffect(
                radius, radius, Shader.TileMode.CLAMP
        );
        view.setRenderEffect(blurEffect);

        if (overlayColor != 0) {
            view.setBackgroundColor(overlayColor);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    private static void applyRenderScriptBlur(View view, float radius, int overlayColor) {
        try {
            Bitmap bitmap = getViewBitmap(view);
            if (bitmap == null) return;

            Bitmap blurredBitmap = renderScriptBlur(view.getContext(), bitmap, radius);
            view.setBackground(new android.graphics.drawable.BitmapDrawable(
                    view.getResources(),
                    applyOverlayColor(blurredBitmap, overlayColor)
            ));
            bitmap.recycle();
        } catch (Exception ignored) {
        }
    }

    private static Bitmap getViewBitmap(View view) {
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return null;
        }
        Bitmap bitmap = Bitmap.createBitmap(
                view.getWidth(),
                view.getHeight(),
                Bitmap.Config.ARGB_8888
        );
        Canvas canvas = new Canvas(bitmap);
        view.draw(canvas);
        return bitmap;
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    private static Bitmap renderScriptBlur(Context context, Bitmap bitmap, float radius) {
        if (context == null || bitmap == null) return null;
        radius = Math.max(1, Math.min(25, radius));
        int width = Math.max(1, bitmap.getWidth() / 4);
        int height = Math.max(1, bitmap.getHeight() / 4);
        Bitmap inputBitmap = Bitmap.createScaledBitmap(bitmap, width, height, false);
        Bitmap outputBitmap = Bitmap.createBitmap(inputBitmap);
        RenderScript rs = null;
        try {
            rs = RenderScript.create(context);
            ScriptIntrinsicBlur blurScript = ScriptIntrinsicBlur.create(rs, Element.U8_4(rs));
            Allocation tmpIn = Allocation.createFromBitmap(rs, inputBitmap);
            Allocation tmpOut = Allocation.createFromBitmap(rs, outputBitmap);
            blurScript.setRadius(radius);
            blurScript.setInput(tmpIn);
            blurScript.forEach(tmpOut);
            tmpOut.copyTo(outputBitmap);
            return Bitmap.createScaledBitmap(outputBitmap,
                    bitmap.getWidth(), bitmap.getHeight(), true);
        } finally {
            if (rs != null) rs.destroy();
        }
    }

    private static Bitmap applyOverlayColor(Bitmap bitmap, int overlayColor) {
        if (overlayColor == 0) return bitmap;
        Bitmap result = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        Canvas canvas = new Canvas(result);
        Paint paint = new Paint();
        paint.setColor(overlayColor);
        canvas.drawRect(0, 0, canvas.getWidth(), canvas.getHeight(), paint);
        return result;
    }

    private static boolean hasRenderScript() {
        try {
            Class.forName("android.renderscript.RenderScript");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    private static boolean hasThirdPartyLib() {
        try {
            Class.forName("jp.wasabeef.blurry.Blurry");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    private static void applyThirdPartyBlur(ImageView imageView, float radius, int overlayColor) {
        try {
            // 第三方库实现...
            Blurry.with(imageView.getContext()).capture(imageView).into(imageView);
        } catch (Exception e) {
            applyFallbackBlur(imageView, radius, overlayColor);
        }
    }

    private static void applyFallbackBlur(View view, float radius, int overlayColor) {
        int alpha = Color.alpha(overlayColor);
        float intensity = radius / 25f;
        int adjustedAlpha = (int) (alpha * intensity);
        view.setBackgroundColor(Color.argb(
                Math.min(200, adjustedAlpha),
                Color.red(overlayColor),
                Color.green(overlayColor),
                Color.blue(overlayColor)
        ));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            view.setElevation(radius);
            view.setTranslationZ(radius / 2);
        }
    }
}