package com.unity3d.services.core.device.reader;

import android.webkit.WebSettings;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: DeviceInfoReaderExtended.java */
/* JADX INFO: loaded from: classes2.dex */
public class d implements p {
    private final p a;

    public d(p pVar) {
        this.a = pVar;
    }

    @Override // com.unity3d.services.core.device.reader.p
    public Map<String, Object> a() {
        Map<String, Object> mapA = this.a.a();
        mapA.put("bundleId", com.unity3d.services.core.properties.a.b());
        mapA.put("encrypted", Boolean.valueOf(com.unity3d.services.core.properties.a.g()));
        mapA.put("rooted", Boolean.valueOf(com.unity3d.services.core.device.b.Y()));
        mapA.put("osVersion", com.unity3d.services.core.device.b.G());
        mapA.put("deviceModel", com.unity3d.services.core.device.b.x());
        mapA.put("language", Locale.getDefault().toString());
        mapA.put("connectionType", com.unity3d.services.core.device.b.m());
        mapA.put("screenHeight", Integer.valueOf(com.unity3d.services.core.device.b.M()));
        mapA.put("screenWidth", Integer.valueOf(com.unity3d.services.core.device.b.O()));
        mapA.put("deviceMake", com.unity3d.services.core.device.b.w());
        mapA.put("screenDensity", Integer.valueOf(com.unity3d.services.core.device.b.L()));
        mapA.put("screenSize", Integer.valueOf(com.unity3d.services.core.device.b.N()));
        mapA.put("limitAdTracking", Boolean.valueOf(com.unity3d.services.core.device.b.W()));
        mapA.put("networkOperator", com.unity3d.services.core.device.b.A());
        mapA.put("volume", Integer.valueOf(com.unity3d.services.core.device.b.b(1)));
        mapA.put("deviceFreeSpace", Long.valueOf(com.unity3d.services.core.device.b.a(com.unity3d.services.core.properties.a.e().getCacheDir())));
        mapA.put("apiLevel", String.valueOf(com.unity3d.services.core.device.b.b()));
        mapA.put("networkType", Integer.valueOf(com.unity3d.services.core.device.b.C()));
        mapA.put("bundleVersion", com.unity3d.services.core.properties.a.c());
        mapA.put("timeZone", TimeZone.getDefault().getDisplayName(false, 0, Locale.US));
        mapA.put("timeZoneOffset", Integer.valueOf(TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000));
        mapA.put("webviewUa", WebSettings.getDefaultUserAgent(com.unity3d.services.core.properties.a.e()));
        mapA.put("networkOperatorName", com.unity3d.services.core.device.b.B());
        mapA.put("wiredHeadset", Boolean.valueOf(com.unity3d.services.core.device.b.b0()));
        mapA.put("versionCode", Integer.valueOf(com.unity3d.services.core.properties.d.n()));
        mapA.put("stores", "google");
        mapA.put("appStartTime", Long.valueOf(com.unity3d.services.core.properties.d.i() / 1000));
        mapA.put("sdkVersionName", com.unity3d.services.core.properties.d.o());
        mapA.put("eventTimeStamp", Long.valueOf(System.currentTimeMillis() / 1000));
        mapA.put("cpuCount", Long.valueOf(com.unity3d.services.core.device.b.k()));
        mapA.put("usbConnected", Boolean.valueOf(com.unity3d.services.core.device.b.Z()));
        try {
            mapA.put("apkHash", com.unity3d.services.core.device.b.c());
        } catch (Exception unused) {
            com.unity3d.services.core.log.a.c("Could not get APK Digest");
        }
        mapA.put("apkDeveloperSigningCertificateHash", com.unity3d.services.core.device.b.l());
        mapA.put("deviceUpTime", Long.valueOf(com.unity3d.services.core.device.b.T()));
        mapA.put("deviceElapsedRealtime", Long.valueOf(com.unity3d.services.core.device.b.p()));
        mapA.put("adbEnabled", com.unity3d.services.core.device.b.V());
        mapA.put("androidFingerprint", com.unity3d.services.core.device.b.q());
        mapA.put("batteryStatus", Integer.valueOf(com.unity3d.services.core.device.b.e()));
        mapA.put("batteryLevel", Float.valueOf(com.unity3d.services.core.device.b.d()));
        mapA.put("networkMetered", Boolean.valueOf(com.unity3d.services.core.device.b.z()));
        mapA.put("test", Boolean.valueOf(com.unity3d.services.core.properties.d.s()));
        mapA.put("callType", "token");
        return mapA;
    }
}
