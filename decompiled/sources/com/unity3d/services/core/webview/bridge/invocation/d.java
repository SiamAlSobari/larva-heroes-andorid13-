package com.unity3d.services.core.webview.bridge.invocation;

import android.os.ConditionVariable;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: WebViewBridgeInvocationRunnable.java */
/* JADX INFO: loaded from: classes2.dex */
public class d implements Runnable {
    private static ConditionVariable a;
    private static com.unity3d.services.core.webview.bridge.a b;
    private b c;
    private com.unity3d.services.core.webview.bridge.b d;
    private Method e;
    private String f;
    private String g;
    private int h;
    private Object[] i;

    public d(b bVar, com.unity3d.services.core.webview.bridge.b bVar2, String str, String str2, int i, Object... objArr) {
        try {
            this.e = d.class.getMethod("a", com.unity3d.services.core.webview.bridge.a.class);
            this.c = bVar;
            this.d = bVar2;
            this.f = str;
            this.g = str2;
            this.h = i;
            this.i = objArr;
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("WebViewBridgeInvocation callback method cannot be found", e);
        }
    }

    public static synchronized void a(com.unity3d.services.core.webview.bridge.a aVar) {
        b = aVar;
        ConditionVariable conditionVariable = a;
        if (conditionVariable != null) {
            conditionVariable.open();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        b = null;
        a = new ConditionVariable();
        boolean zA = this.d.a(this.f, this.g, this.e, this.i);
        b bVar = this.c;
        if (bVar == null) {
            return;
        }
        if (!zA) {
            bVar.a("WebViewBridgeInvocationRunnable:run: invokeMethod failure", null);
            return;
        }
        if (!a.block(this.h)) {
            this.c.b();
        } else if (b == com.unity3d.services.core.webview.bridge.a.OK) {
            this.c.a();
        } else {
            this.c.a("WebViewBridgeInvocationRunnable:run CallbackStatus.Error", b);
        }
    }
}
