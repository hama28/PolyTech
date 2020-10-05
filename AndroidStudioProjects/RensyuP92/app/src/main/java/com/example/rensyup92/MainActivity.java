package com.example.rensyup92;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ToggleButton toggleButton = (ToggleButton)findViewById(R.id.toggleButton);
        final TextView textView = (TextView)findViewById(R.id.textView);
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToggleButton toggleButton = (ToggleButton)view;
                if (toggleButton.isChecked()) {
                    Log.d("TGL","トグルボタンON");
                    textView.setText("トグルボタンON");
                } else {
                    Log.d("TGL","トグルボタンOFF");
                    textView.setText("トグルボタンOFF");
                }
            }
        });
    }
}