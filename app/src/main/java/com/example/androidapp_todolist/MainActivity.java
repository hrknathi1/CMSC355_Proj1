package com.example.androidapp_todolist;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Timer;
import java.util.TimerTask;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class   MainActivity extends AppCompatActivity {
    private Button button;

    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // added below to allow 5 seconds for splashscreen timer
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, ListActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);

        // added below to add functionality to add button
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    // added below - this should open a new activity, but may need to correct name of activity (and should update method name)
    public void openActivity2() {
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }
}