package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgjd {

    @Deprecated
    static final zzgnz zza;

    @Deprecated
    static final zzgnz zzb;

    @Deprecated
    static final zzgnz zzc;

    static {
        new zzgiw();
        zzgnz zzgnzVarZzc = zzgnz.zzc();
        zza = zzgnzVarZzc;
        zzb = zzgnzVarZzc;
        zzc = zzgnzVarZzc;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzgji.zze();
        zzgin.zzd();
        zzgiw.zzh(true);
        if (zzgfk.zzb()) {
            return;
        }
        zzghz.zzm(true);
    }
}
