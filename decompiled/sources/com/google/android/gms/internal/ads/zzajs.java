package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzajs {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfi zza = new zzfi(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzfb zzb = new zzfb();

    zzajs(int i) {
    }

    private final int zze(zzabc zzabcVar) {
        zzfb zzfbVar = this.zzb;
        byte[] bArr = zzfk.zzf;
        int length = bArr.length;
        zzfbVar.zzE(bArr, 0);
        this.zzc = true;
        zzabcVar.zzj();
        return 0;
    }

    public final int zza(zzabc zzabcVar, zzabx zzabxVar, int i) throws IOException {
        if (i <= 0) {
            zze(zzabcVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.zze) {
            long jZzd = zzabcVar.zzd();
            int iMin = (int) Math.min(112800L, jZzd);
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
            int iZzd = zzfbVar.zzd();
            for (int i2 = iZzd - 188; i2 >= iZzc; i2--) {
                byte[] bArrZzI = zzfbVar.zzI();
                int i3 = 0;
                for (int i4 = -4; i4 <= 4; i4++) {
                    int i5 = (i4 * 188) + i2;
                    if (i5 >= iZzc && i5 < iZzd && bArrZzI[i5] == 71) {
                        i3++;
                        if (i3 == 5) {
                            long jZzb = zzakc.zzb(zzfbVar, i2, i);
                            if (jZzb == -9223372036854775807L) {
                                break;
                            }
                            j = jZzb;
                            break;
                        }
                    } else {
                        i3 = 0;
                    }
                }
            }
            this.zzg = j;
            this.zze = true;
            return 0;
        }
        if (this.zzg == -9223372036854775807L) {
            zze(zzabcVar);
            return 0;
        }
        if (this.zzd) {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zze(zzabcVar);
                return 0;
            }
            long jZzb2 = this.zza.zzb(this.zzg) - this.zza.zzb(j3);
            this.zzh = jZzb2;
            if (jZzb2 < 0) {
                zzes.zzf("TsDurationReader", "Invalid duration: " + jZzb2 + ". Using TIME_UNSET instead.");
                this.zzh = -9223372036854775807L;
            }
            zze(zzabcVar);
            return 0;
        }
        int iMin2 = (int) Math.min(112800L, zzabcVar.zzd());
        if (zzabcVar.zzf() != 0) {
            zzabxVar.zza = 0L;
            return 1;
        }
        this.zzb.zzD(iMin2);
        zzabcVar.zzj();
        ((zzaar) zzabcVar).zzm(this.zzb.zzI(), 0, iMin2, false);
        zzfb zzfbVar2 = this.zzb;
        int iZzd2 = zzfbVar2.zzd();
        for (int iZzc2 = zzfbVar2.zzc(); iZzc2 < iZzd2; iZzc2++) {
            if (zzfbVar2.zzI()[iZzc2] == 71) {
                long jZzb3 = zzakc.zzb(zzfbVar2, iZzc2, i);
                if (jZzb3 != -9223372036854775807L) {
                    j = jZzb3;
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

    public final zzfi zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
