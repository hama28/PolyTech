package com.example.rensyup155156;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OutputStream out = null;
                OutputStreamWriter writer = null;
                BufferedWriter bw = null;
                try {
                    out = openFileOutput("myText.txt", Context.MODE_PRIVATE);
                    writer = new OutputStreamWriter(out);
                    bw = new BufferedWriter(writer);
                    bw.write("write data");
                    Toast.makeText(MainActivity.this,"保存完了",Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    Log.e("Internal","IO EXception" + e.getMessage(),e);
                } finally {
                    try {
                        if (bw != null) {
                            bw.close();
                        }
                        if (writer != null) {
                            writer.close();
                        }
                        if (out != null) {
                            out.close();
                        }
                    } catch (IOException e) {
                        Log.e("Internal","IO Exception" + e.getMessage(),e);
                    }
                }
            }
        });

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputStream in = null;
                InputStreamReader sr = null;
                BufferedReader br = null;
                try {
                    in = openFileInput("myText.txt");
                    sr = new InputStreamReader(in);
                    br = new BufferedReader(sr);
                    String line;
                    StringBuilder sb = new StringBuilder();
                    while ((line = br.readLine()) != null) {
                        sb.append(line).append("|n");
                    }
                    Toast.makeText(MainActivity.this,"読込完了",Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    Log.e("Internal","IO Exception" + e.getMessage(),e);
                } finally {
                    try {
                        if (br != null) {
                            br.close();
                        }
                        if (sr != null) {
                            sr.close();
                        }
                        if (in != null) {
                            in.close();
                        }
                    } catch (IOException e) {
                        Log.e("Internal", "IO Exception" + e.getMessage());
                    }
                }
            }
        });
    }
}