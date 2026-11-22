package com.unity3d.services.core.reflection;

import com.unity3d.scar.adapter.common.GMAEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: GenericBridge.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    private final Map<String, Class<?>[]> b;
    private boolean d = false;
    private final String a = g();
    private final Map<String, Method> c = new HashMap();

    public a(Map<String, Class<?>[]> map) {
        this.b = map;
        d();
    }

    private Method a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (Exception e) {
            com.unity3d.services.core.log.a.a("ERROR: Could not find method %s in %s", str, cls.getName() + " " + e.getLocalizedMessage());
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.GMA, GMAEvent.METHOD_ERROR, new Object[0]);
            return null;
        }
    }

    private Method b(String str) {
        return this.c.get(str);
    }

    private void d() {
        boolean z = true;
        for (Map.Entry<String, Class<?>[]> entry : h().entrySet()) {
            Class<?>[] value = entry.getValue();
            try {
                Method methodA = a(e(), entry.getKey(), value);
                if (methodA != null) {
                    this.c.put(entry.getKey(), methodA);
                }
            } catch (Exception unused) {
                com.unity3d.services.core.log.a.a("ERROR: Could not find %s class with method %s and parameters : %s", this.a, entry.getKey(), value);
                z = false;
            }
        }
        this.d = z;
    }

    public Class<?> e() {
        try {
            return Class.forName(this.a);
        } catch (ClassNotFoundException e) {
            com.unity3d.services.core.log.a.a("ERROR: Could not find Class %s %s", this.a, e.getLocalizedMessage());
            return null;
        }
    }

    public boolean f() {
        if (e() == null) {
            com.unity3d.services.core.log.a.a("ERROR: Could not find class %s", this.a);
            return false;
        }
        if (!this.d) {
            d();
        }
        return this.c.size() == h().size();
    }

    protected abstract String g();

    public Map<String, Class<?>[]> h() {
        return this.b;
    }

    public void b(String str, Object obj, Object... objArr) {
        Method methodB = b(str);
        if (methodB == null) {
            com.unity3d.services.core.log.a.a("ERROR: Could not find method %s", str);
            return;
        }
        try {
            methodB.invoke(obj, objArr);
        } catch (Exception e) {
            com.unity3d.services.core.log.a.a("ERROR: Could not invoke method %s : %s", str, e.getLocalizedMessage());
        }
    }

    public <T> T a(String str, Object obj, Object... objArr) {
        Method methodB = b(str);
        if (methodB == null) {
            com.unity3d.services.core.log.a.a("ERROR: Could not find method %s", str);
            return null;
        }
        try {
            return (T) methodB.invoke(obj, objArr);
        } catch (Exception e) {
            com.unity3d.services.core.log.a.a("ERROR: Could not invoke method %s : %s", str, e.getLocalizedMessage());
            return null;
        }
    }
}
