package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbq implements zzbs {
    final /* synthetic */ zzng zza;

    zzbq(zzng zzngVar) {
        this.zza = zzngVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbs
    public final zzbo zza(Class cls) throws GeneralSecurityException {
        try {
            return new zzbp(this.zza, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbs
    public final zzbo zzb() {
        zzng zzngVar = this.zza;
        return new zzbp(zzngVar, zzngVar.zzi());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbs
    public final Class zzc() {
        return this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbs
    @Nullable
    public final Class zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbs
    public final Set zze() {
        return this.zza.zzl();
    }
}
