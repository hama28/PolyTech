package com.example.ensyu3p123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        int mVX = intent.getIntExtra("mVX",10);
        int mVY = intent.getIntExtra("mVY",20);

        MyView myView = (MyView)findViewById(R.id.myView);
        myView.bl1.setmVXY(mVX,mVY);
        myView.bl2.setmVXY(mVX,mVY);

        Button button = (Button)findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}