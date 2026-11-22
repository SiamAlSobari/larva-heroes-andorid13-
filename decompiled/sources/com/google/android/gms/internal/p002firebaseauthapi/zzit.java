package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzit {

    @Nullable
    private Integer zza;
    private zziu zzb;

    private zzit() {
        this.zza = null;
        throw null;
    }

    /* synthetic */ zzit(zzis zzisVar) {
        this.zza = null;
        this.zzb = zziu.zzc;
    }

    public final zzit zzb(zziu zziuVar) {
        this.zzb = zziuVar;
        return this;
    }

    public final zziw zzc() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzb != null) {
            return new zziw(num.intValue(), this.zzb, null);
        }
        throw new GeneralSecurityException("Variant is not set");
    }

    public final zzit zza(int i) throws GeneralSecurityException {
        if (i != 32 && i != 48 && i != 64) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(i)));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }
}
