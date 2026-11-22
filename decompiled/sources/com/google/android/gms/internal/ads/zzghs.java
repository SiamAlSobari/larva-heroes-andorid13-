package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzghs {

    @Nullable
    private zzgie zza = null;

    @Nullable
    private zzgpp zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzghs() {
    }

    /* synthetic */ zzghs(zzghr zzghrVar) {
    }

    public final zzghs zza(zzgpp zzgppVar) throws GeneralSecurityException {
        this.zzb = zzgppVar;
        return this;
    }

    public final zzghs zzb(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzghs zzc(zzgie zzgieVar) {
        this.zza = zzgieVar;
        return this;
    }

    public final zzghu zzd() throws GeneralSecurityException {
        zzgpp zzgppVar;
        zzgpo zzgpoVarZzb;
        zzgie zzgieVar = this.zza;
        if (zzgieVar == null || (zzgppVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgieVar.zzb() != zzgppVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgieVar.zze() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zze() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzgic.zzd) {
            zzgpoVarZzb = zzgpo.zzb(new byte[0]);
        } else if (this.zza.zzd() == zzgic.zzc || this.zza.zzd() == zzgic.zzb) {
            zzgpoVarZzb = zzgpo.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
        } else {
            if (this.zza.zzd() != zzgic.zza) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzd()))));
            }
            zzgpoVarZzb = zzgpo.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
        }
        return new zzghu(this.zza, this.zzb, zzgpoVarZzb, this.zzc, null);
    }
}
