package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds;

/* JADX INFO: compiled from: LoadModuleDecorator.java */
/* JADX INFO: loaded from: classes2.dex */
public class d implements a {
    private final a a;

    public d(a aVar) {
        this.a = aVar;
    }

    public void a(com.unity3d.services.core.webview.bridge.b bVar, h hVar) {
        this.a.a(bVar, hVar);
    }

    @Override // com.unity3d.services.core.webview.bridge.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public b get(String str) {
        return (b) this.a.get(str);
    }

    @Override // com.unity3d.services.ads.operation.load.a
    public void onUnityAdsAdLoaded(String str) {
        this.a.onUnityAdsAdLoaded(str);
    }

    @Override // com.unity3d.services.ads.operation.load.a
    public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        this.a.onUnityAdsFailedToLoad(str, unityAdsLoadError, str2);
    }

    @Override // com.unity3d.services.ads.operation.c
    public com.unity3d.services.core.request.metrics.c a() {
        return this.a.a();
    }

    @Override // com.unity3d.services.core.webview.bridge.c
    public void a(String str) {
        this.a.a(str);
    }
}
