package com.unity3d.services.store.gpbl.bridges.billingclient.v4;

import android.content.Context;
import com.unity3d.services.store.gpbl.proxies.d;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* JADX INFO: compiled from: BillingClientBridge.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends com.unity3d.services.store.gpbl.bridges.billingclient.common.a {

    /* JADX INFO: renamed from: com.unity3d.services.store.gpbl.bridges.billingclient.v4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BillingClientBridge.java */
    class C0055a extends HashMap<String, Class<?>[]> {
        C0055a() throws ClassNotFoundException {
            put("queryPurchasesAsync", new Class[]{String.class, d.c()});
        }
    }

    /* JADX INFO: compiled from: BillingClientBridge.java */
    public static class b extends com.unity3d.services.store.gpbl.bridges.billingclient.common.b {
        public b(Object obj) throws ClassNotFoundException {
            super(obj);
        }

        @Override // com.unity3d.services.store.gpbl.bridges.billingclient.c
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public com.unity3d.services.store.gpbl.bridges.billingclient.common.a c() throws ClassNotFoundException {
            return new a(a("build", this.e, new Object[0]));
        }
    }

    public a(Object obj) throws ClassNotFoundException {
        super(obj, new C0055a());
    }

    public static boolean j() {
        try {
            com.unity3d.services.store.gpbl.bridges.billingclient.common.a.i().getMethod("queryPurchasesAsync", String.class, d.c());
            return true;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.b
    public void a(String str, d dVar) throws ClassNotFoundException {
        b("queryPurchasesAsync", this.f, str, dVar.b());
    }

    public static b a(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return new b(com.unity3d.services.store.gpbl.bridges.billingclient.common.a.a("newBuilder", context));
    }
}
