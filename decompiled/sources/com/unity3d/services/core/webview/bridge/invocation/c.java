package com.unity3d.services.core.webview.bridge.invocation;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: WebViewBridgeInvocation.java */
/* JADX INFO: loaded from: classes2.dex */
public class c implements a {
    private static b a;
    private com.unity3d.services.core.webview.bridge.b b;
    private ExecutorService c;

    public c(ExecutorService executorService, com.unity3d.services.core.webview.bridge.b bVar, b bVar2) {
        this.c = executorService;
        a = bVar2;
        if (bVar == null) {
            throw new IllegalArgumentException("webViewBridgeInvoker cannot be null");
        }
        this.b = bVar;
    }

    @Override // com.unity3d.services.core.webview.bridge.invocation.a
    public synchronized void a(String str, String str2, int i, Object... objArr) {
        this.c.submit(new d(a, this.b, str, str2, i, objArr));
    }
}
