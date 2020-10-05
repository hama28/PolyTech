package com.example.rensyup131;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.speech.RecognizerIntent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode != RESULT_OK) {
            String msg = "Error:onActivityResult:" + Integer.toString(requestCode);
            Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT);
            return;
        }

        if (requestCode == 1) {
            StringBuffer sb = new StringBuffer();
            List<String> results = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            for (String result : results) {
                sb.append(result);
                sb.append(" ");
            }

            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_WEB_SEARCH);
            intent.putExtra(SearchManager.QUERY,sb.toString());
            startActivity(intent);
        }

        if (requestCode == 2) {
            ContentResolver cr = getContentResolver();
            String[] colums = {
                    MediaStore.Images.Media.DATA
            };
            Cursor c = cr.query(data.getData(),colums,null,null,null);
            int column_index = c.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
            c.moveToFirst();
            String path = c.getString(column_index);
            Log.v("test", "path=" + path);
            File filePath = new File(path);

            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_SEND);
            String[] to = {"it18@gmail.com"};
            intent.putExtra(Intent.EXTRA_EMAIL,to);
            intent.putExtra(Intent.EXTRA_SUBJECT,"テストメール");
            intent.putExtra(Intent.EXTRA_TEXT,"本文は\n入っていますか？");
            intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(filePath));
            intent.setType("image/jpeg");
            startActivity(Intent.createChooser(intent,"メールアプリを選択"));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button =(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent();
                    intent.setAction(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                    intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.ACTION_WEB_SEARCH);
                    intent.putExtra(RecognizerIntent.EXTRA_PROMPT,"検索したいキーワードは？");
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(MainActivity.this,"Google音声検索が使えません。",Toast.LENGTH_SHORT);
                }
            }
        });
        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Intent.ACTION_PICK);
                intent2.setType("image/*");
                startActivityForResult(intent2,2);
            }
        });
    }
}