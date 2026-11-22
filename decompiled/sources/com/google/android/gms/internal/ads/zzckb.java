package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzckb implements zzdsh {
    private final zzciz zza;
    private final zzckh zzb;
    private Long zzc;
    private String zzd;

    /* synthetic */ zzckb(zzciz zzcizVar, zzckh zzckhVar, zzcka zzckaVar) {
        this.zza = zzcizVar;
        this.zzb = zzckhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdsh
    public final /* synthetic */ zzdsh zza(String str) {
        str.getClass();
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdsh
    public final /* bridge */ /* synthetic */ zzdsh zzb(long j) {
        this.zzc = Long.valueOf(j);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdsh
    public final zzdsi zzc() {
        zzgzb.zzc(this.zzc, Long.class);
        zzgzb.zzc(this.zzd, String.class);
        return new zzckd(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
