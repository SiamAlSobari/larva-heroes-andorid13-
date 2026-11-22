package com.unity3d.services.core.lifecycle;

/* JADX INFO: compiled from: CachedLifecycle.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    private static c a;

    public static c a() {
        return a;
    }

    public static void b() {
        if (com.unity3d.services.core.properties.a.d() == null || a() != null) {
            return;
        }
        a(new c());
        com.unity3d.services.core.properties.a.d().registerActivityLifecycleCallbacks(a());
    }

    public static void a(c cVar) {
        a = cVar;
    }
}
