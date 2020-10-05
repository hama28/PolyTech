package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "onCreate",Toast.LENGTH_SHORT).show();
    }
    protected  void onRestart() {
        super.onRestart();;
        Toast.makeText(MainActivity.this,"onRestart",Toast.LENGTH_SHORT).show();
    }
    protected  void onDestory() {
        Toast.makeText(MainActivity.this,"onDestory",Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
    protected  void onStop() {
        Toast.makeText(MainActivity.this,"onStop",Toast.LENGTH_SHORT).show();
        super.onStop();
    }
    protected  void onPause() {
        Toast.makeText(MainActivity.this,"onPause",Toast.LENGTH_SHORT).show();
        super.onPause();
    }
    protected  void onResume() {
        Toast.makeText(MainActivity.this,"onResume",Toast.LENGTH_SHORT).show();
        super.onResume();
    }
    protected  void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this,"onStart",Toast.LENGTH_SHORT).show();
    }
}