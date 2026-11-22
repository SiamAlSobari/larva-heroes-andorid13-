package com.unity3d.services.core.configuration;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.api.Broadcast;
import com.unity3d.services.core.api.Cache;
import com.unity3d.services.core.api.ClassDetection;
import com.unity3d.services.core.api.Connectivity;
import com.unity3d.services.core.api.DeviceInfo;
import com.unity3d.services.core.api.Intent;
import com.unity3d.services.core.api.Lifecycle;
import com.unity3d.services.core.api.Permissions;
import com.unity3d.services.core.api.Preferences;
import com.unity3d.services.core.api.Request;
import com.unity3d.services.core.api.Resolve;
import com.unity3d.services.core.api.Sdk;
import com.unity3d.services.core.api.SensorInfo;
import com.unity3d.services.core.api.Storage;
import com.unity3d.services.core.cache.e;
import com.unity3d.services.core.device.k;
import com.unity3d.services.core.misc.j;
import com.unity3d.services.core.properties.d;
import com.unity3d.services.core.request.l;
import com.unity3d.services.core.request.metrics.i;

/* JADX INFO: loaded from: classes2.dex */
public class CoreModuleConfiguration implements IModuleConfiguration {

    class a implements Runnable {
        final /* synthetic */ UnityAds.UnityAdsInitializationError a;
        final /* synthetic */ String b;

        a(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            this.a = unityAdsInitializationError;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.a(this.a, this.b);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.t();
        }
    }

    static /* synthetic */ class c {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ErrorState.values().length];
            a = iArr;
            try {
                iArr[ErrorState.CreateWebApp.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ErrorState.InitModules.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public Class[] getWebAppApiClassList() {
        return new Class[]{Broadcast.class, Cache.class, Connectivity.class, DeviceInfo.class, ClassDetection.class, Storage.class, Sdk.class, Request.class, Resolve.class, Intent.class, Lifecycle.class, Preferences.class, SensorInfo.class, Permissions.class};
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean initCompleteState(Configuration configuration) {
        i.b(configuration);
        InitializationNotificationCenter.getInstance().triggerOnSdkInitialized();
        j.a(new b());
        return true;
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean initErrorState(Configuration configuration, ErrorState errorState, String str) {
        UnityAds.UnityAdsInitializationError unityAdsInitializationError;
        i.b(configuration);
        int i = c.a[errorState.ordinal()];
        if (i == 1) {
            unityAdsInitializationError = UnityAds.UnityAdsInitializationError.INTERNAL_ERROR;
        } else if (i != 2) {
            unityAdsInitializationError = UnityAds.UnityAdsInitializationError.INTERNAL_ERROR;
            str = "Unity Ads failed to initialize due to internal error";
        } else {
            unityAdsInitializationError = UnityAds.UnityAdsInitializationError.AD_BLOCKER_DETECTED;
        }
        InitializationNotificationCenter.getInstance().triggerOnSdkInitializationFailed(str, errorState, 0);
        j.a(new a(unityAdsInitializationError, str));
        return true;
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean initModuleState(Configuration configuration) {
        i.b(configuration);
        return true;
    }

    @Override // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean resetState(Configuration configuration) {
        i.b(configuration);
        com.unity3d.services.core.broadcast.d.a();
        e.a();
        l.b();
        com.unity3d.services.core.connectivity.c.f();
        com.unity3d.services.core.device.i.a(com.unity3d.services.core.properties.a.e());
        com.unity3d.services.core.device.a.b(com.unity3d.services.core.properties.a.e());
        com.unity3d.services.core.device.e.b(com.unity3d.services.core.properties.a.e());
        k.b();
        return true;
    }
}
