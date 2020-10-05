package com.example.rensyup194;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorEventListener2;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
    private SensorManager mSensorManager;
    float[] accell = new float[3];
    float[] geo = new float[3];
    private TextView[] mSensor = new TextView[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mSensor[0] = (TextView) findViewById(R.id.textView);
        mSensor[1] = (TextView) findViewById(R.id.textView2);
        mSensor[2] = (TextView) findViewById(R.id.textView3);
    }

    @Override
    protected void onResume() {
        super.onResume();
        List<Sensor> sensors = mSensorManager.getSensorList(Sensor.TYPE_ALL);
        for (Sensor sensor : sensors) {
            if (sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
                mSensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_UI);
            }
            if (sensor.getType() == Sensor.TYPE_MAGNETIC_FIELD) {
                mSensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_UI);
            }
        }
        Sensor acceleration = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mSensorManager.registerListener(this, acceleration, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mSensorManager != null) {
            mSensorManager.unregisterListener(this);
        }
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] mori = new float[3];
        float[] inR = new float[16];
        float[] outR = new float[16];
        float[] I = new float[16];
        switch (sensorEvent.sensor.getType()) {
            case Sensor.TYPE_MAGNETIC_FIELD:
                geo = sensorEvent.values.clone();
                Log.i("DAT", "Gravity[X]=" + geo[0]);
                Log.i("DAT", "Gravity[Y]=" + geo[1]);
                Log.i("DAT", "Gravity[Z]=" + geo[2]);
                break;
            case Sensor.TYPE_ACCELEROMETER:
                accell = sensorEvent.values.clone();
                Log.i("DAT", "accell[X]=" + accell[0]);
                Log.i("DAT", "accell[Y]=" + accell[1]);
                Log.i("DAT", "accell[Z]=" + accell[2]);
                break;
        }
        if (geo != null && accell != null) {
            SensorManager.getRotationMatrix(inR, I, accell, geo);
            SensorManager.remapCoordinateSystem(inR, SensorManager.AXIS_X, SensorManager.AXIS_Z,
                    outR);
            SensorManager.getOrientation(outR, mori);
            mSensor[0].setText(String.valueOf(radianToDegree(mori[0])));
            mSensor[1].setText(String.valueOf(radianToDegree(mori[1])));
            mSensor[2].setText(String.valueOf(radianToDegree(mori[2])));
        }
    }
    int radianToDegree(float rad) {
        return (int) Math.floor(Math.toDegrees(rad));
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }
}