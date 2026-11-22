package com.unity3d.services.ads.operation.show;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.firebase.messaging.Constants;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.misc.j;
import com.unity3d.services.core.request.metrics.i;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ShowModule.java */
/* JADX INFO: loaded from: classes2.dex */
public class c extends com.unity3d.services.ads.operation.a<com.unity3d.services.ads.operation.show.b, g> implements com.unity3d.services.ads.operation.show.a {
    private static com.unity3d.services.ads.operation.show.a d = null;
    public static String e = "[UnityAds] Placement ID cannot be null";

    /* JADX INFO: compiled from: ShowModule.java */
    class a implements com.unity3d.services.core.webview.bridge.invocation.b {
        final /* synthetic */ g a;

        a(g gVar) {
            this.a = gVar;
        }

        @Override // com.unity3d.services.core.webview.bridge.invocation.b
        public void a() {
        }

        @Override // com.unity3d.services.core.webview.bridge.invocation.b
        public void a(String str, com.unity3d.services.core.webview.bridge.a aVar) {
            c.this.a().a(com.unity3d.services.core.request.metrics.b.b(com.unity3d.services.core.request.metrics.a.callback_error, Long.valueOf(this.a.d())));
            c.this.a(this.a, str, UnityAds.UnityAdsShowError.INTERNAL_ERROR, false);
            c.this.a(this.a.b);
        }

        @Override // com.unity3d.services.core.webview.bridge.invocation.b
        public void b() {
            c.this.a().a(com.unity3d.services.core.request.metrics.b.b(com.unity3d.services.core.request.metrics.a.callback_timeout, Long.valueOf(this.a.d())));
            c.this.a(this.a, "[UnityAds] Show Invocation Timeout", UnityAds.UnityAdsShowError.INTERNAL_ERROR, false);
            c.this.a(this.a.b);
        }
    }

    /* JADX INFO: compiled from: ShowModule.java */
    class b implements Runnable {
        final /* synthetic */ g a;
        final /* synthetic */ UnityAds.UnityAdsShowError b;
        final /* synthetic */ String c;

        b(g gVar, UnityAds.UnityAdsShowError unityAdsShowError, String str) {
            this.a = gVar;
            this.b = unityAdsShowError;
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

    public static com.unity3d.services.ads.operation.show.a b() {
        if (d == null) {
            d = new e(new c(i.a()), new ConfigurationReader());
        }
        return d;
    }

    @Override // com.unity3d.services.ads.operation.show.a
    public void onUnityAdsShowClick(String str) {
        com.unity3d.services.ads.operation.show.b bVar = (com.unity3d.services.ads.operation.show.b) get(str);
        if (bVar == null || bVar.c() == null) {
            return;
        }
        bVar.onUnityAdsShowClick(bVar.c().c);
    }

    @Override // com.unity3d.services.ads.operation.show.a
    public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        com.unity3d.services.ads.operation.show.b bVar = (com.unity3d.services.ads.operation.show.b) get(str);
        if (bVar == null || bVar.c() == null) {
            return;
        }
        g gVarC = bVar.c();
        a().a(com.unity3d.services.core.request.metrics.b.b(Long.valueOf(gVarC.d())));
        bVar.onUnityAdsShowComplete(gVarC.c, unityAdsShowCompletionState);
        a(str);
    }

    @Override // com.unity3d.services.ads.operation.show.a
    public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        com.unity3d.services.ads.operation.show.b bVar = (com.unity3d.services.ads.operation.show.b) get(str);
        if (bVar == null || bVar.c() == null) {
            return;
        }
        g gVarC = bVar.c();
        a().a(com.unity3d.services.core.request.metrics.b.a(unityAdsShowError, Long.valueOf(gVarC.d())));
        bVar.onUnityAdsShowFailure(gVarC.c, unityAdsShowError, str2);
        a(str);
    }

    @Override // com.unity3d.services.ads.operation.show.a
    public void onUnityAdsShowStart(String str) {
        com.unity3d.services.ads.operation.show.b bVar = (com.unity3d.services.ads.operation.show.b) get(str);
        if (bVar == null || bVar.c() == null) {
            return;
        }
        bVar.onUnityAdsShowStart(bVar.c().c);
    }

    @Override // com.unity3d.services.ads.operation.c
    public void a(com.unity3d.services.core.webview.bridge.b bVar, g gVar) {
        if (TextUtils.isEmpty(gVar.c)) {
            a(gVar, e, UnityAds.UnityAdsShowError.INVALID_ARGUMENT, true);
            return;
        }
        f fVar = new f(gVar, new com.unity3d.services.core.webview.bridge.invocation.c(this.c, bVar, new a(gVar)));
        com.unity3d.services.core.properties.a.a(gVar.h);
        Display defaultDisplay = ((WindowManager) gVar.h.getSystemService("window")).getDefaultDisplay();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("requestedOrientation", gVar.h.getRequestedOrientation());
            jSONObject3.put("rotation", defaultDisplay.getRotation());
            Point point = new Point();
            defaultDisplay.getSize(point);
            jSONObject3.put("width", point.x);
            jSONObject3.put("height", point.y);
            jSONObject2.put(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, jSONObject3);
            jSONObject2.put("headerBiddingOptions", gVar.j.getData());
            jSONObject.put("options", jSONObject2);
            jSONObject.put("listenerId", fVar.a());
            jSONObject.put("placementId", gVar.c);
            jSONObject.put("time", com.unity3d.services.core.device.b.p());
            a(fVar);
            fVar.a(gVar.d.getWebViewBridgeTimeout(), jSONObject);
        } catch (NullPointerException unused) {
            a(gVar, "[UnityAds] Error creating show options", UnityAds.UnityAdsShowError.INTERNAL_ERROR, true);
        } catch (JSONException unused2) {
            a(gVar, "[UnityAds] Error creating show options", UnityAds.UnityAdsShowError.INTERNAL_ERROR, true);
        }
    }

    @Override // com.unity3d.services.ads.operation.show.a
    public void b(String str) {
        com.unity3d.services.ads.operation.show.b bVar = (com.unity3d.services.ads.operation.show.b) get(str);
        if (bVar != null) {
            bVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(g gVar, String str, UnityAds.UnityAdsShowError unityAdsShowError, boolean z) {
        if (gVar == null || gVar.i == null) {
            return;
        }
        if (z) {
            a().a(com.unity3d.services.core.request.metrics.b.a(unityAdsShowError, Long.valueOf(gVar.d())));
        }
        j.a(new b(gVar, unityAdsShowError, str));
    }
}
