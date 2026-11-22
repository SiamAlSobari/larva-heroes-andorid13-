package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzexz implements zzfeh {
    private final zzeyv zza;

    public zzexz(zzeyv zzeyvVar) {
        this.zza = zzeyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfeh
    public final ListenableFuture zza(zzfei zzfeiVar) {
        zzeya zzeyaVar = (zzeya) zzfeiVar;
        return ((zzexw) this.zza).zzb(zzeyaVar.zzb, zzeyaVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfeh
    public final void zzb(zzfdw zzfdwVar) {
        zzfdwVar.zza = ((zzexw) this.zza).zza();
    }
}
