package com.unity3d.services.core.api;

import com.unity3d.services.core.broadcast.d;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import com.unity3d.services.core.webview.bridge.l;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class Broadcast {
    @WebViewExposed
    public static void addBroadcastListener(String str, JSONArray jSONArray, l lVar) {
        addBroadcastListener(str, null, jSONArray, lVar);
    }

    @WebViewExposed
    public static void removeAllBroadcastListeners(l lVar) {
        d.a();
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void removeBroadcastListener(String str, l lVar) {
        d.a(str);
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void addBroadcastListener(String str, String str2, JSONArray jSONArray, l lVar) {
        try {
            if (jSONArray.length() > 0) {
                String[] strArr = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr[i] = jSONArray.getString(i);
                }
                d.a(str, str2, strArr);
            }
            lVar.a(new Object[0]);
        } catch (JSONException unused) {
            lVar.a(com.unity3d.services.core.broadcast.a.JSON_ERROR, new Object[0]);
        }
    }
}
