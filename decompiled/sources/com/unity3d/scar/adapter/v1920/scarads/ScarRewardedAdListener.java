package com.unity3d.scar.adapter.v1920.scarads;

import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;

/* JADX INFO: loaded from: classes2.dex */
public class ScarRewardedAdListener {
    private RewardedAd a;
    private IScarRewardedAdListenerWrapper b;
    private IScarLoadListener c;
    private RewardedAdLoadCallback d = new a();
    private RewardedAdCallback e = new b();

    class a extends RewardedAdLoadCallback {
        a() {
        }
    }

    class b extends RewardedAdCallback {
        b() {
        }
    }

    public ScarRewardedAdListener(RewardedAd rewardedAd, IScarRewardedAdListenerWrapper iScarRewardedAdListenerWrapper) {
        this.a = rewardedAd;
        this.b = iScarRewardedAdListenerWrapper;
    }

    public RewardedAdCallback getRewardedAdCallback() {
        return this.e;
    }

    public RewardedAdLoadCallback getRewardedAdLoadCallback() {
        return this.d;
    }

    public void setLoadListener(IScarLoadListener iScarLoadListener) {
        this.c = iScarLoadListener;
    }
}
