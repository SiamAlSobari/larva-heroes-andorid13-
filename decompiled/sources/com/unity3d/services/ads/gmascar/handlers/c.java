package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;

/* JADX INFO: compiled from: ScarRewardedAdHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public class c extends a implements IScarRewardedAdListenerWrapper {
    private boolean d;

    public c(ScarAdMetadata scarAdMetadata, com.unity3d.services.core.misc.a<GMAEvent> aVar) {
        super(scarAdMetadata, aVar);
        this.d = false;
    }

    @Override // com.unity3d.services.ads.gmascar.handlers.a, com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdClosed() {
        if (!this.d) {
            super.onAdSkipped();
        }
        super.onAdClosed();
    }

    @Override // com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper
    public void onAdFailedToShow(int i, String str) {
        this.c.a(GMAEvent.REWARDED_SHOW_ERROR, this.a.getPlacementId(), this.a.getQueryId(), str, Integer.valueOf(i));
    }

    @Override // com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper
    public void onAdImpression() {
        this.c.a(GMAEvent.REWARDED_IMPRESSION_RECORDED, new Object[0]);
    }

    @Override // com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper
    public void onUserEarnedReward() {
        this.d = true;
        this.c.a(GMAEvent.AD_EARNED_REWARD, new Object[0]);
    }
}
