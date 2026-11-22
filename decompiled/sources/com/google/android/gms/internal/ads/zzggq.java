package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzggq {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzggq(Class cls, Class cls2, zzggp zzggpVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzggq zzb(zzggo zzggoVar, Class cls, Class cls2) {
        return new zzggn(cls, cls2, zzggoVar);
    }

    public abstract zzghh zza(zzgah zzgahVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
