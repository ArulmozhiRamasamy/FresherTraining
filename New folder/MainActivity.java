package com.example.mybasiclogicapplication;

import android.os.Build;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    Button login;
    LocalBroadcastManager mngr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {





        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        login=findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                if(Objects.equals(username.getText().toString(), "shanmuga")&&Objects.equals(password.getText().toString(),"sundaram"))
                {
                    Toast.makeText(MainActivity.this,"You have Authenticated Successfully",Toast.LENGTH_LONG).show();
                }else
                {
                    Toast.makeText(MainActivity.this,"Authentication Failed",Toast.LENGTH_LONG).show();
                }
            }
        }
        );

    }
}