package com.unity3d.services.core.api;

import com.unity3d.services.core.properties.c;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import com.unity3d.services.core.webview.bridge.l;

/* JADX INFO: loaded from: classes2.dex */
public class ClassDetection {
    @WebViewExposed
    public static void isMadeWithUnity(l lVar) {
        lVar.a(Boolean.valueOf(c.a()));
    }
}
