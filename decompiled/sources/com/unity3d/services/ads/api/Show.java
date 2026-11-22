package com.unity3d.services.ads.api;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.show.c;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import com.unity3d.services.core.webview.bridge.l;

/* JADX INFO: loaded from: classes2.dex */
public class Show {
    @WebViewExposed
    public static void sendShowClickEvent(String str, String str2, l lVar) {
        c.b().onUnityAdsShowClick(str2);
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void sendShowCompleteEvent(String str, String str2, String str3, l lVar) {
        c.b().onUnityAdsShowComplete(str2, UnityAds.UnityAdsShowCompletionState.valueOf(str3));
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void sendShowConsentEvent(String str, String str2, l lVar) {
        c.b().b(str2);
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void sendShowFailedEvent(String str, String str2, String str3, String str4, l lVar) {
        c.b().onUnityAdsShowFailure(str2, UnityAds.UnityAdsShowError.valueOf(str3), str4);
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void sendShowStartEvent(String str, String str2, l lVar) {
        c.b().onUnityAdsShowStart(str2);
        lVar.a(new Object[0]);
    }
}
