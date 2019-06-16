package com.example.animerack;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    //database
    private static final int  DATABASE_VER = 1;
    private static final String DATABASE_NAME="ANIMEOFFLINE";

    //table
    private static final String TABLE_NAME="AnimeOffline";
    private static final String KEY_ID="Id";
    private static final String KEY_JUDUL="Judul";
    private static final String KEY_SEASON="Season";
    private static final String KEY_PENYIMPANAN="Penyimpanan";

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, DATABASE_VER);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String CREATE_TABLE = "CREATE TABLE"+TABLE_NAME+"("
                +KEY_ID+" INTEGER PRIMARY KEY,"+KEY_JUDUL+"TEXT,"
                +KEY_SEASON+"TEXT,"
                +KEY_PENYIMPANAN+"TEXT"+")";
        sqLiteDatabase.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
