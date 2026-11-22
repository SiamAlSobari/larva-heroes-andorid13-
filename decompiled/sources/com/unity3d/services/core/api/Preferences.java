package com.unity3d.services.core.api;

import com.unity3d.services.core.preferences.b;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import com.unity3d.services.core.webview.bridge.l;

/* JADX INFO: loaded from: classes2.dex */
public class Preferences {
    @WebViewExposed
    public static void getBoolean(String str, String str2, l lVar) {
        Boolean boolA = com.unity3d.services.core.preferences.a.a(str, str2);
        if (boolA != null) {
            lVar.a(boolA);
        } else {
            lVar.a(b.COULDNT_GET_VALUE, str, str2);
        }
    }

    @WebViewExposed
    public static void getFloat(String str, String str2, l lVar) {
        Float fB = com.unity3d.services.core.preferences.a.b(str, str2);
        if (fB != null) {
            lVar.a(fB);
        } else {
            lVar.a(b.COULDNT_GET_VALUE, str, str2);
        }
    }

    @WebViewExposed
    public static void getInt(String str, String str2, l lVar) {
        Integer numC = com.unity3d.services.core.preferences.a.c(str, str2);
        if (numC != null) {
            lVar.a(numC);
        } else {
            lVar.a(b.COULDNT_GET_VALUE, str, str2);
        }
    }

    @WebViewExposed
    public static void getLong(String str, String str2, l lVar) {
        Long lD = com.unity3d.services.core.preferences.a.d(str, str2);
        if (lD != null) {
            lVar.a(lD);
        } else {
            lVar.a(b.COULDNT_GET_VALUE, str, str2);
        }
    }

    @WebViewExposed
    public static void getString(String str, String str2, l lVar) {
        String strE = com.unity3d.services.core.preferences.a.e(str, str2);
        if (strE != null) {
            lVar.a(strE);
        } else {
            lVar.a(b.COULDNT_GET_VALUE, str, str2);
        }
    }

    @WebViewExposed
    public static void hasKey(String str, String str2, l lVar) {
        lVar.a(Boolean.valueOf(com.unity3d.services.core.preferences.a.f(str, str2)));
    }

    @WebViewExposed
    public static void removeKey(String str, String str2, l lVar) {
        com.unity3d.services.core.preferences.a.g(str, str2);
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void setBoolean(String str, String str2, Boolean bool, l lVar) {
        com.unity3d.services.core.preferences.a.a(str, str2, bool);
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void setFloat(String str, String str2, Double d, l lVar) {
        com.unity3d.services.core.preferences.a.a(str, str2, d);
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void setInt(String str, String str2, Integer num, l lVar) {
        com.unity3d.services.core.preferences.a.a(str, str2, num);
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void setLong(String str, String str2, Long l, l lVar) {
        com.unity3d.services.core.preferences.a.a(str, str2, l);
        lVar.a(new Object[0]);
    }

    @WebViewExposed
    public static void setString(String str, String str2, String str3, l lVar) {
        com.unity3d.services.core.preferences.a.a(str, str2, str3);
        lVar.a(new Object[0]);
    }
}
