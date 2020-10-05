package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tview = (TextView)findViewById(R.id.textView);
        tview.setText("イベント検出");
        TextView tview2 = (TextView)findViewById(R.id.textView2);
        tview2.setText("onCreate 発生");

        CheckBox chkbox1 = (CheckBox)findViewById(R.id.checkBox1);
        chkbox1.setText("りんご");
        chkbox1.setChecked(false);
        CheckBox chkbox2 = (CheckBox)findViewById(R.id.checkBox2);
        chkbox2.setText("みかん");
        chkbox2.setChecked(true);

        Button btn1 = (Button)findViewById(R.id.button1);
        btn1.setText("送信");
        Button btn2 = (Button)findViewById(R.id.button2);
        btn2.setText("終了");

    }
}