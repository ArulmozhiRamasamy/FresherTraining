package com.javahelps.sample.listviewdemo;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         listView=(ListView)findViewById(R.id.listview);

        ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("ragul");
        arrayList.add("shanmuga");
        arrayList.add("sundaram");
        arrayList.add("rama");
        arrayList.add("kamal");
        arrayList.add("rajini");
        arrayList.add("vijay");
        arrayList.add("ajith");
        arrayList.add("gread");
        arrayList.add("vishal");
        arrayList.add("is");
        arrayList.add("gread");
        arrayList.add("strar");
        arrayList.add("ragul");
        arrayList.add("shanmuga");
        arrayList.add("sundaram");
        arrayList.add("hema");
        arrayList.add("kamal");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
    }
}
