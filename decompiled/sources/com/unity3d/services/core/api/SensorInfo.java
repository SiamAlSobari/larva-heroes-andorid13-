package com.unity3d.services.core.api;

import com.unity3d.services.core.sensorinfo.b;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import com.unity3d.services.core.webview.bridge.l;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class SensorInfo {
    @WebViewExposed
    public static void getAccelerometerData(l lVar) {
        JSONObject jSONObjectA = b.a();
        if (jSONObjectA != null) {
            lVar.a(jSONObjectA);
        } else {
            lVar.a(com.unity3d.services.core.sensorinfo.a.ACCELEROMETER_DATA_NOT_AVAILABLE, new Object[0]);
        }
    }

    @WebViewExposed
    public static void isAccelerometerActive(l lVar) {
        lVar.a(Boolean.valueOf(b.b()));
    }

    @WebViewExposed
    public static void startAccelerometerUpdates(Integer num, l lVar) {
        lVar.a(Boolean.valueOf(b.a(num.intValue())));
    }

    @WebViewExposed
    public static void stopAccelerometerUpdates(l lVar) {
        b.c();
        lVar.a(new Object[0]);
    }
}
