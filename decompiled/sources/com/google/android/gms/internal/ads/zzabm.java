package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzabm implements zzaca {
    private final zzabo zza;
    private final long zzb;

    public zzabm(zzabo zzaboVar, long j) {
        this.zza = zzaboVar;
        this.zzb = j;
    }

    private final zzacb zza(long j, long j2) {
        return new zzacb((j * 1000000) / ((long) this.zza.zze), this.zzb + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long j) {
        zzdy.zzb(this.zza.zzk);
        zzabo zzaboVar = this.zza;
        zzabn zzabnVar = zzaboVar.zzk;
        long[] jArr = zzabnVar.zza;
        long[] jArr2 = zzabnVar.zzb;
        int iZzc = zzfk.zzc(jArr, zzaboVar.zzb(j), true, false);
        zzacb zzacbVarZza = zza(iZzc == -1 ? 0L : jArr[iZzc], iZzc != -1 ? jArr2[iZzc] : 0L);
        if (zzacbVarZza.zzb == j || iZzc == jArr.length - 1) {
            return new zzaby(zzacbVarZza, zzacbVarZza);
        }
        int i = iZzc + 1;
        return new zzaby(zzacbVarZza, zza(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return true;
    }
}
