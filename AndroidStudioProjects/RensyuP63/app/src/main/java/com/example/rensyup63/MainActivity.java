package com.example.rensyup63;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new Button1ClickListener());
        button1.setOnLongClickListener(new Button1LongClickListener());
        button1.setOnTouchListener(new Button1OnTouchLisner());
        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new Button2ClickListener());
        button2.setOnLongClickListener(new Button2LongClickListener());
        button2.setOnTouchListener(new Button2OnTouchLisner());
    }

    class Button1ClickListener implements  View.OnClickListener{
        public void onClick(View v) {
            TextView textView = (TextView)findViewById(R.id.textView);
            ViewGroup.LayoutParams lp = textView.getLayoutParams();
            ViewGroup.MarginLayoutParams mlp = (ViewGroup.MarginLayoutParams) lp;
            textView.setText("左");
            mlp.setMargins(mlp.leftMargin - 10, mlp.topMargin, mlp.rightMargin + 10, mlp.bottomMargin);
            textView.setLayoutParams(mlp);
        }
    }
    class Button1LongClickListener implements  View.OnLongClickListener{
        public boolean onLongClick(View v) {
            TextView textView = (TextView)findViewById(R.id.textView);
            ViewGroup.LayoutParams lp = textView.getLayoutParams();
            ViewGroup.MarginLayoutParams mlp = (ViewGroup.MarginLayoutParams) lp;
            textView.setText("左");
            mlp.setMargins(mlp.leftMargin - 30, mlp.topMargin, mlp.rightMargin + 30, mlp.bottomMargin);
            textView.setLayoutParams(mlp);
            return  true;
        }
    }
    class  Button1OnTouchLisner implements  View.OnTouchListener{
        public boolean onTouch(View v, MotionEvent event) {
            TextView textView = (TextView)findViewById(R.id.textView);
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                textView.setText("左　押す");
            } else if (event.getAction() == MotionEvent.ACTION_UP) {
                textView.setText("左　離す");
            }
            return  false;
        }
    }


    class Button2ClickListener implements  View.OnClickListener{
        public void onClick(View v) {
            TextView textView = (TextView)findViewById(R.id.textView);
            ViewGroup.LayoutParams lp = textView.getLayoutParams();
            ViewGroup.MarginLayoutParams mlp = (ViewGroup.MarginLayoutParams) lp;
            textView.setText("右");
            mlp.setMargins(mlp.leftMargin + 10, mlp.topMargin, mlp.rightMargin - 10, mlp.bottomMargin);
            textView.setLayoutParams(mlp);
        }
    }
    class Button2LongClickListener implements  View.OnLongClickListener{
        public boolean onLongClick(View v) {
            TextView textView = (TextView)findViewById(R.id.textView);
            ViewGroup.LayoutParams lp = textView.getLayoutParams();
            ViewGroup.MarginLayoutParams mlp = (ViewGroup.MarginLayoutParams) lp;
            textView.setText("右");
            mlp.setMargins(mlp.leftMargin + 30, mlp.topMargin, mlp.rightMargin - 30, mlp.bottomMargin);
            textView.setLayoutParams(mlp);
            return  true;
        }
    }
    class  Button2OnTouchLisner implements  View.OnTouchListener{
        public boolean onTouch(View v, MotionEvent event) {
            TextView textView = (TextView)findViewById(R.id.textView);
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                textView.setText("右　押す");
            } else if (event.getAction() == MotionEvent.ACTION_UP) {
                textView.setText("右　離す");
            }
            return  false;
        }
    }

}