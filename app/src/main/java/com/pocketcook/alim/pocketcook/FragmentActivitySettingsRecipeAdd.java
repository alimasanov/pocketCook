package com.pocketcook.alim.pocketcook;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FragmentActivitySettingsRecipeAdd extends Fragment {
    private static final String TAG = "Tab1Fragment";

    RecipeDBHelper recipeDBHelper;
    EditText etn;
    EditText etp;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_activity_settings_recipe_add, container, false);
        Button button = (Button) view.findViewById(R.id.add_ingr);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ActivityIngrAdd.class);
                startActivity(intent);
            }
        });

        etn = (EditText) view.findViewById(R.id.edit_text_name);
        etp = (EditText) view.findViewById(R.id.edit_text_prepare);

        recipeDBHelper = new RecipeDBHelper(getActivity());
        Button btnAdd = view.findViewById(R.id.add_recipe);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etn.getText().toString();
                String prepare = etp.getText().toString();

                SQLiteDatabase sqLiteDatabase = recipeDBHelper.getReadableDatabase();
                ContentValues contentValues = new ContentValues();

                switch (v.getId()) {
                    case (R.id.add_recipe):
                        contentValues.put(Recipe.RecipeEntry.COLUMN_NAME, name);

                        sqLiteDatabase.insert(Recipe.RecipeEntry.TABLE_NAME, null, contentValues);

                        break;
                }
                recipeDBHelper.close();

            }
        });
        return view;
    }
}