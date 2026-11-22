package com.unity3d.services.core.device;

import java.io.File;
import java.io.FileNotFoundException;
import org.json.JSONObject;

/* JADX INFO: compiled from: Storage.java */
/* JADX INFO: loaded from: classes2.dex */
public class f extends com.unity3d.services.core.misc.g {
    private String a;
    private i.a b;

    public f(String str, i.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public synchronized boolean a() {
        clearData();
        return new File(this.a).delete();
    }

    public i.a b() {
        return this.b;
    }

    public synchronized boolean c() {
        d();
        super.initData();
        return true;
    }

    public synchronized boolean d() {
        try {
            try {
                byte[] bArrA = com.unity3d.services.core.misc.j.a(new File(this.a));
                if (bArrA == null) {
                    return false;
                }
                setData(new JSONObject(new String(bArrA)));
                return true;
            } catch (FileNotFoundException e) {
                com.unity3d.services.core.log.a.a("Storage JSON file not found in local cache:", e);
                return false;
            }
        } catch (Exception e2) {
            com.unity3d.services.core.log.a.a("Failed to read storage JSON file:", e2);
            return false;
        }
    }

    public synchronized boolean e() {
        return new File(this.a).exists();
    }

    public synchronized boolean f() {
        File file = new File(this.a);
        if (getData() == null) {
            return false;
        }
        return com.unity3d.services.core.misc.j.a(file, getData().toString());
    }

    public synchronized void a(h hVar, Object obj) {
        if (!(com.unity3d.services.core.webview.a.c() != null ? com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.STORAGE, hVar, this.b.name(), obj) : false)) {
            com.unity3d.services.core.log.a.b("Couldn't send storage event to WebApp");
        }
    }
}
