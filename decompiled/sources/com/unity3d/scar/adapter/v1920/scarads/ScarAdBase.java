package com.unity3d.scar.adapter.v1920.scarads;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.AdInfo;
import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.scarads.IScarAd;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v1920.signals.QueryInfoMetadata;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ScarAdBase implements IScarAd {
    protected Context a;
    protected ScarAdMetadata b;
    protected QueryInfoMetadata c;
    protected IAdsErrorHandler d;

    public ScarAdBase(Context context, ScarAdMetadata scarAdMetadata, QueryInfoMetadata queryInfoMetadata, IAdsErrorHandler iAdsErrorHandler) {
        this.a = context;
        this.b = scarAdMetadata;
        this.c = queryInfoMetadata;
        this.d = iAdsErrorHandler;
    }

    @Override // com.unity3d.scar.adapter.common.scarads.IScarAd
    public void loadAd(IScarLoadListener iScarLoadListener) {
        if (this.c == null) {
            this.d.handleError(GMAAdsError.QueryNotFoundError(this.b));
        } else {
            loadAdInternal(iScarLoadListener, new AdRequest.Builder().setAdInfo(new AdInfo(this.c.getQueryInfo(), this.b.getAdString())).build());
        }
    }

    protected abstract void loadAdInternal(IScarLoadListener iScarLoadListener, AdRequest adRequest);
}
