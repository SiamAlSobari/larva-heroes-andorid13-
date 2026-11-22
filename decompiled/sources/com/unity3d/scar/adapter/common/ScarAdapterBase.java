package com.unity3d.scar.adapter.common;

import android.app.Activity;
import android.content.Context;
import com.unity3d.scar.adapter.common.scarads.IScarAd;
import com.unity3d.scar.adapter.common.signals.ISignalCollectionListener;
import com.unity3d.scar.adapter.common.signals.ISignalsReader;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ScarAdapterBase implements IScarAdapter {
    protected ISignalsReader a;
    protected Map<String, IScarAd> b = new ConcurrentHashMap();
    protected IScarAd c;
    protected IAdsErrorHandler d;

    class a implements Runnable {
        final /* synthetic */ Activity a;

        a(Activity activity) {
            this.a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            ScarAdapterBase.this.c.show(this.a);
        }
    }

    public ScarAdapterBase(IAdsErrorHandler iAdsErrorHandler) {
        this.d = iAdsErrorHandler;
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    public void getSCARSignals(Context context, String[] strArr, String[] strArr2, ISignalCollectionListener iSignalCollectionListener) {
        this.a.getSCARSignals(context, strArr, strArr2, iSignalCollectionListener);
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    public void show(Activity activity, String str, String str2) {
        IScarAd iScarAd = this.b.get(str2);
        if (iScarAd != null) {
            this.c = iScarAd;
            Utils.runOnUiThread(new a(activity));
            return;
        }
        this.d.handleError(GMAAdsError.NoAdsError(str2, str, "Could not find ad for placement '" + str2 + "'."));
    }
}
