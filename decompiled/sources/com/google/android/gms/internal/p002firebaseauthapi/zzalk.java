package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzalk {
    zzalk() {
    }

    public static final boolean zza(Object obj) {
        return !((zzalj) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzalj zzaljVarZzb = (zzalj) obj;
        zzalj zzaljVar = (zzalj) obj2;
        if (!zzaljVar.isEmpty()) {
            if (!zzaljVarZzb.zze()) {
                zzaljVarZzb = zzaljVarZzb.zzb();
            }
            zzaljVarZzb.zzd(zzaljVar);
        }
        return zzaljVarZzb;
    }
}
