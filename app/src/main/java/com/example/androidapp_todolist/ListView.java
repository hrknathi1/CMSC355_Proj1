package com.example.androidapp_todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

public class ListView extends AppCompatActivity {

    // added below - testing this to see if it will display items user enters in list
    //EditText edText;
    TextView txtView;
    ListView listView;
    ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        // added below - testing to see if can display items user adds to list
        // edText = (EditText) findViewbyId(R.id.editText);
        txtView = (TextView) findViewById(R.id.txtView);

    }


}