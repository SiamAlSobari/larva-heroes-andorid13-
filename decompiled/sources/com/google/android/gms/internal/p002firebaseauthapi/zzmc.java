package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzmc implements zzlt {
    private final zzln zza;
    private final int zzb;

    private zzmc(zzln zzlnVar, int i) {
        this.zza = zzlnVar;
        this.zzb = i;
    }

    static zzmc zzc(int i) throws GeneralSecurityException {
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? new zzmc(new zzln("HmacSha512"), 3) : new zzmc(new zzln("HmacSha384"), 2);
        }
        return new zzmc(new zzln("HmacSha256"), 1);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlt
    public final byte[] zza(byte[] bArr, zzlu zzluVar) throws GeneralSecurityException {
        byte[] bArrZzf = zzym.zzf(zzym.zzg(this.zzb, zzluVar.zza().zzc()), zzym.zzh(zzym.zzi(this.zzb), 1, bArr));
        byte[] bArrZzb = zzyf.zzb(bArr, zzluVar.zzb().zzc());
        byte[] bArrZze = zzmb.zze(zzb());
        zzln zzlnVar = this.zza;
        return zzlnVar.zzb(null, bArrZzf, "eae_prk", bArrZzb, "shared_secret", bArrZze, zzlnVar.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlt
    public final byte[] zzb() throws GeneralSecurityException {
        int i = this.zzb - 1;
        if (i != 0) {
            return i != 1 ? zzmb.zzf : zzmb.zze;
        }
        return zzmb.zzd;
    }
}
