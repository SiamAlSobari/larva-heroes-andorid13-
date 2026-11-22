package com.unity3d.scar.adapter.v1950;

import android.content.Context;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.IScarAdapter;
import com.unity3d.scar.adapter.common.IScarInterstitialAdListenerWrapper;
import com.unity3d.scar.adapter.common.IScarRewardedAdListenerWrapper;
import com.unity3d.scar.adapter.common.ScarAdapterBase;
import com.unity3d.scar.adapter.common.Utils;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v1950.scarads.ScarInterstitialAd;
import com.unity3d.scar.adapter.v1950.scarads.ScarRewardedAd;
import com.unity3d.scar.adapter.v1950.signals.SignalsReader;
import com.unity3d.scar.adapter.v1950.signals.SignalsStorage;

/* JADX INFO: loaded from: classes2.dex */
public class ScarAdapter extends ScarAdapterBase implements IScarAdapter {
    private SignalsStorage e;

    class a implements Runnable {
        final /* synthetic */ ScarInterstitialAd a;
        final /* synthetic */ ScarAdMetadata b;

        /* JADX INFO: renamed from: com.unity3d.scar.adapter.v1950.ScarAdapter$a$a, reason: collision with other inner class name */
        class C0029a implements IScarLoadListener {
            C0029a() {
            }

            @Override // com.unity3d.scar.adapter.common.scarads.IScarLoadListener
            public void onAdLoaded() {
                ((ScarAdapterBase) ScarAdapter.this).b.put(a.this.b.getPlacementId(), a.this.a);
            }
        }

        a(ScarInterstitialAd scarInterstitialAd, ScarAdMetadata scarAdMetadata) {
            this.a = scarInterstitialAd;
            this.b = scarAdMetadata;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.loadAd(new C0029a());
        }
    }

    class b implements Runnable {
        final /* synthetic */ ScarRewardedAd a;
        final /* synthetic */ ScarAdMetadata b;

        class a implements IScarLoadListener {
            a() {
            }

            @Override // com.unity3d.scar.adapter.common.scarads.IScarLoadListener
            public void onAdLoaded() {
                ((ScarAdapterBase) ScarAdapter.this).b.put(b.this.b.getPlacementId(), b.this.a);
            }
        }

        b(ScarRewardedAd scarRewardedAd, ScarAdMetadata scarAdMetadata) {
            this.a = scarRewardedAd;
            this.b = scarAdMetadata;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.loadAd(new a());
        }
    }

    public ScarAdapter(IAdsErrorHandler iAdsErrorHandler) {
        super(iAdsErrorHandler);
        SignalsStorage signalsStorage = new SignalsStorage();
        this.e = signalsStorage;
        this.a = new SignalsReader(signalsStorage);
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    public void loadInterstitialAd(Context context, ScarAdMetadata scarAdMetadata, IScarInterstitialAdListenerWrapper iScarInterstitialAdListenerWrapper) {
        Utils.runOnUiThread(new a(new ScarInterstitialAd(context, this.e.getQueryInfoMetadata(scarAdMetadata.getPlacementId()), scarAdMetadata, this.d, iScarInterstitialAdListenerWrapper), scarAdMetadata));
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    public void loadRewardedAd(Context context, ScarAdMetadata scarAdMetadata, IScarRewardedAdListenerWrapper iScarRewardedAdListenerWrapper) {
        Utils.runOnUiThread(new b(new ScarRewardedAd(context, this.e.getQueryInfoMetadata(scarAdMetadata.getPlacementId()), scarAdMetadata, this.d, iScarRewardedAdListenerWrapper), scarAdMetadata));
    }
}
