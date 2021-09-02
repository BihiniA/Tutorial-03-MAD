package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText text_1;
    EditText text_2;
    TextView text_3;

    //assign values in globle variables
    String number1;
    String number2;

    int n1;
    int n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text_1 = findViewById(R.id.text_1);
        text_2 = findViewById(R.id.text_2);
        text_3 = findViewById(R.id.text_3);

        Intent intent = getIntent();
        number1 = intent.getStringExtra("n1");
        number2 = intent.getStringExtra("n2");

        text_1.setText(number1);
        text_2.setText(number2);

        n1 = Integer.parseInt(number1);
        n2 = Integer.parseInt(number2);

    }

    //Calculation for Add button
    public void add(View view) {
        text_3.setText(number1 + "+" + number2 + "+" + (n1 + n2));
    }

    //Calculation for subtract button
    public void subtract(View view) {
        text_3.setText(number1 + "-" + number2 + "+" + (n1 - n2));
    }

    //Calculation for multiply button
    public void multiply(View view) {
        text_3.setText(number1 + "*" + number2 + "+" + (n1 * n2));
    }

    //Calculation for divide button
    public void divide(View view) {
        text_3.setText(number1 + "/" + number2 + "+" + (n1 / n2));
    }
}