package com.timosmond.contentprovideractiveandroid.model;

import android.database.Cursor;
import android.provider.BaseColumns;

import com.activeandroid.Cache;
import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "Sample", id = BaseColumns._ID)
public class Sample extends Model {
    @Column(name = "Name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Cursor fetchResultCursor() {
        return Cache.openDatabase().rawQuery("select * from sample", null);
    }

}
