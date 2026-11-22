package com.unity3d.scar.adapter.v2000.signals;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class SignalsStorage {
    private Map<String, QueryInfoMetadata> a = new HashMap();

    public Map<String, QueryInfoMetadata> getPlacementQueryInfoMap() {
        return this.a;
    }

    public QueryInfoMetadata getQueryInfoMetadata(String str) {
        return this.a.get(str);
    }

    public void put(String str, QueryInfoMetadata queryInfoMetadata) {
        this.a.put(str, queryInfoMetadata);
    }
}
