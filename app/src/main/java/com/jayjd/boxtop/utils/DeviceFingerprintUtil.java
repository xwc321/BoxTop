package com.jayjd.boxtop.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 设备指纹工具（Android TV / 盒子适用）
 *
 * 规则：
 * deviceId = SHA256(ANDROID_ID + BRAND + MODEL)
 */
public final class DeviceFingerprintUtil {

    private DeviceFingerprintUtil() {}

    /**
     * 获取设备指纹（稳定、合规）
     */
    public static String getDeviceFingerprint(Context context) {
        @SuppressLint("HardwareIds") String androidId = Settings.Secure.getString(
                context.getContentResolver(),
                Settings.Secure.ANDROID_ID
        );

        if (TextUtils.isEmpty(androidId)) {
            androidId = "unknown_android_id";
        }

        String raw = androidId
                + "|" + android.os.Build.BRAND
                + "|" + android.os.Build.MODEL;

        return sha256(raw);
    }

    /**
     * SHA-256
     */
    private static String sha256(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] bytes = md.digest(input.getBytes(StandardCharsets.UTF_8));
            return bytesToHex(bytes);
        } catch (NoSuchAlgorithmException e) {
            return "";
        }
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
