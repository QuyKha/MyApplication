package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<Food> foodList = new ArrayList<Food>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        listView.setAdapter(new ListFoodAdapter(this, foodList, R.layout.list_item));

        listView.setOnItemClickListener((new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Food food = (Food) listView.getItemAtPosition(i);
                Log.d("Jala", "onItemClick: "+ food.getDescription());
            }
        }));
    }

    private void init() {
        listView = findViewById(R.id.listFood);

        Food food1 = new Food("Tasty Donut", "Spicy tasty donut family", "10.00$", R.drawable.donut_red);
        Food food2 = new Food("Pink Donut", "Spicy tasty donut family", "20.00$", R.drawable.donut_yellow);
        Food food3 = new Food("Floating Donut", "Spicy tasty donut family", "30.00$", R.drawable.green_donut);
        Food food4 = new Food("Tasty Donut", "Spicy tasty donut family", "40.00$", R.drawable.tasty_donut);

        foodList.add(food1);
        foodList.add(food2);
        foodList.add(food3);
        foodList.add(food4);
    }
}