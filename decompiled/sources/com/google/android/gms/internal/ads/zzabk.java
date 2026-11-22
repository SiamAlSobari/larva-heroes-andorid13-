package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzabk {
    public static int zza(zzfb zzfbVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzfbVar.zzl() + 1;
            case 7:
                return zzfbVar.zzp() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static long zzb(zzabc zzabcVar, zzabo zzaboVar) throws IOException {
        zzabcVar.zzj();
        zzaar zzaarVar = (zzaar) zzabcVar;
        zzaarVar.zzl(1, false);
        byte[] bArr = new byte[1];
        zzaarVar.zzm(bArr, 0, 1, false);
        int i = bArr[0] & 1;
        boolean z = 1 == i;
        zzaarVar.zzl(2, false);
        int i2 = 1 != i ? 6 : 7;
        zzfb zzfbVar = new zzfb(i2);
        zzfbVar.zzF(zzabf.zza(zzabcVar, zzfbVar.zzI(), 0, i2));
        zzabcVar.zzj();
        zzabj zzabjVar = new zzabj();
        if (zzd(zzfbVar, zzaboVar, z, zzabjVar)) {
            return zzabjVar.zza;
        }
        throw zzcd.zza(null, null);
    }

    public static boolean zzc(zzfb zzfbVar, zzabo zzaboVar, int i, zzabj zzabjVar) {
        int iZza;
        int iZzc = zzfbVar.zzc();
        long jZzt = zzfbVar.zzt();
        long j = jZzt >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        long j2 = jZzt >> 12;
        long j3 = jZzt >> 8;
        long j4 = jZzt >> 4;
        long j5 = jZzt >> 1;
        long j6 = jZzt & 1;
        int i2 = (int) (j4 & 15);
        if (i2 <= 7) {
            if (i2 != zzaboVar.zzg - 1) {
                return false;
            }
        } else if (i2 > 10 || zzaboVar.zzg != 2) {
            return false;
        }
        int i3 = (int) (j5 & 7);
        if (!(i3 == 0 || i3 == zzaboVar.zzi) || j6 == 1 || !zzd(zzfbVar, zzaboVar, z, zzabjVar) || (iZza = zza(zzfbVar, (int) (j2 & 15))) == -1 || iZza > zzaboVar.zzb) {
            return false;
        }
        int i4 = zzaboVar.zze;
        int i5 = (int) (j3 & 15);
        if (i5 != 0) {
            if (i5 <= 11) {
                if (i5 != zzaboVar.zzf) {
                    return false;
                }
            } else if (i5 == 12) {
                if (zzfbVar.zzl() * 1000 != i4) {
                    return false;
                }
            } else {
                if (i5 > 14) {
                    return false;
                }
                int iZzp = zzfbVar.zzp();
                if (i5 == 14) {
                    iZzp *= 10;
                }
                if (iZzp != i4) {
                    return false;
                }
            }
        }
        return zzfbVar.zzl() == zzfk.zze(zzfbVar.zzI(), iZzc, zzfbVar.zzc() + (-1), 0);
    }

    private static boolean zzd(zzfb zzfbVar, zzabo zzaboVar, boolean z, zzabj zzabjVar) {
        try {
            long jZzv = zzfbVar.zzv();
            if (!z) {
                jZzv *= (long) zzaboVar.zzb;
            }
            zzabjVar.zza = jZzv;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
