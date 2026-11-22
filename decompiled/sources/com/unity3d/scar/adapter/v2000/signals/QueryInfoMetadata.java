package com.unity3d.scar.adapter.v2000.signals;

import com.google.android.gms.ads.query.QueryInfo;

/* JADX INFO: loaded from: classes2.dex */
public class QueryInfoMetadata {
    private String a;
    private QueryInfo b;
    private String c;

    public QueryInfoMetadata(String str) {
        this.a = str;
    }

    public String getError() {
        return this.c;
    }

    public String getPlacementId() {
        return this.a;
    }

    public QueryInfo getQueryInfo() {
        return this.b;
    }

    public String getQueryStr() {
        QueryInfo queryInfo = this.b;
        if (queryInfo != null) {
            return queryInfo.getQuery();
        }
        return null;
    }

    public void setError(String str) {
        this.c = str;
    }

    public void setQueryInfo(QueryInfo queryInfo) {
        this.b = queryInfo;
    }
}
