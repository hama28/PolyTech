package com.example.rensyup121;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String name = intent.getStringExtra("名前");
        String mail = intent.getStringExtra("メール");
        int age = intent.getIntExtra("年齢",1);
        String msg = name + ":" + mail + ":" + Integer.toString(age);
        Toast.makeText(MainActivity2.this,msg,Toast.LENGTH_SHORT).show();
        Button btn = (Button)findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}