package com.unity3d.scar.adapter.v1950.scarads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.InterstitialAd;
import com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;

/* JADX INFO: loaded from: classes2.dex */
public class ScarInterstitialAdListener {
    private InterstitialAd a;
    private IScarInterstitialAdListenerWrapper b;
    private IScarLoadListener c;
    private AdListener d = new a();

    class a extends AdListener {
        a() {
        }
    }

    public ScarInterstitialAdListener(InterstitialAd interstitialAd, IScarInterstitialAdListenerWrapper iScarInterstitialAdListenerWrapper) {
        this.a = interstitialAd;
        this.b = iScarInterstitialAdListenerWrapper;
    }

    public AdListener getAdListener() {
        return this.d;
    }

    public void setLoadListener(IScarLoadListener iScarLoadListener) {
        this.c = iScarLoadListener;
    }
}
