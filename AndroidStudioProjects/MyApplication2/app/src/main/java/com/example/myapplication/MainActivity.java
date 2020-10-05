package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylayout);
        // setContentView(R.layout.mylayout);

        /*
         textview = (TextView)findViewById(R.id.textView);

        Button left_btn =(Button)findViewById(R.id.button);
        left_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview.setText("初めまして");
            }
        });
        Button right_btn = (Button)findViewById(R.id.button2);
        right_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum = 0;
                for (int i = 0; i <= 10; i++){
                    sum += i;
                }
                textview.setText(new Integer(sum).toString());
            }
        });
         */

    }
}