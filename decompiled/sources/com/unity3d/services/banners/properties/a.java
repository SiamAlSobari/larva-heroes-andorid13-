package com.unity3d.services.banners.properties;

import java.util.HashMap;

/* JADX INFO: compiled from: BannerRefreshInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    private static a a;
    private HashMap<String, Integer> b = new HashMap<>();

    public static a a() {
        if (a == null) {
            a = new a();
        }
        return a;
    }

    public synchronized void a(String str, Integer num) {
        this.b.put(str, num);
    }

    public synchronized Integer a(String str) {
        return this.b.get(str);
    }
}
