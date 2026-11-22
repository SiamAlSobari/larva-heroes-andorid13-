package com.unity3d.services.ads.api;

import com.unity3d.services.ads.gmascar.a;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import com.unity3d.services.core.webview.bridge.l;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class GMAScar {
    private static final a a = new a();

    private static String[] a(JSONArray jSONArray) throws JSONException {
        String[] strArr = new String[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            strArr[i] = jSONArray.getString(i);
        }
        return strArr;
    }

    @WebViewExposed
    public static void getSCARSignals(JSONArray jSONArray, JSONArray jSONArray2, l lVar) throws JSONException {
        a.a(a(jSONArray), a(jSONArray2));
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void getVersion(l lVar) {
        a.b();
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void initializeScar(l lVar) {
        a.c();
        lVar.a(new Object[0]);
    }

    public static void isInitialized(l lVar) {
        a.d();
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void load(String str, String str2, Boolean bool, String str3, String str4, Integer num, l lVar) {
        a.a(bool.booleanValue(), str, str2, str4, str3, num.intValue());
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void show(String str, String str2, Boolean bool, l lVar) {
        a.a(str, str2, bool.booleanValue());
        lVar.a(new Object[0]);
    }
}
