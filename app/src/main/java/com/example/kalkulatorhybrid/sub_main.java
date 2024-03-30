package com.example.kalkulatorhybrid;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.kalkulatorhybrid.fragments.Fragment_3D;
import com.example.kalkulatorhybrid.fragments.fragment_2d;
import com.example.kalkulatorhybrid.fragments.fragment_profile;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.MenuItem;

public class sub_main extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        bottomNavigationView.setOnItemSelectedListener(navListener);

        // Load the default fragment
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new fragment_2d())
                .commit();
    }

    private BottomNavigationView.OnItemSelectedListener navListener =
            new BottomNavigationView.OnItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    if (item.getItemId() == R.id.menu_item1) {
                        selectedFragment = new fragment_2d();
                    } else if (item.getItemId() == R.id.menu_item2) {
                        selectedFragment = new Fragment_3D();
                    } else if (item.getItemId() == R.id.menu_item3) {
                        selectedFragment = new fragment_profile();
                    }

                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container, selectedFragment)
                            .commit();

                    return true;
                }
            };
}