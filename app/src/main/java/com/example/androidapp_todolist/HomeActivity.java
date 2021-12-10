package com.example.androidapp_todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.opengl.GLDebugHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    // added button name for Helpful Lists (pre-filled lists for users to reference)
    Button helpfulLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // helpful lists button (button1) functionality
        helpfulLists = (Button) findViewById(R.id.button1);
        helpfulLists.setOnClickListener(new View.OnClickListener() {

            @Override  // I believe this determines 'what' (aka the text entry box) the "add" button click reacts to
            public void onClick(View v) {

                // Updated splashscreen to automatically go to screen with three buttons for the different list types
                Intent intent = new Intent(HomeActivity.this, HelpfulLists.class);
                startActivity(intent);
                finish();
                openHelpfulLists();
            }

        } );


    }

    // added below - this should open a new activity, but may need to correct name of activity (and should update method name/origin of that name)
    public void openHelpfulLists () {
        Intent intent = new Intent(this, HelpfulLists.class);
        startActivity(intent);
    }

}