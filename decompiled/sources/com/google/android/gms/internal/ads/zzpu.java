package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzpu {
    private final zzdr[] zza;
    private final zzqm zzb;
    private final zzdu zzc;

    public zzpu(zzdr... zzdrVarArr) {
        zzqm zzqmVar = new zzqm();
        zzdu zzduVar = new zzdu();
        zzdr[] zzdrVarArr2 = {zzqmVar, zzduVar};
        this.zza = zzdrVarArr2;
        System.arraycopy(zzdrVarArr, 0, zzdrVarArr2, 0, 0);
        this.zzb = zzqmVar;
        this.zzc = zzduVar;
    }

    public final long zza(long j) {
        return this.zzc.zzi(j);
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzch zzc(zzch zzchVar) {
        this.zzc.zzk(zzchVar.zzc);
        this.zzc.zzj(zzchVar.zzd);
        return zzchVar;
    }

    public final boolean zzd(boolean z) {
        this.zzb.zzp(z);
        return z;
    }

    public final zzdr[] zze() {
        return this.zza;
    }
}
