package com.unity3d.services.store.gpbl.bridges.billingclient.common;

import android.content.Context;
import com.unity3d.services.store.gpbl.bridges.g;
import com.unity3d.services.store.gpbl.proxies.e;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: BillingClientBridgeCommon.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends com.unity3d.services.core.reflection.a implements com.unity3d.services.store.gpbl.bridges.billingclient.b {
    private static final Map<String, Class<?>[]> e = new C0053a();
    protected final Object f;

    /* JADX INFO: renamed from: com.unity3d.services.store.gpbl.bridges.billingclient.common.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BillingClientBridgeCommon.java */
    static class C0053a extends HashMap<String, Class<?>[]> {
        C0053a() {
            put("newBuilder", new Class[]{Context.class});
        }
    }

    /* JADX INFO: compiled from: BillingClientBridgeCommon.java */
    static class b extends HashMap<String, Class<?>[]> {
        b() throws ClassNotFoundException {
            put("newBuilder", new Class[]{Context.class});
            put("startConnection", new Class[]{com.unity3d.services.store.gpbl.proxies.a.c()});
            put("endConnection", new Class[0]);
            put("querySkuDetailsAsync", new Class[]{g.i(), e.c()});
            put("queryPurchaseHistoryAsync", new Class[]{String.class, com.unity3d.services.store.gpbl.proxies.b.c()});
            put("isFeatureSupported", new Class[]{String.class});
            put("isReady", new Class[0]);
        }
    }

    public a(Object obj, Map<String, Class<?>[]> map) throws ClassNotFoundException {
        super(a(map));
        this.f = obj;
    }

    private static Map<String, Class<?>[]> a(Map<String, Class<?>[]> map) throws ClassNotFoundException {
        map.putAll(new b());
        return map;
    }

    protected static Class<?> i() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.BillingClient");
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.b
    public boolean b() {
        return ((Boolean) a("isReady", this.f, new Object[0])).booleanValue();
    }

    @Override // com.unity3d.services.core.reflection.a
    protected String g() {
        return "com.android.billingclient.api.BillingClient";
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.b
    public void a(com.unity3d.services.store.gpbl.proxies.a aVar) throws ClassNotFoundException {
        b("startConnection", this.f, aVar.b());
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.b
    public com.unity3d.services.store.gpbl.a a(String str) {
        return new com.unity3d.services.store.gpbl.bridges.a(a("isFeatureSupported", this.f, str)).i();
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.b
    public void a(g gVar, e eVar) throws ClassNotFoundException {
        b("querySkuDetailsAsync", this.f, gVar.j(), eVar.b());
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.b
    public void a(String str, com.unity3d.services.store.gpbl.proxies.b bVar) throws ClassNotFoundException {
        b("queryPurchaseHistoryAsync", this.f, str, bVar.b());
    }

    public static Object a(String str, Object... objArr) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return i().getMethod(str, e.get(str)).invoke(null, objArr);
    }
}
