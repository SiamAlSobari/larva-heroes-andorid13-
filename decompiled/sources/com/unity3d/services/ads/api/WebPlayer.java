package com.unity3d.services.ads.api;

import com.unity3d.services.core.misc.j;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import com.unity3d.services.core.webview.bridge.l;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class WebPlayer {

    static class a implements Runnable {
        final /* synthetic */ com.unity3d.services.ads.webplayer.f a;
        final /* synthetic */ String b;

        a(com.unity3d.services.ads.webplayer.f fVar, String str) {
            this.a = fVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.loadUrl(this.b);
        }
    }

    static class b implements Runnable {
        final /* synthetic */ com.unity3d.services.ads.webplayer.f a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        b(com.unity3d.services.ads.webplayer.f fVar, String str, String str2, String str3) {
            this.a = fVar;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.loadData(this.b, this.c, this.d);
        }
    }

    static class c implements Runnable {
        final /* synthetic */ com.unity3d.services.ads.webplayer.f a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;
        final /* synthetic */ String e;

        c(com.unity3d.services.ads.webplayer.f fVar, String str, String str2, String str3, String str4) {
            this.a = fVar;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.loadDataWithBaseURL(this.b, this.c, this.d, this.e, null);
        }
    }

    static class d implements Runnable {
        final /* synthetic */ com.unity3d.services.ads.webplayer.f a;
        final /* synthetic */ JSONObject b;
        final /* synthetic */ JSONObject c;

        d(com.unity3d.services.ads.webplayer.f fVar, JSONObject jSONObject, JSONObject jSONObject2) {
            this.a = fVar;
            this.b = jSONObject;
            this.c = jSONObject2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(this.b, this.c);
        }
    }

    static class e implements Runnable {
        final /* synthetic */ com.unity3d.services.ads.webplayer.f a;
        final /* synthetic */ JSONObject b;

        e(com.unity3d.services.ads.webplayer.f fVar, JSONObject jSONObject) {
            this.a = fVar;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.setEventSettings(this.b);
        }
    }

    static class f implements Runnable {
        final /* synthetic */ com.unity3d.services.ads.webplayer.f a;

        f(com.unity3d.services.ads.webplayer.f fVar) {
            this.a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(new JSONObject(), new JSONObject());
            this.a.setEventSettings(new JSONObject());
        }
    }

    static class g implements Runnable {
        final /* synthetic */ com.unity3d.services.ads.webplayer.f a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        g(com.unity3d.services.ads.webplayer.f fVar, String str, String str2) {
            this.a = fVar;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[2];
            this.a.getLocationOnScreen(iArr);
            com.unity3d.services.ads.webplayer.d.a(this.b, this.c, iArr[0], iArr[1], this.a.getWidth(), this.a.getHeight(), this.a.getAlpha());
        }
    }

    @WebViewExposed
    public static void clearSettings(String str, l lVar) {
        com.unity3d.services.ads.webplayer.e eVarA = com.unity3d.services.ads.webplayer.e.a();
        eVarA.f(str);
        eVarA.e(str);
        eVarA.d(str);
        com.unity3d.services.ads.webplayer.f fVarA = com.unity3d.services.ads.webplayer.g.a().a(str);
        if (fVarA == null) {
            lVar.a(com.unity3d.services.ads.webplayer.b.WEBPLAYER_NULL, new Object[0]);
        } else {
            j.a(new f(fVarA));
            lVar.a(new Object[0]);
        }
    }

    @WebViewExposed
    public static void getErroredSettings(String str, l lVar) {
        com.unity3d.services.ads.webplayer.f fVarA = com.unity3d.services.ads.webplayer.g.a().a(str);
        if (fVarA == null) {
            lVar.a(com.unity3d.services.ads.webplayer.b.WEBPLAYER_NULL, new Object[0]);
            return;
        }
        Map<String, String> erroredSettings = fVarA.getErroredSettings();
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : erroredSettings.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (Exception e2) {
            com.unity3d.services.core.log.a.a("Error forming JSON object", e2);
        }
        lVar.a(jSONObject);
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void getFrame(String str, String str2, l lVar) {
        lVar.a(new Object[0]);
        com.unity3d.services.ads.webplayer.f fVarA = com.unity3d.services.ads.webplayer.g.a().a(str2);
        if (fVarA != null) {
            j.a(new g(fVarA, str, str2));
        }
    }

    @WebViewExposed
    public static void sendEvent(JSONArray jSONArray, String str, l lVar) {
        com.unity3d.services.ads.webplayer.f fVarA = com.unity3d.services.ads.webplayer.g.a().a(str);
        if (fVarA == null) {
            lVar.a(com.unity3d.services.ads.webplayer.b.WEBPLAYER_NULL, new Object[0]);
        } else {
            fVarA.c(jSONArray);
            lVar.a(new Object[0]);
        }
    }

    @WebViewExposed
    public static void setData(String str, String str2, String str3, String str4, l lVar) {
        com.unity3d.services.ads.webplayer.f fVarA = com.unity3d.services.ads.webplayer.g.a().a(str4);
        if (fVarA == null) {
            lVar.a(com.unity3d.services.ads.webplayer.b.WEBPLAYER_NULL, new Object[0]);
        } else {
            j.a(new b(fVarA, str, str2, str3));
            lVar.a(new Object[0]);
        }
    }

    @WebViewExposed
    public static void setDataWithUrl(String str, String str2, String str3, String str4, String str5, l lVar) {
        com.unity3d.services.ads.webplayer.f fVarA = com.unity3d.services.ads.webplayer.g.a().a(str5);
        if (fVarA == null) {
            lVar.a(com.unity3d.services.ads.webplayer.b.WEBPLAYER_NULL, new Object[0]);
        } else {
            j.a(new c(fVarA, str, str2, str3, str4));
            lVar.a(new Object[0]);
        }
    }

    @WebViewExposed
    public static void setEventSettings(JSONObject jSONObject, String str, l lVar) {
        com.unity3d.services.ads.webplayer.e.a().a(str, jSONObject);
        com.unity3d.services.ads.webplayer.f fVarA = com.unity3d.services.ads.webplayer.g.a().a(str);
        if (fVarA == null) {
            lVar.a(com.unity3d.services.ads.webplayer.b.WEBPLAYER_NULL, new Object[0]);
        } else {
            j.a(new e(fVarA, jSONObject));
            lVar.a(new Object[0]);
        }
    }

    @WebViewExposed
    public static void setSettings(JSONObject jSONObject, JSONObject jSONObject2, String str, l lVar) {
        com.unity3d.services.ads.webplayer.e.a().c(str, jSONObject);
        com.unity3d.services.ads.webplayer.e.a().b(str, jSONObject2);
        com.unity3d.services.ads.webplayer.f fVarA = com.unity3d.services.ads.webplayer.g.a().a(str);
        if (fVarA == null) {
            lVar.a(com.unity3d.services.ads.webplayer.b.WEBPLAYER_NULL, new Object[0]);
        } else {
            j.a(new d(fVarA, jSONObject, jSONObject2));
            lVar.a(new Object[0]);
        }
    }

    @WebViewExposed
    public static void setUrl(String str, String str2, l lVar) {
        com.unity3d.services.ads.webplayer.f fVarA = com.unity3d.services.ads.webplayer.g.a().a(str2);
        if (fVarA == null) {
            lVar.a(com.unity3d.services.ads.webplayer.b.WEBPLAYER_NULL, new Object[0]);
        } else {
            j.a(new a(fVarA, str));
            lVar.a(new Object[0]);
        }
    }
}
