package com.unity3d.services.core.webview.bridge.invocation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: WebViewBridgeInvocationSingleThreadedExecutor.java */
/* JADX INFO: loaded from: classes2.dex */
public class e {
    private static e a;
    private ExecutorService b = Executors.newSingleThreadExecutor();

    private e() {
    }

    public static e b() {
        if (a == null) {
            a = new e();
        }
        return a;
    }

    public ExecutorService a() {
        return this.b;
    }
}
