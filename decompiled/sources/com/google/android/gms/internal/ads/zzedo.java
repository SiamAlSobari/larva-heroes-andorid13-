package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzedo implements zzedn {
    public final zzedn zza;
    private final zzfqw zzb;

    public zzedo(zzedn zzednVar, zzfqw zzfqwVar) {
        this.zza = zzednVar;
        this.zzb = zzfqwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final ListenableFuture zza(zzfbr zzfbrVar, zzfbe zzfbeVar) {
        return zzfye.zzm(this.zza.zza(zzfbrVar, zzfbeVar), this.zzb, zzcan.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final boolean zzb(zzfbr zzfbrVar, zzfbe zzfbeVar) {
        return this.zza.zzb(zzfbrVar, zzfbeVar);
    }
}
