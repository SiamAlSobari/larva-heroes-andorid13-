package com.unity3d.services.core.api;

import com.unity3d.services.core.device.f;
import com.unity3d.services.core.device.g;
import com.unity3d.services.core.device.i;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import com.unity3d.services.core.webview.bridge.l;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Storage {
    private static void a(String str, String str2, Object obj, l lVar) {
        f fVarA = a(str);
        if (fVarA == null) {
            lVar.a(g.COULDNT_GET_STORAGE, str, str2);
        } else if (fVarA.set(str2, obj)) {
            lVar.a(str2);
        } else {
            lVar.a(g.COULDNT_SET_VALUE, str2);
        }
    }

    @WebViewExposed
    public static void clear(String str, l lVar) {
        f fVarA = a(str);
        if (fVarA == null) {
            lVar.a(g.COULDNT_GET_STORAGE, str);
        } else if (fVarA.a()) {
            lVar.a(str);
        } else {
            lVar.a(g.COULDNT_CLEAR_STORAGE, str);
        }
    }

    @WebViewExposed
    public static void delete(String str, String str2, l lVar) {
        f fVarA = a(str);
        if (fVarA == null) {
            lVar.a(g.COULDNT_GET_STORAGE, str);
        } else if (fVarA.delete(str2)) {
            lVar.a(str);
        } else {
            lVar.a(g.COULDNT_DELETE_VALUE, str);
        }
    }

    @WebViewExposed
    public static void get(String str, String str2, l lVar) {
        f fVarA = a(str);
        if (fVarA == null) {
            lVar.a(g.COULDNT_GET_STORAGE, str, str2);
            return;
        }
        Object obj = fVarA.get(str2);
        if (obj == null) {
            lVar.a(g.COULDNT_GET_VALUE, str2);
        } else {
            lVar.a(obj);
        }
    }

    @WebViewExposed
    public static void getKeys(String str, String str2, Boolean bool, l lVar) {
        f fVarA = a(str);
        if (fVarA == null) {
            lVar.a(g.COULDNT_GET_STORAGE, str, str2);
            return;
        }
        List<String> keys = fVarA.getKeys(str2, bool.booleanValue());
        if (keys != null) {
            lVar.a(new JSONArray((Collection) keys));
        } else {
            lVar.a(new JSONArray());
        }
    }

    @WebViewExposed
    public static void read(String str, l lVar) {
        f fVarA = a(str);
        if (fVarA == null) {
            lVar.a(g.COULDNT_GET_STORAGE, str);
        } else {
            fVarA.d();
            lVar.a(str);
        }
    }

    @WebViewExposed
    public static void set(String str, String str2, Integer num, l lVar) {
        a(str, str2, num, lVar);
    }

    @WebViewExposed
    public static void write(String str, l lVar) {
        f fVarA = a(str);
        if (fVarA == null) {
            lVar.a(g.COULDNT_GET_STORAGE, str);
        } else if (fVarA.f()) {
            lVar.a(str);
        } else {
            lVar.a(g.COULDNT_WRITE_STORAGE_TO_CACHE, str);
        }
    }

    @WebViewExposed
    public static void set(String str, String str2, Boolean bool, l lVar) {
        a(str, str2, bool, lVar);
    }

    @WebViewExposed
    public static void set(String str, String str2, Long l, l lVar) {
        a(str, str2, l, lVar);
    }

    @WebViewExposed
    public static void set(String str, String str2, Double d, l lVar) {
        a(str, str2, d, lVar);
    }

    @WebViewExposed
    public static void set(String str, String str2, String str3, l lVar) {
        a(str, str2, str3, lVar);
    }

    @WebViewExposed
    public static void set(String str, String str2, JSONObject jSONObject, l lVar) {
        a(str, str2, jSONObject, lVar);
    }

    @WebViewExposed
    public static void set(String str, String str2, JSONArray jSONArray, l lVar) {
        a(str, str2, jSONArray, lVar);
    }

    private static f a(String str) {
        return i.a(i.a.valueOf(str));
    }
}
