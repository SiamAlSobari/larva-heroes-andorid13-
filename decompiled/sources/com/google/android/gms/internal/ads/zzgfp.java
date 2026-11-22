package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgfp {
    private final zzgpo zza;
    private final Class zzb;

    /* synthetic */ zzgfp(zzgpo zzgpoVar, Class cls, zzgfo zzgfoVar) {
        this.zza = zzgpoVar;
        this.zzb = cls;
    }

    public static zzgfp zzb(zzgfn zzgfnVar, zzgpo zzgpoVar, Class cls) {
        return new zzgfm(zzgpoVar, cls, zzgfnVar);
    }

    public abstract zzfzp zza(zzghh zzghhVar, @Nullable zzgas zzgasVar) throws GeneralSecurityException;

    public final zzgpo zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
