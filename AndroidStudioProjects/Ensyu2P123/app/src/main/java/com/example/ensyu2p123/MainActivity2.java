package com.example.ensyu2p123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Intent intent = getIntent();
        String price = intent.getStringExtra("合計金額");
        String people = intent.getStringExtra("人数");
        Long totalprice = Long.parseLong(price);
        Long totalpeople = Long.parseLong(people);
        final Long warikan = totalprice / totalpeople;

        TextView textView = (TextView)findViewById(R.id.textView4);
        textView.setText(totalprice + " 円");
        TextView textView1 = (TextView)findViewById(R.id.textView6);
        textView1.setText(totalpeople + " 人");
        TextView textView2 = (TextView)findViewById(R.id.textView8);
        textView2.setText(warikan + " 円 也");

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent();
                String total = warikan.toString();
                intent1.putExtra("結果",total);
                setResult(RESULT_OK,intent1);
                finish();
            }
        });

    }
}