package com.jayjd.boxtop.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class PrivacyPasswordManager {

    private static final String SP_NAME = "privacy_space";
    private static final String KEY_PASSWORD_HASH = "password_hash";
    private static final String KEY_PASSWORD_SALT = "password_salt";

    private final SharedPreferences sp;

    public PrivacyPasswordManager(Context context) {
        sp = context.getApplicationContext()
                .getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);
    }

    /* ===================== 对外 API ===================== */

    /** 是否已设置密码 */
    public boolean hasPassword() {
        return !TextUtils.isEmpty(sp.getString(KEY_PASSWORD_HASH, null))
                && !TextUtils.isEmpty(sp.getString(KEY_PASSWORD_SALT, null));
    }

    /** 设置新密码（首次或重置） */
    public void setPassword(String password) {
        if (TextUtils.isEmpty(password)) {
            throw new IllegalArgumentException("password is empty");
        }

        String salt = generateSalt();
        String hash = sha256(password + salt);

        sp.edit()
                .putString(KEY_PASSWORD_SALT, salt)
                .putString(KEY_PASSWORD_HASH, hash)
                .apply();
    }

    /** 校验密码是否正确 */
    public boolean verifyPassword(String inputPassword) {
        if (TextUtils.isEmpty(inputPassword)) return false;

        String salt = sp.getString(KEY_PASSWORD_SALT, null);
        String savedHash = sp.getString(KEY_PASSWORD_HASH, null);

        if (salt == null || savedHash == null) return false;

        String inputHash = sha256(inputPassword + salt);
        return savedHash.equals(inputHash);
    }

    /** 清除密码（例如退出隐私空间） */
    public void clearPassword() {
        sp.edit().clear().apply();
    }

    /* ===================== 内部方法 ===================== */

    private String generateSalt() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    private String sha256(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] bytes = md.digest(input.getBytes(StandardCharsets.UTF_8));

            StringBuilder sb = new StringBuilder();
            for (byte b : bytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA-256 not supported", e);
        }
    }
}
