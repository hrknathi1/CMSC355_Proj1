package com.example.androidapp_todolist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.androidapp_todolist.ui.fragments.AppointmentsFragment;
import com.example.androidapp_todolist.ui.fragments.HomeFragment;
import com.example.androidapp_todolist.ui.fragments.ListsFragment;
import com.example.androidapp_todolist.ui.fragments.MedicationsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class   MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(bottomNavMethod);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener bottomNavMethod = new NavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            return false;
        }


        /*
        final HomeFragment homeFragment = new HomeFragment();
        final ListsFragment listsFragment = new ListsFragment();
        final MedicationsFragment medicationsFragment = new MedicationsFragment();
        final AppointmentsFragment appointmentsFragment = new AppointmentsFragment();

        makeCurrentFragment(homeFragment);

        bottomNavigationView.setOnNavigationItemSelectedListener(new bottomNavigationView.OnNavigationItemSelectedListener()) {
            switch(item.getItemId()) {
                R.id.ic_home = makeCurrentFragment(homeFragment);
                R.id.ic_list = makeCurrentFragment(homeFragment);
                R.id.ic_appointments = makeCurrentFragment(homeFragment);
                R.id.ic_medications = makeCurrentFragment(homeFragment);
            }
            return true;

        }

        private void makeCurrentFragment(Fragment fragment) =
        getSupportFragmentManager().beginTransaction() {
            replace(R.id.fl_wrapper, fragment);
            commit();
        }
    }
         */

}