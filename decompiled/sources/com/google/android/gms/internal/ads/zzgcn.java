package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgcn {

    @Nullable
    private zzgcx zza = null;

    @Nullable
    private zzgpp zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzgcn() {
    }

    /* synthetic */ zzgcn(zzgcm zzgcmVar) {
    }

    public final zzgcn zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgcn zzb(zzgpp zzgppVar) {
        this.zzb = zzgppVar;
        return this;
    }

    public final zzgcn zzc(zzgcx zzgcxVar) {
        this.zza = zzgcxVar;
        return this;
    }

    public final zzgcp zzd() throws GeneralSecurityException {
        zzgpp zzgppVar;
        zzgpo zzgpoVarZzb;
        zzgcx zzgcxVar = this.zza;
        if (zzgcxVar == null || (zzgppVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgcxVar.zza() != zzgppVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgcxVar.zzc() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zzc() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzb() == zzgcv.zzc) {
            zzgpoVarZzb = zzgpo.zzb(new byte[0]);
        } else if (this.zza.zzb() == zzgcv.zzb) {
            zzgpoVarZzb = zzgpo.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
        } else {
            if (this.zza.zzb() != zzgcv.zza) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzb()))));
            }
            zzgpoVarZzb = zzgpo.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
        }
        return new zzgcp(this.zza, this.zzb, zzgpoVarZzb, this.zzc, null);
    }
}
