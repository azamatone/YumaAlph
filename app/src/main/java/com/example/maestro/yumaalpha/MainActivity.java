package com.example.maestro.yumaalpha;

import android.app.Application;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView vertical_recycler_view;
    VerticalAdapter verticalAdapter;
    private List<Data> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vertical_recycler_view= (RecyclerView) findViewById(R.id.horizontal_recycler_view);

        data = fill_with_data();


        verticalAdapter=new VerticalAdapter(data, getApplication());

        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        vertical_recycler_view.setLayoutManager(horizontalLayoutManager);
        vertical_recycler_view.setAdapter(verticalAdapter);

    }

    public List<Data> fill_with_data() {

        List<Data> data = new ArrayList<>();

        data.add(new Data( R.drawable.img1, "Text 1"));
        data.add(new Data( R.drawable.img2, "Text 2"));
        data.add(new Data( R.drawable.img1, "Text 3"));
        data.add(new Data( R.drawable.img2, "Text 4"));
        data.add(new Data( R.drawable.img1, "Text 5"));
        data.add(new Data( R.drawable.img2, "Text 6"));
        data.add(new Data( R.drawable.img1, "Text 7"));
        data.add(new Data( R.drawable.img2, "Text 8"));
        data.add(new Data( R.drawable.img1, "Text 9"));
        data.add(new Data( R.drawable.img2, "Text 10"));


        return data;
    }


}