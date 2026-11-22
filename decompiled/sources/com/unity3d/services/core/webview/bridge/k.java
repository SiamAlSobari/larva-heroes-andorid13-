package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.webview.bridge.d;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: WebViewBridgeSharedObjectStore.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k<T extends d> implements c<T> {
    private ConcurrentHashMap<String, T> a = new ConcurrentHashMap<>();

    public void a(T t) {
        if (t == null) {
            return;
        }
        this.a.put(t.a(), t);
    }

    @Override // com.unity3d.services.core.webview.bridge.c
    public T get(String str) {
        if (str == null) {
            return null;
        }
        return this.a.get(str);
    }

    @Override // com.unity3d.services.core.webview.bridge.c
    public void a(String str) {
        this.a.remove(str);
    }
}
