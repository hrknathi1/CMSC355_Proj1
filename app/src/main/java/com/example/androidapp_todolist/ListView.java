package com.example.androidapp_todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListView extends AppCompatActivity {

    // added below - testing this to see if it will display items user enters in list
    //EditText edText;
    TextView txtView;
    TextView myText;
    EditText plainText;
    ScrollView testDisplay;
    ArrayAdapter<String> arrayAdapter;
    EditText inputText;
    ListView listView;
    ArrayList<String> lister;

    // added below - trying this
//    ArrayList<String> list = getIntent().getStringArrayListExtra("key");

    // arrays used to store user lister entries
    ArrayList<String> listItems;

    private ListView getUserAddedItem;

    public ListView getUserAddedItem(ListView getUserAddedItem) {
        return this.getUserAddedItem = getUserAddedItem;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        // added below - testing to see if can display items user adds to lister
        // edText = (EditText) findViewbyId(R.id.editText);
        // added below - it's not working

        txtView = (TextView) findViewById(R.id.txtView);


        LinearLayout lView = new LinearLayout(this);
        myText= new TextView(this);
        lView.addView(myText);
        for (int i=0; i<lister.size();i++){
            myText.append(lister.get(i));
            myText.append("\n");
        }
        setContentView(lView);
        plainText = (EditText) findViewById(R.id.plainText);

    }


    //come back to this
    public void setAdapter(ArrayAdapter adapter) {
    }
}