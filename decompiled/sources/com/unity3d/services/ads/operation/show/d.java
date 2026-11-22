package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;

/* JADX INFO: compiled from: ShowModuleDecorator.java */
/* JADX INFO: loaded from: classes2.dex */
public class d implements a {
    private final a a;

    public d(a aVar) {
        this.a = aVar;
    }

    public void a(com.unity3d.services.core.webview.bridge.b bVar, g gVar) {
        this.a.a(bVar, gVar);
    }

    @Override // com.unity3d.services.ads.operation.show.a
    public void b(String str) {
        this.a.b(str);
    }

    @Override // com.unity3d.services.core.webview.bridge.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public b get(String str) {
        return (b) this.a.get(str);
    }

    @Override // com.unity3d.services.ads.operation.show.a
    public void onUnityAdsShowClick(String str) {
        this.a.onUnityAdsShowClick(str);
    }

    @Override // com.unity3d.services.ads.operation.show.a
    public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        this.a.onUnityAdsShowComplete(str, unityAdsShowCompletionState);
    }

    @Override // com.unity3d.services.ads.operation.show.a
    public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        this.a.onUnityAdsShowFailure(str, unityAdsShowError, str2);
    }

    @Override // com.unity3d.services.ads.operation.show.a
    public void onUnityAdsShowStart(String str) {
        this.a.onUnityAdsShowStart(str);
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
