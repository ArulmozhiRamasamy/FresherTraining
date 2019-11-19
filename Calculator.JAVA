package com.example.mycalculator;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10,
            button11, buttonadd, buttonsub, buttonmul, buttondiv, buttonequal, buttonclear;
    TextView edt1;
    float Num1;
    float Num2;
    boolean Addition, Subtract, Multiplication, Division;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        buttonadd = (Button) findViewById(R.id.button12);
        buttonsub = (Button) findViewById(R.id.button13);
        buttonmul = (Button) findViewById(R.id.button14);
        buttondiv = (Button) findViewById(R.id.button15);
        buttonequal = (Button) findViewById(R.id.button16);
        buttonclear = (Button) findViewById(R.id.button);
        edt1 = (TextView) findViewById(R.id.text);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "9");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "0");
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + ".");
            }
        });
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    Num1 = Float.parseFloat(edt1.getText() + "");
                    Num2 = Float.parseFloat(edt1.getText() + "");
                    Addition = true;
                    boolean decimal = false;
                    edt1.setText(edt1.getText() + "");
                    edt1.setText(null);
                }
            }
        });
        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Num1 = Float.parseFloat(edt1.getText() + "");
                Num2 = Float.parseFloat(edt1.getText() + "");
                Subtract = true;
                boolean decimal = false;
                edt1.setText(edt1.getText() + "");
                edt1.setText(null);
            }
        });

        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Num1 = Float.parseFloat(edt1.getText() + "");
                Num2 = Float.parseFloat(edt1.getText() + "");
                Multiplication = true;
                edt1.setText(null);
            }
        });

        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Num1 = Float.parseFloat(edt1.getText() + "");
                Num2 = Float.parseFloat(edt1.getText() + "");
                Division = true;
                edt1.setText(null);
            }
        });

        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Addition) {
                    edt1.setText(Num1 + Num2 + "");
                    Addition = false;
                }
                if (Subtract) {
                    edt1.setText(Num1 - Num2 + "");
                    Subtract = false;
                }
                if (Multiplication) {
                    edt1.setText(Num1 * Num2 + "");
                    Multiplication = false;
                }
                if (Division) {
                    edt1.setText(Num1 / Num2 + "");
                    Division = false;
                }
            }
        });
        buttonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
            }
        });
    }
}
