package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText text_1;
    EditText text_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_1 = findViewById(R.id.text_1);
        text_2 = findViewById(R.id.text_2);
    }

    //navigation
    public void openSecond(View view) {
        Intent intent = new Intent(this,SecondActivity.class);

        String tv_num1 = text_1.getText().toString();
        String tv_num2 = text_2.getText().toString();

        intent.putExtra("n1", tv_num1);
        intent.putExtra("n2", tv_num2);

        LayoutInflater li = getLayoutInflater();
        View layout = li.inflate(R.layout.custom_toast, findViewById(R.id.toast));

        Toast toast = new Toast(this);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM, 0,0);
        toast.setView(layout);
        toast.show();

        startActivity(intent);
    }
}