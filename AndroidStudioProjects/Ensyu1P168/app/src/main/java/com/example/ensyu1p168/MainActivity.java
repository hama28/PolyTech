package com.example.ensyu1p168;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.webkit.HttpAuthHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private WebView mWebView;
    private final String USERNAME = "admin";
    private final String PASSWORD = "12345";
    Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = (WebView)findViewById(R.id.webView);
        WebSettings settings = mWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSaveFormData(false);
        settings.setSupportZoom(false);

        mWebView.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedHttpAuthRequest(WebView view, HttpAuthHandler handler, String host, String realm) {
                handler.proceed(USERNAME,PASSWORD);
            }
        });

        mWebView.loadUrl("http://10.26.142.125/cgi-bin/camera?resolution=640&quality=5&Language=1%20height=640%20width=480");

        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(500);
                        mHandler.post(new Runnable() {
                            @Override
                            public void run() {
                                mWebView.reload();
                            }
                        });
                    } catch (InterruptedException e) {

                    }
                }
            }
        });
        th.start();

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mWebView.loadUrl("http://10.26.142.125/cgi-bin/directctrl?zoom=1&Language=1");
            }
        });

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mWebView.loadUrl("http://10.26.142.125/cgi-bin/directctrl?zoom=-1&Language=1");
            }
        });
    }
}