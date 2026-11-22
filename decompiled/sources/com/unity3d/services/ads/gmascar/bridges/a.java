package com.unity3d.services.ads.gmascar.bridges;

import java.util.HashMap;

/* JADX INFO: compiled from: AdapterStatusBridge.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends com.unity3d.services.core.reflection.a {
    private Class e;

    /* JADX INFO: renamed from: com.unity3d.services.ads.gmascar.bridges.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AdapterStatusBridge.java */
    class C0031a extends HashMap<String, Class<?>[]> {
        C0031a() {
            put("getInitializationState", new Class[0]);
        }
    }

    public a() {
        super(new C0031a());
        b bVar = new b();
        try {
            this.e = Class.forName(bVar.a());
        } catch (ClassNotFoundException e) {
            com.unity3d.services.core.log.a.a("ERROR: Could not find class %s %s", bVar.a(), e.getLocalizedMessage());
        }
    }

    public boolean a(Object obj) {
        Object[] objArrI = i();
        if (objArrI != null) {
            return a("getInitializationState", obj, new Object[0]) == objArrI[1];
        }
        com.unity3d.services.core.log.a.b("ERROR: Could not get adapter states enum from AdapterStatus.State");
        return false;
    }

    @Override // com.unity3d.services.core.reflection.a
    protected String g() {
        return "com.google.android.gms.ads.initialization.AdapterStatus";
    }

    public Object[] i() {
        return this.e.getEnumConstants();
    }
}
