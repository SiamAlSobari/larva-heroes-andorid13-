package com.unity3d.services.core.webview.bridge;

import android.webkit.JavascriptInterface;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: WebViewBridgeInterface.java */
/* JADX INFO: loaded from: classes2.dex */
public class i {
    private Object[] a(JSONArray jSONArray) throws JSONException {
        Object[] objArr = new Object[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            objArr[i] = jSONArray.get(i);
        }
        return objArr;
    }

    @JavascriptInterface
    public void handleCallback(String str, String str2, String str3) throws Exception {
        Object[] objArr;
        com.unity3d.services.core.log.a.b("handleCallback " + str + " " + str2 + " " + str3);
        JSONArray jSONArray = new JSONArray(str3);
        if (jSONArray.length() > 0) {
            objArr = new Object[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                objArr[i] = jSONArray.get(i);
            }
        } else {
            objArr = null;
        }
        g.b(str, str2, objArr);
    }

    @JavascriptInterface
    public void handleInvocation(String str) throws JSONException {
        com.unity3d.services.core.log.a.b("handleInvocation " + str);
        JSONArray jSONArray = new JSONArray(str);
        e eVar = new e();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray jSONArray2 = (JSONArray) jSONArray.get(i);
            eVar.a((String) jSONArray2.get(0), (String) jSONArray2.get(1), a((JSONArray) jSONArray2.get(2)), new l((String) jSONArray2.get(3), eVar.a()));
        }
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            eVar.c();
        }
        eVar.d();
    }
}
