package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcrw {
    private final zzcyx zza;
    private final zzdbe zzb;

    public zzcrw(zzcyx zzcyxVar, zzdbe zzdbeVar) {
        this.zza = zzcyxVar;
        this.zzb = zzdbeVar;
    }

    public final zzcyx zza() {
        return this.zza;
    }

    final zzdbe zzb() {
        return this.zzb;
    }

    final zzddo zzc() {
        zzdbe zzdbeVar = this.zzb;
        return zzdbeVar != null ? new zzddo(zzdbeVar, zzcan.zzf) : new zzddo(new zzcrv(this), zzcan.zzf);
    }
}
