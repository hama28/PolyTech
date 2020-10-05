package com.example.rensyup133;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (TextView)findViewById(R.id.textView);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText("ON");
            }
        });

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText("OFF");
                Thread th = new myThread();
                th.start();
            }
        });
    }
    public class myThread extends Thread {
        @Override
            public void run() {
                for (int i=0; i<5; i++) {
                    Log.d("test","thread" + i);
                    try{
                        Thread.sleep(1000);
                        handler.post(new Thread(){
                            @Override
                            public void run(){
                                txt.setText("スレッド起動");
                            }
                        });
                    } catch (InterruptedException e) {
                    }
                }
            }
        }
    
}