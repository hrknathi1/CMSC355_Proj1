package com.example.androidapp_todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

// class that allows a user to add an item to a list
// *NOTE: Need functionality for when user enters items, where are they stored, etc.
public class BasicListTemp extends AppCompatActivity {

    // variables for basic list temp activity (aka: adding items, accepting user input, submit button)
    // where we will store the info collected
    String userAddedItem;

    // fields that user inputs into
    EditText userAddsItem;

    // add item button
    Button addItemButton;

    // arrays used to store user list entries
    ArrayList<String> listItems;
    ArrayAdapter<String> itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_list_temp);

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
                    itemAdapter.add(userAddedItem);
                    listItems.add(userAddedItem);
                    userAddsItem.setText("");
                }
                // if user does not add anything, provide message to user to enter item
                else
                {
                    Toast.makeText(getApplicationContext(), "Please Insert Item",Toast.LENGTH_LONG).show();
                }
                showToast(userAddedItem);
            }
        });
    }

        private void showToast(String text) {
            Toast.makeText(BasicListTemp.this, text, Toast.LENGTH_SHORT).show();
        }

}