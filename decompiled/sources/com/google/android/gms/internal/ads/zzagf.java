package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzagf implements zzage {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;

    private zzagf(long[] jArr, long[] jArr2, long j, long j2) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzagf zza(long j, long j2, zzabu zzabuVar, zzfb zzfbVar) {
        int iZzl;
        zzfbVar.zzH(10);
        int iZzf = zzfbVar.zzf();
        if (iZzf <= 0) {
            return null;
        }
        int i = zzabuVar.zzd;
        long jZzq = zzfk.zzq(iZzf, ((long) (i >= 32000 ? 1152 : 576)) * 1000000, i);
        int iZzp = zzfbVar.zzp();
        int iZzp2 = zzfbVar.zzp();
        int iZzp3 = zzfbVar.zzp();
        zzfbVar.zzH(2);
        long j3 = j2 + ((long) zzabuVar.zzc);
        long[] jArr = new long[iZzp];
        long[] jArr2 = new long[iZzp];
        int i2 = 0;
        long j4 = j2;
        while (i2 < iZzp) {
            int i3 = iZzp2;
            long j5 = j3;
            jArr[i2] = (((long) i2) * jZzq) / ((long) iZzp);
            jArr2[i2] = Math.max(j4, j5);
            if (iZzp3 == 1) {
                iZzl = zzfbVar.zzl();
            } else if (iZzp3 == 2) {
                iZzl = zzfbVar.zzp();
            } else if (iZzp3 == 3) {
                iZzl = zzfbVar.zzn();
            } else {
                if (iZzp3 != 4) {
                    return null;
                }
                iZzl = zzfbVar.zzo();
            }
            j4 += ((long) iZzl) * ((long) i3);
            i2++;
            j3 = j5;
            iZzp2 = i3;
            iZzp = iZzp;
        }
        if (j != -1 && j != j4) {
            zzes.zzf("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new zzagf(jArr, jArr2, jZzq, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzage
    public final long zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzage
    public final long zzc(long j) {
        return this.zza[zzfk.zzc(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long j) {
        int iZzc = zzfk.zzc(this.zza, j, true, true);
        zzacb zzacbVar = new zzacb(this.zza[iZzc], this.zzb[iZzc]);
        if (zzacbVar.zzb < j) {
            long[] jArr = this.zza;
            if (iZzc != jArr.length - 1) {
                int i = iZzc + 1;
                return new zzaby(zzacbVar, new zzacb(jArr[i], this.zzb[i]));
            }
        }
        return new zzaby(zzacbVar, zzacbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return true;
    }
}
