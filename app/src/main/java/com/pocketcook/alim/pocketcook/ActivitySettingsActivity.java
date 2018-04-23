package com.pocketcook.alim.pocketcook;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomButtons.TextOutsideCircleButton;
import com.nightonke.boommenu.BoomMenuButton;

public class ActivitySettingsActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    BoomMenuButton bmb;
    Toolbar toolbar;
    DrawerLayout drawer;
    ActionBarDrawerToggle toggle;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_activity);

        boomMenuButton();

        findSetToolbar();

        drawerSet();

        navigationViewSet();
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

                                Intent intent = new Intent(ActivitySettingsActivity.this,
                                        AddRecipe.class);
                                startActivity(intent);

                            }
                        });
                bmb.addBuilder(builder);
            } else if (i == 1) {
                TextOutsideCircleButton.Builder builder = new TextOutsideCircleButton.Builder()
                        .normalImageRes(R.drawable.ingr)
                        .normalText("Продукты")
                        .textSize(14)
                        .textWidth(200)
                        .listener(new OnBMClickListener() {
                            @Override
                            public void onBoomButtonClick(int index) {

                                Intent intent = new Intent(ActivitySettingsActivity.this,
                                        AddRecipe.class);
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
            case (R.id.nav_holodilnik):
                Intent intent_holodilnic_activity = new Intent(this, ActivityFridgeActivity.class);
                startActivity(intent_holodilnic_activity);
                finish();
                break;
            case (R.id.about):
                Intent intent_about_activity = new Intent(this, ActivityAboutActivity.class);
                startActivity(intent_about_activity);
                finish();
                break;
            case (R.id.nav_your_menu):
                Intent intent_menu_activity = new Intent(this, ActivityMenuActivity.class);
                startActivity(intent_menu_activity);
                finish();
                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
