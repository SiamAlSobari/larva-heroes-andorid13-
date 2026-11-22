package com.unity3d.services.ads.token;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.j;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: TokenStorage.java */
/* JADX INFO: loaded from: classes2.dex */
public class h {
    private static ConcurrentLinkedQueue<String> b = null;
    private static int c = 0;
    private static boolean d = false;
    private static String e;
    private static final Object a = new Object();
    private static ExecutorService f = Executors.newSingleThreadExecutor();

    /* JADX INFO: compiled from: TokenStorage.java */
    static class a implements c {
        a() {
        }

        @Override // com.unity3d.services.ads.token.c
        public void a(String str) {
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.TOKEN, g.TOKEN_NATIVE_DATA, str);
        }
    }

    public static void a(JSONArray jSONArray) throws JSONException {
        boolean z;
        synchronized (a) {
            if (b == null) {
                b = new ConcurrentLinkedQueue<>();
                c = 0;
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                b.add(jSONArray.getString(i));
            }
            z = !b.isEmpty();
        }
        if (z) {
            a(Boolean.FALSE);
            com.unity3d.services.ads.token.a.a().b(j.TOKEN_REMOTE);
        }
    }

    public static void b(JSONArray jSONArray) throws JSONException {
        boolean z;
        synchronized (a) {
            b = new ConcurrentLinkedQueue<>();
            c = 0;
            for (int i = 0; i < jSONArray.length(); i++) {
                b.add(jSONArray.getString(i));
            }
            z = !b.isEmpty();
        }
        if (z) {
            a(Boolean.FALSE);
            com.unity3d.services.ads.token.a.a().b(j.TOKEN_REMOTE);
        }
    }

    public static String c() {
        synchronized (a) {
            ConcurrentLinkedQueue<String> concurrentLinkedQueue = b;
            if (concurrentLinkedQueue == null) {
                return e;
            }
            if (concurrentLinkedQueue.isEmpty()) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.TOKEN, g.QUEUE_EMPTY, new Object[0]);
                return null;
            }
            if (d) {
                com.unity3d.services.core.webview.a aVarC = com.unity3d.services.core.webview.a.c();
                com.unity3d.services.core.webview.b bVar = com.unity3d.services.core.webview.b.TOKEN;
                g gVar = g.TOKEN_ACCESS;
                int i = c;
                c = i + 1;
                aVarC.a(bVar, gVar, Integer.valueOf(i));
                return b.peek();
            }
            com.unity3d.services.core.webview.a aVarC2 = com.unity3d.services.core.webview.a.c();
            com.unity3d.services.core.webview.b bVar2 = com.unity3d.services.core.webview.b.TOKEN;
            g gVar2 = g.TOKEN_ACCESS;
            int i2 = c;
            c = i2 + 1;
            aVarC2.a(bVar2, gVar2, Integer.valueOf(i2));
            return b.poll();
        }
    }

    public static void b() {
        new d(f, new com.unity3d.services.core.device.reader.a(new ConfigurationReader(), PrivacyConfigStorage.getInstance()), null).a(new a());
    }

    public static void a() {
        synchronized (a) {
            b = null;
            c = 0;
        }
    }

    public static void a(boolean z) {
        synchronized (a) {
            d = z;
        }
    }

    public static void a(String str) {
        boolean z;
        synchronized (a) {
            e = str;
            z = str != null;
        }
        if (z) {
            com.unity3d.services.ads.token.a.a().b(j.TOKEN_REMOTE);
            a(Boolean.TRUE);
        }
    }

    private static void a(Boolean bool) {
        InitializeEventsMetricSender.getInstance().sdkTokenDidBecomeAvailableWithConfig(bool.booleanValue());
    }
}
