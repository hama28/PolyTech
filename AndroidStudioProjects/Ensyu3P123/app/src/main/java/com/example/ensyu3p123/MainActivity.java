package com.example.ensyu3p123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = (EditText)findViewById(R.id.editTextNumber);
                int mVX = Integer.parseInt(editText.getText().toString());
                EditText editText1 = (EditText)findViewById(R.id.editTextNumber2);
                int mVY = Integer.parseInt(editText1.getText().toString());

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("mVX", mVX);
                intent.putExtra("mVY",mVY);
                startActivity(intent);
            }
        });
    }
}