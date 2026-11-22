package com.unity3d.services.store.gpbl.proxies;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PurchasesResponseListenerProxy.java */
/* JADX INFO: loaded from: classes2.dex */
public class d extends com.unity3d.services.core.reflection.b {
    private com.unity3d.services.store.listeners.c a;

    public d(com.unity3d.services.store.listeners.c cVar) {
        this.a = cVar;
    }

    public static Class<?> c() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.PurchasesResponseListener");
    }

    @Override // com.unity3d.services.core.reflection.b
    public Class<?> a() throws ClassNotFoundException {
        return c();
    }

    public com.unity3d.services.store.listeners.c d() {
        return this.a;
    }

    @Override // com.unity3d.services.core.reflection.b, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!method.getName().equals("onQueryPurchasesResponse")) {
            return super.invoke(obj, method, objArr);
        }
        a(objArr[0], (List) objArr[1]);
        return null;
    }

    public void a(Object obj, List<Object> list) {
        ArrayList arrayList;
        com.unity3d.services.store.gpbl.bridges.a aVar = new com.unity3d.services.store.gpbl.bridges.a(obj);
        if (list != null) {
            arrayList = new ArrayList();
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.unity3d.services.store.gpbl.bridges.c(it.next()));
            }
        } else {
            arrayList = null;
        }
        com.unity3d.services.store.listeners.c cVar = this.a;
        if (cVar != null) {
            cVar.a(aVar, arrayList);
        }
    }
}
