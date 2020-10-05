package com.example.rensyup99;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import java.text.AttributedCharacterIterator;
import java.util.ResourceBundle;

public class MyView extends View {
    Ball bl1 = new Ball(100,100);
    Ball bl2 = new Ball(100,200,-10,5);

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.argb(255,89,116,62));

        bl1.Draw(canvas);
        bl2.Draw(canvas);

        bl1.Move();
        bl2.Move();

        bl1.Check(this.getWidth(),this.getHeight());
        bl2.Check(this.getWidth(),this.getHeight());

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