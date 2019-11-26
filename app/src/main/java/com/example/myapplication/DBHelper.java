package com.example.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "FinancerDb";
    public static final String TABLE_CONSTACTS = "contacts";

    public static final String KEY_BALANCE = "balance";
    public static final String KEY_ID = "_id";
    public static final String KEY_MONEY = "money";
    public static final String KEY_CATEGORY = "category";
    public static final String KEY_DATE = "date";

    public DBHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_CONSTACTS + " (" + KEY_ID +
                " integer primary key," + KEY_CATEGORY + " text," + KEY_DATE + " text," + KEY_MONEY + " text" + " )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + TABLE_CONSTACTS);
        onCreate(db);
    }
}
