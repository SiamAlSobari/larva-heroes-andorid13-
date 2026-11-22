package com.unity3d.services.ads.gmascar.bridges;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;

/* JADX INFO: compiled from: InitializeListenerBridge.java */
/* JADX INFO: loaded from: classes2.dex */
public class d extends com.unity3d.services.core.reflection.a {
    private com.unity3d.services.ads.gmascar.listeners.a e;

    /* JADX INFO: compiled from: InitializeListenerBridge.java */
    class a extends HashMap<String, Class<?>[]> {
        a() throws Error, RuntimeException {
            try {
                put("onInitializationComplete", new Class[]{Class.forName("com.google.android.gms.ads.initialization.InitializationStatus")});
            } catch (ClassNotFoundException e) {
                com.unity3d.services.core.log.a.a("Could not find class \"com.google.android.gms.ads.initialization.InitializationStatus\" %s", e.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: compiled from: InitializeListenerBridge.java */
    class b implements InvocationHandler {
        b() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (!method.getName().equals("onInitializationComplete") || d.this.e == null) {
                return null;
            }
            d.this.e.a(objArr[0]);
            return null;
        }
    }

    public d() {
        super(new a());
    }

    @Override // com.unity3d.services.core.reflection.a
    public String g() {
        return "com.google.android.gms.ads.initialization.OnInitializationCompleteListener";
    }

    public Object i() {
        try {
            return Proxy.newProxyInstance(e().getClassLoader(), new Class[]{e()}, new b());
        } catch (Exception unused) {
            com.unity3d.services.core.log.a.b("ERROR: Could not create InitializeCompletionListener");
            return null;
        }
    }

    public void a(com.unity3d.services.ads.gmascar.listeners.a aVar) {
        this.e = aVar;
    }
}
