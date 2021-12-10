package com.example.androidapp_todolist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.Timer;
import java.util.TimerTask;

import android.content.Intent;
import android.os.Bundle;

import android.view.MenuItem;

import com.example.androidapp_todolist.ui.fragments.AppointmentsFragment;
import com.example.androidapp_todolist.ui.fragments.HomeFragment;
import com.example.androidapp_todolist.ui.fragments.ListsFragment;
import com.example.androidapp_todolist.ui.fragments.MedicationsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import android.view.View;
import android.widget.Button;

// Main Activity is the first screen app opens/lauches from - splash screen, 5 sec timer, then loads next screen (eventually login/create accct screen)
public class   MainActivity extends AppCompatActivity {
    private Button button;
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      
      // bottom navigation
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(bottomNavMethod);

        getSupportFragmentManager().beginTransaction().replace(R.id.fl_wrapper, new HomeFragment()).commit();

        // added below to allow 5 seconds for splashscreen to show, then it moves to the next screen
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, BasicListTemp.class);
                startActivity(intent);
                finish();
            }
        }, 5000);

    }

    // added below - this should open a new activity, but may need to correct name of activity (and should update method name/origin of that name)
    public void openActivity2() {
        Intent intent = new Intent(this, BasicListTemp.class);
        startActivity(intent);

    }

  // Bottom Navigation Bar Method
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


    };

}