package com.unity3d.services.store.gpbl.bridges;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: CommonJsonResponseBridge.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends com.unity3d.services.core.reflection.a {
    private final Object e;

    /* JADX INFO: compiled from: CommonJsonResponseBridge.java */
    static class a extends HashMap<String, Class<?>[]> {
        a() {
            put("getOriginalJson", new Class[0]);
        }
    }

    protected b(Object obj) {
        this(obj, new HashMap());
    }

    private static Map<String, Class<?>[]> a(Map<String, Class<?>[]> map) {
        map.putAll(new a());
        return map;
    }

    public JSONObject i() {
        try {
            return new JSONObject((String) a("getOriginalJson", this.e, new Object[0]));
        } catch (JSONException e) {
            com.unity3d.services.core.log.a.b("Couldn't parse BillingResponse JSON : %s", e.getMessage());
            return null;
        }
    }

    protected b(Object obj, Map<String, Class<?>[]> map) {
        super(a(map));
        this.e = obj;
    }
}
