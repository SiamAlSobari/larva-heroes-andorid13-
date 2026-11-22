package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzaaq implements zzaca {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzaaq(long j, long j2, int i, int i2, boolean z) {
        long jZzb;
        this.zza = j;
        this.zzb = j2;
        this.zzc = i2 == -1 ? 1 : i2;
        this.zze = i;
        if (j == -1) {
            this.zzd = -1L;
            jZzb = -9223372036854775807L;
        } else {
            this.zzd = j - j2;
            jZzb = zzb(j, j2, i);
        }
        this.zzf = jZzb;
    }

    private static long zzb(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / ((long) i);
    }

    public final long zza(long j) {
        return zzb(j, this.zzb, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long j) {
        long j2 = this.zzd;
        if (j2 == -1) {
            zzacb zzacbVar = new zzacb(0L, this.zzb);
            return new zzaby(zzacbVar, zzacbVar);
        }
        long j3 = ((long) this.zze) * j;
        long j4 = this.zzc;
        long jMin = ((j3 / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j4);
        }
        long jMax = this.zzb + Math.max(jMin, 0L);
        long jZza = zza(jMax);
        zzacb zzacbVar2 = new zzacb(jZza, jMax);
        if (this.zzd != -1 && jZza < j) {
            long j5 = jMax + ((long) this.zzc);
            if (j5 < this.zza) {
                return new zzaby(zzacbVar2, new zzacb(zza(j5), j5));
            }
        }
        return new zzaby(zzacbVar2, zzacbVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return this.zzd != -1;
    }
}
