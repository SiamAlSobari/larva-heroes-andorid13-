package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzahn implements zzaht {
    private final zzabo zza;
    private final zzabn zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzahn(zzabo zzaboVar, zzabn zzabnVar) {
        this.zza = zzaboVar;
        this.zzb = zzabnVar;
    }

    public final void zza(long j) {
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final long zzd(zzabc zzabcVar) {
        long j = this.zzd;
        if (j < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final zzaca zze() {
        zzdy.zzf(this.zzc != -1);
        return new zzabm(this.zza, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void zzg(long j) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzfk.zzc(jArr, j, true, true)];
    }
}
