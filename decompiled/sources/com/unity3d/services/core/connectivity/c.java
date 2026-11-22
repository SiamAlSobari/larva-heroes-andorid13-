package com.unity3d.services.core.connectivity;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: ConnectivityMonitor.java */
/* JADX INFO: loaded from: classes2.dex */
public class c {
    private static int a = -1;
    private static boolean b = false;
    private static boolean c = false;
    private static boolean d = false;
    private static int e = -1;
    private static Set<e> f;

    /* JADX INFO: compiled from: ConnectivityMonitor.java */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.NETWORK_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void a(boolean z) {
        c = z;
        h();
    }

    public static void b(e eVar) {
        Set<e> set = f;
        if (set == null) {
            return;
        }
        set.remove(eVar);
        h();
    }

    public static void c() {
        if (a == 0) {
            return;
        }
        a = 0;
        com.unity3d.services.core.log.a.b("Unity Ads connectivity change: disconnected");
        Set<e> set = f;
        if (set != null) {
            Iterator<e> it = set.iterator();
            while (it.hasNext()) {
                it.next().onDisconnected();
            }
        }
        a(b.DISCONNECTED, false, 0);
    }

    private static void d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) com.unity3d.services.core.properties.a.e().getSystemService("connectivity");
        if (connectivityManager == null) {
            return;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            a = 0;
            return;
        }
        a = 1;
        boolean z = activeNetworkInfo.getType() == 1;
        d = z;
        if (z) {
            return;
        }
        try {
            e = ((TelephonyManager) com.unity3d.services.core.properties.a.e().getSystemService("phone")).getNetworkType();
        } catch (SecurityException unused) {
            com.unity3d.services.core.log.a.e("Unity Ads was not able to get current network type due to missing permission");
        }
    }

    private static void e() {
        if (b) {
            return;
        }
        b = true;
        d();
        if (Build.VERSION.SDK_INT < 21) {
            com.unity3d.services.core.connectivity.a.a();
        } else {
            d.a();
        }
    }

    public static void f() {
        f = null;
        c = false;
        h();
    }

    private static void g() {
        if (b) {
            b = false;
            if (Build.VERSION.SDK_INT < 21) {
                com.unity3d.services.core.connectivity.a.b();
            } else {
                d.b();
            }
        }
    }

    private static void h() {
        Set<e> set;
        if (c || !((set = f) == null || set.isEmpty())) {
            e();
        } else {
            g();
        }
    }

    public static void a(e eVar) {
        if (f == null) {
            f = Collections.newSetFromMap(new ConcurrentHashMap());
        }
        f.add(eVar);
        h();
    }

    public static void b() {
        NetworkInfo activeNetworkInfo;
        int networkType;
        if (a == 1 && (activeNetworkInfo = ((ConnectivityManager) com.unity3d.services.core.properties.a.e().getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
            boolean z = activeNetworkInfo.getType() == 1;
            try {
                networkType = ((TelephonyManager) com.unity3d.services.core.properties.a.e().getSystemService("phone")).getNetworkType();
            } catch (SecurityException unused) {
                com.unity3d.services.core.log.a.e("Unity Ads was not able to get current network type due to missing permission");
                networkType = -1;
            }
            boolean z2 = d;
            if (z == z2 && (networkType == e || z2)) {
                return;
            }
            d = z;
            e = networkType;
            com.unity3d.services.core.log.a.b("Unity Ads connectivity change: network change");
            a(b.NETWORK_CHANGE, z, networkType);
        }
    }

    public static void a() {
        if (a == 1) {
            return;
        }
        com.unity3d.services.core.log.a.b("Unity Ads connectivity change: connected");
        d();
        Set<e> set = f;
        if (set != null) {
            Iterator<e> it = set.iterator();
            while (it.hasNext()) {
                it.next().onConnected();
            }
        }
        a(b.CONNECTED, d, e);
    }

    private static void a(b bVar, boolean z, int i) {
        com.unity3d.services.core.webview.a aVarC;
        if (c && (aVarC = com.unity3d.services.core.webview.a.c()) != null && aVarC.i()) {
            int i2 = a.a[bVar.ordinal()];
            if (i2 == 1) {
                if (z) {
                    aVarC.a(com.unity3d.services.core.webview.b.CONNECTIVITY, b.CONNECTED, Boolean.valueOf(z), 0);
                    return;
                } else {
                    aVarC.a(com.unity3d.services.core.webview.b.CONNECTIVITY, b.CONNECTED, Boolean.valueOf(z), Integer.valueOf(i));
                    return;
                }
            }
            if (i2 == 2) {
                aVarC.a(com.unity3d.services.core.webview.b.CONNECTIVITY, b.DISCONNECTED, new Object[0]);
            } else {
                if (i2 != 3) {
                    return;
                }
                if (z) {
                    aVarC.a(com.unity3d.services.core.webview.b.CONNECTIVITY, b.NETWORK_CHANGE, Boolean.valueOf(z), 0);
                } else {
                    aVarC.a(com.unity3d.services.core.webview.b.CONNECTIVITY, b.NETWORK_CHANGE, Boolean.valueOf(z), Integer.valueOf(i));
                }
            }
        }
    }
}
