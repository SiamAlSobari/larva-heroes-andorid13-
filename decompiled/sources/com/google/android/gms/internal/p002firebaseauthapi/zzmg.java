package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzmg {
    private final zzbd zza;
    private final zzbj zzb;

    public zzmg(zzbd zzbdVar) {
        this.zza = zzbdVar;
        this.zzb = null;
    }

    public zzmg(zzbj zzbjVar) {
        this.zza = null;
        this.zzb = zzbjVar;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzbd zzbdVar = this.zza;
        return zzbdVar != null ? zzbdVar.zza(bArr, bArr2) : this.zzb.zza(bArr, bArr2);
    }
}
