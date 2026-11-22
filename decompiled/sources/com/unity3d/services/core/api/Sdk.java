package com.unity3d.services.core.api;

import com.unity3d.services.core.configuration.InitializeThread;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.b;
import com.unity3d.services.core.properties.d;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import com.unity3d.services.core.webview.bridge.l;

/* JADX INFO: loaded from: classes2.dex */
public class Sdk {
    @WebViewExposed
    public static void downloadLatestWebView(l lVar) {
        com.unity3d.services.core.log.a.b("Unity Ads init: WebView called download");
        lVar.a(Integer.valueOf(InitializeThread.downloadLatestWebView().getValue()));
    }

    @WebViewExposed
    public static void getDebugMode(l lVar) {
        lVar.a(Boolean.valueOf(d.f()));
    }

    @WebViewExposed
    public static void initComplete(l lVar) {
        com.unity3d.services.core.log.a.b("Web Application initialized");
        d.b(true);
        com.unity3d.services.core.webview.a.c().a(true);
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void initError(String str, Integer num, l lVar) {
        com.unity3d.services.core.webview.a.c().b(str);
        com.unity3d.services.core.webview.a.c().a(num.intValue());
        com.unity3d.services.core.webview.a.c().a(false);
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void loadComplete(l lVar) {
        com.unity3d.services.core.log.a.b("Web Application loaded");
        com.unity3d.services.core.webview.a.c().b(true);
        Object[] objArr = new Object[18];
        objArr[0] = com.unity3d.services.core.properties.a.f();
        objArr[1] = Boolean.valueOf(d.s());
        objArr[2] = com.unity3d.services.core.properties.a.b();
        objArr[3] = com.unity3d.services.core.properties.a.c();
        objArr[4] = Integer.valueOf(d.n());
        objArr[5] = d.o();
        objArr[6] = Boolean.valueOf(com.unity3d.services.core.properties.a.g());
        objArr[7] = d.d();
        objArr[8] = com.unity3d.services.core.webview.a.c().b().getWebViewUrl();
        objArr[9] = com.unity3d.services.core.webview.a.c().b().getWebViewHash();
        objArr[10] = com.unity3d.services.core.webview.a.c().b().getWebViewVersion();
        objArr[11] = Long.valueOf(d.h());
        objArr[12] = Boolean.valueOf(d.r());
        objArr[13] = Boolean.TRUE;
        objArr[14] = Boolean.valueOf(d.j() != null);
        objArr[15] = Long.valueOf(b.p());
        objArr[16] = com.unity3d.services.core.webview.a.c().b().getStateId();
        objArr[17] = PrivacyConfigStorage.getInstance().getPrivacyConfig().getPrivacyStatus().toLowerCase();
        lVar.a(objArr);
    }

    @WebViewExposed
    public static void logDebug(String str, l lVar) {
        com.unity3d.services.core.log.a.b(str);
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void logError(String str, l lVar) {
        com.unity3d.services.core.log.a.c(str);
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void logInfo(String str, l lVar) {
        com.unity3d.services.core.log.a.d(str);
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void logWarning(String str, l lVar) {
        com.unity3d.services.core.log.a.e(str);
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void reinitialize(l lVar) {
        d.c(true);
        InitializeThread.initialize(com.unity3d.services.core.webview.a.c().b());
    }

    @WebViewExposed
    public static void setDebugMode(Boolean bool, l lVar) {
        d.a(bool.booleanValue());
        lVar.a(new Object[0]);
    }
}
