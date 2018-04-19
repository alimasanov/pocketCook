package com.pocketcook.alim.pocketcook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ActivityIngrAdd extends AppCompatActivity {

    private List<Ingridient> ingrList;

    public ActivityIngrAdd() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingr_add);
    }

    public void RV() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerViewIngrAdd);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        ingrList = new ArrayList<>();


        //adding some items to our list
        ingrList.add(
                new Ingridient("1 ингридиент", "грамм" , 50));
        ingrList.add(
                new Ingridient("2 ингридиент", "килограмм" , 5));
        ingrList.add(
                new Ingridient("3 ингридиент", "шт" , 10));
        ingrList.add(
                new Ingridient("4 ингридиент", "грамм" , 500));
        ingrList.add(
                new Ingridient("4 ингридиент", "грамм" , 500));
        ingrList.add(
                new Ingridient("4 ингридиент", "грамм" , 500));
        ingrList.add(
                new Ingridient("4 ингридиент", "грамм" , 500));
        ingrList.add(
                new Ingridient("4 ингридиент", "грамм" , 500));
        ingrList.add(
                new Ingridient("4 ингридиент", "грамм" , 500));
        ingrList.add(
                new Ingridient("4 ингридиент", "грамм" , 500));
        ingrList.add(
                new Ingridient("4 ингридиент", "грамм" , 500));
        ingrList.add(
                new Ingridient("4 ингридиент", "грамм" , 500));
        ingrList.add(
                new Ingridient("4 ингридиент", "грамм" , 500));
        ingrList.add(
                new Ingridient("4 ингридиент", "грамм" , 500));
        ingrList.add(
                new Ingridient("4 ингридиент", "грамм" , 500));
        ingrList.add(
                new Ingridient("4 ингридиент", "грамм" , 500));
        ingrList.add(
                new Ingridient("4 ингридиент", "грамм" , 500));
        ingrList.add(
                new Ingridient("4 ингридиент", "грамм" , 500));
        ingrList.add(
                new Ingridient("4 ингридиент", "грамм" , 500));
        ingrList.add(
                new Ingridient("4 ингридиент", "грамм" , 500));
        ingrList.add(
                new Ingridient("4 ингридиент", "грамм" , 500));
        ingrList.add(
                new Ingridient("4 ингридиент", "грамм" , 500));
        ingrList.add(
                new Ingridient("4 ингридиент", "грамм" , 500));
        ingrList.add(
                new Ingridient("4 ингридиент", "грамм" , 500));



        //creating recyclerview adapter
        IngridAdapterAdd adapter = new IngridAdapterAdd(this, ingrList);

        recyclerView.setAdapter(adapter);

    }
}
