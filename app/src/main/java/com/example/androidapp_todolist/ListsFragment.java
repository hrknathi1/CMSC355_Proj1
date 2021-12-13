package com.example.androidapp_todolist;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ListsFragment extends Fragment {

    Button create_list_btn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lists, container, false);

        // pop-up feature for creating list
        create_list_btn = (Button) view.findViewById(R.id.create_list_btn);

        create_list_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity().getApplicationContext(), PopActivity.class);
                startActivity(i);
            }
        });
        return view;
    }
}
