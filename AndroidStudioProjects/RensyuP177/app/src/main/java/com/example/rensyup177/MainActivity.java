package com.example.rensyup177;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private  final static String BR=System.getProperty("line.separator");
    private  final static  String IP="10.26.142.118";
    private TextView textView;
    private EditText editText;
    private Button button;
    private Socket socket;
    private InputStream in;
    private OutputStream out;
    private boolean error;
    private final Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
        editText = (EditText)findViewById(R.id.editTextTextPersonName);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);
    }
    protected void onStart() {
        super.onStart();
        Thread thread = new Thread() {
            public void run() {
                try {
                    connect(IP,8081);
                } catch (Exception e) {
                }
            }
        };
        thread.start();
    }

    public void onClick(View view) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                error = false;
                try {
                    if(socket != null && socket.isConnected()) {
                        byte[] w = editText.getText().toString().getBytes("UTF-8");
                        out.write(w);
                        out.flush();
                    }
                } catch (Exception e) {
                    error = true;
                }
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        if (!error) {
                            editText.setText("");
                        } else {
                            addText("通信失敗しました");
                        }
                    }
                });
            }
        });
        thread.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        disconnect();
    }

    private void connect(String ip,int port) {
        int size;
        String str;
        byte[] w = new byte[1024];
        try {
            addText("接続中");
            socket = new Socket(ip,port);
            in = socket.getInputStream();
            out = socket.getOutputStream();
            addText("接続完了");
            while (socket != null && socket.isConnected()) {
                size = in.read(w);
                if(size <= 0) continue;
                str = new String(w, 0, size, "UTF-8");
                addText(str);
            }
        } catch (Exception e) {
            addText("通信失敗しました");
        }
    }

    private void addText(final String text) {
        handler.post(new Runnable() {
            @Override
            public void run() {
                textView.setText(text + BR + textView.getText());
            }
        });
    }

    private void disconnect() {
        try {
            socket.close();
            socket = null;
        } catch (Exception e){
        }
    }
}