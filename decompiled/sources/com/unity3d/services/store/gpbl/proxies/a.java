package com.unity3d.services.store.gpbl.proxies;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: BillingClientStateListenerProxy.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends com.unity3d.services.core.reflection.b {
    private static String a = "onBillingServiceDisconnected";
    private static String b = "onBillingSetupFinished";
    private com.unity3d.services.store.gpbl.b c;

    public a(com.unity3d.services.store.gpbl.b bVar) {
        this.c = bVar;
    }

    public static Class<?> c() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.BillingClientStateListener");
    }

    private void d() {
        com.unity3d.services.store.gpbl.b bVar = this.c;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // com.unity3d.services.core.reflection.b
    public Class<?> a() throws ClassNotFoundException {
        return c();
    }

    @Override // com.unity3d.services.core.reflection.b, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (method.getName().equals(b)) {
            a(objArr[0]);
        } else {
            if (!method.getName().equals(a)) {
                return super.invoke(obj, method, objArr);
            }
            d();
        }
        return null;
    }

    private void a(Object obj) {
        com.unity3d.services.store.gpbl.b bVar = this.c;
        if (bVar != null) {
            bVar.a(new com.unity3d.services.store.gpbl.bridges.a(obj));
        }
    }
}
