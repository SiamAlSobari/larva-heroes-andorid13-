package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zznx {
    private final zzzo zza;
    private final Class zzb;

    /* synthetic */ zznx(zzzo zzzoVar, Class cls, zznw zznwVar) {
        this.zza = zzzoVar;
        this.zzb = cls;
    }

    public static zznx zzb(zznv zznvVar, zzzo zzzoVar, Class cls) {
        return new zznu(zzzoVar, cls, zznvVar);
    }

    public abstract zzce zza(zzot zzotVar) throws GeneralSecurityException;

    public final zzzo zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
