package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgsv {
    zzgsv() {
    }

    public static final boolean zza(Object obj) {
        return !((zzgsu) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzgsu zzgsuVarZzb = (zzgsu) obj;
        zzgsu zzgsuVar = (zzgsu) obj2;
        if (!zzgsuVar.isEmpty()) {
            if (!zzgsuVarZzb.zze()) {
                zzgsuVarZzb = zzgsuVarZzb.zzb();
            }
            zzgsuVarZzb.zzd(zzgsuVar);
        }
        return zzgsuVarZzb;
    }
}
