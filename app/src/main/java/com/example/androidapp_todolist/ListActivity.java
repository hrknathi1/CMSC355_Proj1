package com.example.androidapp_todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity
{
    ArrayList<String> data;
    ArrayAdapter<String> dataAdapter;
    ListView listView;
    Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = findViewById(R.id.listView);
        addButton = findViewById(R.id.addButton);


        addButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                addItem(v);

            }
        });

        data = new ArrayList<>();
        dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        listView.setAdapter(dataAdapter);
        setListViewListener();




    }

    private void setListViewListener()
    {

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
        {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id)
            {
                Context context = getApplicationContext();
                Toast.makeText(context,"Item Removed",Toast.LENGTH_LONG).show();

                data.remove(position);
                dataAdapter.notifyDataSetChanged();
                return false;
            }
        });


    }


    private void addItem(View v)
    {
        EditText input = findViewById(R.id.addText);
        String itemText = input.getText().toString();

        if(!(itemText.equals("")))
        {
            dataAdapter.add(itemText);
            input.setText("");

        }
        else
            {
                Toast.makeText(getApplicationContext(), "Please Insert Item",Toast.LENGTH_LONG).show();
            }

    }


}









