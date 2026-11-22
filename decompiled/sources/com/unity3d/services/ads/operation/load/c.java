package com.unity3d.services.ads.operation.load;

import android.text.TextUtils;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitializationNotificationCenter;
import com.unity3d.services.core.misc.j;
import com.unity3d.services.core.request.metrics.i;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: LoadModule.java */
/* JADX INFO: loaded from: classes2.dex */
public class c extends com.unity3d.services.ads.operation.a<com.unity3d.services.ads.operation.load.b, h> implements com.unity3d.services.ads.operation.load.a {
    private static com.unity3d.services.ads.operation.load.a d;

    /* JADX INFO: compiled from: LoadModule.java */
    class a implements com.unity3d.services.core.webview.bridge.invocation.b {
        final /* synthetic */ h a;

        a(h hVar) {
            this.a = hVar;
        }

        @Override // com.unity3d.services.core.webview.bridge.invocation.b
        public void a() {
        }

        @Override // com.unity3d.services.core.webview.bridge.invocation.b
        public void a(String str, com.unity3d.services.core.webview.bridge.a aVar) {
            c.this.a().a(com.unity3d.services.core.request.metrics.b.a(com.unity3d.services.core.request.metrics.a.callback_error, Long.valueOf(this.a.d())));
            c.this.a(this.a, UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Internal communication failure", false);
            c.this.a(this.a.b);
        }

        @Override // com.unity3d.services.core.webview.bridge.invocation.b
        public void b() {
            c.this.a().a(com.unity3d.services.core.request.metrics.b.a(com.unity3d.services.core.request.metrics.a.callback_timeout, Long.valueOf(this.a.d())));
            c.this.a(this.a, UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Internal communication timeout", false);
            c.this.a(this.a.b);
        }
    }

    /* JADX INFO: compiled from: LoadModule.java */
    class b implements Runnable {
        final /* synthetic */ h a;
        final /* synthetic */ UnityAds.UnityAdsLoadError b;
        final /* synthetic */ String c;

        b(h hVar, UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
            this.a = hVar;
            this.b = unityAdsLoadError;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(this.b, this.c);
        }
    }

    public c(com.unity3d.services.core.request.metrics.c cVar) {
        super(cVar);
    }

    public static com.unity3d.services.ads.operation.load.a b() {
        if (d == null) {
            d = new f(new e(new c(i.a()), InitializationNotificationCenter.getInstance()), new ConfigurationReader());
        }
        return d;
    }

    @Override // com.unity3d.services.ads.operation.load.a
    public void onUnityAdsAdLoaded(String str) {
        com.unity3d.services.ads.operation.load.b bVar = (com.unity3d.services.ads.operation.load.b) get(str);
        if (bVar == null || bVar.b() == null) {
            return;
        }
        h hVarB = bVar.b();
        a().a(com.unity3d.services.core.request.metrics.b.a(Long.valueOf(hVarB.d())));
        bVar.onUnityAdsAdLoaded(hVarB.c);
        a(str);
    }

    @Override // com.unity3d.services.ads.operation.load.a
    public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        com.unity3d.services.ads.operation.load.b bVar = (com.unity3d.services.ads.operation.load.b) get(str);
        if (bVar == null || bVar.b() == null) {
            return;
        }
        h hVarB = bVar.b();
        a().a(com.unity3d.services.core.request.metrics.b.a(unityAdsLoadError, Long.valueOf(hVarB.d())));
        bVar.onUnityAdsFailedToLoad(hVarB.c, unityAdsLoadError, str2);
        a(str);
    }

    @Override // com.unity3d.services.ads.operation.c
    public void a(com.unity3d.services.core.webview.bridge.b bVar, h hVar) {
        if (TextUtils.isEmpty(hVar.c)) {
            a(hVar, UnityAds.UnityAdsLoadError.INVALID_ARGUMENT, "[UnityAds] Placement ID cannot be null", true);
            return;
        }
        g gVar = new g(hVar, new com.unity3d.services.core.webview.bridge.invocation.c(this.c, bVar, new a(hVar)));
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("headerBiddingOptions", hVar.i.getData());
            jSONObject.put("options", jSONObject2);
            jSONObject.put("listenerId", gVar.a());
            jSONObject.put("placementId", hVar.c);
            jSONObject.put("time", com.unity3d.services.core.device.b.p());
            a(gVar);
            gVar.a(hVar.d.getWebViewBridgeTimeout(), jSONObject);
        } catch (NullPointerException unused) {
            a(hVar, UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Failed to create load request", true);
        } catch (JSONException unused2) {
            a(hVar, UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Failed to create load request", true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(h hVar, UnityAds.UnityAdsLoadError unityAdsLoadError, String str, boolean z) {
        if (hVar == null || hVar.h == null) {
            return;
        }
        if (z) {
            a().a(com.unity3d.services.core.request.metrics.b.a(unityAdsLoadError, Long.valueOf(hVar.d())));
        }
        j.a(new b(hVar, unityAdsLoadError, str));
    }
}
