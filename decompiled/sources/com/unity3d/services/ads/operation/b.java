package com.unity3d.services.ads.operation;

/* JADX INFO: compiled from: AdOperation.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements d {
    private static String a = "webview";
    private com.unity3d.services.core.webview.bridge.invocation.a b;
    private String c;

    protected b(com.unity3d.services.core.webview.bridge.invocation.a aVar, String str) throws NullPointerException {
        this.c = str;
        if (str == null || str == "") {
            throw new IllegalArgumentException("invocationMethodName cannot be null");
        }
        this.b = aVar;
        if (aVar == null) {
            throw new IllegalArgumentException("webViewBridgeInvocation cannot be null");
        }
    }

    @Override // com.unity3d.services.ads.operation.d
    public void a(int i, Object... objArr) {
        this.b.a(a, this.c, i, objArr);
    }
}
