package com.unity3d.services.ads.operation;

import com.unity3d.services.core.webview.bridge.d;
import com.unity3d.services.core.webview.bridge.k;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: AdModule.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a<T extends com.unity3d.services.core.webview.bridge.d, T2> extends k<T> implements c<T, T2> {
    protected com.unity3d.services.core.request.metrics.c b;
    protected ExecutorService c = com.unity3d.services.core.webview.bridge.invocation.e.b().a();

    protected a(com.unity3d.services.core.request.metrics.c cVar) {
        this.b = cVar;
    }

    @Override // com.unity3d.services.ads.operation.c
    public com.unity3d.services.core.request.metrics.c a() {
        return this.b;
    }
}
