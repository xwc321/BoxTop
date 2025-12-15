package com.jayjd.boxtop.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.jayjd.boxtop.entity.AppInfo;

import java.util.List;

@Dao
public interface FavoriteAppInfoDao {
    @Insert
    void insert(AppInfo favoriteAppInfo);

    @Update
    void update(AppInfo favoriteAppInfo);

    @Query("DELETE FROM app_info WHERE packageName = :packageName")
    void deleteByPackageName(String packageName);

    @Query("SELECT * FROM app_info")
    List<AppInfo> getAllFavoriteAppInfo();

}
