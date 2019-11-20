package com.example.mysampleapplication;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


public class WelcomeScreen extends Activity {
    Button button;
    EditText email;
    EditText pass;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        Bundle b = getIntent().getExtras();
        TextView email = findViewById(R.id.nameText);
        TextView pass = findViewById(R.id.password);
        email.setText(b.getString("Username"));
        pass.setText(b.getCharSequence("password"));

    }
}
