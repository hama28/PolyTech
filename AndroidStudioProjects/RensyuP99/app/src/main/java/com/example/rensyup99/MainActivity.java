package com.example.rensyup99;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyButton btn = (MyButton)findViewById(R.id.view);
        btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                MyButton myb = (MyButton)view;
                myb.setPosx(motionEvent.getX());
                myb.setPosy(motionEvent.getY());
                myb.invalidate();
                return false;
            }
        });
        Button btn2 = (Button)findViewById(R.id.button);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyButton mybtn = (MyButton)findViewById(R.id.view);
                mybtn.setPosx(100f);
                mybtn.setPosy(100f);
                mybtn.invalidate();
            }
        });
    }
}