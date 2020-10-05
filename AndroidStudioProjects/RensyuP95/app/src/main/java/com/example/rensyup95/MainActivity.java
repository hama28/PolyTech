import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import com.example.rensyup95.R;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity {
    // 日付設定ダイアログのインスタンスを格納する変数
    private DatePickerDialog.OnDateSetListener dateListener;
    // 時刻設定ダイアログのインスタンスを格納する変数
    private TimePickerDialog.OnTimeSetListener timeListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 日付設定ダイアログに登録する
        // イベントリスナーのインスタンス化
        dateListener =
                new DatePickerDialog.OnDateSetListener() {
                    // 日付設定ダイアログの[OK]ボタンがクリックされたときの処理
                    @Override
                    public void onDateSet(
                            DatePicker view,
                            int year,
                            int monthOfYear,
                            int dayOfMonth
                    ) {
                        // データをエディットテキストに書き込む
                        ((EditText) findViewById(R.id.editText1))
                                .setText(year + "/" +
                                        (monthOfYear + 1) +
                                        "/" +
                                        dayOfMonth);
                    }
                };

        // 時刻設定ダイアログに登録する
        // イベントリスナーのインスタンス化
        timeListener =
                new TimePickerDialog.OnTimeSetListener() {
                    // 時刻設定ダイアログの[OK]ボタンがクリックされたときの処理
                    @Override
                    public void onTimeSet(
                            TimePicker view,
                            int hourOfDay,
                            int minute
                    ) {
                        // データをエディットテキストに書き込む
                        ((EditText) findViewById(R.id.editText2))
                                .setText(hourOfDay + ":" + minute);
                    }
                };

        ((Button) findViewById(R.id.button1))
                .setOnClickListener(
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // 現在日時を取得
                                Calendar calendar = Calendar.getInstance();
                                // 日時設定ダイアログのインスタンスを生成
                                DatePickerDialog dateDialog =
                                        new DatePickerDialog(
                                                MainActivity.this,
                                                dateListener,
                                                calendar.get(Calendar.YEAR),
                                                calendar.get(Calendar.MONTH),
                                                calendar.get(Calendar.DAY_OF_MONTH)
                                        );
                                // 日付設定ダイアログを表示
                                dateDialog.show();
                            }
                        });

        ((Button) findViewById(R.id.button2))
                .setOnClickListener(
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // 現在時刻を取得
                                Calendar calendar = Calendar.getInstance();
                                // 時刻設定ダイアログのインスタンスを生成
                                TimePickerDialog timeDialog =
                                        new TimePickerDialog(
                                                MainActivity.this,
                                                timeListener,
                                                calendar.get(Calendar.HOUR_OF_DAY),
                                                calendar.get(Calendar.MINUTE),
                                                false
                                        );
                                // 時刻設定ダイアログを表示
                                timeDialog.show();
                            }
                        });
    }
}package com.example.rensyup95;

