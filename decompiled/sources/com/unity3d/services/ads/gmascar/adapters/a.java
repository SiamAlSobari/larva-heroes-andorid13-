package com.unity3d.services.ads.gmascar.adapters;

import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.IScarAdapter;
import com.unity3d.scar.adapter.v2000.ScarAdapter;

/* JADX INFO: compiled from: ScarAdapterFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    public IScarAdapter a(long j, IAdsErrorHandler iAdsErrorHandler) {
        if (j >= 210402000) {
            return new ScarAdapter(iAdsErrorHandler);
        }
        if (j >= 203404000 && j <= 204890000) {
            return new com.unity3d.scar.adapter.v1950.ScarAdapter(iAdsErrorHandler);
        }
        if (j >= 201604000) {
            return new com.unity3d.scar.adapter.v1920.ScarAdapter(iAdsErrorHandler);
        }
        String str = String.format("SCAR version %s is not supported.", Long.valueOf(j));
        iAdsErrorHandler.handleError(GMAAdsError.AdapterCreationError(str));
        com.unity3d.services.core.log.a.b(str);
        return null;
    }
}
