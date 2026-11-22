package com.unity3d.services.ads.gmascar.bridges;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: InitializationStatusBridge.java */
/* JADX INFO: loaded from: classes2.dex */
public class c extends com.unity3d.services.core.reflection.a {

    /* JADX INFO: compiled from: InitializationStatusBridge.java */
    class a extends HashMap<String, Class<?>[]> {
        a() {
            put("getAdapterStatusMap", new Class[0]);
        }
    }

    public c() {
        super(new a());
    }

    public Map<String, Object> a(Object obj) {
        return (Map) a("getAdapterStatusMap", obj, new Object[0]);
    }

    @Override // com.unity3d.services.core.reflection.a
    public String g() {
        return "com.google.android.gms.ads.initialization.InitializationStatus";
    }
}
