package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzagg implements zzage {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long[] zzf;

    private zzagg(long j, int i, long j2, long j3, long[] jArr) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzf = jArr;
        this.zzd = j3;
        this.zze = j3 != -1 ? j + j3 : -1L;
    }

    public static zzagg zza(long j, long j2, zzabu zzabuVar, zzfb zzfbVar) {
        int iZzo;
        int i = zzabuVar.zzg;
        int i2 = zzabuVar.zzd;
        int iZzf = zzfbVar.zzf();
        if ((iZzf & 1) != 1 || (iZzo = zzfbVar.zzo()) == 0) {
            return null;
        }
        int i3 = iZzf & 6;
        long jZzq = zzfk.zzq(iZzo, ((long) i) * 1000000, i2);
        if (i3 != 6) {
            return new zzagg(j2, zzabuVar.zzc, jZzq, -1L, null);
        }
        long jZzt = zzfbVar.zzt();
        long[] jArr = new long[100];
        for (int i4 = 0; i4 < 100; i4++) {
            jArr[i4] = zzfbVar.zzl();
        }
        if (j != -1) {
            long j3 = j2 + jZzt;
            if (j != j3) {
                zzes.zzf("XingSeeker", "XING data size mismatch: " + j + ", " + j3);
            }
        }
        return new zzagg(j2, zzabuVar.zzc, jZzq, jZzt, jArr);
    }

    private final long zzd(int i) {
        return (this.zzc * ((long) i)) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzage
    public final long zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzage
    public final long zzc(long j) {
        double d;
        long j2 = j - this.zza;
        if (!zzh() || j2 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzf;
        zzdy.zzb(jArr);
        double d2 = j2;
        long j3 = this.zzd;
        Double.isNaN(d2);
        double d3 = j3;
        Double.isNaN(d3);
        double d4 = (d2 * 256.0d) / d3;
        int iZzc = zzfk.zzc(jArr, (long) d4, true, true);
        long jZzd = zzd(iZzc);
        long j4 = jArr[iZzc];
        int i = iZzc + 1;
        long jZzd2 = zzd(i);
        long j5 = iZzc == 99 ? 256L : jArr[i];
        if (j4 == j5) {
            d = 0.0d;
        } else {
            double d5 = j4;
            Double.isNaN(d5);
            double d6 = j5 - j4;
            Double.isNaN(d6);
            d = (d4 - d5) / d6;
        }
        double d7 = jZzd2 - jZzd;
        Double.isNaN(d7);
        return jZzd + Math.round(d * d7);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long j) {
        if (!zzh()) {
            zzacb zzacbVar = new zzacb(0L, this.zza + ((long) this.zzb));
            return new zzaby(zzacbVar, zzacbVar);
        }
        long jMax = Math.max(0L, Math.min(j, this.zzc));
        double d = jMax;
        long j2 = this.zzc;
        Double.isNaN(d);
        double d2 = j2;
        Double.isNaN(d2);
        double d3 = (d * 100.0d) / d2;
        double d4 = 0.0d;
        if (d3 > 0.0d) {
            if (d3 >= 100.0d) {
                d4 = 256.0d;
            } else {
                int i = (int) d3;
                long[] jArr = this.zzf;
                zzdy.zzb(jArr);
                double d5 = jArr[i];
                double d6 = i == 99 ? 256.0d : jArr[i + 1];
                double d7 = i;
                Double.isNaN(d7);
                Double.isNaN(d5);
                Double.isNaN(d5);
                d4 = d5 + ((d3 - d7) * (d6 - d5));
            }
        }
        double d8 = this.zzd;
        Double.isNaN(d8);
        zzacb zzacbVar2 = new zzacb(jMax, this.zza + Math.max(this.zzb, Math.min(Math.round((d4 / 256.0d) * d8), this.zzd - 1)));
        return new zzaby(zzacbVar2, zzacbVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return this.zzf != null;
    }
}
