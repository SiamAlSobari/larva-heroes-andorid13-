package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcsg implements zzcsh {
    private final Map zza;

    zzcsg(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcsh
    public final zzedn zza(int i, String str) {
        return (zzedn) this.zza.get(str);
    }
}
