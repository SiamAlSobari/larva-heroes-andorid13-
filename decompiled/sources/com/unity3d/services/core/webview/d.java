package com.unity3d.services.core.webview;

import android.content.Context;
import android.webkit.WebSettings;

/* JADX INFO: compiled from: WebViewWithCache.java */
/* JADX INFO: loaded from: classes2.dex */
public class d extends WebView {
    public d(Context context) {
        super(context);
        WebSettings settings = getSettings();
        settings.setCacheMode(-1);
        settings.setDomStorageEnabled(true);
    }
}
