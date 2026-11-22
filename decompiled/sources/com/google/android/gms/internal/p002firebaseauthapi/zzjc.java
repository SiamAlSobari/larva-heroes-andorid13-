package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzjc {
    public static final String zza;

    @Deprecated
    static final zzxr zzb;

    @Deprecated
    static final zzxr zzc;

    static {
        new zzir();
        zza = "type.googleapis.com/google.crypto.tink.AesSivKey";
        zzb = zzxr.zzb();
        zzc = zzxr.zzb();
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzjg.zzd();
        if (zzik.zzb()) {
            return;
        }
        zzcq.zzg(new zzir(), true);
        int i = zzjb.zza;
        zzjb.zzd(zznt.zzc());
    }
}
