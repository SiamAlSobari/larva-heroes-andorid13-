package com.unity3d.scar.adapter.v2000.scarads;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper;

/* JADX INFO: loaded from: classes2.dex */
public class ScarInterstitialAdListener extends ScarAdListener {
    private final ScarInterstitialAd b;
    private final IScarInterstitialAdListenerWrapper c;
    private final InterstitialAdLoadCallback d = new a();
    private final FullScreenContentCallback e = new b();

    class a extends InterstitialAdLoadCallback {
        a() {
        }
    }

    class b extends FullScreenContentCallback {
        b() {
        }
    }

    public ScarInterstitialAdListener(IScarInterstitialAdListenerWrapper iScarInterstitialAdListenerWrapper, ScarInterstitialAd scarInterstitialAd) {
        this.c = iScarInterstitialAdListenerWrapper;
        this.b = scarInterstitialAd;
    }

    public InterstitialAdLoadCallback getAdLoadListener() {
        return this.d;
    }
}
