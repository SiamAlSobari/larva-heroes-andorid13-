package com.unity3d.services.core.webview;

import android.os.Build;
import android.os.ConditionVariable;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebViewClient;
import com.unity3d.services.ads.api.AdUnit;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.InitializeThread;
import com.unity3d.services.core.misc.j;
import com.unity3d.services.core.misc.k;
import com.unity3d.services.core.request.metrics.i;
import com.unity3d.services.core.webview.bridge.e;
import com.unity3d.services.core.webview.bridge.f;
import com.unity3d.services.core.webview.bridge.g;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: WebViewApp.java */
/* JADX INFO: loaded from: classes2.dex */
public class a implements com.unity3d.services.core.webview.bridge.b {
    private static a a;
    private static ConditionVariable b;
    private static AtomicReference<Boolean> c = new AtomicReference<>(Boolean.FALSE);
    private static AtomicReference<String> d = new AtomicReference<>();
    private static AtomicReference<Integer> e = new AtomicReference<>();
    private boolean f;
    private WebView g;
    private Configuration h;
    private HashMap<String, f> i;

    /* JADX INFO: renamed from: com.unity3d.services.core.webview.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: WebViewApp.java */
    static class RunnableC0049a implements Runnable {
        final /* synthetic */ Configuration a;

        RunnableC0049a(Configuration configuration) {
            this.a = configuration;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            try {
                Configuration configuration = this.a;
                a aVar = new a(configuration, configuration.getExperiments().isWebAssetAdCaching(), null);
                String strA = new com.unity3d.services.core.webview.c("file://" + com.unity3d.services.core.properties.d.m(), this.a).a();
                if (strA == null) {
                    try {
                        if (this.a.getWebViewUrl() != null) {
                            str = "?platform=android&origin=" + URLEncoder.encode(this.a.getWebViewUrl(), "UTF-8");
                        } else {
                            str = "?platform=android";
                        }
                    } catch (UnsupportedEncodingException e) {
                        com.unity3d.services.core.log.a.a("Unsupported charset when encoding origin url", e);
                    }
                    try {
                        if (this.a.getWebViewVersion() != null) {
                            str = str + "&version=" + URLEncoder.encode(this.a.getWebViewVersion(), "UTF-8");
                        }
                    } catch (UnsupportedEncodingException e2) {
                        com.unity3d.services.core.log.a.a("Unsupported charset when encoding webview version", e2);
                    }
                    aVar.g().loadDataWithBaseURL("file://" + com.unity3d.services.core.properties.d.m() + str, this.a.getWebViewData(), "text/html", "UTF-8", null);
                } else {
                    aVar.g().loadDataWithBaseURL(strA, this.a.getWebViewData(), "text/html", "UTF-8", null);
                }
                a.a(aVar);
            } catch (Exception unused) {
                com.unity3d.services.core.log.a.c("Couldn't construct WebViewApp");
                a.b.open();
            }
        }
    }

    /* JADX INFO: compiled from: WebViewApp.java */
    static class b implements Runnable {
        final /* synthetic */ Configuration a;

