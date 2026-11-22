package com.unity3d.services.ads.api;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.load.c;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import com.unity3d.services.core.webview.bridge.l;

/* JADX INFO: loaded from: classes2.dex */
public class Load {
    @WebViewExposed
    public static void sendAdFailedToLoad(String str, String str2, String str3, String str4, l lVar) {
        c.b().onUnityAdsFailedToLoad(str2, UnityAds.UnityAdsLoadError.valueOf(str3), str4);
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void sendAdLoaded(String str, String str2, l lVar) {
        c.b().onUnityAdsAdLoaded(str2);
        lVar.a(new Object[0]);
    }
}
