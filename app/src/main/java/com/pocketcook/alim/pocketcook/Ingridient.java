package com.pocketcook.alim.pocketcook;

import android.provider.BaseColumns;

public class Ingridient {
    public static final class IngridientEntry implements BaseColumns {
        public static final String TABLE_NAME = "ingridientList";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_COUNT = "count";
        public static final String COLUMN_UNIT = "unit";
        public static final String COLUMN_TIMESTAMP = "timestamp";
    }
}