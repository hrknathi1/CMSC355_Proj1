package com.example.androidapp_todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.icu.text.DisplayContext;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// class that allows a user to add an item to a list
// *NOTE: Need functionality for when user enters items, where are they stored, displayed, etc.
public class BasicListTemp extends AppCompatActivity {

    // variables for basic list temp activity (aka: adding items, accepting user input, submit button)
    String userAddedItem = "";
  //  String userEditedItem = "";
    String listItemView;
    public ArrayList<String> itemsInList;

    // fields that user inputs into
    EditText userAddsItem;

    // add item button
    Button addItemButton;
    EditText inputText;
    View simpleListView;
    ArrayList<String> list;
    ListView listView;

    // arrays used to store user list entries
    ArrayList<String> listItems;
    ArrayAdapter<String> itemAdapter;
    private String[] StringArray;
    // ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.activity_list_view,R.id.textView,StringArray);

    // added below - necessary for array adapter ?
    private Context context;

   // @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_list_temp);

        addItemButton = findViewById(R.id.addButton);
        inputText = findViewById(R.id.userAddsItem);
        simpleListView =findViewById(R.id.listView);
        list = new ArrayList<>();
//        ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, list);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, listItems);
      //  listView.setAdapter(adapter);
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
                  //  itemAdapter.add(userAddedItem);
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
                itemsInList = listItems;

                String text = inputText.getText().toString();
                list.add(text);
//                ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
                //   ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, list);
                // ListView listView = null;
          //      ListView listView = (ListView) view.findViewById(R.id.listView);
           //     listView.setAdapter(adapter);

//                // added below - testing, may need to delete
//                for (Iterator<String> i = listItems.iterator(); i.hasNext();) {
//                   simpleListView = i.next();
//                }
                getItemsInList();
                getUserAddedItem();


               // simpleListView = getUserAddedItem();
                        // getDisplay().toString()getUserAddedItem();

               // Calling open list method will pull up new screen (where, theoretically, items in list will be dsiplay... working on alt, to display on same add screen)
              // openList();
            }

            // added below method for something trying to display items user enters
            public void onClickAdd(View view) {
                String text = inputText.getText().toString();
                list.add(text);
//                ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
             //   ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, list);
               // ListView listView = null;
                ListView listView = (ListView) view.findViewById(R.id.listView);
                listView.setAdapter(adapter);
            }

        });
    }

    // added getter for userAddedItem (single / most recent item?)
    public String getUserAddedItem() {
        return userAddedItem;
    }

    // added getter for array list of items user entered
    public ArrayList<String> getItemsInList() {
        return itemsInList;
    }

    // added below - TEMPORARY.... method to add items
    public void addItems(View v) {
        itemAdapter.add(userAddedItem);

    }

        private void showToast(String text) {
            Toast.makeText(BasicListTemp.this, text, Toast.LENGTH_SHORT).show();

        }

//need to be able to make edit after adding aswell in this

    // added below - this should open a new activity, but may need to correct name of activity (and should update method name/origin of that name)
    public void openList() {
        Intent intent = new Intent(this, ListView.class);
        startActivity(intent);
        // added below - it's not working
        getItemsInList();
        getUserAddedItem();
        listItemView = getUserAddedItem();
        }

}