package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzob {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzob(Class cls, Class cls2, zzoa zzoaVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzob zzb(zznz zznzVar, Class cls, Class cls2) {
        return new zzny(cls, cls2, zznzVar);
    }

    public abstract zzot zza(zzce zzceVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
