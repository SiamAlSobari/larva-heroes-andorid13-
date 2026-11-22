package com.unity3d.services.core.cache;

import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: CacheThread.java */
/* JADX INFO: loaded from: classes2.dex */
public class e extends Thread {
    private static f a = null;
    private static boolean b = false;
    private static final Object c = new Object();
    private static int d = 30000;
    private static int e = 30000;
    private static int f;

    public static synchronized void a(String str, String str2, HashMap<String, List<String>> map, boolean z) {
        if (!b) {
            e();
        }
        Bundle bundle = new Bundle();
        bundle.putString("source", str);
        bundle.putString("target", str2);
        bundle.putInt("connectTimeout", d);
        bundle.putInt("readTimeout", e);
        bundle.putInt("progressInterval", f);
        bundle.putBoolean("append", z);
        if (map != null) {
            for (String str3 : map.keySet()) {
                bundle.putStringArray(str3, (String[]) map.get(str3).toArray(new String[map.get(str3).size()]));
            }
        }
        Message message = new Message();
        message.what = 1;
        message.setData(bundle);
        a.a(false);
        a.sendMessage(message);
    }

    public static void b(int i) {
        f = i;
    }

    public static int c() {
        return f;
    }

    public static int d() {
        return e;
    }

    private static void e() {
        e eVar = new e();
        eVar.setName("UnityAdsCacheThread");
        eVar.start();
        while (!b) {
            try {
                Object obj = c;
                synchronized (obj) {
                    try {
                        obj.wait();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (InterruptedException unused) {
                com.unity3d.services.core.log.a.b("Couldn't synchronize thread");
            }
        }
    }

    public static boolean f() {
        if (b) {
            return a.a();
        }
        return false;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        a = new f();
        b = true;
        Object obj = c;
        synchronized (obj) {
            obj.notify();
        }
        Looper.loop();
    }

    public static int b() {
        return d;
    }

    public static void c(int i) {
        e = i;
    }

    public static void a() {
        if (b) {
            a.removeMessages(1);
            a.a(true);
        }
    }

    public static void a(int i) {
        d = i;
    }
}
