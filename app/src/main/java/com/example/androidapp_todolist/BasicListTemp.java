package com.example.androidapp_todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

// class that allows a user to add an item to a list
// *NOTE: Need functionality for when user enters items, where are they stored, displayed, etc.
public class BasicListTemp extends AppCompatActivity {

    // variables for basic list temp activity (aka: adding items, accepting user input, submit button)
    String userAddedItem = "";
  //  String userEditedItem = "";
    String listItemView;
    public ArrayList<String> itemsInList;
    Timer timer;

    // fields that user inputs into
    EditText userAddsItem;

    // add item button
    Button addItemButton;
    EditText inputText;
    View simpleListView;
    ArrayList<String> list;
    ListView listView;
    TextView txtView;
    TextView txt2View;

    // arrays used to store user list entries
    ArrayList<String> listItems;

//    String myList = "This is my list";

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

        // added below
        ArrayList<String> listItems = new ArrayList<String>();
 //       listItems.add(String myList);
        // ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, (List<String>) userAddsItem);
        ArrayAdapter<String> itemAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, (List<String>) userAddsItem);

        userAddsItem = (EditText) findViewById(R.id.userAddsItem);
        addItemButton = (Button) findViewById(R.id.addItemButton);

        // button functionality
        addItemButton.setOnClickListener(new View.OnClickListener() {

            @Override  // I believe this determines 'what' (aka the text entry box) the "add" button click reacts to
            public void onClick(View v) {
    //            listItems.add(myList);
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

                txtView.setText((CharSequence) simpleListView);

               // displayItems();

//                    for(int item = 0; item < listItems.size(); item ++){
//                    if(listItems[item].size() >= 1){
//                        View view = ListView.listItems[item];
//                        TextView textview = view.findViewById(your textView id);
//                        // do some thing
//                    }
                }


            public void displayItems() {
                //Printing string array list values on screen.
//                for(int i=0; i < listItems.size(); i++){
//                    txtView.setText(txtView.getText() + listItems.get(i) + "/n");
//                }
//                txt2View.findViewById(textView2);
                for(int i=0; i < listItems.size(); i++) {
//                    txt2View.setText(txt2View.getText() + listItems.get(i) + "/n");
                    String displayTxt = listItems.get(i) + "n/";
//                    txt2View.findViewById(R.id.textView2);
                    txt2View.findViewById(R.id.textView2);
                    // simpleListView.addTouchables(itemsInList);
                   // txt2View = displayTxt;
                }
                ListView simpleListView;
                }
        });
        // run();
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


    // added below - this should open a new activity, but may need to correct name of activity (and should update method name/origin of that name)
    public void openList() {
//        Intent intent = new Intent(this, ListView.class);
//        startActivity(intent);

        // cancelling out below for now, going to try to get to display on same (this) screen instead
//        Intent intent = new Intent(this, ListView.class);
//        intent.putStringArrayListExtra("key",itemsInList);
//        startActivity(intent);

        // added below - it's not working
        getItemsInList();
        getUserAddedItem();
        listItemView = getUserAddedItem();
        }

}