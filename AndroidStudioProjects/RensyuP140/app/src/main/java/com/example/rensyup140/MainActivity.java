package com.example.rensyup140;

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
    TextView timer;
    Button button,button2;
    MyCountDownTimer count;
    ToneGenerator tone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timer = (TextView)findViewById(R.id.textView);
        button = (Button)findViewById(R.id.button);
        tone = new ToneGenerator(AudioManager.STREAM_SYSTEM,ToneGenerator.MAX_VOLUME);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = new MyCountDownTimer(10000,100);
                count.start();
            }
        });
        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
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
                public void onTick(long millisUntilFinished) {
            timer.setText(Long.toString(millisUntilFinished/1000/60) + ":" + Long.toString(millisUntilFinished/1000%60) + ":" + Long.toString(millisUntilFinished));
            tone.startTone(ToneGenerator.TONE_PROP_BEEP);
        }
        @Override
        public void onFinish() {
            timer.setText("0");
            Toast.makeText(getApplicationContext(),"終了",Toast.LENGTH_SHORT).show();
            tone.startTone(ToneGenerator.TONE_PROP_BEEP);
        }
    }
}