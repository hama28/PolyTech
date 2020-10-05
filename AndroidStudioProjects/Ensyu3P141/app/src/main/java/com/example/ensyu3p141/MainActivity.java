package com.example.ensyu3p141;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    TextView textView3,textView5;
    EditText settime;
    Button button,button2;
    Timer timer;
    Handler handler = new Handler();
    double time;

    ToneGenerator tone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tone = new ToneGenerator(AudioManager.STREAM_SYSTEM,ToneGenerator.MAX_VOLUME);
        textView3 = (TextView)findViewById(R.id.textView3);
        textView5 = (TextView)findViewById(R.id.textView5);
        settime = (EditText) findViewById(R.id.editTextNumber);

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView5.setText(" ");
                time = 0;
                timer = new Timer(true);
                timer.schedule(new  TimerTask() {
                    @Override
                    public void run() {
                        time += 0.1;
                        tone.startTone(ToneGenerator.TONE_PROP_BEEP);
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                if (time < 10.0) {
                                    textView3.setText("" + String.format("%.1f", time) + "秒");
                                } else {
                                    textView3.setText(" ??? 秒");
                                }
                            }
                        });
                    }
                }, 0 ,100);
            }
        });

        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timer.cancel();
                textView3.setText("" + String.format("%.1f", time) + "秒");
                String set = settime.getText().toString();
                double set1 = Double.parseDouble(set);
                double ans = time - set1;
                String ans1 = String.valueOf(ans);
                textView5.setText(String.format("%.1f", ans) + "秒");

            }
        });
    }
}