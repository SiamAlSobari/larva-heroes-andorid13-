package com.unity3d.services.ads.operation.show;

import android.app.Activity;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.services.core.configuration.Configuration;

/* JADX INFO: compiled from: ShowOperationState.java */
/* JADX INFO: loaded from: classes2.dex */
public class g extends com.unity3d.services.ads.operation.e {
    public Activity h;
    public IUnityAdsShowListener i;
    public UnityAdsShowOptions j;

    public g(String str, IUnityAdsShowListener iUnityAdsShowListener, Activity activity, UnityAdsShowOptions unityAdsShowOptions, Configuration configuration) {
        super(str, configuration);
        this.i = iUnityAdsShowListener;
        this.h = activity;
        this.j = unityAdsShowOptions;
    }

    public void a(UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        IUnityAdsShowListener iUnityAdsShowListener = this.i;
        if (iUnityAdsShowListener != null) {
            iUnityAdsShowListener.onUnityAdsShowFailure(this.c, unityAdsShowError, str);
        }
    }

    public void f() {
        IUnityAdsShowListener iUnityAdsShowListener = this.i;
        if (iUnityAdsShowListener != null) {
            iUnityAdsShowListener.onUnityAdsShowClick(this.c);
        }
    }

    public void a(String str) {
        IUnityAdsShowListener iUnityAdsShowListener = this.i;
        if (iUnityAdsShowListener != null) {
            iUnityAdsShowListener.onUnityAdsShowStart(str);
        }
    }

    public void a(UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        IUnityAdsShowListener iUnityAdsShowListener = this.i;
        if (iUnityAdsShowListener != null) {
            iUnityAdsShowListener.onUnityAdsShowComplete(this.c, unityAdsShowCompletionState);
        }
    }
}
