package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaao {
    public static void zza(long j, zzfb zzfbVar, zzace[] zzaceVarArr) {
        int iZzf;
        while (true) {
            if (zzfbVar.zza() <= 1) {
                return;
            }
            int iZzc = zzc(zzfbVar);
            int iZzc2 = zzc(zzfbVar);
            int iZzc3 = zzfbVar.zzc() + iZzc2;
            if (iZzc2 == -1 || iZzc2 > zzfbVar.zza()) {
                zzes.zzf("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iZzc3 = zzfbVar.zzd();
            } else if (iZzc == 4 && iZzc2 >= 8) {
                int iZzl = zzfbVar.zzl();
                int iZzp = zzfbVar.zzp();
                if (iZzp == 49) {
                    iZzf = zzfbVar.zzf();
                    iZzp = 49;
                } else {
                    iZzf = 0;
                }
                int iZzl2 = zzfbVar.zzl();
                if (iZzp == 47) {
                    zzfbVar.zzH(1);
                    iZzp = 47;
                }
                boolean z = iZzl == 181 && (iZzp == 49 || iZzp == 47) && iZzl2 == 3;
                if (iZzp == 49) {
                    z &= iZzf == 1195456820;
                }
                if (z) {
                    zzb(j, zzfbVar, zzaceVarArr);
                }
            }
            zzfbVar.zzG(iZzc3);
        }
    }

    public static void zzb(long j, zzfb zzfbVar, zzace[] zzaceVarArr) {
        int iZzl = zzfbVar.zzl();
        if ((iZzl & 64) != 0) {
            int i = iZzl & 31;
            zzfbVar.zzH(1);
            int iZzc = zzfbVar.zzc();
            for (zzace zzaceVar : zzaceVarArr) {
                int i2 = i * 3;
                zzfbVar.zzG(iZzc);
                zzaceVar.zzq(zzfbVar, i2);
                if (j != -9223372036854775807L) {
                    zzaceVar.zzs(j, 1, i2, 0, null);
                }
            }
        }
    }

    private static int zzc(zzfb zzfbVar) {
        int i = 0;
        while (zzfbVar.zza() != 0) {
            int iZzl = zzfbVar.zzl();
            i += iZzl;
            if (iZzl != 255) {
                return i;
            }
        }
        return -1;
    }
}
