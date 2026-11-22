package com.unity3d.services.core.properties;

/* JADX INFO: compiled from: MadeWithUnityDetector.java */
/* JADX INFO: loaded from: classes2.dex */
public class c {
    public static boolean a() {
        try {
            Class.forName("com.unity3d.player.UnityPlayer");
        } catch (Throwable unused) {
        }
        return false;
    }
}
