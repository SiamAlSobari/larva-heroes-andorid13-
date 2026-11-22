package com.unity3d.services.store.core.api;

import com.unity3d.services.ads.gmascar.handlers.e;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import com.unity3d.services.core.webview.bridge.l;
import com.unity3d.services.store.b;
import com.unity3d.services.store.c;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class Store {
    private static final com.unity3d.services.store.core.a a = new com.unity3d.services.store.core.a(new e());

    static class a implements Runnable {
        final /* synthetic */ Integer a;
        final /* synthetic */ String b;

        a(Integer num, String str) {
            this.a = num;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.b(this.a.intValue(), this.b);
        }
    }

    @WebViewExposed
    public static void getPurchaseHistory(Integer num, String str, Integer num2, l lVar) {
        if (!c.b()) {
            lVar.a(com.unity3d.services.store.a.NOT_INITIALIZED, new Object[0]);
        } else {
            c.a(num.intValue(), str, num2.intValue());
            lVar.a(new Object[0]);
        }
    }

    @WebViewExposed
    public static void getPurchases(Integer num, String str, l lVar) {
        if (!c.b()) {
            lVar.a(com.unity3d.services.store.a.NOT_INITIALIZED, new Object[0]);
        } else {
            c.a(num.intValue(), str);
            lVar.a(new Object[0]);
        }
    }

    @WebViewExposed
    public static void getSkuDetails(Integer num, String str, JSONArray jSONArray, l lVar) {
        if (!c.b()) {
            lVar.a(com.unity3d.services.store.a.NOT_INITIALIZED, new Object[0]);
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            c.a(num.intValue(), str, (ArrayList<String>) arrayList);
        } catch (JSONException e) {
            a.a(b.SKU_DETAILS_LIST_REQUEST_ERROR, num.intValue(), e);
        }
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void initialize(l lVar) {
        try {
            c.a(a);
            lVar.a(new Object[0]);
        } catch (Exception e) {
            lVar.a(com.unity3d.services.store.a.UNKNOWN_ERROR, e.getMessage(), e.getClass().getName());
        }
    }

    @WebViewExposed
    public static void isFeatureSupported(Integer num, String str, l lVar) {
        if (!c.b()) {
            lVar.a(com.unity3d.services.store.a.NOT_INITIALIZED, new Object[0]);
        } else {
            new Thread(new a(num, str)).start();
            lVar.a(new Object[0]);
        }
    }

    @WebViewExposed
    public static void startPurchaseTracking(JSONArray jSONArray, l lVar) {
        if (!c.b()) {
            lVar.a(com.unity3d.services.store.a.NOT_INITIALIZED, new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(jSONArray.getString(i));
            } catch (JSONException e) {
                lVar.a(com.unity3d.services.store.a.JSON_ERROR, e.getMessage());
                return;
            }
        }
        c.a((ArrayList<String>) arrayList);
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void stopPurchaseTracking(l lVar) {
        if (!c.b()) {
            lVar.a(com.unity3d.services.store.a.NOT_INITIALIZED, new Object[0]);
        } else {
            c.c();
            lVar.a(new Object[0]);
        }
    }
}
