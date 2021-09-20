package com.example.cs407_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView answerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        answerView = (TextView) findViewById(R.id.answerView);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        answerView.setText("Answer: " + str);
    }
}