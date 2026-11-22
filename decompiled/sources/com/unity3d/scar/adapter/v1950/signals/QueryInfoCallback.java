package com.unity3d.scar.adapter.v1950.signals;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.unity3d.scar.adapter.common.DispatchGroup;

/* JADX INFO: loaded from: classes2.dex */
public class QueryInfoCallback extends QueryInfoGenerationCallback {
    private DispatchGroup a;
    private QueryInfoMetadata b;

    public QueryInfoCallback(QueryInfoMetadata queryInfoMetadata, DispatchGroup dispatchGroup) {
        this.a = dispatchGroup;
        this.b = queryInfoMetadata;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onFailure(String str) {
        this.b.setError(str);
        this.a.leave();
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onSuccess(QueryInfo queryInfo) {
        this.b.setQueryInfo(queryInfo);
        this.a.leave();
    }
}
