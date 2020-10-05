package com.example.ensyu3p123;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;

public class MyView extends View {
    Ball bl1 = new Ball(100,100,5,5);
    Ball bl2 = new Ball(600,400,-10,15);
    Ball bl3 = new Ball(300,300,20,-10);
    Ball bl4 = new Ball(200,400,30,20);

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.argb(255,89,116,62));

        bl1.Draw(canvas);
        bl2.Draw(canvas);
        bl3.Draw(canvas);
        bl4.Draw(canvas);

        bl1.Move();
        bl2.Move();
        bl3.Move();
        bl4.Move();

        bl1.Check(this.getWidth(),this.getHeight());
        bl2.Check(this.getWidth(),this.getHeight());
        bl3.Check(this.getWidth(),this.getHeight());
        bl4.Check(this.getWidth(),this.getHeight());

        invalidate();
    }

    public MyView(Context context) {
        super(context);
    }
    public MyView(Context context, AttributeSet attrs){
        super(context,attrs);
    }
    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context,attrs,defStyleAttr);
    }
}