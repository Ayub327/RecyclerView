package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private MyAdapter myAdapter;
    private int[] flags ={
            R.drawable.bangladesh_icon,R.drawable.pakistan_icon,R.drawable.nepal,R.drawable.afghanistan,
            R.drawable.japan,R.drawable.bahrain,R.drawable.armenia,
            R.drawable.china,R.drawable.azerbaijan,R.drawable.koinobori,
    };
    private String[] countryNames,desc;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewId);
        countryNames = getResources().getStringArray(R.array.country_names);
        desc = getResources().getStringArray(R.array.country_desc);

        myAdapter = new MyAdapter(this,countryNames,desc,flags);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}