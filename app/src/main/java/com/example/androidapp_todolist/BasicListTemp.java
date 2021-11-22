package com.example.androidapp_todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// class that allows a user to add an item to a list
// *NOTE: Need functionality for when user enters items, where are they stored, etc.
public class BasicListTemp extends AppCompatActivity {

    // variables for basic list temp activity (aka: adding items, accepting user input, submit button)
    // where we will store the info collected
    String userAddedItem = "";

    // fields that user inputs into
    EditText userAddsItem;

    // add item button
    Button addItemButton;

    // arrays used to store user list entries
    ArrayList<String> listItems;
    ArrayAdapter<String> itemAdapter;

    // added below - necessary for array adapter ?
    private Context context;


   // @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_list_temp);

        // added below - testing to see if initialization of arrayadapter is the problem
//        ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(this, R.layout.activity_basic_list_temp, R.id.textView, Collections.singletonList(userAddedItem));
      //  ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, (List<String>) userAddsItem);

        // added below - Will probably need to figure out how to get this to work:
        //  https://www.tutorialspoint.com/android/android_list_view.htm
        //  ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.ListView,StringArray);



        // added below - following steps from youtube video regarding null pointer exception error [MAY NOT NEED THIS]
    //    mytextview = (TextView)findViewById(R.id.mytextview);
    //    mytextview.setText("Kass TESTING BasicListTemp.Java");
        //  TextView mytextview = null;
        //    context = this;

        // added below
        ArrayList<String> listItems = new ArrayList<String>();
        // ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, (List<String>) userAddsItem);
        ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, (List<String>) userAddsItem);

        userAddsItem = (EditText) findViewById(R.id.userAddsItem);
        addItemButton = (Button) findViewById(R.id.addItemButton);

        // button functionality
        addItemButton.setOnClickListener(new View.OnClickListener() {

            @Override  // I believe this determines 'what' (aka the text entry box) the "add" button click reacts to
            public void onClick(View v) {
                userAddedItem = userAddsItem.getText().toString();

                // if user enters something, add it
                if(!(userAddedItem.equals("")))
                {
                    // SOMETHING WRONG IS HAPPENING IN THE BELOW LINE...SOMETHING ABOUT INSTANTIATING IT
                  //  itemAdapter.add(userAddedItem);
                    listItems.add(userAddedItem);
                    itemAdapter.notifyDataSetChanged();
                    userAddsItem.setText("");
                }
                // if user does not add anything, provide message to user to enter item
                else
                {
                    Toast.makeText(getApplicationContext(), "Please Insert Item",Toast.LENGTH_LONG).show();
                }
                showToast(userAddedItem);
                // added below to print items in list for testing
                System.out.println(listItems);
            }
        });
    }

    // added below - TEMPORARY.... method to add items
    public void addItems(View v) {
        itemAdapter.add(userAddedItem);
    }

        private void showToast(String text) {
            Toast.makeText(BasicListTemp.this, text, Toast.LENGTH_SHORT).show();

        }

}