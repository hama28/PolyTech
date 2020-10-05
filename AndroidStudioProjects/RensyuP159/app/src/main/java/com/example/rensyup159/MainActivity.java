package com.example.rensyup159;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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
                    File folder = Environment.getExternalStoragePublicDirectory("MyDocuments");
                    if (!folder.exists()) {
                        boolean result = folder.mkdir();
                        if (!result) {
                            return;
                        }
                    }
                    File file = new File(folder,"myText.txt");
                    out = new FileOutputStream(file);
                    writer = new OutputStreamWriter(out);
                    bw = new BufferedWriter(writer);
                    bw.write("write data");
                    Toast.makeText(MainActivity.this,"保存完了",Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    Log.e("Internal","IO Exception" + e.getMessage(),e);
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
    }
}