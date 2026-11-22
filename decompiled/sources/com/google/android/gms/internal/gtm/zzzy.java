package com.google.android.gms.internal.gtm;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzzy {
    zzzy() {
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

    abstract void zzk(Object obj, int i, zzud zzudVar);

    abstract void zzl(Object obj, int i, long j);

    abstract void zzm(Object obj);

    abstract void zzn(Object obj, Object obj2);

    abstract void zzo(Object obj, Object obj2);

    abstract boolean zzq(zzzg zzzgVar);

    abstract void zzr(Object obj, zzur zzurVar) throws IOException;

    abstract void zzs(Object obj, zzur zzurVar) throws IOException;

    final boolean zzp(Object obj, zzzg zzzgVar) throws IOException {
        int iZzd = zzzgVar.zzd();
        int i = iZzd >>> 3;
        int i2 = iZzd & 7;
        if (i2 == 0) {
            zzl(obj, i, zzzgVar.zzl());
            return true;
        }
        if (i2 == 1) {
            zzi(obj, i, zzzgVar.zzk());
            return true;
        }
        if (i2 == 2) {
            zzk(obj, i, zzzgVar.zzp());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzxu.zza();
            }
            zzh(obj, i, zzzgVar.zzf());
            return true;
        }
        Object objZzf = zzf();
        int i3 = i << 3;
        while (zzzgVar.zzc() != Integer.MAX_VALUE && zzp(objZzf, zzzgVar)) {
        }
        if ((4 | i3) != zzzgVar.zzd()) {
            throw zzxu.zzb();
        }
        zzg(objZzf);
        zzj(obj, i, objZzf);
        return true;
    }
}
