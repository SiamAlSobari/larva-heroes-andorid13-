package com.google.android.recaptcha.internal;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzjf {
    zzjf() {
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

    abstract void zzk(Object obj, int i, zzez zzezVar);

    abstract void zzl(Object obj, int i, long j);

    abstract void zzm(Object obj);

    abstract void zzn(Object obj, Object obj2);

    abstract void zzo(Object obj, Object obj2);

    abstract void zzp(Object obj, zzjx zzjxVar) throws IOException;

    abstract void zzq(Object obj, zzjx zzjxVar) throws IOException;

    abstract boolean zzs(zzik zzikVar);

    final boolean zzr(Object obj, zzik zzikVar) throws IOException {
        int iZzd = zzikVar.zzd();
        int i = iZzd >>> 3;
        int i2 = iZzd & 7;
        if (i2 == 0) {
            zzl(obj, i, zzikVar.zzl());
            return true;
        }
        if (i2 == 1) {
            zzi(obj, i, zzikVar.zzk());
            return true;
        }
        if (i2 == 2) {
            zzk(obj, i, zzikVar.zzp());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzgy.zza();
            }
            zzh(obj, i, zzikVar.zzf());
            return true;
        }
        Object objZzf = zzf();
        int i3 = i << 3;
        while (zzikVar.zzc() != Integer.MAX_VALUE && zzr(objZzf, zzikVar)) {
        }
        if ((4 | i3) != zzikVar.zzd()) {
            throw zzgy.zzb();
        }
        zzg(objZzf);
        zzj(obj, i, objZzf);
        return true;
    }
}
