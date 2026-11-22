package com.unity3d.services.core.api;

import com.unity3d.services.core.connectivity.c;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import com.unity3d.services.core.webview.bridge.l;

/* JADX INFO: loaded from: classes2.dex */
public class Connectivity {
    @WebViewExposed
    public static void setConnectionMonitoring(Boolean bool, l lVar) {
        c.a(bool.booleanValue());
        lVar.a(new Object[0]);
    }
}
