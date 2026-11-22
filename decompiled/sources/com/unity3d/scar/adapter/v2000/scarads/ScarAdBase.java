package com.unity3d.scar.adapter.v2000.scarads;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.AdInfo;
import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.scarads.IScarAd;
import com.unity3d.scar.adapter.common.scarads.IScarLoadListener;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.v2000.signals.QueryInfoMetadata;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ScarAdBase<T> implements IScarAd {
    protected T a;
    protected Context b;
    protected ScarAdMetadata c;
    protected QueryInfoMetadata d;
    protected ScarAdListener e;
    protected IAdsErrorHandler f;

    public ScarAdBase(Context context, ScarAdMetadata scarAdMetadata, QueryInfoMetadata queryInfoMetadata, IAdsErrorHandler iAdsErrorHandler) {
        this.b = context;
        this.c = scarAdMetadata;
        this.d = queryInfoMetadata;
        this.f = iAdsErrorHandler;
    }

    protected abstract void a(AdRequest adRequest, IScarLoadListener iScarLoadListener);

    @Override // com.unity3d.scar.adapter.common.scarads.IScarAd
    public void loadAd(IScarLoadListener iScarLoadListener) {
        if (this.d == null) {
            this.f.handleError(GMAAdsError.QueryNotFoundError(this.c));
            return;
        }
        AdRequest adRequestBuild = new AdRequest.Builder().setAdInfo(new AdInfo(this.d.getQueryInfo(), this.c.getAdString())).build();
        this.e.setLoadListener(iScarLoadListener);
        a(adRequestBuild, iScarLoadListener);
    }

    public void setGmaAd(T t) {
        this.a = t;
    }
}
