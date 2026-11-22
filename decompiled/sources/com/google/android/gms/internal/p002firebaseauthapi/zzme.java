package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzme implements zzlt {
    private final zzln zza;

    zzme(zzln zzlnVar) {
        this.zza = zzlnVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlt
    public final byte[] zza(byte[] bArr, zzlu zzluVar) throws GeneralSecurityException {
        byte[] bArrZza = zzzm.zza(zzluVar.zza().zzc(), bArr);
        byte[] bArrZzb = zzyf.zzb(bArr, zzluVar.zzb().zzc());
        byte[] bArrZze = zzmb.zze(zzmb.zzc);
        zzln zzlnVar = this.zza;
        return zzlnVar.zzb(null, bArrZza, "eae_prk", bArrZzb, "shared_secret", bArrZze, zzlnVar.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlt
    public final byte[] zzb() throws GeneralSecurityException {
        if (Arrays.equals(this.zza.zzc(), zzmb.zzg)) {
            return zzmb.zzc;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
