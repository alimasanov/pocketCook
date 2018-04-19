package com.pocketcook.alim.pocketcook;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FragmentActivitySettingsRecipeDelete extends Fragment {
    private static final String TAG = "Tab1Fragment";
    List<Recipe> recipeList;

    @Override
    public void onCreate(Bundle savedInstnceState) {
        super.onCreate(savedInstnceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_activity_settings_recipe_delete, container, false);
        RecyclerView rv = rootView.findViewById(R.id.recyclerViewDel);
        rv.setHasFixedSize(true);

        return rootView;
    }
}