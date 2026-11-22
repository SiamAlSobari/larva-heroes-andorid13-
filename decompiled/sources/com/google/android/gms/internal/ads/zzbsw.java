package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbsw extends zzbsq {
    final /* synthetic */ List zza;

    zzbsw(zzbsz zzbszVar, List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void zze(String str) {
        zzcaa.zzg("Error recording impression urls: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void zzf(List list) {
        zzcaa.zzi("Recorded impression urls: ".concat(this.zza.toString()));
    }
}
