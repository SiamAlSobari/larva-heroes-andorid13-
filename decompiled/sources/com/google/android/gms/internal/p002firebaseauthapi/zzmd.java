package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzmd implements zzlu {
    private final zzzo zza;
    private final zzzo zzb;

    private zzmd(byte[] bArr, byte[] bArr2) {
        this.zza = zzzo.zzb(bArr);
        this.zzb = zzzo.zzb(bArr2);
    }

    static zzmd zzc(byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        zzym.zzd(zzym.zzh(zzym.zzi(i), 1, bArr2), zzym.zzg(i, bArr));
        return new zzmd(bArr, bArr2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlu
    public final zzzo zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlu
    public final zzzo zzb() {
        return this.zzb;
    }
}
