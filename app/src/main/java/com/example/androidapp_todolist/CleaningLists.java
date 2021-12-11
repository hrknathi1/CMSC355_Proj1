package com.example.androidapp_todolist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.TextView;

public class CleaningLists extends AppCompatActivity {

    CheckedTextView cleaningList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cleaning_lists);


//        cleaningList.findViewById(R.id.checkedTextView);
//        cleaningList.append("Take the trash out");

    }
}