package com.pocketcook.alim.pocketcook;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.pocketcook.alim.pocketcook.Recipe.*;
import com.pocketcook.alim.pocketcook.Ingridient.*;
import com.pocketcook.alim.pocketcook.RecipeIngridient.*;

public class DBHelper extends SQLiteOpenHelper{

    public static final String DATABASE_NAME = "recipeList.db";
    public static final int DATABASE_VERSION = 1;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        final String SQL_CREATE_RECIPELIST_TABLE = "CREATE TABLE " +
                RecipeEntry.TABLE_NAME + " (" +
                RecipeEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                RecipeEntry.COLUMN_NAME + " TEXT NOT NULL, " +
                RecipeEntry.COLUMN_TIMESTAMP + " TIMESTAMP DEFAULT CURRENT_TIMESTAMP" +
                ");";

        final String SQL_CREATE_INGRLIST_TABLE = "CREATE TABLE " +
                IngridientEntry.TABLE_NAME + " (" +
                IngridientEntry._ID + " INTEGER PRIMARY KEY AUTOINKREMENT, " +
                IngridientEntry.COLUMN_NAME + " TEXT NOT NULL, " +
                IngridientEntry.COLUMN_COUNT + " INTEGER, " +
                IngridientEntry.COLUMN_UNIT + " TEXT NOT NULL, " +
                IngridientEntry.COLUMN_TIMESTAMP + " TIMESTAMP DEFAULT CURRENT_TIMESTAMP" +
                ");";

        final String SQL_CREATE_RECIPEINGRLIST_TABLE = "CREATE TABLE " +
                RecipeIngridientEntry.TABLE_NAME + " (" +
                RecipeIngridientEntry.COLUMN_INGRIDIENT_ID + " INTEGER NOT NULL, " +
                RecipeIngridientEntry.COLUMN_RECIPE_ID + " INTEGER NOT NULL, PRIMARY KEY(" +
                RecipeIngridientEntry.COLUMN_INGRIDIENT_ID + ", " +
                RecipeIngridientEntry.COLUMN_RECIPE_ID + "), FOREIGN KEY (" +
                RecipeIngridientEntry.COLUMN_INGRIDIENT_ID + ") REFERENCES " +
                IngridientEntry.TABLE_NAME + ", FOREIGN KEY (" +
                RecipeIngridientEntry.COLUMN_RECIPE_ID + ") REFERENCES " +
                RecipeEntry.TABLE_NAME + ",);";


        db.execSQL(SQL_CREATE_RECIPELIST_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + RecipeEntry.TABLE_NAME + IngridientEntry.TABLE_NAME);

        onCreate(db);
    }
}
