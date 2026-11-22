package com.unity3d.services.core.sensorinfo;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: SensorInfoListener.java */
/* JADX INFO: loaded from: classes2.dex */
public class b implements SensorEventListener {
    private static b a;
    private static Sensor b;
    private static SensorEvent c;

    public static boolean a(int i) {
        if (a == null) {
            a = new b();
        }
        SensorManager sensorManager = (SensorManager) com.unity3d.services.core.properties.a.e().getSystemService("sensor");
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        b = defaultSensor;
        return sensorManager.registerListener(a, defaultSensor, i);
    }

    public static boolean b() {
        return a != null;
    }

    public static void c() {
        if (a != null) {
            ((SensorManager) com.unity3d.services.core.properties.a.e().getSystemService("sensor")).unregisterListener(a);
            a = null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            c = sensorEvent;
        }
    }

    public static JSONObject a() {
        if (c == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", c.values[0]);
            jSONObject.put("y", c.values[1]);
            jSONObject.put("z", c.values[2]);
            return jSONObject;
        } catch (JSONException e) {
            com.unity3d.services.core.log.a.a("JSON error while constructing accelerometer data", e);
            return jSONObject;
        }
    }
}
