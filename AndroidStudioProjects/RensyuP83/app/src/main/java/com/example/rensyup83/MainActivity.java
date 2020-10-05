package com.example.rensyup83;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCopyClick(View v) {
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        if (Boolean.valueOf(imageView.getTag().toString()) == true) {
            imageView.setImageResource(R.drawable.pin001);
            imageView.setTag(false);
        } else {
            imageView.setImageResource(R.drawable.pin002);
            imageView.setTag(true);
        }
    }
}