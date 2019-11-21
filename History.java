package com.example.optionmenubar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.history, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.profile:
                Intent intent=new Intent(History.this,Profile.class);
                startActivity(intent);
                Toast.makeText(this,"profile",Toast.LENGTH_LONG).show();
        }
        switch (item.getItemId()) {
            case R.id.History:
                Intent intent=new Intent(History.this,History.class);
                startActivity(intent);
                Toast.makeText(this,"History",Toast.LENGTH_LONG).show();
        }
        switch (item.getItemId()) {
            case R.id.Help:
                Intent intent=new Intent(History.this,Help.class);
                startActivity(intent);
                Toast.makeText(this,"Help",Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
