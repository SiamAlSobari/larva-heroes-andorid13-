package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzckd implements zzdsi {
    private final Long zza;
    private final String zzb;
    private final zzciz zzc;
    private final zzckh zzd;
    private final zzckd zze = this;

    /* synthetic */ zzckd(zzciz zzcizVar, zzckh zzckhVar, Long l, String str, zzckc zzckcVar) {
        this.zzc = zzcizVar;
        this.zzd = zzckhVar;
        this.zza = l;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdsi
    public final zzdss zza() {
        long jLongValue = this.zza.longValue();
        zzckh zzckhVar = this.zzd;
        return zzdst.zza(jLongValue, zzckhVar.zza, zzdsm.zzc(zzckhVar.zzb), this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdsi
    public final zzdsw zzb() {
        long jLongValue = this.zza.longValue();
        zzckh zzckhVar = this.zzd;
        return zzdsx.zza(jLongValue, zzckhVar.zza, zzdsm.zzc(zzckhVar.zzb), this.zzc, this.zzb);
    }
}
