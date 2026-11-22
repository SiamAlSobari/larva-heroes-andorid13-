package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzggm {
    private final zzgpo zza;
    private final Class zzb;

    /* synthetic */ zzggm(zzgpo zzgpoVar, Class cls, zzggl zzgglVar) {
        this.zza = zzgpoVar;
        this.zzb = cls;
    }

    public static zzggm zzb(zzggk zzggkVar, zzgpo zzgpoVar, Class cls) {
        return new zzggj(zzgpoVar, cls, zzggkVar);
    }

    public abstract zzgah zza(zzghh zzghhVar) throws GeneralSecurityException;

    public final zzgpo zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
