package com.example.ensyu322;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
        Button ledt_btn = (Button)findViewById(R.id.button);
                ledt_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                textView.setText(Integer.toString(count));
            }
        });
        Button right_btn = (Button)findViewById(R.id.button2);
        right_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                textView.setText(Integer.toString(count));
            }
        });
        Button down_btn = (Button)findViewById(R.id.button3);
        down_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count > 0){
                    count--;
                }
                textView.setText(Integer.toString(count));
            }
        });
    }

}