package com.unity3d.scar.adapter.v2000.scarads;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper;

/* JADX INFO: loaded from: classes2.dex */
public class ScarRewardedAdListener extends ScarAdListener {
    private final ScarRewardedAd b;
    private final IScarRewardedAdListenerWrapper c;
    private final RewardedAdLoadCallback d = new a();
    private final OnUserEarnedRewardListener e = new b();
    private final FullScreenContentCallback f = new c();

    class a extends RewardedAdLoadCallback {
        a() {
        }
    }

    class b implements OnUserEarnedRewardListener {
        b() {
        }
    }

    class c extends FullScreenContentCallback {
        c() {
        }
    }

    public ScarRewardedAdListener(IScarRewardedAdListenerWrapper iScarRewardedAdListenerWrapper, ScarRewardedAd scarRewardedAd) {
        this.c = iScarRewardedAdListenerWrapper;
        this.b = scarRewardedAd;
    }

    public RewardedAdLoadCallback getAdLoadListener() {
        return this.d;
    }

    public OnUserEarnedRewardListener getOnUserEarnedRewardListener() {
        return this.e;
    }
}
