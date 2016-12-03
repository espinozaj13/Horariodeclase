package com.example.jaime.horariodeclase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Jaime on 02/12/2016.
 */

public class sqliteopenhelper extends SQLiteOpenHelper {
    public sqliteopenhelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table registrar-asig codigo integer primary key, nombre text, hora text, diaclase text");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists registrar-asig");

        db.execSQL("create table registrar-asig codigo integer primary key, nombre text, hora text, diaclase text");
    }
}
