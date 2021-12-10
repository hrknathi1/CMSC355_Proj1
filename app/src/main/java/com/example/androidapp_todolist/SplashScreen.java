package com.example.androidapp_todolist;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

// Main Activity is the first screen app opens/launches from - splash screen, 5 sec timer, then loads next screen (eventually login/create accct screen)
public class SplashScreen extends AppCompatActivity {
    private Button button;
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // added below to allow 5 seconds for splashscreen to show, then it moves to the next screen
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // Updated splashscreen to automatically go to screen with three buttons for the different list types
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
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
}

