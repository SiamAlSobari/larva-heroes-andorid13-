package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.misc.j;

/* JADX INFO: compiled from: ShowOperation.java */
/* JADX INFO: loaded from: classes2.dex */
public class f extends com.unity3d.services.ads.operation.b implements com.unity3d.services.ads.operation.show.b {
    private g d;

    /* JADX INFO: compiled from: ShowOperation.java */
    class a implements Runnable {
        final /* synthetic */ UnityAds.UnityAdsShowError a;
        final /* synthetic */ String b;

        a(UnityAds.UnityAdsShowError unityAdsShowError, String str) {
            this.a = unityAdsShowError;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (f.this.d != null) {
                f.this.d.a(this.a, this.b);
            }
        }
    }

    /* JADX INFO: compiled from: ShowOperation.java */
    class b implements Runnable {
        final /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (f.this.d != null) {
                f.this.d.a(this.a);
            }
        }
    }

    /* JADX INFO: compiled from: ShowOperation.java */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (f.this.d != null) {
                f.this.d.f();
            }
        }
    }

    /* JADX INFO: compiled from: ShowOperation.java */
    class d implements Runnable {
        final /* synthetic */ UnityAds.UnityAdsShowCompletionState a;

        d(UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            this.a = unityAdsShowCompletionState;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (f.this.d != null) {
                f.this.d.a(this.a);
            }
        }
    }

    public f(g gVar, com.unity3d.services.core.webview.bridge.invocation.a aVar) {
        super(aVar, "show");
        this.d = gVar;
    }

    @Override // com.unity3d.services.ads.operation.show.b
    public g c() {
        return this.d;
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowClick(String str) {
        if (this.d == null) {
            return;
        }
        j.a(new c());
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        if (this.d == null) {
            return;
        }
        j.a(new d(unityAdsShowCompletionState));
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        g gVar = this.d;
        if (gVar == null || gVar.i == null) {
            return;
        }
        j.a(new a(unityAdsShowError, str2));
    }

    @Override // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowStart(String str) {
        if (this.d == null) {
            return;
        }
        j.a(new b(str));
    }

    @Override // com.unity3d.services.core.webview.bridge.d
    public String a() {
        return this.d.b;
    }
}
