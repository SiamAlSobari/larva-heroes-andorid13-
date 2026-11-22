package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.misc.j;

/* JADX INFO: compiled from: LoadOperation.java */
/* JADX INFO: loaded from: classes2.dex */
public class g extends com.unity3d.services.ads.operation.b implements com.unity3d.services.ads.operation.load.b {
    private h d;

    /* JADX INFO: compiled from: LoadOperation.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.d != null) {
                g.this.d.f();
            }
        }
    }

    /* JADX INFO: compiled from: LoadOperation.java */
    class b implements Runnable {
        final /* synthetic */ UnityAds.UnityAdsLoadError a;
        final /* synthetic */ String b;

        b(UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
            this.a = unityAdsLoadError;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g.this.d != null) {
                g.this.d.a(this.a, this.b);
            }
        }
    }

    public g(h hVar, com.unity3d.services.core.webview.bridge.invocation.a aVar) {
        super(aVar, "load");
        this.d = hVar;
    }

    @Override // com.unity3d.services.ads.operation.load.b
    public h b() {
        return this.d;
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public void onUnityAdsAdLoaded(String str) {
        h hVar = this.d;
        if (hVar == null || hVar.h == null || str == null) {
            return;
        }
        j.a(new a());
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        h hVar = this.d;
        if (hVar == null || hVar.h == null || str == null) {
            return;
        }
        j.a(new b(unityAdsLoadError, str2));
    }

    @Override // com.unity3d.services.core.webview.bridge.d
    public String a() {
        return this.d.b;
    }
}
