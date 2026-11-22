package com.unity3d.services.core.misc;

import java.util.List;

/* JADX INFO: compiled from: JsonFlattenerRules.java */
/* JADX INFO: loaded from: classes2.dex */
public class f {
    List<String> a;
    List<String> b;
    List<String> c;

    public f(List<String> list, List<String> list2, List<String> list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public List<String> a() {
        return this.b;
    }

    public List<String> b() {
        return this.c;
    }

    public List<String> c() {
        return this.a;
    }
}
