package com.unity3d.services.core.device.reader.pii;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PiiDecisionData.java */
/* JADX INFO: loaded from: classes2.dex */
public class d {
    private final Map<String, Object> a;
    private final a b;

    public d(a aVar) {
        this(aVar, new HashMap());
    }

    public void a(Map<String, Object> map) {
        Map<String, Object> map2 = this.a;
        if (map2 != null) {
            map2.putAll(map);
        }
    }

    public a b() {
        return this.b;
    }

    public Boolean c() {
        Map<String, Object> map = this.a;
        if (map != null) {
            Object obj = map.get("user.nonBehavioral");
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
        }
        return null;
    }

    public d(a aVar, Map<String, Object> map) {
        this.b = aVar;
        this.a = map;
    }

    public Map<String, Object> a() {
        return this.a;
    }
}
