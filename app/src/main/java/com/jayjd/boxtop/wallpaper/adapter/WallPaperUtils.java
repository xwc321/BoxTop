package com.jayjd.boxtop.wallpaper.adapter;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.util.Log;

import androidx.annotation.NonNull;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class WallPaperUtils {

    public static List<File> getLocalWallPaperList(Context context) {
        List<File> fileList = new ArrayList<>();

        File localPath = getLocalWallPath(context);
        Log.d("TAG", "getLocalWallPaperList: " + localPath.getAbsolutePath());
        File[] files = localPath.listFiles();
        if (files == null) return fileList;
        for (File file : files) {
            if (file.isFile() && (file.getName().endsWith(".jpg") || file.getName().endsWith(".jpeg") || file.getName().endsWith(".png"))) {
                fileList.add(file);
            }
        }
        return fileList;
    }

    @NonNull
    public static File getLocalWallPath(Context context) {
        File absoluteFile;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            absoluteFile = context.getExternalFilesDir(Environment.DIRECTORY_DCIM);
            if (absoluteFile == null) {
                absoluteFile = new File(context.getFilesDir() + File.separator + Environment.DIRECTORY_DCIM);
            }
        } else {
            absoluteFile = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
        }
        if (!absoluteFile.exists()) {
            boolean mkdirs = absoluteFile.mkdirs();
        }
        return absoluteFile;
    }

    @NonNull
    public static File getLocalDownloadPath(Context context) {
        File absoluteFile;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            absoluteFile = context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
            if (absoluteFile == null) {
                absoluteFile = new File(context.getFilesDir() + File.separator + Environment.DIRECTORY_DOWNLOADS);
            }
        } else {
            absoluteFile = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        }
        if (!absoluteFile.exists()) {
            boolean mkdirs = absoluteFile.mkdirs();
        }
        return absoluteFile;
    }


}
