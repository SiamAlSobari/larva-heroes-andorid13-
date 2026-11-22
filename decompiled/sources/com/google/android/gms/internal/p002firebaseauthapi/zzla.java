package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzla {

    @Deprecated
    static final zzxr zza;

    @Deprecated
    static final zzxr zzb;

    @Deprecated
    static final zzxr zzc;

    static {
        new zzjn();
        new zzjl();
        zza = zzxr.zzb();
        zzb = zzxr.zzb();
        zzc = zzxr.zzb();
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzlc.zzd();
        zzle.zzd();
        zzcu.zza();
        zzjc.zza();
        if (zzik.zzb()) {
            return;
        }
        zzcq.zzf(new zzjl(), new zzjn(), true);
        int i = zzkf.zza;
        zzkf.zze(zznt.zzc());
        zzcq.zzf(new zzly(), new zzma(), true);
        int i2 = zzky.zza;
        zzky.zze(zznt.zzc());
    }
}
