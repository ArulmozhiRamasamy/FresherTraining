package com.example.mysampleapplication;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginScreen extends Activity {
    Button button;
    EditText email ;
    EditText pass ;
  /*  public static final String MyPREFERENCES = "MyPrefs" ;
EditText email;
EditText pass;
    SharedPreferences sharedpreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        addListenerOnButton();
        email = findViewById(R.id.username);
        pass = findViewById(R.id.password);
        Button login = findViewById(R.id.login);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = email.getText().toString();
                String ph = pass.getText().toString();
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.commit();
                Toast.makeText(LoginScreen.this, "Welcome  " + n + "", Toast.LENGTH_LONG).show();


            }

        });*/
  @Override
  protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.login);

      addListenerOnButton();

}


    public void addListenerOnButton() {

        final Context context = this;
        email=findViewById(R.id.username);
        pass=findViewById(R.id.password);

        button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getApplicationContext(), WelcomeScreen.class);
                Bundle b=new Bundle();
                b.putString("Username", email.getText().toString());
                b.putString("password", pass.getText().toString());
                intent.putExtras(b);
                startActivity(intent);

            }

        });

    }

}

