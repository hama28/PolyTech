package com.example.ensyu531;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView numberText;
    String number1 = "0";
    String number2 = "0";
    String cal = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculatorlayout);

        numberText = (TextView)findViewById(R.id.inputNum);

        Button btnBS = (Button)findViewById(R.id.delbutton);
        Button btnCE = (Button)findViewById(R.id.cebutton);
        Button btnC = (Button)findViewById(R.id.cbutton);

        Button btn1 = (Button)findViewById(R.id.button1);
        Button btn2 = (Button)findViewById(R.id.button2);
        Button btn3 = (Button)findViewById(R.id.button3);
        Button btn4 = (Button)findViewById(R.id.button4);
        Button btn5 = (Button)findViewById(R.id.button5);
        Button btn6 = (Button)findViewById(R.id.button6);
        Button btn7 = (Button)findViewById(R.id.button7);
        Button btn8 = (Button)findViewById(R.id.button8);
        Button btn9 = (Button)findViewById(R.id.button9);
        Button btn0 = (Button)findViewById(R.id.button0);

        Button btnDot = (Button) findViewById(R.id.dotbutton);

        Button btnWaru = (Button)findViewById(R.id.warubutton);
        Button btnKake = (Button)findViewById(R.id.kakerubutton);
        Button btnHiku = (Button)findViewById(R.id.hikubutton);
        Button btnTasu = (Button)findViewById(R.id.tasubutton);
        Button btnWa = (Button)findViewById(R.id.wabutton);

        btnBS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = numberText.getText().toString();

                if ( num != null && num.length() > 0){
                    num = num.substring(0,num.length() -1);
                }

                numberText.setText(num);
            }
        });
        btnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberText.setText("");
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1 = "0";
                number2 = "0";
                cal = "";
                numberText.setText("");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = numberText.getText().toString();
                tmp += "1";
                numberText.setText(tmp);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = numberText.getText().toString();
                tmp += "2";
                numberText.setText(tmp);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = numberText.getText().toString();
                tmp += "3";
                numberText.setText(tmp);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = numberText.getText().toString();
                tmp += "4";
                numberText.setText(tmp);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = numberText.getText().toString();
                tmp += "5";
                numberText.setText(tmp);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = numberText.getText().toString();
                tmp += "6";
                numberText.setText(tmp);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = numberText.getText().toString();
                tmp += "7";
                numberText.setText(tmp);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = numberText.getText().toString();
                tmp += "8";
                numberText.setText(tmp);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = numberText.getText().toString();
                tmp += "9";
                numberText.setText(tmp);
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = numberText.getText().toString();
                tmp += "0";
                numberText.setText(tmp);
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tmp = numberText.getText().toString();
                tmp += ".";
                numberText.setText(tmp);
            }
        });
        btnWaru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1 = numberText.getText().toString();
                cal = "/";
                numberText.setText("");
            }
        });
        btnKake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1 = numberText.getText().toString();
                cal = "*";
                numberText.setText("");
            }
        });
        btnHiku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1 = numberText.getText().toString();
                cal = "-";
                numberText.setText("");
            }
        });
        btnTasu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1 = numberText.getText().toString();
                cal = "+";
                numberText.setText("");
            }
        });
        btnWa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double answer = 0;
                number2 = numberText.getText().toString();

                if(number1 != "" && number2 != "" && cal != ""){
                    switch (cal) {
                        case "+":
                            answer = Double.parseDouble(number1) + Double.parseDouble(number2);
                            break;
                        case "-":
                            answer = Double.parseDouble(number1) - Double.parseDouble(number2);
                            break;
                        case "*":
                            answer = Double.parseDouble(number1) * Double.parseDouble(number2);
                            break;
                        case "/":
                            answer = Double.parseDouble(number1) / Double.parseDouble(number2);
                            break;
                        default:
                            break;
                    }
                } else {

                }
                numberText.setText(Double.toString(answer));

                number1 = "0";
                number2 = "0";
                cal = "";
            }
        });

    }
}