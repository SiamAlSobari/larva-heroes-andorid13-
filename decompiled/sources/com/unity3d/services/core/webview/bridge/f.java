package com.unity3d.services.core.webview.bridge;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: NativeCallback.java */
/* JADX INFO: loaded from: classes2.dex */
public class f {
    private static AtomicInteger a = new AtomicInteger(0);
    private Method b;
    private String c;

    public f(Method method) {
        this.b = method;
        this.c = this.b.getName().toUpperCase(Locale.US) + "_" + a.getAndIncrement();
    }

    public String a() {
        return this.c;
    }

    public void a(String str, Object... objArr) throws Exception {
        Object[] array;
        try {
            a aVarValueOf = a.valueOf(str);
            if (objArr == null) {
                array = new Object[]{aVarValueOf};
            } else {
                ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
                arrayList.add(0, aVarValueOf);
                array = arrayList.toArray();
            }
            this.b.invoke(null, array);
            com.unity3d.services.core.webview.a.c().b(this);
        } catch (Exception e) {
            com.unity3d.services.core.log.a.c("Illegal status");
            com.unity3d.services.core.webview.a.c().b(this);
            throw e;
        }
    }
}
