package com.unity3d.services.core.webview.bridge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Invocation.java */
/* JADX INFO: loaded from: classes2.dex */
public class e {
    private static AtomicInteger a = new AtomicInteger(0);
    private static Map<Integer, e> b;
    private ArrayList<ArrayList<Object>> c;
    private ArrayList<ArrayList<Object>> d;
    private int e = a.getAndIncrement();

    public e() {
        if (b == null) {
            b = new HashMap();
        }
        b.put(Integer.valueOf(this.e), this);
    }

    public void a(String str, String str2, Object[] objArr, l lVar) {
        if (this.c == null) {
            this.c = new ArrayList<>();
        }
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(str);
        arrayList.add(str2);
        arrayList.add(objArr);
        arrayList.add(lVar);
        this.c.add(arrayList);
    }

    public ArrayList<ArrayList<Object>> b() {
        return this.d;
    }

    public boolean c() {
        ArrayList<ArrayList<Object>> arrayList = this.c;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        ArrayList<Object> arrayListRemove = this.c.remove(0);
        String str = (String) arrayListRemove.get(0);
        String str2 = (String) arrayListRemove.get(1);
        Object[] objArr = (Object[]) arrayListRemove.get(2);
        try {
            g.a(str, str2, objArr, (l) arrayListRemove.get(3));
        } catch (Exception e) {
            com.unity3d.services.core.log.a.a(String.format("Error handling invocation %s.%s(%s)", str, str2, Arrays.toString(objArr)), e);
        }
        return true;
    }

    public void d() {
        b.remove(Integer.valueOf(a()));
        com.unity3d.services.core.webview.a.c().a(this);
    }

    public void a(a aVar, Enum r3, Object... objArr) {
        if (this.d == null) {
            this.d = new ArrayList<>();
        }
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(aVar);
        arrayList.add(r3);
        arrayList.add(objArr);
        this.d.add(arrayList);
    }

    public int a() {
        return this.e;
    }

    public static synchronized e a(int i) {
        Map<Integer, e> map = b;
        if (map == null || !map.containsKey(Integer.valueOf(i))) {
            return null;
        }
        return b.get(Integer.valueOf(i));
    }
}
