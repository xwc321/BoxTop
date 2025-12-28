package com.jayjd.boxtop.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;

import com.jayjd.boxtop.MainActivity;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public final class VerifyUtils {
    static {
        System.loadLibrary("boxtop");
    }
    public static String getSignatureSha256(Context context) {
        try {
            PackageManager pm = context.getPackageManager();
            PackageInfo pi;

            if (Build.VERSION.SDK_INT >= 28) {
                pi = pm.getPackageInfo(
                        context.getPackageName(),
                        PackageManager.GET_SIGNING_CERTIFICATES
                );
                Signature[] sigs = pi.signingInfo.getApkContentsSigners();
                return sha256(sigs[0].toByteArray());
            } else {
                pi = pm.getPackageInfo(
                        context.getPackageName(),
                        PackageManager.GET_SIGNATURES
                );
                return sha256(pi.signatures[0].toByteArray());
            }
        } catch (Throwable e) {
            return "";
        }
    }
    public static String base64ToString(String entity) {
        byte[] bytes;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            bytes = desDecrypt(java.util.Base64.getDecoder().decode(entity), getKey());
        } else {
            bytes = desDecrypt(android.util.Base64.decode(entity, android.util.Base64.DEFAULT), getKey());
        }
        return new String(bytes);
    }

    public static byte[] desDecrypt(byte[] encryptText, String desKeyParameter) {
        try {
            SecureRandom sr = new SecureRandom();
            byte[] rawKeyData = desKeyParameter.getBytes();
            DESKeySpec dks = new DESKeySpec(rawKeyData);
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey key = keyFactory.generateSecret(dks);
            @SuppressLint("GetInstance") Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.DECRYPT_MODE, key, sr);
            return cipher.doFinal(encryptText);
        } catch (InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException |
                 NoSuchPaddingException | BadPaddingException | IllegalBlockSizeException e) {
            return "".getBytes();
        }
    }
    public static String unBase64(String base64Str) {
        return base64ToString(base64Str);
    }

    private static String sha256(byte[] data) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] digest = md.digest(data);
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(String.format("%02X:", b));
        }
        return sb.substring(0, sb.length() - 1);
    }
    public static native String getKey();
    public static native void initVerify(Context context);

    public static native void checkVerify(MainActivity mainActivity);
}
