package com.unity3d.services.core.webview;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import com.unity3d.services.core.misc.j;
import com.unity3d.services.core.misc.k;
import com.unity3d.services.core.webview.bridge.i;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class WebView extends android.webkit.WebView {
    private static Method a;

    private class a implements Runnable {
        private String a;
        private android.webkit.WebView b;

        public a(String str, android.webkit.WebView webView) {
            this.a = str;
            this.b = webView;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a == null) {
                com.unity3d.services.core.log.a.c("Could not process JavaScript, the string is NULL");
                return;
            }
            try {
                WebView.a.invoke(this.b, this.a, null);
            } catch (Exception e) {
                com.unity3d.services.core.log.a.a("Error while processing JavaScriptString", e);
            }
        }
    }

    public WebView(Context context) {
        super(context);
        WebSettings settings = getSettings();
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setAllowFileAccess(true);
        try {
            a = android.webkit.WebView.class.getMethod("evaluateJavascript", String.class, ValueCallback.class);
        } catch (NoSuchMethodException e) {
            com.unity3d.services.core.log.a.a("Method evaluateJavascript not found", e);
            a = null;
        }
        settings.setBlockNetworkImage(false);
        settings.setBlockNetworkLoads(false);
        settings.setBuiltInZoomControls(false);
        settings.setCacheMode(2);
        settings.setDatabaseEnabled(false);
        int i = Build.VERSION.SDK_INT;
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(false);
        settings.setEnableSmoothTransition(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setJavaScriptEnabled(true);
        settings.setLightTouchEnabled(false);
        settings.setLoadWithOverviewMode(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        if (i >= 21) {
            settings.setMixedContentMode(1);
        }
        settings.setNeedInitialFocus(true);
        settings.setPluginState(WebSettings.PluginState.OFF);
        settings.setRenderPriority(WebSettings.RenderPriority.NORMAL);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(false);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setInitialScale(0);
        setBackgroundColor(0);
        k.a(this, new ColorDrawable(0));
        setBackgroundResource(0);
        addJavascriptInterface(new i(), "webviewbridge");
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        com.unity3d.services.core.log.a.b("Loading url: " + str);
        super.loadUrl(str);
    }

    public void a(String str) {
        j.a(new a(str, this));
    }
}
