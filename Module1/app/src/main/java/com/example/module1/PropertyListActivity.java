package com.example.module1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PropertyListActivity extends AppCompatActivity {

    RecyclerView rcvPropertyList;
    ImageView btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_list);
        getSupportActionBar().setTitle("Your Listings");

        setControl();
        setAdapter();
        setEvent();
    }

    private void setAdapter() {
        PropertyListAdapter propertyListAdapter = new PropertyListAdapter(this);
        rcvPropertyList.setLayoutManager(new LinearLayoutManager(this));
        rcvPropertyList.setAdapter(propertyListAdapter);
    }

    private void setEvent() {
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void setControl() {
        rcvPropertyList = findViewById(R.id.rcvPropertyList);
        btnLogout = findViewById(R.id.btnLogout);
    }
}