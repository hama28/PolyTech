package com.example.rensyup144;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flag = true;
                Thread thread = new Thread(new Thread() {
                    @Override
                    public void run() {
                        MediaPlayer mediaPlayer;
                        mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.waterdrop1);
                        while (flag) {
                            try {
                                mediaPlayer.start();
                                this.sleep(1000);
                            } catch (InterruptedException e) {

                            }
                        }
                    }
                });
                thread.start();
            }
        });

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                flag = false;
            }
        });
    }
}