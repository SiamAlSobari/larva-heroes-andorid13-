package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzado extends zzabp {
    private final long zza;

    public zzado(zzabc zzabcVar, long j) {
        super(zzabcVar);
        zzdy.zzd(zzabcVar.zzf() >= j);
        this.zza = j;
    }

    @Override // com.google.android.gms.internal.ads.zzabp, com.google.android.gms.internal.ads.zzabc
    public final long zzd() {
        return super.zzd() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabp, com.google.android.gms.internal.ads.zzabc
    public final long zze() {
        return super.zze() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabp, com.google.android.gms.internal.ads.zzabc
    public final long zzf() {
        return super.zzf() - this.zza;
    }
}
