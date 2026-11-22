package com.unity3d.scar.adapter.v1920.scarads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v1920.signals.QueryInfoMetadata;

/* JADX INFO: loaded from: classes2.dex */
public class ScarInterstitialAd extends ScarAdBase {
    private InterstitialAd e;
    private ScarInterstitialAdListener f;

    public ScarInterstitialAd(Context context, QueryInfoMetadata queryInfoMetadata, ScarAdMetadata scarAdMetadata, IAdsErrorHandler iAdsErrorHandler, IScarInterstitialAdListenerWrapper iScarInterstitialAdListenerWrapper) {
        super(context, scarAdMetadata, queryInfoMetadata, iAdsErrorHandler);
        InterstitialAd interstitialAd = new InterstitialAd(this.a);
        this.e = interstitialAd;
        interstitialAd.setAdUnitId(this.b.getAdUnitId());
        this.f = new ScarInterstitialAdListener(this.e, iScarInterstitialAdListenerWrapper);
    }

    @Override // com.unity3d.scar.adapter.v1920.scarads.ScarAdBase
    public void loadAdInternal(IScarLoadListener iScarLoadListener, AdRequest adRequest) {
        this.e.setAdListener(this.f.getAdListener());
        this.f.setLoadListener(iScarLoadListener);
        this.e.loadAd(adRequest);
    }

    @Override // com.unity3d.scar.adapter.common.scarads.IScarAd
    public void show(Activity activity) {
        if (this.e.isLoaded()) {
            this.e.show();
        } else {
            this.d.handleError(GMAAdsError.AdNotLoadedError(this.b));
        }
    }
}
