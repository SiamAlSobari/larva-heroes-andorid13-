package com.unity3d.services.core.request.metrics;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: Metric.java */
/* JADX INFO: loaded from: classes2.dex */
public class d {
    private final String a;
    private final Object b;
    private final Map<String, String> c;

    public d(String str, Object obj, Map<String, String> map) {
        this.a = str;
        this.b = obj;
        this.c = map;
    }

    Map<String, Object> a() {
        HashMap map = new HashMap();
        String str = this.a;
        if (str != null) {
            map.put("n", str);
        }
        Object obj = this.b;
        if (obj != null) {
            map.put("v", obj);
        }
        Map<String, String> map2 = this.c;
        if (map2 != null) {
            map.put("t", map2);
        }
        return map;
    }

    public Map<String, String> b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.a.equals(dVar.a) && this.b.equals(dVar.b) && this.c.equals(dVar.c);
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public String toString() {
        return "Metric{name='" + this.a + "', value='" + this.b + "', tags=" + this.c + '}';
    }
}
