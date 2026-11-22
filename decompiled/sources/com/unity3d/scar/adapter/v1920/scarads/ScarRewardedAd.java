package com.unity3d.scar.adapter.v1920.scarads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v1920.signals.QueryInfoMetadata;

/* JADX INFO: loaded from: classes2.dex */
public class ScarRewardedAd extends ScarAdBase {
    private RewardedAd e;
    private ScarRewardedAdListener f;

    public ScarRewardedAd(Context context, QueryInfoMetadata queryInfoMetadata, ScarAdMetadata scarAdMetadata, IAdsErrorHandler iAdsErrorHandler, IScarRewardedAdListenerWrapper iScarRewardedAdListenerWrapper) {
        super(context, scarAdMetadata, queryInfoMetadata, iAdsErrorHandler);
        RewardedAd rewardedAd = new RewardedAd(this.a, this.b.getAdUnitId());
        this.e = rewardedAd;
        this.f = new ScarRewardedAdListener(rewardedAd, iScarRewardedAdListenerWrapper);
    }

    @Override // com.unity3d.scar.adapter.v1920.scarads.ScarAdBase
    public void loadAdInternal(IScarLoadListener iScarLoadListener, AdRequest adRequest) {
        this.f.setLoadListener(iScarLoadListener);
        this.e.loadAd(adRequest, this.f.getRewardedAdLoadCallback());
    }

    @Override // com.unity3d.scar.adapter.common.scarads.IScarAd
    public void show(Activity activity) {
        if (this.e.isLoaded()) {
            this.e.show(activity, this.f.getRewardedAdCallback());
        } else {
            this.d.handleError(GMAAdsError.AdNotLoadedError(this.b));
        }
    }
}
