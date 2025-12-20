package com.jayjd.boxtop.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.jayjd.boxtop.dao.AllAppsInfoDao;
import com.jayjd.boxtop.dao.FavoriteAppInfoDao;
import com.jayjd.boxtop.entity.AppInfo;
import com.jayjd.boxtop.entity.FavoriteApp;

@Database(entities = {AppInfo.class, FavoriteApp.class}, version = 1, exportSchema = false)
public abstract class AppDataBase extends RoomDatabase {

    private static AppDataBase appDataBase;

    public static AppDataBase getInstance(Context context) {
        if (appDataBase == null) {
            synchronized (AppDataBase.class) {
                if (appDataBase == null) {
                    appDataBase = Room.databaseBuilder(context, AppDataBase.class, "app_database").build();
                }
            }
        }
        return appDataBase;
    }

    public abstract FavoriteAppInfoDao getFavoriteAppInfoDao();

    public abstract AllAppsInfoDao getAllAppsInfoDao();

}