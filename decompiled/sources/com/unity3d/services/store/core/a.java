package com.unity3d.services.store.core;

import com.unity3d.services.ads.gmascar.handlers.e;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONException;

/* JADX INFO: compiled from: StoreExceptionHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    private final e a;

    public a(e eVar) {
        this.a = eVar;
    }

    public void a(com.unity3d.services.store.b bVar, int i, Exception exc) {
        a(bVar, a(exc), i, exc);
    }

    private void a(com.unity3d.services.store.b bVar, com.unity3d.services.store.a aVar, int i, Exception exc) {
        this.a.handleError(new c(bVar, exc.getMessage(), Integer.valueOf(i), aVar, exc.getMessage()));
    }

    private com.unity3d.services.store.a a(Exception exc) {
        com.unity3d.services.store.a aVar = com.unity3d.services.store.a.UNKNOWN_ERROR;
        if (exc instanceof NoSuchMethodException) {
            return com.unity3d.services.store.a.NO_SUCH_METHOD;
        }
        if (exc instanceof IllegalAccessException) {
            return com.unity3d.services.store.a.ILLEGAL_ACCESS;
        }
        if (exc instanceof JSONException) {
            return com.unity3d.services.store.a.JSON_ERROR;
        }
        if (exc instanceof InvocationTargetException) {
            return com.unity3d.services.store.a.INVOCATION_TARGET;
        }
        return exc instanceof ClassNotFoundException ? com.unity3d.services.store.a.CLASS_NOT_FOUND : aVar;
    }
}
