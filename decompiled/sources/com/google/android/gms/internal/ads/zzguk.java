package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzguk {
    zzguk() {
    }

    abstract int zza(Object obj);

    abstract int zzb(Object obj);

    abstract Object zzc(Object obj);

    abstract Object zzd(Object obj);

    abstract Object zze(Object obj, Object obj2);

    abstract Object zzf();

    abstract Object zzg(Object obj);

    abstract void zzh(Object obj, int i, int i2);

    abstract void zzi(Object obj, int i, long j);

    abstract void zzj(Object obj, int i, Object obj2);

    abstract void zzk(Object obj, int i, zzgqi zzgqiVar);

    abstract void zzl(Object obj, int i, long j);

    abstract void zzm(Object obj);

    abstract void zzn(Object obj, Object obj2);

    abstract void zzo(Object obj, Object obj2);

    abstract boolean zzq(zzgtl zzgtlVar);

    abstract void zzr(Object obj, zzgqy zzgqyVar) throws IOException;

    final boolean zzp(Object obj, zzgtl zzgtlVar) throws IOException {
        int iZzd = zzgtlVar.zzd();
        int i = iZzd >>> 3;
        int i2 = iZzd & 7;
        if (i2 == 0) {
            zzl(obj, i, zzgtlVar.zzl());
            return true;
        }
        if (i2 == 1) {
            zzi(obj, i, zzgtlVar.zzk());
            return true;
        }
        if (i2 == 2) {
            zzk(obj, i, zzgtlVar.zzp());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzgsc.zza();
            }
            zzh(obj, i, zzgtlVar.zzf());
            return true;
        }
        Object objZzf = zzf();
        int i3 = i << 3;
        while (zzgtlVar.zzc() != Integer.MAX_VALUE && zzp(objZzf, zzgtlVar)) {
        }
        if ((4 | i3) != zzgtlVar.zzd()) {
            throw zzgsc.zzb();
        }
        zzg(objZzf);
        zzj(obj, i, objZzf);
        return true;
    }
}
