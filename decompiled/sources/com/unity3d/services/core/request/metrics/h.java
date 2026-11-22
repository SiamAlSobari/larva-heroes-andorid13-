package com.unity3d.services.core.request.metrics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: MetricsContainer.java */
/* JADX INFO: loaded from: classes2.dex */
public class h {
    private final e a;
    private final List<d> b;
    private final String c;

    public h(String str, e eVar, List<d> list) {
        this.c = str;
        this.a = eVar;
        this.b = list;
    }

    public Map<String, Object> a() {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator<d> it = this.b.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        map.put("msr", this.c);
        map.put("m", arrayList);
        map.put("t", this.a.a());
        return map;
    }
}
