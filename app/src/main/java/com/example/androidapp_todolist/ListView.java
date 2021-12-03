package com.example.androidapp_todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListView extends AppCompatActivity {

    // added below - testing this to see if it will display items user enters in list
    //EditText edText;
    TextView txtView;
    ScrollView testDisplay;
    ArrayAdapter<String> arrayAdapter;
    EditText inputText;
    ListView listView;
    ArrayList<String> list;

    private ListView getUserAddedItem;

    public ListView getUserAddedItem(ListView getUserAddedItem) {
        return this.getUserAddedItem = getUserAddedItem;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        // added below - testing to see if can display items user adds to list
        // edText = (EditText) findViewbyId(R.id.editText);
        // added below - it's not working

        txtView = (TextView) findViewById(R.id.txtView);

    }


    //come back to this
    public void setAdapter(ArrayAdapter adapter) {
    }
}