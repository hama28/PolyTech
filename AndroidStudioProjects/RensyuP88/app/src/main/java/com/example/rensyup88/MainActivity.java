package com.example.rensyup88;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> animals = new ArrayList<String>();
        animals.add("いぬ");
        animals.add("ねこ");
        animals.add("ひつじ");
        animals.add("うま");
        animals.add("つばめ");
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,animals);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner spinner2 = (Spinner)findViewById(R.id.spinner2);
        spinner2.setAdapter(adapter);
        spinner2.setSelection(0);

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String animal = parent.getItemAtPosition(position).toString();
                Toast toast = Toast.makeText(MainActivity.this,animal,Toast.LENGTH_SHORT);
                toast.show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String animal = spinner2.getSelectedItem().toString();
                int position = spinner2.getSelectedItemPosition();

                String msg = Integer.toString(position) + ":" + animal;
                TextView textView = (TextView)findViewById(R.id.textView);
                textView.setText(msg);
            }
        });
    }
}