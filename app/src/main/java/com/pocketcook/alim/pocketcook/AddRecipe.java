package com.pocketcook.alim.pocketcook;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddRecipe extends AppCompatActivity {

    DBHelper dbHelper;
    EditText etn;
    EditText etp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_recipe);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button button = (Button) findViewById(R.id.add_ingr);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddRecipe.this, ActivityIngrAdd.class);
                startActivity(intent);
            }
        });

        etn = (EditText) findViewById(R.id.edit_text_name);
        etp = (EditText) findViewById(R.id.edit_text_prepare);

        dbHelper = new DBHelper(this);
        Button btnAdd = findViewById(R.id.add_recipe);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etn.getText().toString();
                String prepare = etp.getText().toString();

                SQLiteDatabase sqLiteDatabase = dbHelper.getReadableDatabase();
                ContentValues contentValues = new ContentValues();

                contentValues.put(Recipe.RecipeEntry.COLUMN_NAME, name);

                sqLiteDatabase.insert(Recipe.RecipeEntry.TABLE_NAME, null, contentValues);
                dbHelper.close();
            }
        });
    }

}
