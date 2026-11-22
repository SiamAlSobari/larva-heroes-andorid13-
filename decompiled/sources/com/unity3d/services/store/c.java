package com.unity3d.services.store;

import com.unity3d.services.store.gpbl.bridges.f;
import com.unity3d.services.store.listeners.e;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* JADX INFO: compiled from: StoreMonitor.java */
/* JADX INFO: loaded from: classes2.dex */
public class c {
    private static com.unity3d.services.store.gpbl.c a;
    private static AtomicBoolean b = new AtomicBoolean(false);
    private static com.unity3d.services.store.core.a c;
    private static com.unity3d.services.store.core.b d;

    /* JADX INFO: compiled from: StoreMonitor.java */
    static class a implements com.unity3d.services.store.listeners.b {
        a() {
        }

        @Override // com.unity3d.services.store.listeners.b
        public void a(com.unity3d.services.store.gpbl.bridges.a aVar, List<com.unity3d.services.store.gpbl.bridges.c> list) {
            if (aVar.i() != com.unity3d.services.store.gpbl.a.OK) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.STORE, com.unity3d.services.store.b.PURCHASES_UPDATED_ERROR, aVar.i());
                return;
            }
            JSONArray jSONArray = new JSONArray();
            if (list != null) {
                Iterator<com.unity3d.services.store.gpbl.bridges.c> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().k());
                }
            }
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.STORE, com.unity3d.services.store.b.PURCHASES_UPDATED_RESULT, jSONArray);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.store.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: StoreMonitor.java */
    static class C0051c implements com.unity3d.services.store.listeners.a {
        final /* synthetic */ int a;

        C0051c(int i) {
            this.a = i;
        }

        @Override // com.unity3d.services.store.listeners.a
        public void a(com.unity3d.services.store.gpbl.bridges.a aVar, List<com.unity3d.services.store.gpbl.bridges.d> list) {
            JSONArray jSONArray = new JSONArray();
            if (list != null) {
                Iterator<com.unity3d.services.store.gpbl.bridges.d> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().i());
                }
            }
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.STORE, com.unity3d.services.store.b.PURCHASE_HISTORY_LIST_REQUEST_RESULT, Integer.valueOf(this.a), jSONArray);
        }
    }

    /* JADX INFO: compiled from: StoreMonitor.java */
    static class d implements com.unity3d.services.store.listeners.d {
        final /* synthetic */ int a;

        d(int i) {
            this.a = i;
        }

        @Override // com.unity3d.services.store.listeners.d
        public void a(com.unity3d.services.store.gpbl.bridges.a aVar, List<f> list) {
            JSONArray jSONArray = new JSONArray();
            if (list != null) {
                Iterator<f> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().i());
                }
            }
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.STORE, com.unity3d.services.store.b.SKU_DETAILS_LIST_REQUEST_RESULT, Integer.valueOf(this.a), jSONArray);
        }
    }

    public static boolean b() {
        return b.get();
    }

    public static void c() {
        if (d != null) {
            com.unity3d.services.core.properties.a.d().unregisterActivityLifecycleCallbacks(d);
            d = null;
        }
    }

    public static void a(com.unity3d.services.store.core.a aVar) throws IllegalAccessException, InterruptedException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        if (b.get()) {
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.STORE, com.unity3d.services.store.b.INITIALIZATION_REQUEST_RESULT, Integer.valueOf(com.unity3d.services.store.gpbl.a.OK.a()));
            return;
        }
        c = aVar;
        com.unity3d.services.store.gpbl.c cVar = new com.unity3d.services.store.gpbl.c(com.unity3d.services.core.properties.a.e(), new a());
        a = cVar;
        cVar.a(new b());
    }

    public static int b(int i, String str) {
        int iA = -1;
        try {
            iA = a.a(str);
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.STORE, com.unity3d.services.store.b.IS_FEATURE_SUPPORTED_REQUEST_RESULT, Integer.valueOf(i), Integer.valueOf(iA));
            return iA;
        } catch (Exception e) {
            c.a(com.unity3d.services.store.b.IS_FEATURE_SUPPORTED_REQUEST_ERROR, i, e);
            return iA;
        }
    }

    /* JADX INFO: compiled from: StoreMonitor.java */
    static class b implements com.unity3d.services.store.gpbl.b {
        b() {
        }

        @Override // com.unity3d.services.store.gpbl.b
        public void a(com.unity3d.services.store.gpbl.bridges.a aVar) {
            if (aVar.i() != com.unity3d.services.store.gpbl.a.OK) {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.STORE, com.unity3d.services.store.b.INITIALIZATION_REQUEST_FAILED, aVar.i());
            } else {
                com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.STORE, com.unity3d.services.store.b.INITIALIZATION_REQUEST_RESULT, aVar.i());
                c.b.set(true);
            }
        }

        @Override // com.unity3d.services.store.gpbl.b
        public void a() {
            com.unity3d.services.core.webview.a.c().a(com.unity3d.services.core.webview.b.STORE, com.unity3d.services.store.b.DISCONNECTED_RESULT, new Object[0]);
        }
    }

    public static void a(int i, String str) {
        try {
            a.a(str, new e(Integer.valueOf(i), com.unity3d.services.store.b.PURCHASES_REQUEST_RESULT, com.unity3d.services.store.b.PURCHASES_REQUEST_ERROR));
        } catch (Exception e) {
            c.a(com.unity3d.services.store.b.PURCHASES_REQUEST_ERROR, i, e);
        }
    }

    public static void a(int i, String str, int i2) {
        try {
            a.a(str, i2, new C0051c(i));
        } catch (Exception e) {
            c.a(com.unity3d.services.store.b.PURCHASE_HISTORY_LIST_REQUEST_ERROR, i, e);
        }
    }

    public static void a(int i, String str, ArrayList<String> arrayList) {
        try {
            a.a(str, arrayList, new d(i));
        } catch (Exception e) {
            c.a(com.unity3d.services.store.b.SKU_DETAILS_LIST_REQUEST_ERROR, i, e);
        }
    }

    public static void a(ArrayList<String> arrayList) {
        if (d != null) {
            c();
        }
        d = new com.unity3d.services.store.core.b(arrayList, a);
        com.unity3d.services.core.properties.a.d().registerActivityLifecycleCallbacks(d);
    }
}
