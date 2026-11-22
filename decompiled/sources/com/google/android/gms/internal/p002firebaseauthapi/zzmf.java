package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzmf implements zzlu {
    private final zzzo zza;
    private final zzzo zzb;

    private zzmf(byte[] bArr, byte[] bArr2) {
        this.zza = zzzo.zzb(bArr);
        this.zzb = zzzo.zzb(bArr2);
    }

    static zzmf zzc(byte[] bArr) throws GeneralSecurityException {
        return new zzmf(bArr, zzzm.zzb(bArr));
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
