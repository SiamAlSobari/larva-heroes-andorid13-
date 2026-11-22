package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzggg {
    private static final zzggg zza = new zzggg();
    private final AtomicReference zzb = new AtomicReference(new zzghb(new zzggx(null), null));

    zzggg() {
    }

    public static zzggg zza() {
        return zza;
    }

    public final Class zzb(Class cls) throws GeneralSecurityException {
        return ((zzghb) this.zzb.get()).zza(cls);
    }

    public final Object zzc(zzfzp zzfzpVar, Class cls) throws GeneralSecurityException {
        return ((zzghb) this.zzb.get()).zzb(zzfzpVar, cls);
    }

    public final Object zzd(zzgao zzgaoVar, Class cls) throws GeneralSecurityException {
        return ((zzghb) this.zzb.get()).zzc(zzgaoVar, cls);
    }

    public final synchronized void zze(zzggu zzgguVar) throws GeneralSecurityException {
        zzggx zzggxVar = new zzggx((zzghb) this.zzb.get(), null);
        zzggxVar.zza(zzgguVar);
        this.zzb.set(new zzghb(zzggxVar, null));
    }

    public final synchronized void zzf(zzgap zzgapVar) throws GeneralSecurityException {
        zzggx zzggxVar = new zzggx((zzghb) this.zzb.get(), null);
        zzggxVar.zzb(zzgapVar);
        this.zzb.set(new zzghb(zzggxVar, null));
    }
}
