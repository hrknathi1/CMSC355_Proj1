package com.example.androidapp_todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

// KassieFeature - adding a quick note page to jot down quick thoughts (like a post-it note)
public class QuickNotes extends AppCompatActivity {

    EditText editTextNote;
    String userQuickNote0 = "";
    Button button0;
    TextView QuickNoteDisplay;
    int displayBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_notes);

        Intent intent = getIntent();

        editTextNote = findViewById(R.id.editTextNote);
        QuickNoteDisplay = findViewById(displayBox);
        button0 = findViewById(R.id.Button0);

        button0.setOnClickListener(new View.OnClickListener() {

            @Override  // Determines 'what' (aka the text entry box) the "add" button click reacts to/inputs into textView field
            public void onClick (View v){
                editTextNote.setText(userQuickNote0);

                // if user enters something, add it
                if (!(userQuickNote0.equals(""))) {
//                   QuickNoteDisplay.setText(userQuickNote0);
                           //userQuickNote0;
                    QuickNoteDisplay.setText(userQuickNote0);
                   // userQuickNote0 = editTextNote.getText().toString();

                }
                // if user does not add anything, provide message to user to enter item
                else {
                    Toast.makeText(getApplicationContext(), "Please Insert Item", Toast.LENGTH_LONG).show();
                }

                showToast(userQuickNote0);
                String userQuickNote0 = editTextNote.getText().toString();

           //     QuickNoteDisplay.setText(userQuickNote0);

            }
        });
    }


    private void showToast(String text) {
            Toast.makeText(QuickNotes.this, text, Toast.LENGTH_SHORT).show();

        }

}