package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzqq {

    @Deprecated
    static final zzxr zza;

    @Deprecated
    static final zzxr zzb;

    @Deprecated
    static final zzxr zzc;

    static {
        new zzqj();
        zzxr zzxrVarZzb = zzxr.zzb();
        zza = zzxrVarZzb;
        zzb = zzxrVarZzb;
        zzc = zzxrVarZzb;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzqw.zzd();
        zzqa.zzd();
        zzqj.zzh(true);
        if (zzik.zzb()) {
            return;
        }
        zzpm.zzm(true);
    }
}
