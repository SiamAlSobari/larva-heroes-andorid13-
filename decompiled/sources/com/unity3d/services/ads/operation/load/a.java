package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds;

/* JADX INFO: compiled from: ILoadModule.java */
/* JADX INFO: loaded from: classes2.dex */
public interface a extends com.unity3d.services.ads.operation.c<b, h> {
    void onUnityAdsAdLoaded(String str);

    void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2);
}
