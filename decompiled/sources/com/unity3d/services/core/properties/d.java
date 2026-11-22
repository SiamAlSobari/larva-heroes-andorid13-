package com.unity3d.services.core.properties;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.unity3d.ads.BuildConfig;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.configuration.Configuration;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: SdkProperties.java */
/* JADX INFO: loaded from: classes2.dex */
public class d {
    private static String a;
    private static com.unity3d.services.core.cache.a b;
    private static long c;
    private static long d;
    private static Configuration e;
    private static final LinkedHashSet<IUnityAdsInitializationListener> f = new LinkedHashSet<>();
    private static boolean g = false;
    private static boolean h = false;
    private static boolean i = false;
    private static boolean j = false;
    private static final AtomicReference<a> k = new AtomicReference<>(a.NOT_INITIALIZED);

    /* JADX INFO: compiled from: SdkProperties.java */
    public enum a {
        NOT_INITIALIZED,
        INITIALIZING,
        INITIALIZED_SUCCESSFULLY,
        INITIALIZED_FAILED
    }

    public static void a(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        a(a.INITIALIZED_FAILED);
        for (IUnityAdsInitializationListener iUnityAdsInitializationListener : g()) {
            iUnityAdsInitializationListener.onInitializationFailed(unityAdsInitializationError, str);
        }
        u();
    }

    public static void b(boolean z) {
        g = z;
    }

    public static String c() {
        return "UnityAdsCache-";
    }

    public static void c(boolean z) {
        h = z;
    }

    public static void d(boolean z) {
        i = z;
    }

    public static a e() {
        return k.get();
    }

    public static boolean f() {
        return j;
    }

    public static IUnityAdsInitializationListener[] g() {
        IUnityAdsInitializationListener[] iUnityAdsInitializationListenerArr;
        LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet = f;
        synchronized (linkedHashSet) {
            iUnityAdsInitializationListenerArr = new IUnityAdsInitializationListener[linkedHashSet.size()];
            linkedHashSet.toArray(iUnityAdsInitializationListenerArr);
        }
        return iUnityAdsInitializationListenerArr;
    }

    public static long h() {
        return c;
    }

    public static long i() {
        return d;
    }

    public static Configuration j() {
        return e;
    }

    public static String k() {
        return a().getAbsolutePath() + "/UnityAdsWebViewConfiguration.json";
    }

    public static String l() {
        return "UnityAdsStorage-";
    }

    public static String m() {
        return a().getAbsolutePath() + "/UnityAdsWebApp.html";
    }

    public static int n() {
        return BuildConfig.VERSION_CODE;
    }

    public static String o() {
        return "4.3.0";
    }

    private static String p() {
        return o();
    }

    public static boolean q() {
        return g;
    }

    public static boolean r() {
        return h;
    }

    public static boolean s() {
        return i;
    }

    public static void t() {
        a(a.INITIALIZED_SUCCESSFULLY);
        for (IUnityAdsInitializationListener iUnityAdsInitializationListener : g()) {
            iUnityAdsInitializationListener.onInitializationComplete();
        }
        u();
    }

    public static void u() {
        LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet = f;
        synchronized (linkedHashSet) {
            linkedHashSet.clear();
        }
    }

    public static String b(Context context) {
        if (context == null) {
            return "configv2";
        }
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            return bundle != null ? bundle.getString("com.unity3d.ads.configversion", "configv2") : "configv2";
        } catch (PackageManager.NameNotFoundException unused) {
            com.unity3d.services.core.log.a.e("Failed to retrieve application info for current package");
            return "configv2";
        }
    }

    public static String d() {
        if (a == null) {
            a = a("release");
        }
        return a;
    }

    public static void a(a aVar) {
        k.set(aVar);
    }

    public static String a(String str) {
        boolean zB = b(com.unity3d.services.core.device.b.y());
        String str2 = "https://" + b(com.unity3d.services.core.properties.a.e()) + ".unityads.unity3d.com/webview/";
        if (zB) {
            str2 = "https://" + b(com.unity3d.services.core.properties.a.e()) + ".unityads.unitychina.cn/webview/";
        }
        return str2 + p() + "/" + str + "/config.json";
    }

    public static com.unity3d.services.core.cache.a b() {
        return b;
    }

    public static void b(long j2) {
        d = j2;
    }

    public static boolean b(String str) {
        return str.equalsIgnoreCase("CN") || str.equalsIgnoreCase("CHN");
    }

    public static void a(Configuration configuration) {
        e = configuration;
    }

    public static File a() {
        return a(com.unity3d.services.core.properties.a.e());
    }

    public static File a(Context context) {
        if (b == null) {
            a(new com.unity3d.services.core.cache.a("UnityAdsCache"));
        }
        return b.a(context);
    }

    public static void a(com.unity3d.services.core.cache.a aVar) {
        b = aVar;
    }

    public static void a(long j2) {
        c = j2;
    }

    public static void a(boolean z) {
        j = z;
        if (z) {
            com.unity3d.services.core.log.a.a(8);
        } else {
            com.unity3d.services.core.log.a.a(4);
        }
    }

    public static void a(IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        if (iUnityAdsInitializationListener == null) {
            return;
        }
        LinkedHashSet<IUnityAdsInitializationListener> linkedHashSet = f;
        synchronized (linkedHashSet) {
            linkedHashSet.add(iUnityAdsInitializationListener);
        }
    }
}
