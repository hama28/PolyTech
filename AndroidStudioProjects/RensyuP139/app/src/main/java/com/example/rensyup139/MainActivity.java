package com.example.rensyup139;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button,button2;
    Timer timer;
    Handler handler = new Handler();
    int time;
    ToneGenerator tone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tone = new ToneGenerator(AudioManager.STREAM_SYSTEM,ToneGenerator.MAX_VOLUME);
        textView = (TextView)findViewById(R.id.textView);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                time = 0;
                timer = new Timer(true);
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        time++;
                        tone.startTone(ToneGenerator.TONE_PROP_BEEP);
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                textView.setText("" + time + " 秒経過");
                            }
                        });
                    }
                } , 0 , 1000);
            }
        });
        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timer.cancel();
            }
        });
    }
}