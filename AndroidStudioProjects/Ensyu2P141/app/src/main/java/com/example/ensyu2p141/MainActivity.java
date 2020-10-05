package com.example.ensyu2p141;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button,button2,button3,button4;
    MyCountDownTimer count;
    ToneGenerator tone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
        tone = new ToneGenerator(AudioManager.STREAM_SYSTEM,ToneGenerator.MAX_VOLUME);

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = new MyCountDownTimer(5*60000,1000);
                count.start();
            }
        });
        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = new MyCountDownTimer(3*60000,1000);
                count.start();
            }
        });
        button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = new MyCountDownTimer(60000,1000);
                count.start();
            }
        });
        button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count.cancel();
            }
        });
    }

    private class MyCountDownTimer extends CountDownTimer {
        public MyCountDownTimer(long millsInFuture, long countDownInterval) {
            super(millsInFuture, countDownInterval);
        }
        @Override
        public void onTick(long millisUntilFinished) {
            textView.setText(Long.toString(millisUntilFinished/1000/60) + ":" + Long.toString(millisUntilFinished/1000%60));
            tone.startTone(ToneGenerator.TONE_PROP_BEEP);
        }
        @Override
        public void onFinish() {
            textView.setText("0");
            Toast.makeText(getApplicationContext(),"終了",Toast.LENGTH_SHORT).show();
            tone.startTone(ToneGenerator.TONE_PROP_BEEP);
        }
    }
}