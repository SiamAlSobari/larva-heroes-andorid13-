package com.unity3d.services.ads;

import android.app.Activity;
import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.services.ads.operation.show.c;
import com.unity3d.services.ads.operation.show.g;
import com.unity3d.services.ads.token.h;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.request.metrics.b;
import com.unity3d.services.core.request.metrics.i;
import com.unity3d.services.core.webview.bridge.j;

/* JADX INFO: compiled from: UnityAdsImplementation.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    private static Configuration a;
    private static j b = new j();

    public static void a(Context context, String str, boolean z, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        com.unity3d.services.core.log.a.a();
        com.unity3d.services.a.a(context, str, z, iUnityAdsInitializationListener);
    }

    public static String b() {
        return h.c();
    }

    public static String c() {
        return com.unity3d.services.a.b();
    }

    public static boolean d() {
        return com.unity3d.services.a.c();
    }

    public static boolean e() {
        return com.unity3d.services.a.d();
    }

    public static void a(Activity activity, String str, IUnityAdsShowListener iUnityAdsShowListener) {
        a(activity, str, new UnityAdsShowOptions(), iUnityAdsShowListener);
    }

    public static void a(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions, IUnityAdsShowListener iUnityAdsShowListener) {
        if (!e()) {
            a(iUnityAdsShowListener, str, UnityAds.UnityAdsShowError.NOT_INITIALIZED, "Unity Ads is not supported for this device");
            return;
        }
        if (!d()) {
            a(iUnityAdsShowListener, str, UnityAds.UnityAdsShowError.NOT_INITIALIZED, "Unity Ads is not initialized");
            return;
        }
        if (activity == null) {
            a(iUnityAdsShowListener, str, UnityAds.UnityAdsShowError.INVALID_ARGUMENT, "Activity must not be null");
            return;
        }
        Configuration configuration = a;
        if (configuration == null) {
            configuration = new Configuration();
        }
        com.unity3d.services.core.properties.a.a(activity);
        c.b().a(com.unity3d.services.core.webview.a.c(), new g(str, iUnityAdsShowListener, activity, unityAdsShowOptions, configuration));
    }

    private static void a(IUnityAdsShowListener iUnityAdsShowListener, String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        i.a().a(b.a(unityAdsShowError, (Long) 0L));
        if (iUnityAdsShowListener == null) {
            return;
        }
        iUnityAdsShowListener.onUnityAdsShowFailure(str, unityAdsShowError, str2);
    }

    public static void a(boolean z) {
        com.unity3d.services.a.a(z);
    }

    public static boolean a() {
        return com.unity3d.services.a.a();
    }

    public static void a(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener) {
        Configuration configuration = a;
        if (configuration == null) {
            configuration = new Configuration();
        }
        com.unity3d.services.ads.operation.load.c.b().a(b, new com.unity3d.services.ads.operation.load.h(str, iUnityAdsLoadListener, unityAdsLoadOptions, configuration));
    }

    public static void a(IUnityAdsTokenListener iUnityAdsTokenListener) {
        if (iUnityAdsTokenListener == null) {
            com.unity3d.services.core.log.a.d("Please provide non-null listener to UnityAds.GetToken method");
        } else if (com.unity3d.services.core.properties.a.e() == null) {
            iUnityAdsTokenListener.onUnityAdsTokenReady(null);
        } else {
            com.unity3d.services.ads.token.a.a().b(iUnityAdsTokenListener);
        }
    }

    public static void a(Configuration configuration) {
        a = configuration;
    }
}