        b(Configuration configuration) {
            this.a = configuration;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a aVar = new a(this.a, true, null);
                aVar.g().loadUrl(new com.unity3d.services.core.webview.c(this.a.getWebViewUrl(), this.a).a());
                a.a(aVar);
            } catch (Exception unused) {
                com.unity3d.services.core.log.a.c("Couldn't construct WebViewApp");
                a.b.open();
            }
        }
    }

    /* JADX INFO: compiled from: WebViewApp.java */
    private class c extends WebChromeClient {
        private c() {
        }

        @Override // android.webkit.WebChromeClient
        public void onConsoleMessage(String str, int i, String str2) {
            File file;
            try {
                file = new File(str2);
            } catch (Exception e) {
                com.unity3d.services.core.log.a.a("Could not handle sourceId", e);
                file = null;
            }
            if (file != null) {
                file.getName();
            }
        }

        /* synthetic */ c(a aVar, RunnableC0049a runnableC0049a) {
            this();
        }
    }

    /* JADX INFO: compiled from: WebViewApp.java */
    private class d extends WebViewClient {

        /* JADX INFO: renamed from: com.unity3d.services.core.webview.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: WebViewApp.java */
        class RunnableC0050a implements Runnable {
            RunnableC0050a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (AdUnit.getAdUnitActivity() != null) {
                    AdUnit.getAdUnitActivity().finish();
                }
                if (a.c() != null && a.c().g() != null) {
                    k.a(a.c().g());
                }
                InitializeThread.reset();
            }
        }

        /* JADX INFO: compiled from: WebViewApp.java */
        class b extends HashMap<String, String> {
            final /* synthetic */ RenderProcessGoneDetail a;

            b(RenderProcessGoneDetail renderProcessGoneDetail) {
                this.a = renderProcessGoneDetail;
                if (Build.VERSION.SDK_INT >= 26) {
                    put("dc", "" + renderProcessGoneDetail.didCrash());
                    put("pae", "" + renderProcessGoneDetail.rendererPriorityAtExit());
                }
            }
        }

        private d() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(android.webkit.WebView webView, String str) {
            super.onPageFinished(webView, str);
            com.unity3d.services.core.log.a.b("onPageFinished url: " + str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(android.webkit.WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webView != null) {
                com.unity3d.services.core.log.a.c("WEBVIEW_ERROR: " + webView.toString());
            }
            if (webResourceRequest != null) {
                com.unity3d.services.core.log.a.c("WEBVIEW_ERROR: " + webResourceRequest.toString());
            }
            if (webResourceError != null) {
                com.unity3d.services.core.log.a.c("WEBVIEW_ERROR: " + webResourceError.toString());
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(android.webkit.WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            j.a(new RunnableC0050a());
            com.unity3d.services.core.log.a.c("UnityAds Sdk WebView onRenderProcessGone : " + renderProcessGoneDetail.toString());
            i.a().a("native_webview_render_process_gone", new b(renderProcessGoneDetail));
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(android.webkit.WebView webView, String str) {
            com.unity3d.services.core.log.a.b("Trying to load url: " + str);
            return false;
        }

        /* synthetic */ d(a aVar, RunnableC0049a runnableC0049a) {
            this();
        }
    }

    /* synthetic */ a(Configuration configuration, boolean z, RunnableC0049a runnableC0049a) {
        this(configuration, z);
    }

    public static a c() {
        return a;
    }

    private ErrorState d() {
        int iE = e();
        if (iE == 1) {
            return ErrorState.CreateWebviewGameIdDisabled;
        }
        if (iE == 2) {
            return ErrorState.CreateWebviewConfigError;
        }
        return iE == 3 ? ErrorState.CreateWebviewInvalidArgument : ErrorState.CreateWebview;
    }

    public void b(boolean z) {
        this.f = z;
    }

    public int e() {
        return e.get().intValue();
    }

    public String f() {
        return d.get();
    }

    public WebView g() {
        return this.g;
    }

    public boolean h() {
        return c.get().booleanValue();
    }

    public boolean i() {
        return this.f;
    }

    public void j() {
        this.f = false;
        e.set(-1);
        d.set("");
        c.set(Boolean.FALSE);
    }

    private a(Configuration configuration, boolean z) {
        this.f = false;
        b(configuration);
        g.a(b().getWebAppApiClassList());
        WebView dVar = z ? new com.unity3d.services.core.webview.d(com.unity3d.services.core.properties.a.e()) : new WebView(com.unity3d.services.core.properties.a.e());
        this.g = dVar;
        RunnableC0049a runnableC0049a = null;
        dVar.setWebViewClient(new d(this, runnableC0049a));
        this.g.setWebChromeClient(new c(this, runnableC0049a));
    }

    public void a(int i) {
        e.set(Integer.valueOf(i));
    }

    public void b(String str) {
        d.set(str);
    }

    public void a(boolean z) {
        c.set(Boolean.valueOf(z));
        b.open();
    }

    public Configuration b() {
        return this.h;
    }

    public void b(Configuration configuration) {
        this.h = configuration;
    }

    private void b(String str, String str2, JSONArray jSONArray) throws JSONException {
        String strA = a(str, str2, jSONArray);
        com.unity3d.services.core.log.a.a("Invoking javascript: %s", strA);
        g().a(strA);
    }

    public void a(WebView webView) {
        this.g = webView;
    }

    private String a(String str, String str2, JSONArray jSONArray) throws JSONException {
        String string = jSONArray.toString();
        StringBuilder sb = new StringBuilder(str.length() + 22 + str2.length() + string.length());
        sb.append("javascript:window.");
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        sb.append("(");
        sb.append(string);
        sb.append(");");
        return sb.toString();
    }

    public void b(f fVar) {
        HashMap<String, f> map = this.i;
        if (map == null) {
            return;
        }
        synchronized (map) {
            this.i.remove(fVar.a());
        }
    }

    public boolean a(Enum r4, Enum r5, Object... objArr) {
        if (!i()) {
            com.unity3d.services.core.log.a.b("sendEvent ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(r4.name());
        jSONArray.put(r5.name());
        for (Object obj : objArr) {
            jSONArray.put(obj);
        }
        try {
            b("nativebridge", "handleEvent", jSONArray);
            return true;
        } catch (Exception e2) {
            com.unity3d.services.core.log.a.a("Error while sending event to WebView", e2);
            return false;
        }
    }

    @Override // com.unity3d.services.core.webview.bridge.b
    public boolean a(String str, String str2, Method method, Object... objArr) {
        if (!i()) {
            com.unity3d.services.core.log.a.b("invokeMethod ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        if (method != null) {
            f fVar = new f(method);
            a(fVar);
            jSONArray.put(fVar.a());
        } else {
            jSONArray.put((Object) null);
        }
        if (objArr != null) {
            for (Object obj : objArr) {
                jSONArray.put(obj);
            }
        }
        try {
            b("nativebridge", "handleInvocation", jSONArray);
            return true;
        } catch (Exception e2) {
            com.unity3d.services.core.log.a.a("Error invoking javascript method", e2);
            return false;
        }
    }

    public boolean a(e eVar) {
        if (!i()) {
            com.unity3d.services.core.log.a.b("invokeBatchCallback ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList<ArrayList<Object>> arrayListB = eVar.b();
        if (arrayListB != null && !arrayListB.isEmpty()) {
            for (ArrayList<Object> arrayList : arrayListB) {
                com.unity3d.services.core.webview.bridge.a aVar = (com.unity3d.services.core.webview.bridge.a) arrayList.get(0);
                Enum r5 = (Enum) arrayList.get(1);
                Object[] objArr = (Object[]) arrayList.get(2);
                String str = (String) objArr[0];
                Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, 1, objArr.length);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(str);
                arrayList2.add(aVar.toString());
                JSONArray jSONArray2 = new JSONArray();
                if (r5 != null) {
                    jSONArray2.put(r5.name());
                }
                for (Object obj : objArrCopyOfRange) {
                    jSONArray2.put(obj);
                }
                arrayList2.add(jSONArray2);
                JSONArray jSONArray3 = new JSONArray();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    jSONArray3.put(it.next());
                }
                jSONArray.put(jSONArray3);
            }
        }
        try {
            b("nativebridge", "handleCallback", jSONArray);
        } catch (Exception e2) {
            com.unity3d.services.core.log.a.a("Error while invoking batch response for WebView", e2);
        }
        return true;
    }

    public void a(f fVar) {
        if (this.i == null) {
            this.i = new HashMap<>();
        }
        synchronized (this.i) {
            this.i.put(fVar.a(), fVar);
        }
    }

    public f a(String str) {
        f fVar;
        synchronized (this.i) {
            fVar = this.i.get(str);
        }
        return fVar;
    }

    public static void a(a aVar) {
        a = aVar;
    }

    public static ErrorState a(Configuration configuration, boolean z) throws IllegalThreadStateException {
        com.unity3d.services.core.log.a.a();
        if (z) {
            return a(configuration);
        }
        if (!Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
            j.a(new RunnableC0049a(configuration));
            ConditionVariable conditionVariable = new ConditionVariable();
            b = conditionVariable;
            boolean zBlock = conditionVariable.block(configuration.getWebViewAppCreateTimeout());
            boolean z2 = c() != null;
            if (zBlock && z2 && (z2 && c().h())) {
                return null;
            }
            if (!zBlock) {
                return ErrorState.CreateWebviewTimeout;
            }
            return c().d();
        }
        throw new IllegalThreadStateException("Cannot call create() from main thread!");
    }

    private static ErrorState a(Configuration configuration) {
        if (!Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
            j.a(new b(configuration));
            ConditionVariable conditionVariable = new ConditionVariable();
            b = conditionVariable;
            boolean zBlock = conditionVariable.block(configuration.getWebViewAppCreateTimeout());
            boolean z = c() != null;
            if (zBlock && z && (z && c().h())) {
                return null;
            }
            if (!zBlock) {
                return ErrorState.CreateWebviewTimeout;
            }
            return c().d();
        }
        throw new IllegalThreadStateException("Cannot call create() from main thread!");
    }
}
