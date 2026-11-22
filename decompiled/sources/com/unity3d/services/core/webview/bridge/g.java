package com.unity3d.services.core.webview.bridge;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;

/* JADX INFO: compiled from: WebViewBridge.java */
/* JADX INFO: loaded from: classes2.dex */
public class g {
    private static HashMap<String, HashMap<String, HashMap<Integer, Method>>> a;

    public static void a(Class[] clsArr) {
        if (clsArr == null) {
            return;
        }
        a = new HashMap<>();
        for (Class cls : clsArr) {
            if (cls != null && (cls.getPackage().getName().startsWith("com.unity3d.services") || cls.getPackage().getName().startsWith("com.unity3d.ads.test"))) {
                HashMap<String, HashMap<Integer, Method>> map = new HashMap<>();
                for (Method method : cls.getMethods()) {
                    if (method.getAnnotation(WebViewExposed.class) != null) {
                        String name = method.getName();
                        HashMap<Integer, Method> map2 = map.containsKey(name) ? map.get(name) : new HashMap<>();
                        map2.put(Integer.valueOf(Arrays.deepHashCode(method.getParameterTypes())), method);
                        map.put(name, map2);
                    }
                }
                a.put(cls.getName(), map);
            }
        }
    }

    public static void b(String str, String str2, Object[] objArr) throws Exception {
        try {
            com.unity3d.services.core.webview.a.c().a(str).a(str2, a(objArr, null));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | JSONException e) {
            com.unity3d.services.core.log.a.c("Error while invoking method");
            throw e;
        }
    }

    private static Method a(String str, String str2, Object[] objArr) throws JSONException, NoSuchMethodException {
        if (a.containsKey(str)) {
            HashMap<String, HashMap<Integer, Method>> map = a.get(str);
            if (map.containsKey(str2)) {
                return map.get(str2).get(Integer.valueOf(Arrays.deepHashCode(a(objArr))));
            }
            throw new NoSuchMethodException();
        }
        throw new NoSuchMethodException();
    }

    private static Class<?>[] a(Object[] objArr) throws JSONException {
        Class<?>[] clsArr = objArr == null ? new Class[1] : new Class[objArr.length + 1];
        if (objArr != null) {
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = objArr[i].getClass();
            }
        }
        clsArr[clsArr.length - 1] = l.class;
        return clsArr;
    }

    private static Object[] a(Object[] objArr, l lVar) throws JSONException {
        Object[] objArr2;
        if (objArr != null) {
            objArr2 = new Object[objArr.length + (lVar != null ? 1 : 0)];
        } else {
            if (lVar == null) {
                return null;
            }
            objArr2 = new Object[1];
        }
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        if (lVar != null) {
            objArr2[objArr2.length - 1] = lVar;
        }
        return objArr2;
    }

    public static void a(String str, String str2, Object[] objArr, l lVar) throws Exception {
        try {
            try {
                a(str, str2, objArr).invoke(null, a(objArr, lVar));
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | JSONException e) {
                lVar.a(h.INVOCATION_FAILED, str, str2, objArr, e.getMessage());
                throw e;
            }
        } catch (NoSuchMethodException | JSONException e2) {
            lVar.a(h.METHOD_NOT_FOUND, str, str2, objArr);
            throw e2;
        }
    }
}
