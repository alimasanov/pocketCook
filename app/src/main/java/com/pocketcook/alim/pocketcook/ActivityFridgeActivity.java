package com.pocketcook.alim.pocketcook;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomButtons.TextOutsideCircleButton;
import com.nightonke.boommenu.BoomMenuButton;

import java.util.ArrayList;
import java.util.List;

public class ActivityFridgeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    BoomMenuButton bmb;
    Toolbar toolbar;
    DrawerLayout drawer;
    ActionBarDrawerToggle toggle;
    NavigationView navigationView;
    List<Ingridient> ingrList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holodilnic_activity);

        boomMenuButton();

        findSetToolbar();

        drawerSet();

        navigationViewSet();

        RV();
    }

    private void navigationViewSet() {
        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void drawerSet() {
        drawer = findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }

    private void findSetToolbar() {
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void boomMenuButton() {
        bmb = findViewById(R.id.bmb);
        for (int i = 0; i < bmb.getPiecePlaceEnum().pieceNumber(); i++) {
            int position = i;
            if (i == 0) {
                TextOutsideCircleButton.Builder builder = new TextOutsideCircleButton.Builder()
                        .normalImageRes(R.drawable.food)
                        .normalText("Блюда")
                        .textSize(14)
                        .listener(new OnBMClickListener() {
                            @Override
                            public void onBoomButtonClick(int index) {

                                Intent intent = new Intent(ActivityFridgeActivity.this,
                                        ActivitySettingsRecipe.class);
                                startActivity(intent);

                            }
                        });
                bmb.addBuilder(builder);
            } else if (i == 1) {
                TextOutsideCircleButton.Builder builder = new TextOutsideCircleButton.Builder()
                        .normalImageRes(R.drawable.ingr)
                        .normalText("Продукты")
                        .textWidth(200)
                        .textSize(14)
                        .listener(new OnBMClickListener() {
                            @Override
                            public void onBoomButtonClick(int index) {

                                Intent intent = new Intent(ActivityFridgeActivity.this,
                                        ActivitySettingsIngridient.class);
                                startActivity(intent);

                            }
                        });

                bmb.addBuilder(builder);
            }
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        switch (item.getItemId()){
            case (R.id.nav_your_menu):
                Intent intent_your_menu_activity = new Intent(this, ActivityMenuActivity.class);
                startActivity(intent_your_menu_activity);
                finish();
                break;
            case (R.id.about):
                Intent intent_about_activity = new Intent(this, ActivityAboutActivity.class);
                startActivity(intent_about_activity);
                finish();
                break;
            case (R.id.nav_settings):
                Intent intent_settings_activity = new Intent(this, ActivitySettingsActivity.class);
                startActivity(intent_settings_activity);
                finish();
                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void RV() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerViewIngr);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        ingrList = new ArrayList<>();


        //adding some items to our list
        ingrList.add(new Ingridient("1 ингридиент", "грамм" , 50));
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
        IngrAdapter adapter = new IngrAdapter(this, ingrList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);

    }
}