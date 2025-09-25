package com.example.wireframeapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    BakeryAdapter adapter;
    List<BakeryItem> bakeryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        bakeryList = new ArrayList<>();
        bakeryList.add(new BakeryItem("Macaron", R.drawable.macaron));
        bakeryList.add(new BakeryItem("Cupcake", R.drawable.cupcake));
        bakeryList.add(new BakeryItem("Roll Cake", R.drawable.rollcake));
        bakeryList.add(new BakeryItem("Donut", R.drawable.donut));
        bakeryList.add(new BakeryItem("Macaron 2", R.drawable.macaron));
        bakeryList.add(new BakeryItem("Cupcake 2", R.drawable.cupcake));
        bakeryList.add(new BakeryItem("Roll Cake 2", R.drawable.rollcake));
        bakeryList.add(new BakeryItem("Donut 2", R.drawable.donut));

        adapter = new BakeryAdapter(bakeryList);
        recyclerView.setAdapter(adapter);
    }
}
