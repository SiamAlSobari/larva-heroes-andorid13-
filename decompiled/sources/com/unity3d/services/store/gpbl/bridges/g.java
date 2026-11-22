package com.unity3d.services.store.gpbl.bridges;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: SkuDetailsParamsBridge.java */
/* JADX INFO: loaded from: classes2.dex */
public class g extends com.unity3d.services.core.reflection.a {
    private static final Map<String, Class<?>[]> e = new a();
    private final Object f;

    /* JADX INFO: compiled from: SkuDetailsParamsBridge.java */
    static class a extends HashMap<String, Class<?>[]> {
        a() {
            put("newBuilder", new Class[0]);
        }
    }

    /* JADX INFO: compiled from: SkuDetailsParamsBridge.java */
    class b extends HashMap<String, Class<?>[]> {
        b() {
            put("newBuilder", new Class[0]);
        }
    }

    /* JADX INFO: compiled from: SkuDetailsParamsBridge.java */
    public static class c extends com.unity3d.services.core.reflection.a {
        private Object e;

        /* JADX INFO: compiled from: SkuDetailsParamsBridge.java */
        class a extends HashMap<String, Class<?>[]> {
            a() {
                put("build", new Class[0]);
                put("setSkusList", new Class[]{List.class});
                put("setType", new Class[]{String.class});
            }
        }

        public c(Object obj) {
            super(new a());
            this.e = obj;
        }

        public c a(List<String> list) {
            this.e = a("setSkusList", this.e, list);
            return this;
        }

        public c c(String str) {
            this.e = a("setType", this.e, str);
            return this;
        }

        @Override // com.unity3d.services.core.reflection.a
        protected String g() {
            return "com.android.billingclient.api.SkuDetailsParams$Builder";
        }

        public g i() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
            return new g(a("build", this.e, new Object[0]));
        }
    }

    public g(Object obj) {
        super(new b());
        this.f = obj;
    }

    public static Object a(String str, Object... objArr) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return i().getMethod(str, e.get(str)).invoke(null, objArr);
    }

    public static Class<?> i() throws ClassNotFoundException {
        return Class.forName("com.android.billingclient.api.SkuDetailsParams");
    }

    public static c k() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return new c(a("newBuilder", new Object[0]));
    }

    @Override // com.unity3d.services.core.reflection.a
    protected String g() {
        return "com.android.billingclient.api.SkuDetailsParams";
    }

    public Object j() {
        return this.f;
    }
}
