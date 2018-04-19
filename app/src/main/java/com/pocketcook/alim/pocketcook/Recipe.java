package com.pocketcook.alim.pocketcook;

import android.provider.BaseColumns;

import java.util.ArrayList;
import java.util.List;

public class Recipe {

    public static final class RecipeEntry implements BaseColumns {
        public static final String TABLE_NAME = "recipeList";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_TIMESTAMP = "timestamp";
    }
}