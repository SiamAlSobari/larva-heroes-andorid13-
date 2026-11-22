package com.unity3d.services.store.gpbl.bridges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PurchasesResultBridge.java */
/* JADX INFO: loaded from: classes2.dex */
public class e extends com.unity3d.services.core.reflection.a {
    private final Object e;

    /* JADX INFO: compiled from: PurchasesResultBridge.java */
    class a extends HashMap<String, Class<?>[]> {
        a() {
            put("getBillingResult", new Class[0]);
            put("getPurchasesList", new Class[0]);
        }
    }

    public e(Object obj) {
        super(new a());
        this.e = obj;
    }

    @Override // com.unity3d.services.core.reflection.a
    protected String g() {
        return "com.android.billingclient.api.Purchase$PurchasesResult";
    }

    public com.unity3d.services.store.gpbl.bridges.a i() {
        return new com.unity3d.services.store.gpbl.bridges.a(a("getBillingResult", this.e, new Object[0]));
    }

    public List<c> j() {
        List list = (List) a("getPurchasesList", this.e, new Object[0]);
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new c(it.next()));
            }
        }
        return arrayList;
    }
}
