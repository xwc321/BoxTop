#include <jni.h>
#include <string>
#include <cstring>
#include <sstream>
#include <android/log.h>

#define TAG "boxtop-verify"

#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, TAG, __VA_ARGS__)
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO,  TAG, __VA_ARGS__)

/**
 * ===========================
 * 你需要修改的常量
 * ===========================
 */

// 包名
#define PACKAGE_NAME "com.jayjd.boxtop"

// Application 类名
#define APPLICATION_NAME "com.jayjd.boxtop.BoxApplication"

// Application 的父类（一般是这个）
#define APPLICATION_SUPER "androidx.multidex.MultiDexApplication"

// 正式版签名 SHA256
#define SIGNATURE_SHA256 "5A:7A:D3:1C:2A:BA:C0:C9:5E:F0:0A:81:02:E7:FC:6B:61:1D:3A:97:D3:A3:EC:BA:93:75:47:B7:0B:F7:E0:A2"

/**
 * 校验结果标记
 */
static int gVerified = 0;


static void ensureVerified() {
    if (!gVerified) {
        LOGE("verify not initialized");
        abort();
    }
}


static void die() {
    LOGE("verify failed, abort");
    abort();
}

extern "C"
JNIEXPORT void JNICALL
Java_com_jayjd_boxtop_utils_VerifyUtils_initVerify(JNIEnv *env, jclass clazz, jobject context) {

    if (gVerified) return;

    /**
     * ===========================
     * 1. SDK_INT
     * ===========================
     */
    jclass versionClz = env->FindClass("android/os/Build$VERSION");
    jfieldID sdkField = env->GetStaticFieldID(versionClz, "SDK_INT", "I");
    jint sdkInt = env->GetStaticIntField(versionClz, sdkField);
    /**
     * ===========================
     * 6. DEBUG 放行
     * ===========================
     */
    jclass bcClz = env->FindClass("com/jayjd/boxtop/BuildConfig");
    jfieldID debugField = env->GetStaticFieldID(bcClz, "DEBUG", "Z");
//    LOGE("DEBUG: %d", env->GetStaticBooleanField(bcClz, debugField));
    if (env->GetStaticBooleanField(bcClz, debugField)) {
        LOGI("DEBUG build, skip verify");
        gVerified = 1;
        return;
    }
    /**
     * ===========================
     * 2. Context / PackageManager
     * ===========================
     */
    jclass contextClz = env->GetObjectClass(context);

    jmethodID getPM = env->GetMethodID(
            contextClz,
            "getPackageManager",
            "()Landroid/content/pm/PackageManager;");
    jobject pmObj = env->CallObjectMethod(context, getPM);

    jmethodID getPkgName = env->GetMethodID(
            contextClz,
            "getPackageName",
            "()Ljava/lang/String;");
    jstring pkgNameStr = (jstring) env->CallObjectMethod(context, getPkgName);

    const char *pkgName = env->GetStringUTFChars(pkgNameStr, nullptr);
    if (strcmp(pkgName, PACKAGE_NAME) != 0) {
        LOGE("package mismatch: %s", pkgName);
        die();
    }

    /**
     * ===========================
     * 3. ApplicationInfo 校验
     * ===========================
     */
    jclass context_clz = env->GetObjectClass(context);
    jmethodID package_manager_method = env->GetMethodID(context_clz, "getPackageManager",
            "()Landroid/content/pm/PackageManager;");
    jobject package_manager = env->CallObjectMethod(context, package_manager_method);

    jclass package_manager_clazz = env->GetObjectClass(package_manager);

    jmethodID package_name_method = env->GetMethodID(context_clz, "getPackageName",
            "()Ljava/lang/String;");
    jstring package_name = (jstring) env->CallObjectMethod(context, package_name_method);

    jmethodID application_info_method = env->GetMethodID(package_manager_clazz,
            "getApplicationInfo",
            "(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;");

    jobject application_info = env->CallObjectMethod(package_manager, application_info_method,
            package_name, 0x00000080);

    jclass application_info_clz = env->GetObjectClass(application_info);

    jfieldID class_name_jf = env->GetFieldID(application_info_clz, "className",
            "Ljava/lang/String;");
    jstring class_name = (jstring) env->GetObjectField(application_info, class_name_jf);

    const char *c_class_name = env->GetStringUTFChars(class_name, nullptr);

    if (strcmp(c_class_name, APPLICATION_NAME) != 0) {
        LOGE("Application injected: %s", c_class_name);
        die();
    }

    /**
     * ===========================
     * 4. Application SuperClass 校验
     * ===========================
     */
    jmethodID getClazz = env->GetMethodID(context_clz, "getClass", "()Ljava/lang/Class;");
    jobject clazzObject = env->CallObjectMethod(context, getClazz);

    jclass clazzClazz = env->GetObjectClass(clazzObject);
    jmethodID superMethod = env->GetMethodID(clazzClazz, "getSuperclass", "()Ljava/lang/Class;");
    jobject superObject = env->CallObjectMethod(clazzObject, superMethod);

    jclass classClass = env->FindClass("java/lang/Class");
    jmethodID getNameMethod = env->GetMethodID(classClass, "getName", "()Ljava/lang/String;");
    jstring superNameStr = (jstring) env->CallObjectMethod(superObject, getNameMethod);

    const char *c_superNameStr = env->GetStringUTFChars(superNameStr, nullptr);
//    LOGI("APPLICATION_SUPER: %s", c_superNameStr);
    // 5. 对比
    if (strcmp(c_superNameStr, APPLICATION_SUPER) != 0) {
        LOGE("super class mismatch: %s", c_superNameStr);
        die();
    }

    /**
     * ===========================
     * 5. 签名 SHA256 校验（最终裁决）
     * ===========================
     */
    jclass verifyClz = env->FindClass(
            "com/jayjd/boxtop/utils/VerifyUtils");
    jmethodID getSign = env->GetStaticMethodID(
            verifyClz,
            "getSignatureSha256",
            "(Landroid/content/Context;)Ljava/lang/String;");
    jstring signStr = (jstring) env->CallStaticObjectMethod(
            verifyClz,
            getSign,
            context);

    const char *sign = env->GetStringUTFChars(signStr, nullptr);
//    LOGE("signature mismatch: %s", sign);
    if (strcmp(sign, SIGNATURE_SHA256) != 0) {
        LOGE("signature mismatch: %s", sign);
        die();
    }

    /**
     * ===========================
     * 7. 检测自定义 APPLICATION
     * ===========================
     */
    jclass contextClass = env->GetObjectClass(context);
    jmethodID getSharedPreferences = env->GetMethodID(contextClass, "getSharedPreferences",
            "(Ljava/lang/String;I)Landroid/content/SharedPreferences;");
    jstring spName = env->NewStringUTF("Toist_SP");
    jobject spObj = env->CallObjectMethod(context, getSharedPreferences, spName,
            0); // MODE_PRIVATE = 0

    jclass spClass = env->GetObjectClass(spObj);
    jmethodID getString = env->GetMethodID(spClass, "getString",
            "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;");
    jstring key = env->NewStringUTF("appGuard");
    jstring defaultValue = env->NewStringUTF("");
    jstring resultStr = (jstring) env->CallObjectMethod(spObj, getString, key, defaultValue);
    const char *result = env->GetStringUTFChars(resultStr, nullptr);
//    LOGI("appGuard: %s", result);

    jclass toolsUtilsClass = env->FindClass("com/jayjd/boxtop/utils/VerifyUtils"); // 替换为你自己的包名
    if (toolsUtilsClass == nullptr) {
        LOGI("VerifyUtils: class not found");
        return;
    }
    jmethodID base64ToString = env->GetStaticMethodID(toolsUtilsClass, "unBase64",
            "(Ljava/lang/String;)Ljava/lang/String;");
    if (base64ToString == nullptr) {
        LOGI("VerifyUtils unBase64: method not found");
        return;
    }
    jstring decodedStr = (jstring) env->CallStaticObjectMethod(toolsUtilsClass, base64ToString,
            resultStr);

    const char *decodedCStr = env->GetStringUTFChars(decodedStr, nullptr);
//    LOGI("decoded: %s", decodedCStr);
    // 3. 拆分字符串（竖线 | 分隔）
    std::string fullStr(decodedCStr);
    std::stringstream ss(fullStr);
    std::string classPath;
    while (std::getline(ss, classPath, '|')) {
        std::replace(classPath.begin(), classPath.end(), '.', '/');
        jclass cls = env->FindClass(classPath.c_str());
        if (cls != nullptr) {
            __android_log_print(ANDROID_LOG_INFO, "huya", "If you want to use it, use it well");
            abort();
        } else if (env->ExceptionCheck()) {
            env->ExceptionClear(); // 重要：清除异常防止 JNI 崩溃
        }
    }

    /**
     * ===========================
     * 校验成功
     * ===========================
     */
//    LOGI("verify success");
    gVerified = 1;

}
extern "C"
JNIEXPORT jstring JNICALL
Java_com_jayjd_boxtop_utils_VerifyUtils_getKey(JNIEnv *env, jclass clazz) {
    const char *pwd = "P%hr$|5GhVJpHEQR5*k}";
    return env->NewStringUTF(pwd);
}

extern "C"
JNIEXPORT void JNICALL
Java_com_jayjd_boxtop_utils_VerifyUtils_checkVerify(JNIEnv *env, jclass clazz, jobject main_activity) {
    ensureVerified();
    // 1. 拿到 MainActivity 的 Class
    jclass activityClz = env->GetObjectClass(main_activity);
    if (activityClz == nullptr) {
        LOGE("MainActivity class not found");
        return;
    }

    // 2. 找 initData 方法
    jmethodID initDataMethod = env->GetMethodID(
            activityClz,
            "checkInfo",
            "()V"
    );

    if (initDataMethod == nullptr) {
        LOGE("initData method not found");
        return;
    }

    // 3. 调用 initData()
    env->CallVoidMethod(main_activity, initDataMethod);

    // 4. 可选：清理本地引用
    env->DeleteLocalRef(activityClz);
}