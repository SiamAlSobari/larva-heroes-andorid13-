package com.unity3d.services.store.gpbl.proxies;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PurchaseHistoryResponseListenerProxy.java */
/* JADX INFO: loaded from: classes2.dex */
public class b extends com.unity3d.services.core.reflection.b {
    private com.unity3d.services.store.listeners.a a;
    private int b;

    public b(com.unity3d.services.store.listeners.a aVar, int i) {
        this.a = aVar;
        this.b = i;
    }

    public static Class<?> c() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.PurchaseHistoryResponseListener");
    }

    @Override // com.unity3d.services.core.reflection.b
    public Class<?> a() throws ClassNotFoundException {
        return c();
    }

    @Override // com.unity3d.services.core.reflection.b, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!method.getName().equals("onPurchaseHistoryResponse")) {
            return super.invoke(obj, method, objArr);
        }
        a(objArr[0], (List) objArr[1]);
        return null;
    }

    public void a(Object obj, List<Object> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (int i = 0; i < this.b && i < list.size(); i++) {
                arrayList.add(new com.unity3d.services.store.gpbl.bridges.d(list.get(i)));
            }
        } else {
            arrayList = null;
        }
        com.unity3d.services.store.listeners.a aVar = this.a;
        if (aVar != null) {
            aVar.a(new com.unity3d.services.store.gpbl.bridges.a(obj), arrayList);
        }
    }
}
