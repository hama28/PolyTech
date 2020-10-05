package com.example.rensyup82;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = (TextView)findViewById(R.id.textView);
        ImageButton imbtn1 = (ImageButton)findViewById(R.id.imageButton);
        final  ImageButton imbtn2 = (ImageButton)findViewById(R.id.imageButton2);
        imbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("ImageButton");
            }
        });
        imbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("ImageButton2");
                imbtn2.setBackgroundColor(Color.GREEN);
            }
        });
    }
}