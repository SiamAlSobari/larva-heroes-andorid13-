package com.unity3d.services.core.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: compiled from: GenericListenerProxy.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements InvocationHandler {
    public abstract Class<?> a() throws ClassNotFoundException;

    public Object b() throws ClassNotFoundException {
        return Proxy.newProxyInstance(a().getClassLoader(), new Class[]{a()}, this);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        return method.invoke(this, objArr);
    }
}
