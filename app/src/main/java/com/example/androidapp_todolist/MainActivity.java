package com.example.androidapp_todolist;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Timer;
import java.util.TimerTask;

import android.content.Intent;
import android.os.Bundle;
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
}