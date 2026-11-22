package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgbw {

    @Nullable
    private zzgcg zza = null;

    @Nullable
    private zzgpp zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzgbw() {
    }

    /* synthetic */ zzgbw(zzgbv zzgbvVar) {
    }

    public final zzgbw zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgbw zzb(zzgpp zzgppVar) {
        this.zzb = zzgppVar;
        return this;
    }

    public final zzgbw zzc(zzgcg zzgcgVar) {
        this.zza = zzgcgVar;
        return this;
    }

    public final zzgby zzd() throws GeneralSecurityException {
        zzgpp zzgppVar;
        zzgpo zzgpoVarZzb;
        zzgcg zzgcgVar = this.zza;
        if (zzgcgVar == null || (zzgppVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgcgVar.zzb() != zzgppVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgcgVar.zzd() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zzd() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzc() == zzgce.zzc) {
            zzgpoVarZzb = zzgpo.zzb(new byte[0]);
        } else if (this.zza.zzc() == zzgce.zzb) {
            zzgpoVarZzb = zzgpo.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
        } else {
            if (this.zza.zzc() != zzgce.zza) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzc()))));
            }
            zzgpoVarZzb = zzgpo.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
        }
        return new zzgby(this.zza, this.zzb, zzgpoVarZzb, this.zzc, null);
    }
}
