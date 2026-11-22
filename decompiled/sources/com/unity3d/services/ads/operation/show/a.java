package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;

/* JADX INFO: compiled from: IShowModule.java */
/* JADX INFO: loaded from: classes2.dex */
public interface a extends com.unity3d.services.ads.operation.c<b, g> {
    void b(String str);

    void onUnityAdsShowClick(String str);

    void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState);

    void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2);

    void onUnityAdsShowStart(String str);
}
