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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(bottomNavMethod);

        getSupportFragmentManager().beginTransaction().replace(R.id.fl_wrapper, new HomeFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener bottomNavMethod = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // get the selected fragment by id
                Fragment selectedFragment = null;
                switch (item.getItemId()) {
                    case R.id.ic_home:
                        selectedFragment = new HomeFragment();
                        break;
                    case R.id.ic_appointments:
                        selectedFragment = new AppointmentsFragment();
                        break;
                    case R.id.ic_list:
                        selectedFragment = new ListsFragment();
                        break;
                    case R.id.ic_medications:
                        selectedFragment = new MedicationsFragment();
                        break;
                }
                // replacing one fragment with another fragment
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fl_wrapper, selectedFragment)
                        .commit();
                return true;
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

    };

}