package com.unity3d.services.ads.webplayer;

/* JADX INFO: compiled from: WebPlayerEventBridge.java */
/* JADX INFO: loaded from: classes2.dex */
public class d {
    public static void a(String str, String str2, String str3) {
        com.unity3d.services.core.webview.a aVarC = com.unity3d.services.core.webview.a.c();
        if (aVarC != null) {
            aVarC.a(com.unity3d.services.core.webview.b.WEBPLAYER, c.ERROR, str2, str3, str);
        }
    }

    public static void a(String str, int i, int i2, int i3, int i4, float f) {
        com.unity3d.services.core.webview.a aVarC = com.unity3d.services.core.webview.a.c();
        if (aVarC != null) {
            aVarC.a(com.unity3d.services.core.webview.b.WEBPLAYER, c.FRAME_UPDATE, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Float.valueOf(f));
        }
    }

    public static void a(String str, String str2, int i, int i2, int i3, int i4, float f) {
        com.unity3d.services.core.webview.a aVarC = com.unity3d.services.core.webview.a.c();
        if (aVarC != null) {
            aVarC.a(com.unity3d.services.core.webview.b.WEBPLAYER, c.GET_FRAME_RESPONSE, str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Float.valueOf(f));
        }
    }
}
