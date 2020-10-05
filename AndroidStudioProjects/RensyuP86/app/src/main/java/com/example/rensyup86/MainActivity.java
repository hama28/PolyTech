package com.example.rensyup86;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox chkbox1;
    CheckBox chkbox2;
    CheckBox chkbox3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkbox1 = (CheckBox)findViewById(R.id.checkBox1);
        chkbox2 = (CheckBox)findViewById(R.id.checkBox2);
        chkbox3 = (CheckBox)findViewById(R.id.checkBox3);
        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new Button1ClickListner());
        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new Button2ClickListner());
    }

    class Button1ClickListner implements View.OnClickListener {
        public void onClick(View v) {
            String msg="";
            if (chkbox1.isChecked() == true) {
                msg = msg + "たまねぎON";
            } else {
                msg = msg + "たまねぎOFF";
            }
            if (chkbox2.isChecked() == true) {
                msg = msg + "とまとON";
            } else {
                msg = msg + "とまとOFF";
            }
            if (chkbox3.isChecked() == true) {
                msg = msg + "ピーマンON";
            } else {
                msg = msg + "ピーマンOFF";
            }
            Toast toast;
            toast = Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    class Button2ClickListner implements View.OnClickListener {
        public void onClick(View v) {
            chkbox1.setChecked(false);
            chkbox2.setChecked(false);
            chkbox3.setChecked(false);
        }
    }
}