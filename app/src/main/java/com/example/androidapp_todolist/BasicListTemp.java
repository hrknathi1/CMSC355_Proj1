package com.example.androidapp_todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BasicListTemp extends AppCompatActivity {

    // variables for basic list temp activity (aka: adding items, accepting user input, submit button)
    // where we will store the info collected
    String userAddedItem;

    // fields that user inputs into
    EditText userAddsItem;

    // add item button
    Button addItemButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_list_temp);

        userAddsItem = (EditText) findViewById(R.id.userAddsItem);

        addItemButton = (Button) findViewById(R.id.addItemButton);
        // button functionality
        addItemButton.setOnClickListener(new View.OnClickListener() {
            @Override  // I believe this determines what the "add" button click reacts to
            public void onClick(View v) {
                userAddedItem = userAddsItem.getText().toString();

                showToast(userAddedItem);
            }
        });
    }

        private void showToast(String text) {
            Toast.makeText(BasicListTemp.this, text, Toast.LENGTH_SHORT).show();
        }

}