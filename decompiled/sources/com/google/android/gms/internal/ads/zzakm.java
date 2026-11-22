package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzakm implements zzaca {
    private final zzakj zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzakm(zzakj zzakjVar, int i, long j, long j2) {
        this.zza = zzakjVar;
        this.zzb = i;
        this.zzc = j;
        long j3 = (j2 - j) / ((long) zzakjVar.zzd);
        this.zzd = j3;
        this.zze = zza(j3);
    }

    private final long zza(long j) {
        return zzfk.zzq(j * ((long) this.zzb), 1000000L, this.zza.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long j) {
        long jMax = Math.max(0L, Math.min((((long) this.zza.zzc) * j) / (((long) this.zzb) * 1000000), this.zzd - 1));
        long j2 = this.zzc + (((long) this.zza.zzd) * jMax);
        long jZza = zza(jMax);
        zzacb zzacbVar = new zzacb(jZza, j2);
        if (jZza >= j || jMax == this.zzd - 1) {
            return new zzaby(zzacbVar, zzacbVar);
        }
        long j3 = jMax + 1;
        return new zzaby(zzacbVar, new zzacb(zza(j3), this.zzc + (((long) this.zza.zzd) * j3)));
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return true;
    }
}
