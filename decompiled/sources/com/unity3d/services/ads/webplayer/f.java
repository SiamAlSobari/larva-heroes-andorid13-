package com.unity3d.services.ads.webplayer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.unity3d.services.core.misc.j;
import com.unity3d.services.core.misc.k;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: WebPlayerView.java */
/* JADX INFO: loaded from: classes2.dex */
public class f extends WebView {
    private Map<String, String> a;
    private JSONObject b;
    private Method c;
    private String d;
    private Runnable e;

    /* JADX INFO: compiled from: WebPlayerView.java */
    class a implements View.OnLayoutChangeListener {
        a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            f.this.a();
        }
    }

    /* JADX INFO: compiled from: WebPlayerView.java */
    class b implements Runnable {
        final /* synthetic */ View.OnLayoutChangeListener a;

        b(View.OnLayoutChangeListener onLayoutChangeListener) {
            this.a = onLayoutChangeListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.removeOnLayoutChangeListener(this.a);
        }
    }

    /* JADX INFO: compiled from: WebPlayerView.java */
    private class c implements Runnable {
        private String a;
        private WebView b;

        public c(String str, WebView webView) {
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
                f.this.c.invoke(this.b, this.a, null);
            } catch (Exception e) {
                com.unity3d.services.core.log.a.a("Error while processing JavaScriptString", e);
            }
        }
    }

    /* JADX INFO: compiled from: WebPlayerView.java */
    private class d extends WebChromeClient {
        private d() {
        }

        @Override // android.webkit.WebChromeClient
        public void onCloseWindow(WebView webView) {
            if (f.this.c("onCloseWindow")) {
                super.onCloseWindow(webView);
            }
            if (f.this.d("onCloseWindow")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.CLOSE_WINDOW, f.this.d);
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Boolean boolValueOf = Boolean.FALSE;
            if (f.this.c("onConsoleMessage")) {
                boolValueOf = Boolean.valueOf(super.onConsoleMessage(consoleMessage));
            }
            if (f.this.d("onConsoleMessage")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.CONSOLE_MESSAGE, consoleMessage != null ? consoleMessage.message() : "", f.this.d);
            }
            if (f.this.a("onConsoleMessage")) {
                boolValueOf = (Boolean) f.this.a("onConsoleMessage", Boolean.class, Boolean.TRUE);
            }
            return boolValueOf.booleanValue();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            Boolean bool = Boolean.FALSE;
            Boolean boolValueOf = f.this.c("onCreateWindow") ? Boolean.valueOf(super.onCreateWindow(webView, z, z2, message)) : bool;
            if (f.this.d("onCreateWindow")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.CREATE_WINDOW, Boolean.valueOf(z), Boolean.valueOf(z2), message, f.this.d);
            }
            if (f.this.a("onCreateWindow")) {
                boolValueOf = (Boolean) f.this.a("onCreateWindow", Boolean.class, bool);
            }
            return boolValueOf.booleanValue();
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            if (f.this.c("onGeolocationPermissionsShowPrompt")) {
                super.onGeolocationPermissionsShowPrompt(str, callback);
            }
            if (f.this.d("onGeolocationPermissionsShowPrompt")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.GEOLOCATION_PERMISSIONS_SHOW, str, f.this.d);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            if (f.this.c("onHideCustomView")) {
                super.onHideCustomView();
            }
            if (f.this.d("onHideCustomView")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.HIDE_CUSTOM_VIEW, f.this.d);
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            Boolean boolValueOf = Boolean.FALSE;
            if (f.this.c("onJsAlert")) {
                boolValueOf = Boolean.valueOf(super.onJsAlert(webView, str, str2, jsResult));
            }
            if (f.this.d("onJsAlert")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.JS_ALERT, str, str2, jsResult, f.this.d);
            }
            if (f.this.a("onJsAlert")) {
                boolValueOf = (Boolean) f.this.a("onJsAlert", Boolean.class, Boolean.TRUE);
            }
            return boolValueOf.booleanValue();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            Boolean boolValueOf = Boolean.FALSE;
            if (f.this.c("onJsConfirm")) {
                boolValueOf = Boolean.valueOf(super.onJsConfirm(webView, str, str2, jsResult));
            }
            if (f.this.d("onJsConfirm")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.JS_CONFIRM, str, str2, f.this.d);
            }
            if (f.this.a("onJsConfirm")) {
                boolValueOf = (Boolean) f.this.a("onJsConfirm", Boolean.class, Boolean.TRUE);
            }
            return boolValueOf.booleanValue();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            Boolean boolValueOf = Boolean.FALSE;
            if (f.this.c("onJsPrompt")) {
                boolValueOf = Boolean.valueOf(super.onJsPrompt(webView, str, str2, str3, jsPromptResult));
            }
            if (f.this.d("onJsPrompt")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.JS_PROMPT, str, str2, str3, f.this.d);
            }
            if (f.this.a("onJsPrompt")) {
                boolValueOf = (Boolean) f.this.a("onJsPrompt", Boolean.class, Boolean.TRUE);
            }
            return boolValueOf.booleanValue();
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            if (f.this.c("onPermissionRequest")) {
                super.onPermissionRequest(permissionRequest);
            }
            if (f.this.d("onPermissionRequest")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.PERMISSION_REQUEST, (permissionRequest == null || permissionRequest.getOrigin() == null) ? "" : permissionRequest.getOrigin().toString(), f.this.d);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            if (f.this.c("onProgressChanged")) {
                super.onProgressChanged(webView, i);
            }
            if (f.this.d("onProgressChanged")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.PROGRESS_CHANGED, Integer.valueOf(i), f.this.d);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedIcon(WebView webView, Bitmap bitmap) {
            if (f.this.c("onReceivedIcon")) {
                super.onReceivedIcon(webView, bitmap);
            }
            if (f.this.d("onReceivedIcon")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.RECEIVED_ICON, f.this.d);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            if (f.this.c("onReceivedTitle")) {
                super.onReceivedTitle(webView, str);
            }
            if (f.this.d("onReceivedTitle")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.RECEIVED_TITLE, str, f.this.d);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
            if (f.this.c("onReceivedTouchIconUrl")) {
                super.onReceivedTouchIconUrl(webView, str, z);
            }
            if (f.this.d("onReceivedTouchIconUrl")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.RECEIVED_TOUCH_ICON_URL, str, Boolean.valueOf(z), f.this.d);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onRequestFocus(WebView webView) {
            if (f.this.c("onRequestFocus")) {
                super.onRequestFocus(webView);
            }
            if (f.this.d("onRequestFocus")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.REQUEST_FOCUS, f.this.d);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (f.this.c("onShowCustomView")) {
                super.onShowCustomView(view, customViewCallback);
            }
            if (f.this.d("onShowCustomView")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.SHOW_CUSTOM_VIEW, f.this.d);
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            Boolean boolValueOf = Boolean.FALSE;
            if (f.this.c("onShowFileChooser")) {
                boolValueOf = Boolean.valueOf(super.onShowFileChooser(webView, valueCallback, fileChooserParams));
            }
            if (f.this.d("onShowFileChooser")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.SHOW_FILE_CHOOSER, f.this.d);
            }
            if (f.this.a("onShowFileChooser")) {
                boolValueOf = (Boolean) f.this.a("onShowFileChooser", Boolean.class, Boolean.TRUE);
                if (boolValueOf.booleanValue()) {
                    valueCallback.onReceiveValue(null);
                }
            }
            return boolValueOf.booleanValue();
        }

        /* synthetic */ d(f fVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: WebPlayerView.java */
    private class e extends WebViewClient {

        /* JADX INFO: compiled from: WebPlayerView.java */
        class a implements Runnable {
            final /* synthetic */ WebView a;

            a(WebView webView) {
                this.a = webView;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.a(this.a);
                this.a.destroy();
            }
        }

        private e() {
        }

        @Override // android.webkit.WebViewClient
        public void onFormResubmission(WebView webView, Message message, Message message2) {
            if (f.this.c("onFormResubmission")) {
                super.onFormResubmission(webView, message, message2);
            }
            if (f.this.d("onFormResubmission")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.FORM_RESUBMISSION, f.this.d);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            if (f.this.c("onLoadResource")) {
                super.onLoadResource(webView, str);
            }
            if (f.this.d("onLoadResource")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.LOAD_RESOUCE, str, f.this.d);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(WebView webView, String str) {
            if (f.this.c("onPageCommitVisible")) {
                super.onPageCommitVisible(webView, str);
            }
            if (f.this.d("onPageCommitVisible")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.PAGE_COMMIT_VISIBLE, str, f.this.d);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (f.this.c("onPageFinished")) {
                super.onPageFinished(webView, str);
            }
            if (f.this.d("onPageFinished")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.PAGE_FINISHED, str, f.this.d);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (f.this.c("onPageStarted")) {
                super.onPageStarted(webView, str, bitmap);
            }
            if (f.this.d("onPageStarted")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.PAGE_STARTED, str, f.this.d);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
            String host;
            int port;
            if (f.this.c("onReceivedClientCertRequest")) {
                super.onReceivedClientCertRequest(webView, clientCertRequest);
            }
            if (f.this.d("onReceivedClientCertRequest")) {
                if (clientCertRequest != null) {
                    host = clientCertRequest.getHost();
                    port = clientCertRequest.getPort();
                } else {
                    host = "";
                    port = -1;
                }
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.CLIENT_CERT_REQUEST, host, Integer.valueOf(port), f.this.d);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            if (f.this.c("onReceivedError")) {
                super.onReceivedError(webView, i, str, str2);
            }
            if (f.this.d("onReceivedError")) {
                com.unity3d.services.ads.webplayer.d.a(f.this.d, str2, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            if (f.this.c("onReceivedHttpAuthRequest")) {
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
            if (f.this.d("onReceivedHttpAuthRequest")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.HTTP_AUTH_REQUEST, str, str2, f.this.d);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            String reasonPhrase;
            int statusCode;
            if (f.this.c("onReceivedHttpError")) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }
            if (f.this.d("onReceivedHttpError")) {
                String string = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? "" : webResourceRequest.getUrl().toString();
                if (webResourceResponse != null) {
                    statusCode = webResourceResponse.getStatusCode();
                    reasonPhrase = webResourceResponse.getReasonPhrase();
                } else {
                    reasonPhrase = "";
                    statusCode = -1;
                }
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.HTTP_ERROR, string, reasonPhrase, Integer.valueOf(statusCode), f.this.d);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
            if (f.this.c("onReceivedLoginRequest")) {
                super.onReceivedLoginRequest(webView, str, str2, str3);
            }
            if (f.this.d("onReceivedLoginRequest")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.LOGIN_REQUEST, str, str2, str3, f.this.d);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            com.unity3d.services.core.log.a.b("Received SSL error for '%s': %s", sslError.getUrl(), sslError.toString());
            if (f.this.d("onReceivedSslError")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.SSL_ERROR, sslError.getUrl(), f.this.d);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            j.a(new a(webView));
            com.unity3d.services.ads.webplayer.d.a(f.this.d, f.this.getUrl(), "UnityAds Sdk WebPlayer onRenderProcessGone : " + renderProcessGoneDetail.toString());
            com.unity3d.services.core.log.a.c("UnityAds Sdk WebPlayer onRenderProcessGone : " + renderProcessGoneDetail.toString());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(WebView webView, float f, float f2) {
            if (f.this.c("onScaleChanged")) {
                super.onScaleChanged(webView, f, f2);
            }
            if (f.this.d("onScaleChanged")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.SCALE_CHANGED, Float.valueOf(f), Float.valueOf(f2), f.this.d);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
            if (f.this.c("onUnhandledKeyEvent")) {
                super.onUnhandledKeyEvent(webView, keyEvent);
            }
            if (f.this.d("onUnhandledKeyEvent")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.UNHANDLED_KEY_EVENT, Integer.valueOf(keyEvent.getKeyCode()), Integer.valueOf(keyEvent.getAction()), f.this.d);
            }
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            WebResourceResponse webResourceResponseShouldInterceptRequest = f.this.c("shouldInterceptRequest") ? super.shouldInterceptRequest(webView, webResourceRequest) : null;
            if (f.this.d("shouldInterceptRequest")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.SHOULD_INTERCEPT_REQUEST, webResourceRequest.getUrl().toString(), f.this.d);
            }
            return webResourceResponseShouldInterceptRequest;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
            Boolean boolValueOf = Boolean.FALSE;
            if (f.this.c("shouldOverrideKeyEvent")) {
                boolValueOf = Boolean.valueOf(super.shouldOverrideKeyEvent(webView, keyEvent));
            }
            if (f.this.d("shouldOverrideKeyEvent")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.SHOULD_OVERRIDE_KEY_EVENT, Integer.valueOf(keyEvent.getKeyCode()), Integer.valueOf(keyEvent.getAction()), f.this.d);
            }
            if (f.this.a("shouldOverrideKeyEvent")) {
                boolValueOf = (Boolean) f.this.a("shouldOverrideKeyEvent", Boolean.class, Boolean.TRUE);
            }
            return boolValueOf.booleanValue();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Boolean boolValueOf = Boolean.FALSE;
            if (f.this.c("shouldOverrideUrlLoading")) {
                boolValueOf = Boolean.valueOf(super.shouldOverrideUrlLoading(webView, webResourceRequest));
            }
            if (f.this.d("shouldOverrideUrlLoading")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.SHOULD_OVERRIDE_URL_LOADING, webResourceRequest.getUrl().toString(), webResourceRequest.getMethod(), f.this.d);
            }
            if (f.this.a("shouldOverrideUrlLoading")) {
                boolValueOf = (Boolean) f.this.a("shouldOverrideUrlLoading", Boolean.class, Boolean.TRUE);
            }
            return boolValueOf.booleanValue();
        }

        /* synthetic */ e(f fVar, a aVar) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (f.this.c("onReceivedError")) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
            }
            if (f.this.d("onReceivedError")) {
                String string = "";
                String string2 = (webResourceError == null || webResourceError.getDescription() == null) ? "" : webResourceError.getDescription().toString();
                if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    string = webResourceRequest.getUrl().toString();
                }
                com.unity3d.services.ads.webplayer.d.a(f.this.d, string, string2);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Boolean boolValueOf = Boolean.FALSE;
            if (f.this.c("shouldOverrideUrlLoading")) {
                boolValueOf = Boolean.valueOf(super.shouldOverrideUrlLoading(webView, str));
            }
            if (f.this.d("shouldOverrideUrlLoading")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.SHOULD_OVERRIDE_URL_LOADING, str, f.this.d);
            }
            if (f.this.a("shouldOverrideUrlLoading")) {
                boolValueOf = (Boolean) f.this.a("shouldOverrideUrlLoading", Boolean.class, Boolean.TRUE);
            }
            return boolValueOf.booleanValue();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.ads.webplayer.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: WebPlayerView.java */
    private class C0036f implements DownloadListener {
        private C0036f() {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            if (f.this.d("onDownloadStart")) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.WEBPLAYER, com.unity3d.services.ads.webplayer.c.DOWNLOAD_START, str, str2, str3, str4, Long.valueOf(j), f.this.d);
            }
        }

        /* synthetic */ C0036f(f fVar, a aVar) {
            this();
        }
    }

    public f(Context context, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        super(context);
        a aVar = null;
        this.c = null;
        this.e = null;
        this.d = str;
        WebSettings settings = getSettings();
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        try {
            this.c = WebView.class.getMethod("evaluateJavascript", String.class, ValueCallback.class);
        } catch (NoSuchMethodException e2) {
            com.unity3d.services.core.log.a.a("Method evaluateJavascript not found", e2);
            this.c = null;
        }
        settings.setCacheMode(2);
        settings.setDatabaseEnabled(false);
        settings.setDomStorageEnabled(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setPluginState(WebSettings.PluginState.OFF);
        settings.setRenderPriority(WebSettings.RenderPriority.NORMAL);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setInitialScale(0);
        setBackgroundColor(0);
        k.a(this, new ColorDrawable(0));
        setBackgroundResource(0);
        a(jSONObject, jSONObject2);
        setWebViewClient(new e(this, aVar));
        setWebChromeClient(new d(this, aVar));
        setDownloadListener(new C0036f(this, aVar));
        addJavascriptInterface(new com.unity3d.services.ads.webplayer.a(str), "webplayerbridge");
        g.a().a(str, this);
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(String str) {
        try {
            JSONObject jSONObject = this.b;
            if (jSONObject != null && jSONObject.has(str) && this.b.getJSONObject(str).has("sendEvent")) {
                return this.b.getJSONObject(str).getBoolean("sendEvent");
            }
            return false;
        } catch (Exception e2) {
            com.unity3d.services.core.log.a.a("Error getting send event status", e2);
            return false;
        }
    }

    @Override // android.webkit.WebView
    public void destroy() {
        super.destroy();
        g.a().b(this.d);
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
    }

    public Map<String, String> getErroredSettings() {
        return this.a;
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a();
    }

    public void setEventSettings(JSONObject jSONObject) {
        this.b = jSONObject;
    }

    public void c(JSONArray jSONArray) {
        b("javascript:window.nativebridge.receiveEvent(" + jSONArray.toString() + ")");
    }

    private void b() {
        Runnable runnable = this.e;
        if (runnable != null) {
            runnable.run();
        }
        a aVar = new a();
        addOnLayoutChangeListener(aVar);
        this.e = new b(aVar);
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2) {
        Map<String, String> map = this.a;
        if (map != null) {
            map.clear();
        }
        a(getSettings(), jSONObject);
        a(this, jSONObject2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        try {
            JSONObject jSONObject = this.b;
            if (jSONObject != null && jSONObject.has(str) && this.b.getJSONObject(str).has("callSuper")) {
                return this.b.getJSONObject(str).getBoolean("callSuper");
            }
            return true;
        } catch (Exception e2) {
            com.unity3d.services.core.log.a.a("Error getting super call status", e2);
            return true;
        }
    }

    public void a() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        com.unity3d.services.ads.webplayer.d.a(this.d, iArr[0], iArr[1], getWidth(), getHeight(), getAlpha());
    }

    public void b(String str) {
        j.a(new c(str, this));
    }

    private Object[] b(JSONArray jSONArray) throws JSONException, NoSuchMethodException, ClassNotFoundException {
        if (jSONArray == null) {
            return null;
        }
        Object[] objArr = new Object[jSONArray.length()];
        Object[] objArr2 = new Object[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            if (jSONArray.get(i) instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                Object obj = jSONObject.get("value");
                String string = jSONObject.getString("type");
                String string2 = jSONObject.has("className") ? jSONObject.getString("className") : null;
                if (string2 != null && string.equals("Enum")) {
                    objArr2[i] = Enum.valueOf(Class.forName(string2), (String) obj);
                }
            } else {
                objArr2[i] = jSONArray.get(i);
            }
        }
        System.arraycopy(objArr2, 0, objArr, 0, jSONArray.length());
        return objArr;
    }

    private Object a(Object obj, JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray(next);
                    obj.getClass().getMethod(next, a(jSONArray)).invoke(obj, b(jSONArray));
                } catch (Exception e2) {
                    a(next, e2.getMessage());
                    com.unity3d.services.core.log.a.a("Setting errored", e2);
                }
            }
        }
        return obj;
    }

    private Class<?>[] a(JSONArray jSONArray) throws JSONException, ClassNotFoundException {
        if (jSONArray == null) {
            return null;
        }
        Class<?>[] clsArr = new Class[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            if (jSONArray.get(i) instanceof JSONObject) {
                clsArr[i] = Class.forName(((JSONObject) jSONArray.get(i)).getString("className"));
            } else {
                clsArr[i] = a(jSONArray.get(i).getClass());
            }
        }
        return clsArr;
    }

    public Class<?> a(Class<?> cls) {
        String name = cls.getName();
        if (name.equals("java.lang.Byte")) {
            return Byte.TYPE;
        }
        if (name.equals("java.lang.Short")) {
            return Short.TYPE;
        }
        if (name.equals("java.lang.Integer")) {
            return Integer.TYPE;
        }
        if (name.equals("java.lang.Long")) {
            return Long.TYPE;
        }
        if (name.equals("java.lang.Character")) {
            return Character.TYPE;
        }
        if (name.equals("java.lang.Float")) {
            return Float.TYPE;
        }
        if (name.equals("java.lang.Double")) {
            return Double.TYPE;
        }
        if (name.equals("java.lang.Boolean")) {
            return Boolean.TYPE;
        }
        return name.equals("java.lang.Void") ? Void.TYPE : cls;
    }

    private void a(String str, String str2) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> T a(String str, Class<T> cls, T t) {
        try {
            JSONObject jSONObject = this.b;
            if (jSONObject != null && jSONObject.has(str) && this.b.getJSONObject(str).has("returnValue")) {
                return cls.cast(this.b.getJSONObject(str).get("returnValue"));
            }
        } catch (Exception e2) {
            com.unity3d.services.core.log.a.a("Error getting default return value", e2);
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str) {
        try {
            JSONObject jSONObject = this.b;
            return jSONObject != null && jSONObject.has(str) && this.b.getJSONObject(str).has("returnValue");
        } catch (Exception e2) {
            com.unity3d.services.core.log.a.a("Error getting default return value", e2);
            return false;
        }
    }
}
