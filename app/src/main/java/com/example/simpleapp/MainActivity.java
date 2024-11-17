package com.example.simpleapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Custom ListView
        ListView customListView = findViewById(R.id.customListView);
        ArrayList<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        customListView.setAdapter(adapter);

        // Expandable ListView
        ExpandableListView expandableListView = findViewById(R.id.expandableListView);
        List<String> groupList = new ArrayList<>();
        HashMap<String, List<String>> childMap = new HashMap<>();

        // Group Items
        groupList.add("Fruits");
        groupList.add("Vegetables");

        // Child Items
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");

        List<String> vegetables = new ArrayList<>();
        vegetables.add("Carrot");
        vegetables.add("Broccoli");

        childMap.put("Fruits", fruits);
        childMap.put("Vegetables", vegetables);

        ExpandableListAdapter expandableAdapter = new ExpandableListAdapter(this, groupList, childMap);
        expandableListView.setAdapter(expandableAdapter);
    }
}
