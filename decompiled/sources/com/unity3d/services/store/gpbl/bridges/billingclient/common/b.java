package com.unity3d.services.store.gpbl.bridges.billingclient.common;

import com.unity3d.services.store.gpbl.bridges.billingclient.c;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* JADX INFO: compiled from: BillingClientBuilderBridgeCommon.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends com.unity3d.services.core.reflection.a implements c {
    protected Object e;

    /* JADX INFO: compiled from: BillingClientBuilderBridgeCommon.java */
    class a extends HashMap<String, Class<?>[]> {
        a() throws ClassNotFoundException {
            put("setListener", new Class[]{com.unity3d.services.store.gpbl.proxies.c.c()});
            put("enablePendingPurchases", new Class[0]);
            put("build", new Class[0]);
        }
    }

    public b(Object obj) throws ClassNotFoundException {
        super(new a());
        this.e = obj;
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.c
    public c a(com.unity3d.services.store.gpbl.proxies.c cVar) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        this.e = a("setListener", this.e, cVar.b());
        return this;
    }

    @Override // com.unity3d.services.core.reflection.a
    protected String g() {
        return "com.android.billingclient.api.BillingClient$Builder";
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.c
    public c a() {
        this.e = a("enablePendingPurchases", this.e, new Object[0]);
        return this;
    }
}
