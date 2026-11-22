package com.unity3d.services.store.gpbl.proxies;

import com.unity3d.services.store.gpbl.bridges.f;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: SkuDetailsResponseListenerProxy.java */
/* JADX INFO: loaded from: classes2.dex */
public class e extends com.unity3d.services.core.reflection.b {
    private com.unity3d.services.store.listeners.d a;

    public e(com.unity3d.services.store.listeners.d dVar) {
        this.a = dVar;
    }

    public static Class<?> c() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.SkuDetailsResponseListener");
    }

    @Override // com.unity3d.services.core.reflection.b
    public Class<?> a() throws ClassNotFoundException {
        return c();
    }

    @Override // com.unity3d.services.core.reflection.b, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (!method.getName().equals("onSkuDetailsResponse")) {
            return super.invoke(obj, method, objArr);
        }
        a(objArr[0], (List) objArr[1]);
        return null;
    }

    public void a(Object obj, List<Object> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new f(it.next()));
            }
        } else {
            arrayList = null;
        }
        com.unity3d.services.store.listeners.d dVar = this.a;
        if (dVar != null) {
            dVar.a(new com.unity3d.services.store.gpbl.bridges.a(obj), arrayList);
        }
    }
}
