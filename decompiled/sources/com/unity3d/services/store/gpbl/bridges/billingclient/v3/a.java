package com.unity3d.services.store.gpbl.bridges.billingclient.v3;

import android.content.Context;
import com.unity3d.services.store.gpbl.bridges.e;
import com.unity3d.services.store.gpbl.proxies.d;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* JADX INFO: compiled from: BillingClientBridge.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends com.unity3d.services.store.gpbl.bridges.billingclient.common.a {

    /* JADX INFO: renamed from: com.unity3d.services.store.gpbl.bridges.billingclient.v3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BillingClientBridge.java */
    class C0054a extends HashMap<String, Class<?>[]> {
        C0054a() {
            put("queryPurchases", new Class[]{String.class});
        }
    }

    /* JADX INFO: compiled from: BillingClientBridge.java */
    public static class b extends com.unity3d.services.store.gpbl.bridges.billingclient.common.b {
        public b(Object obj) throws ClassNotFoundException {
            super(obj);
        }

        @Override // com.unity3d.services.store.gpbl.bridges.billingclient.c
        public com.unity3d.services.store.gpbl.bridges.billingclient.b c() throws ClassNotFoundException {
            return new a(a("build", this.e, new Object[0]));
        }
    }

    public a(Object obj) throws ClassNotFoundException {
        super(obj, new C0054a());
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.b
    public void a(String str, d dVar) {
        e eVar = new e(a("queryPurchases", this.f, str));
        dVar.d().a(eVar.i(), eVar.j());
    }

    public static b a(Context context) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return new b(com.unity3d.services.store.gpbl.bridges.billingclient.common.a.a("newBuilder", context));
    }
}
