package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcw {
    public static final zzcw zza = new zzcr();
    private static final String zzc = Integer.toString(0, 36);
    private static final String zzd = Integer.toString(1, 36);
    private static final String zze = Integer.toString(2, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzcq
    };

    protected zzcw() {
    }

    public final boolean equals(Object obj) {
        int iZzh;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcw)) {
            return false;
        }
        zzcw zzcwVar = (zzcw) obj;
        if (zzcwVar.zzc() == zzc() && zzcwVar.zzb() == zzb()) {
            zzcv zzcvVar = new zzcv();
            zzct zzctVar = new zzct();
            zzcv zzcvVar2 = new zzcv();
            zzct zzctVar2 = new zzct();
            for (int i = 0; i < zzc(); i++) {
                if (!zze(i, zzcvVar, 0L).equals(zzcwVar.zze(i, zzcvVar2, 0L))) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < zzb(); i2++) {
                if (!zzd(i2, zzctVar, true).equals(zzcwVar.zzd(i2, zzctVar2, true))) {
                    return false;
                }
            }
            int iZzg = zzg(true);
            if (iZzg == zzcwVar.zzg(true) && (iZzh = zzh(true)) == zzcwVar.zzh(true)) {
                while (iZzg != iZzh) {
                    int iZzj = zzj(iZzg, 0, true);
                    if (iZzj != zzcwVar.zzj(iZzg, 0, true)) {
                        return false;
                    }
                    iZzg = iZzj;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        zzcv zzcvVar = new zzcv();
        zzct zzctVar = new zzct();
        int iZzc = zzc() + 217;
        for (int i = 0; i < zzc(); i++) {
            iZzc = (iZzc * 31) + zze(i, zzcvVar, 0L).hashCode();
        }
        int iZzb = (iZzc * 31) + zzb();
        for (int i2 = 0; i2 < zzb(); i2++) {
            iZzb = (iZzb * 31) + zzd(i2, zzctVar, true).hashCode();
        }
        int iZzg = zzg(true);
        while (iZzg != -1) {
            iZzb = (iZzb * 31) + iZzg;
            iZzg = zzj(iZzg, 0, true);
        }
        return iZzb;
    }

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzct zzd(int i, zzct zzctVar, boolean z);

    public abstract zzcv zze(int i, zzcv zzcvVar, long j);

    public abstract Object zzf(int i);

    public int zzg(boolean z) {
        return zzo() ? -1 : 0;
    }

    public int zzh(boolean z) {
        if (zzo()) {
            return -1;
        }
        return zzc() - 1;
    }

    public final int zzi(int i, zzct zzctVar, zzcv zzcvVar, int i2, boolean z) {
        int i3 = zzd(i, zzctVar, false).zzd;
        if (zze(i3, zzcvVar, 0L).zzq != i) {
            return i + 1;
        }
        int iZzj = zzj(i3, i2, z);
        if (iZzj == -1) {
            return -1;
        }
        return zze(iZzj, zzcvVar, 0L).zzp;
    }

    public int zzj(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == zzh(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == zzh(z) ? zzg(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public int zzk(int i, int i2, boolean z) {
        if (i == zzg(false)) {
            return -1;
        }
        return i - 1;
    }

    public final Pair zzl(zzcv zzcvVar, zzct zzctVar, int i, long j) {
        Pair pairZzm = zzm(zzcvVar, zzctVar, i, j, 0L);
        pairZzm.getClass();
        return pairZzm;
    }

    public final Pair zzm(zzcv zzcvVar, zzct zzctVar, int i, long j, long j2) {
        zzdy.zza(i, 0, zzc());
        zze(i, zzcvVar, j2);
        if (j == -9223372036854775807L) {
            long j3 = zzcvVar.zzn;
            j = 0;
        }
        int i2 = zzcvVar.zzp;
        zzd(i2, zzctVar, false);
        while (i2 < zzcvVar.zzq) {
            long j4 = zzctVar.zzf;
            if (j == 0) {
                break;
            }
            int i3 = i2 + 1;
            long j5 = zzd(i3, zzctVar, false).zzf;
            if (j < 0) {
                break;
            }
            i2 = i3;
        }
        zzd(i2, zzctVar, true);
        long j6 = zzctVar.zzf;
        long j7 = zzctVar.zze;
        if (j7 != -9223372036854775807L) {
            j = Math.min(j, j7 - 1);
        }
        long jMax = Math.max(0L, j);
        Object obj = zzctVar.zzc;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public zzct zzn(Object obj, zzct zzctVar) {
        return zzd(zza(obj), zzctVar, true);
    }

    public final boolean zzo() {
        return zzc() == 0;
    }
}
