package com.example.rensyup99;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.Button;

public class MyButton extends Button {
    float x = 100, y =100;
    public MyButton(Context context) {
        super(context);
    }
    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.WHITE);
        canvas.drawCircle(x,y,100,paint);
    }
    public void setPosx(float mx) {
        x = mx;
    }
    public  void setPosy(float my) {
        y = my;
    }
}
