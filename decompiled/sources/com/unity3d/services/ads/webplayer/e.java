package com.unity3d.services.ads.webplayer;

import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: WebPlayerSettingsCache.java */
/* JADX INFO: loaded from: classes2.dex */
public class e {
    private static e a;
    private HashMap<String, JSONObject> b = new HashMap<>();
    private HashMap<String, JSONObject> c = new HashMap<>();
    private HashMap<String, JSONObject> d = new HashMap<>();

    public static e a() {
        if (a == null) {
            a = new e();
        }
        return a;
    }

    public synchronized void b(String str, JSONObject jSONObject) {
        this.c.put(str, jSONObject);
    }

    public synchronized void c(String str, JSONObject jSONObject) {
        this.b.put(str, jSONObject);
    }

    public synchronized void d(String str) {
        if (this.d.containsKey(str)) {
            this.d.remove(str);
        }
    }

    public synchronized void e(String str) {
        if (this.c.containsKey(str)) {
            this.c.remove(str);
        }
    }

    public synchronized void f(String str) {
        if (this.b.containsKey(str)) {
            this.b.remove(str);
        }
    }

    public synchronized JSONObject b(String str) {
        if (this.c.containsKey(str)) {
            return this.c.get(str);
        }
        return new JSONObject();
    }

    public synchronized JSONObject c(String str) {
        if (this.b.containsKey(str)) {
            return this.b.get(str);
        }
        return new JSONObject();
    }

    public synchronized void a(String str, JSONObject jSONObject) {
        this.d.put(str, jSONObject);
    }

    public synchronized JSONObject a(String str) {
        if (this.d.containsKey(str)) {
            return this.d.get(str);
        }
        return new JSONObject();
    }
}
