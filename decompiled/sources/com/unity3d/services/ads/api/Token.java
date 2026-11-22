package com.unity3d.services.ads.api;

import com.unity3d.services.ads.token.f;
import com.unity3d.services.ads.token.h;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import com.unity3d.services.core.webview.bridge.l;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class Token {
    @WebViewExposed
    public static void appendTokens(JSONArray jSONArray, l lVar) {
        try {
            h.a(jSONArray);
            lVar.a(new Object[0]);
        } catch (JSONException e) {
            lVar.a(f.JSON_EXCEPTION, e.getMessage());
        }
    }

    @WebViewExposed
    public static void createTokens(JSONArray jSONArray, l lVar) {
        try {
            h.b(jSONArray);
            lVar.a(new Object[0]);
        } catch (JSONException e) {
            lVar.a(f.JSON_EXCEPTION, e.getMessage());
        }
    }

    @WebViewExposed
    public static void deleteTokens(l lVar) {
        h.a();
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void getNativeGeneratedToken(l lVar) {
        h.b();
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void setPeekMode(Boolean bool, l lVar) {
        h.a(bool.booleanValue());
        lVar.a(new Object[0]);
    }
}
