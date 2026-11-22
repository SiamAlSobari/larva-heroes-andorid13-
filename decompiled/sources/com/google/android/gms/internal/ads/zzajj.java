package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzajj {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfi zza = new zzfi(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzfb zzb = new zzfb();

    zzajj() {
    }

    public static long zzc(zzfb zzfbVar) {
        int iZzc = zzfbVar.zzc();
        if (zzfbVar.zza() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzfbVar.zzC(bArr, 0, 9);
        zzfbVar.zzG(iZzc);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    private final int zzf(zzabc zzabcVar) {
        zzfb zzfbVar = this.zzb;
        byte[] bArr = zzfk.zzf;
        int length = bArr.length;
        zzfbVar.zzE(bArr, 0);
        this.zzc = true;
        zzabcVar.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final int zza(zzabc zzabcVar, zzabx zzabxVar) throws IOException {
        long j = -9223372036854775807L;
        if (!this.zze) {
            long jZzd = zzabcVar.zzd();
            int iMin = (int) Math.min(20000L, jZzd);
            long j2 = jZzd - ((long) iMin);
            if (zzabcVar.zzf() != j2) {
                zzabxVar.zza = j2;
                return 1;
            }
            this.zzb.zzD(iMin);
            zzabcVar.zzj();
            ((zzaar) zzabcVar).zzm(this.zzb.zzI(), 0, iMin, false);
            zzfb zzfbVar = this.zzb;
            int iZzc = zzfbVar.zzc();
            for (int iZzd = zzfbVar.zzd() - 4; iZzd >= iZzc; iZzd--) {
                if (zzg(zzfbVar.zzI(), iZzd) == 442) {
                    zzfbVar.zzG(iZzd + 4);
                    long jZzc = zzc(zzfbVar);
                    if (jZzc != -9223372036854775807L) {
                        j = jZzc;
                        break;
                    }
                }
            }
            this.zzg = j;
            this.zze = true;
            return 0;
        }
        if (this.zzg == -9223372036854775807L) {
            zzf(zzabcVar);
            return 0;
        }
        if (this.zzd) {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zzf(zzabcVar);
                return 0;
            }
            long jZzb = this.zza.zzb(this.zzg) - this.zza.zzb(j3);
            this.zzh = jZzb;
            if (jZzb < 0) {
                zzes.zzf("PsDurationReader", "Invalid duration: " + jZzb + ". Using TIME_UNSET instead.");
                this.zzh = -9223372036854775807L;
            }
            zzf(zzabcVar);
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, zzabcVar.zzd());
        if (zzabcVar.zzf() != 0) {
            zzabxVar.zza = 0L;
            return 1;
        }
        this.zzb.zzD(iMin2);
        zzabcVar.zzj();
        ((zzaar) zzabcVar).zzm(this.zzb.zzI(), 0, iMin2, false);
        zzfb zzfbVar2 = this.zzb;
        int iZzd2 = zzfbVar2.zzd();
        for (int iZzc2 = zzfbVar2.zzc(); iZzc2 < iZzd2 - 3; iZzc2++) {
            if (zzg(zzfbVar2.zzI(), iZzc2) == 442) {
                zzfbVar2.zzG(iZzc2 + 4);
                long jZzc2 = zzc(zzfbVar2);
                if (jZzc2 != -9223372036854775807L) {
                    j = jZzc2;
                    break;
                }
            }
        }
        this.zzf = j;
        this.zzd = true;
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzfi zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
