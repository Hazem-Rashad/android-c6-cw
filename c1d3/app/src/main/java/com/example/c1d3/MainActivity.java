package com.example.c1d3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Items>something = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lestview = findViewById(R.id.listviwe);

        Items first = new Items("cheese", R.drawable.cheese , 20.0);
       Items suc = new Items("chocolate", R.drawable.choc , 20.2);
       Items ther = new Items("donut", R.drawable.dounat, 33.1);

       something.add(suc);
       something.add(ther);
        something.add(first);
        ItemsAdapter itemAdepter = new ItemsAdapter(this , 0 , something);

        lestview.setAdapter(itemAdepter);
    }
}