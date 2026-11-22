package com.unity3d.services.store.gpbl.bridges;

import java.util.HashMap;

/* JADX INFO: compiled from: BillingResultBridge.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends com.unity3d.services.core.reflection.a {
    private final Object e;

    /* JADX INFO: renamed from: com.unity3d.services.store.gpbl.bridges.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BillingResultBridge.java */
    class C0052a extends HashMap<String, Class<?>[]> {
        C0052a() {
            put("getResponseCode", new Class[0]);
        }
    }

    public a(Object obj) {
        super(new C0052a());
        this.e = obj;
    }

    @Override // com.unity3d.services.core.reflection.a
    protected String g() {
        return "com.android.billingclient.api.BillingResult";
    }

    public com.unity3d.services.store.gpbl.a i() {
        return com.unity3d.services.store.gpbl.a.a(((Integer) a("getResponseCode", this.e, new Object[0])).intValue());
    }
}
