package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzghb {
    private final Map zza;
    private final Map zzb;

    /* synthetic */ zzghb(zzggx zzggxVar, zzgha zzghaVar) {
        this.zza = new HashMap(zzggxVar.zza);
        this.zzb = new HashMap(zzggxVar.zzb);
    }

    public final Class zza(Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            return ((zzgap) this.zzb.get(cls)).zza();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls.toString() + " available");
    }

    public final Object zzb(zzfzp zzfzpVar, Class cls) throws GeneralSecurityException {
        zzggz zzggzVar = new zzggz(zzfzpVar.getClass(), cls, null);
        if (this.zza.containsKey(zzggzVar)) {
            return ((zzggu) this.zza.get(zzggzVar)).zza(zzfzpVar);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + zzggzVar.toString() + " available");
    }

    public final Object zzc(zzgao zzgaoVar, Class cls) throws GeneralSecurityException {
        if (!this.zzb.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        zzgap zzgapVar = (zzgap) this.zzb.get(cls);
        if (zzgaoVar.zzc().equals(zzgapVar.zza()) && zzgapVar.zza().equals(zzgaoVar.zzc())) {
            return zzgapVar.zzc(zzgaoVar);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}
