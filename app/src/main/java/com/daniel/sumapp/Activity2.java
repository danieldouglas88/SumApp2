package com.daniel.sumapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.NumberFormat;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        String number = intent.getStringExtra(MainActivity.EXTRA_NUMBER);

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView textView6 = (TextView) findViewById(R.id.textView6);

        textView2.setText(text);
        textView3.setText(number);

        int result = Integer.parseInt(text) + Integer.parseInt(number);
        textView6.setText(String.valueOf(result));

    }
}
