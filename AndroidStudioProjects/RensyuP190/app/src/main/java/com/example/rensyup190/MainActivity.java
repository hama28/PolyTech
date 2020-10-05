package com.example.rensyup190;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
    private SensorManager sensorManager;

    @Override
    protected void onResume() {
        super.onResume();

        sensorManager = (SensorManager)getSystemService(Context.SENSOR_SERVICE);
        Sensor acceleration = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorManager.registerListener(this,acceleration,SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        /* 加速度センサーの値を取得して、LogCat に表示 */
        float[] accell = new float[3];
        accell[0] = event.values[0]; //X 軸方向加速度
        accell[1] = event.values[1]; //Y 軸方向加速度
        accell[2] = event.values[2]; //Z 軸方向加速度
        Log.i("DAT","accell[X] " + accell[0]);
        Log.i("DAT","accell[Y] " + accell[1]);
        Log.i("DAT","accell[Z] " + accell[2]);
        /* テキストに追加。テキストビューにも表示 */
        TextView textViewX = (TextView)findViewById(R.id.textView2);
        TextView textViewY = (TextView)findViewById(R.id.textView4);
        TextView textViewZ = (TextView)findViewById(R.id.textView6);
        textViewX.setText(Float.toString(accell[0]));
        textViewY.setText(Float.toString(accell[1]));
        textViewZ.setText(Float.toString(accell[2]));
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (sensorManager != null)
        {
            sensorManager.unregisterListener(this);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}