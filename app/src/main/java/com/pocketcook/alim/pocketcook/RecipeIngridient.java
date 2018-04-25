package com.pocketcook.alim.pocketcook;

import android.provider.BaseColumns;

public class RecipeIngridient {

    public static final class RecipeIngridientEntry implements BaseColumns{
        public static final String TABLE_NAME = "recipeIngridient list";
        public static final String COLUMN_RECIPE_ID = "recipe id";
        public static final String COLUMN_INGRIDIENT_ID = "ingridient id";
    }
}
