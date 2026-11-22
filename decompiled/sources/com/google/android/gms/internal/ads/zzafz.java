package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzafz implements zzage {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzafz(long[] jArr, long[] jArr2, long j) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j == -9223372036854775807L ? zzfk.zzp(jArr2[jArr2.length - 1]) : j;
    }

    public static zzafz zza(long j, zzaew zzaewVar, long j2) {
        int length = zzaewVar.zzd.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (zzaewVar.zzb + zzaewVar.zzd[i3]);
            j3 += (long) (zzaewVar.zzc + zzaewVar.zze[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new zzafz(jArr, jArr2, j2);
    }

    private static Pair zzd(long j, long[] jArr, long[] jArr2) {
        double d;
        int iZzc = zzfk.zzc(jArr, j, true, true);
        long j2 = jArr[iZzc];
        long j3 = jArr2[iZzc];
        int i = iZzc + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        long j5 = jArr2[i];
        if (j4 == j2) {
            d = 0.0d;
        } else {
            double d2 = j;
            double d3 = j2;
            Double.isNaN(d2);
            Double.isNaN(d3);
            double d4 = j4 - j2;
            Double.isNaN(d4);
            d = (d2 - d3) / d4;
        }
        double d5 = j5 - j3;
        Double.isNaN(d5);
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) (d * d5)) + j3));
    }

    @Override // com.google.android.gms.internal.ads.zzage
    public final long zzb() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzage
    public final long zzc(long j) {
        return zzfk.zzp(((Long) zzd(j, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long j) {
        Pair pairZzd = zzd(zzfk.zzr(Math.max(0L, Math.min(j, this.zzc))), this.zzb, this.zza);
        zzacb zzacbVar = new zzacb(zzfk.zzp(((Long) pairZzd.first).longValue()), ((Long) pairZzd.second).longValue());
        return new zzaby(zzacbVar, zzacbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return true;
    }
}
