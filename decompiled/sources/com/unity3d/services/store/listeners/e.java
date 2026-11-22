package com.unity3d.services.store.listeners;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: compiled from: PurchasesResponseListener.java */
/* JADX INFO: loaded from: classes2.dex */
public class e implements c {
    private final Integer a;
    private final com.unity3d.services.store.b b;
    private final com.unity3d.services.store.b c;

    public e(com.unity3d.services.store.b bVar, com.unity3d.services.store.b bVar2) {
        this(null, bVar, bVar2);
    }

    @Override // com.unity3d.services.store.listeners.c
    public void a(com.unity3d.services.store.gpbl.bridges.a aVar, List<com.unity3d.services.store.gpbl.bridges.c> list) {
        ArrayList arrayList = new ArrayList();
        Integer num = this.a;
        if (num != null) {
            arrayList.add(num);
        }
        if (aVar.i() != com.unity3d.services.store.gpbl.a.OK) {
            arrayList.add(aVar.i());
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.STORE, this.c, arrayList.toArray());
            return;
        }
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            Iterator<com.unity3d.services.store.gpbl.bridges.c> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().k());
            }
        }
        arrayList.add(jSONArray);
        com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.STORE, this.b, arrayList.toArray());
    }

    public e(Integer num, com.unity3d.services.store.b bVar, com.unity3d.services.store.b bVar2) {
        this.a = num;
        this.b = bVar;
        this.c = bVar2;
    }
}
