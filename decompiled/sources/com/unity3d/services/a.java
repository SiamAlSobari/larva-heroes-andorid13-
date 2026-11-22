package com.unity3d.services;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.EnvironmentCheck;
import com.unity3d.services.core.configuration.InitializeThread;
import com.unity3d.services.core.device.b;
import com.unity3d.services.core.properties.d;

/* JADX INFO: compiled from: UnityServices.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static void a(Context context, String str, boolean z, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        com.unity3d.services.core.log.a.a();
        if (d.e() != d.a.NOT_INITIALIZED) {
            String strF = com.unity3d.services.core.properties.a.f();
            String str2 = "";
            if (strF != null && !strF.equals(str)) {
                str2 = "" + a("Game ID", com.unity3d.services.core.properties.a.f(), str);
            }
            boolean zS = d.s();
            if (zS != z) {
                str2 = str2 + a("Test Mode", Boolean.valueOf(zS), Boolean.valueOf(z));
            }
            if (!TextUtils.isEmpty(str2)) {
                String str3 = "Unity Ads SDK failed to initialize due to already being initialized with different parameters" + str2;
                com.unity3d.services.core.log.a.e(str3);
                if (iUnityAdsInitializationListener != null) {
                    iUnityAdsInitializationListener.onInitializationFailed(UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, str3);
                    return;
                }
                return;
            }
        }
        d.a(iUnityAdsInitializationListener);
        if (d.e() == d.a.INITIALIZED_SUCCESSFULLY) {
            d.t();
            return;
        }
        if (d.e() == d.a.INITIALIZED_FAILED) {
            d.a(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to previous failed reason");
            return;
        }
        d.a aVarE = d.e();
        d.a aVar = d.a.INITIALIZING;
        if (aVarE == aVar) {
            return;
        }
        d.a(aVar);
        com.unity3d.services.core.properties.a.a(str);
        d.d(z);
        if (!d()) {
            com.unity3d.services.core.log.a.c("Error while initializing Unity Services: device is not supported");
            d.a(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to device is not supported");
            return;
        }
        d.a(b.p());
        d.b(System.currentTimeMillis());
        if (str == null || str.length() == 0) {
            com.unity3d.services.core.log.a.c("Error while initializing Unity Services: empty game ID, halting Unity Ads init");
            d.a(UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to empty game ID");
            return;
        }
        if (context == null) {
            com.unity3d.services.core.log.a.c("Error while initializing Unity Services: null context, halting Unity Ads init");
            d.a(UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to null context");
            return;
        }
        if (context instanceof Application) {
            com.unity3d.services.core.properties.a.a((Application) context);
        } else {
            if (!(context instanceof Activity)) {
                com.unity3d.services.core.log.a.c("Error while initializing Unity Services: invalid context, halting Unity Ads init");
                d.a(UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to invalid context");
                return;
            }
            Activity activity = (Activity) context;
            if (activity.getApplication() == null) {
                com.unity3d.services.core.log.a.c("Error while initializing Unity Services: cannot retrieve application from context, halting Unity Ads init");
                d.a(UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to inability to retrieve application from context");
                return;
            }
            com.unity3d.services.core.properties.a.a(activity.getApplication());
        }
        if (z) {
            com.unity3d.services.core.log.a.d("Initializing Unity Services " + d.o() + " (" + d.n() + ") with game id " + str + " in test mode");
        } else {
            com.unity3d.services.core.log.a.d("Initializing Unity Services " + d.o() + " (" + d.n() + ") with game id " + str + " in production mode");
        }
        d.a(d.f());
        if (context.getApplicationContext() == null) {
            com.unity3d.services.core.log.a.c("Error while initializing Unity Services: cannot retrieve application context, halting Unity Ads init");
            d.a(UnityAds.UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to inability to retrieve application context");
            return;
        }
        com.unity3d.services.core.properties.a.a(context.getApplicationContext());
        if (EnvironmentCheck.isEnvironmentOk()) {
            com.unity3d.services.core.log.a.d("Unity Services environment check OK");
            InitializeThread.initialize(new Configuration());
        } else {
            com.unity3d.services.core.log.a.c("Error during Unity Services environment check, halting Unity Services init");
            d.a(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to environment check failed");
        }
    }

    public static String b() {
        return d.o();
    }

    public static boolean c() {
        return d.q();
    }

    public static boolean d() {
        return true;
    }

    public static void a(boolean z) {
        d.a(z);
    }

    public static boolean a() {
        return d.f();
    }

    private static String a(String str, Object obj, Object obj2) {
        return "\n - " + str + " Current: " + (obj == null ? "null" : obj.toString()) + " | Received: " + (obj2 != null ? obj2.toString() : "null");
    }
}
