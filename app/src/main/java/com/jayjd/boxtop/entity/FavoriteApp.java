package com.jayjd.boxtop.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

import lombok.Data;

@Entity(tableName = "favorite_app")
@Data
public class FavoriteApp implements Serializable {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String packageName;

    public FavoriteApp(String packageName) {
        this.packageName = packageName;
    }
}
