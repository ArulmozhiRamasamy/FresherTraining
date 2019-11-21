package com.example.myapplication2;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
 RecyclerView recyclerView;
 RecyclerAdapter recyclerAdapter;
 List<String> android_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android_name =new ArrayList<>();
        recyclerView= findViewById(R.id.recyclerView);
        recyclerAdapter=new RecyclerAdapter(android_name);
       // recyclerView.setLayoutManager(new LinearLayoutManager(this));
        DividerItemDecoration dividerItemDecoration=new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setAdapter(recyclerAdapter);
        android_name.add("Android:Alpha");
        android_name.add("Android:Beta");
        android_name.add("Android 1.5:Cupcake");
        android_name.add("Android 1.6:Donut");
        android_name.add("Andrid 2.0:Eclair");
        android_name.add("Andrid 2.1:Eclair");
        android_name.add("Android 2.2:Froyo");
        android_name.add("Android 2.3:Gingerbread");
        android_name.add("Android 2.4:Gingerbread");
        android_name.add("Android 3.0:Honeycomb");
        android_name.add("Android 3.1:Honeycomb");
        android_name.add("Android 3.2:Honeycomb");
        android_name.add("Android 4.0:Icecream sandwich");
        android_name.add("Anroid 4.1:Jelly bean");
        android_name.add("Android 4.4:Kitkat");
        android_name.add("Android 5.x:Lollipop");
        android_name.add("Android 6.x:Marshmallow");
        android_name.add("Andrid 7:Nougat");
        android_name.add("Android 8:Oreo");
        android_name.add("Android 9:pie");


    }


    }


