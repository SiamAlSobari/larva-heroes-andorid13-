package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.services.core.configuration.Configuration;

/* JADX INFO: compiled from: LoadOperationState.java */
/* JADX INFO: loaded from: classes2.dex */
public class h extends com.unity3d.services.ads.operation.e {
    public IUnityAdsLoadListener h;
    public UnityAdsLoadOptions i;

    public h(String str, IUnityAdsLoadListener iUnityAdsLoadListener, UnityAdsLoadOptions unityAdsLoadOptions, Configuration configuration) {
        super(str, configuration);
        this.h = iUnityAdsLoadListener;
        this.i = unityAdsLoadOptions;
    }

    public void a(UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        IUnityAdsLoadListener iUnityAdsLoadListener = this.h;
        if (iUnityAdsLoadListener != null) {
            iUnityAdsLoadListener.onUnityAdsFailedToLoad(this.c, unityAdsLoadError, str);
        }
    }

    public void f() {
        IUnityAdsLoadListener iUnityAdsLoadListener = this.h;
        if (iUnityAdsLoadListener != null) {
            iUnityAdsLoadListener.onUnityAdsAdLoaded(this.c);
        }
    }
}
