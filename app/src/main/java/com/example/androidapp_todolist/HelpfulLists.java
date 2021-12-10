package com.example.androidapp_todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelpfulLists extends AppCompatActivity {

    Button cleaningList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpful_lists);

        cleaningList = findViewById(R.id.CleaningListsbutton);
        cleaningList.setOnClickListener(new View.OnClickListener() {
            @Override  // I believe this determines 'what' (aka the text entry box) the "add" button click reacts to
            public void onClick(View v) {

                // Updated splashscreen to automatically go to screen with three buttons for the different list types
                Intent intent = new Intent(HelpfulLists.this, CleaningLists.class);
                startActivity(intent);
                finish();
                openCleaningList();
            }

        } );


    }

    // added below - this should open a new activity, but may need to correct name of activity (and should update method name/origin of that name)
    public void openCleaningList () {
        Intent intent = new Intent(this, CleaningLists.class);
        startActivity(intent);
    }

}