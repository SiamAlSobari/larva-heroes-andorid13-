package com.unity3d.services.ads.webplayer;

import android.webkit.JavascriptInterface;

/* JADX INFO: compiled from: WebPlayerBridgeInterface.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    private final String a;

    public a(String str) {
        this.a = str;
    }

    @JavascriptInterface
    public void handleEvent(String str) {
        if (com.unity3d.services.core.webview.a.c() != null) {
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, c.WEBPLAYER_EVENT, str, this.a);
        }
    }
}
