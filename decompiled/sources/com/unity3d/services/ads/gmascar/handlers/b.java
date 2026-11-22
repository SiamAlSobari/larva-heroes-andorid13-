package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;

/* JADX INFO: compiled from: ScarInterstitialAdHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public class b extends a implements IScarInterstitialAdListenerWrapper {
    public b(ScarAdMetadata scarAdMetadata, com.unity3d.services.core.misc.a<GMAEvent> aVar) {
        super(scarAdMetadata, aVar);
    }

    @Override // com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper
    public void onAdClicked() {
        this.c.a(GMAEvent.AD_CLICKED, new Object[0]);
    }

    @Override // com.unity3d.services.ads.gmascar.handlers.a, com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdClosed() {
        if (!this.b.a()) {
            super.onAdSkipped();
        }
        super.onAdClosed();
    }

    @Override // com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper
    public void onAdFailedToShow(int i, String str) {
        this.c.a(GMAEvent.INTERSTITIAL_SHOW_ERROR, this.a.getPlacementId(), this.a.getQueryId(), str, Integer.valueOf(i));
    }

    @Override // com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper
    public void onAdImpression() {
        this.c.a(GMAEvent.INTERSTITIAL_IMPRESSION_RECORDED, new Object[0]);
    }

    @Override // com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper
    public void onAdLeftApplication() {
        this.c.a(GMAEvent.AD_LEFT_APPLICATION, new Object[0]);
    }
}
