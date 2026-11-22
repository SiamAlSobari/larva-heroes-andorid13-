package com.unity3d.services.ads.webplayer;

import java.util.HashMap;

/* JADX INFO: compiled from: WebPlayerViewCache.java */
/* JADX INFO: loaded from: classes2.dex */
public class g {
    private static g a;
    private HashMap<String, f> b = new HashMap<>();

    public static g a() {
        if (a == null) {
            a = new g();
        }
        return a;
    }

    public synchronized void b(String str) {
        if (this.b.containsKey(str)) {
            this.b.remove(str);
        }
    }

    public synchronized void a(String str, f fVar) {
        this.b.put(str, fVar);
    }

    public synchronized f a(String str) {
        if (!this.b.containsKey(str)) {
            return null;
        }
        return this.b.get(str);
    }
}
