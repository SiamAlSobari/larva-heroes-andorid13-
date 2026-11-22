package com.unity3d.services.store.gpbl;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.unity3d.services.store.gpbl.bridges.g;
import com.unity3d.services.store.gpbl.proxies.d;
import com.unity3d.services.store.gpbl.proxies.e;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* JADX INFO: compiled from: StoreBilling.java */
/* JADX INFO: loaded from: classes2.dex */
public class c {
    private final com.unity3d.services.store.gpbl.bridges.billingclient.b a;

    public c(Context context, com.unity3d.services.store.listeners.b bVar) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        this.a = com.unity3d.services.store.gpbl.bridges.billingclient.a.a(context).a(new com.unity3d.services.store.gpbl.proxies.c(bVar)).a().c();
    }

    public void a(b bVar) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        this.a.a(new com.unity3d.services.store.gpbl.proxies.a(bVar));
    }

    public int a(String str) {
        boolean zB;
        if (str.equals("inapp")) {
            zB = this.a.b();
        } else {
            if (str.equals("subs")) {
                str = BillingClient.FeatureType.SUBSCRIPTIONS;
            }
            zB = this.a.a(str) == a.OK;
        }
        return zB ? 0 : -1;
    }

    public void a(String str, com.unity3d.services.store.listeners.c cVar) throws ClassNotFoundException {
        this.a.a(str, new d(cVar));
    }

    public void a(String str, ArrayList<String> arrayList, com.unity3d.services.store.listeners.d dVar) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        this.a.a(g.k().a(arrayList).c(str).i(), new e(dVar));
    }

    public void a(String str, int i, com.unity3d.services.store.listeners.a aVar) throws ClassNotFoundException {
        this.a.a(str, new com.unity3d.services.store.gpbl.proxies.b(aVar, i));
    }
}
