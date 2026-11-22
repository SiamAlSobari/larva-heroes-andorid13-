package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgdl {

    @Nullable
    private Integer zza;
    private zzgdm zzb;

    private zzgdl() {
        this.zza = null;
        throw null;
    }

    /* synthetic */ zzgdl(zzgdk zzgdkVar) {
        this.zza = null;
        this.zzb = zzgdm.zzc;
    }

    public final zzgdl zzb(zzgdm zzgdmVar) {
        this.zzb = zzgdmVar;
        return this;
    }

    public final zzgdo zzc() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzb != null) {
            return new zzgdo(num.intValue(), this.zzb, null);
        }
        throw new GeneralSecurityException("Variant is not set");
    }

    public final zzgdl zza(int i) throws GeneralSecurityException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }
}
