package com.unity3d.services.core.api;

import com.unity3d.services.core.lifecycle.d;
import com.unity3d.services.core.lifecycle.f;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import com.unity3d.services.core.webview.bridge.l;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class Lifecycle {
    private static f a;

    public static f getLifecycleListener() {
        return a;
    }

    @WebViewExposed
    public static void register(JSONArray jSONArray, l lVar) {
        if (com.unity3d.services.core.properties.a.d() == null) {
            lVar.a(d.APPLICATION_NULL, new Object[0]);
            return;
        }
        if (getLifecycleListener() != null) {
            lVar.a(d.LISTENER_NOT_NULL, new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add((String) jSONArray.get(i));
            } catch (JSONException unused) {
                lVar.a(d.JSON_ERROR, new Object[0]);
                return;
            }
        }
        setLifecycleListener(new f(arrayList));
        com.unity3d.services.core.properties.a.d().registerActivityLifecycleCallbacks(getLifecycleListener());
        lVar.a(new Object[0]);
    }

    public static void setLifecycleListener(f fVar) {
        a = fVar;
    }

    @WebViewExposed
    public static void unregister(l lVar) {
        if (com.unity3d.services.core.properties.a.d() == null) {
            lVar.a(d.APPLICATION_NULL, new Object[0]);
            return;
        }
        if (getLifecycleListener() != null) {
            com.unity3d.services.core.properties.a.d().unregisterActivityLifecycleCallbacks(getLifecycleListener());
            setLifecycleListener(null);
        }
        lVar.a(new Object[0]);
    }
}
