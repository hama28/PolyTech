package com.example.ensyu2p123;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==1 && resultCode==RESULT_OK) {
            String total = data.getStringExtra("結果");
            TextView textView9 = (TextView)findViewById(R.id.textView9);
            textView9.setText("計算結果　　" + total + "円");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText1 = (EditText)findViewById(R.id.editTextNumber);
                String price = editText1.getText().toString();
                EditText editText2 = (EditText)findViewById(R.id.editTextNumber2);
                String people = editText2.getText().toString();

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("合計金額",price);
                intent.putExtra("人数",people);
                startActivityForResult(intent,1);
            }
        });
    }
}