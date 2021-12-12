package com.example.androidapp_todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelpfulLists extends AppCompatActivity {

    // button variables
    Button cleaningList;
    Button workoutButton;
    Button commonBillsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpful_lists);

        // buttons by ID
        cleaningList = findViewById(R.id.cleaningButton);
        workoutButton = findViewById(R.id.workoutButton);
        commonBillsButton = findViewById(R.id.billsButton);


        cleaningList.setOnClickListener(new View.OnClickListener() {
            @Override
            // I believe this determines 'what' (aka the text entry box) the "add" button click reacts to
            public void onClick(View v) {

                Intent intent = new Intent(HelpfulLists.this, CleaningLists.class);
                startActivity(intent);
                finish();
                openCleaningList();
            }

        });

        workoutButton.setOnClickListener(new View.OnClickListener()   {
            @Override  // I believe this determines 'what' (aka the text entry box) the "add" button click reacts to
            public void onClick (View v){

                Intent intent = new Intent(HelpfulLists.this, WorkoutRoutine.class);
                startActivity(intent);
                finish();
                openWorkoutList();
            }
        });

        commonBillsButton.setOnClickListener(new View.OnClickListener()   {
            @Override  // I believe this determines 'what' (aka the text entry box) the "add" button click reacts to
            public void onClick (View v){

                Intent intent = new Intent(HelpfulLists.this, CommonBills.class);
                startActivity(intent);
                finish();
                openCommonBillList();
            }
        });

    }

    // Opens cleaning list screen
    public void openCleaningList () {
        Intent intent = new Intent(this, CleaningLists.class);
        startActivity(intent);
    }


    // Opens workout list screen
    public void openWorkoutList () {
        Intent intent = new Intent(this, WorkoutRoutine.class);
        startActivity(intent);
    }

    // Opens workout list screen
    public void openCommonBillList () {
        Intent intent = new Intent(this, CommonBills.class);
        startActivity(intent);
    }

}