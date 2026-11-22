package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbip implements zzbir {
    zzbip() {
    }

    @Override // com.google.android.gms.internal.ads.zzbir
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfi zzcfiVar = (zzcfi) obj;
        if (map.keySet().contains("start")) {
            zzcfiVar.zzas(true);
        }
        if (map.keySet().contains("stop")) {
            zzcfiVar.zzas(false);
        }
    }
}
