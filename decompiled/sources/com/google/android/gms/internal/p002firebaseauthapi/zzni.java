package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzni extends zzbn {
    private final zzoo zza;

    public zzni(zzoo zzooVar, @Nullable zzcr zzcrVar) throws GeneralSecurityException {
        zzc(zzooVar, zzcrVar);
        this.zza = zzooVar;
    }

    private static void zzc(zzoo zzooVar, @Nullable zzcr zzcrVar) throws GeneralSecurityException {
        int i = zznh.zzb[zzooVar.zzb().ordinal()];
    }

    public final zzoo zza(@Nullable zzcr zzcrVar) throws GeneralSecurityException {
        zzc(this.zza, zzcrVar);
        return this.zza;
    }

    @Nullable
    public final Integer zzb() {
        return this.zza.zzf();
    }
}
