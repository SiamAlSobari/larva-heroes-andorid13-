package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgbb {

    @Nullable
    private zzgbm zza = null;

    @Nullable
    private zzgpp zzb = null;

    @Nullable
    private zzgpp zzc = null;

    @Nullable
    private Integer zzd = null;

    private zzgbb() {
    }

    /* synthetic */ zzgbb(zzgba zzgbaVar) {
    }

    public final zzgbb zza(zzgpp zzgppVar) {
        this.zzb = zzgppVar;
        return this;
    }

    public final zzgbb zzb(zzgpp zzgppVar) {
        this.zzc = zzgppVar;
        return this;
    }

    public final zzgbb zzc(@Nullable Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzgbb zzd(zzgbm zzgbmVar) {
        this.zza = zzgbmVar;
        return this;
    }

    public final zzgbd zze() throws GeneralSecurityException {
        zzgpo zzgpoVarZzb;
        zzgbm zzgbmVar = this.zza;
        if (zzgbmVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        zzgpp zzgppVar = this.zzb;
        if (zzgppVar == null || this.zzc == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (zzgbmVar.zza() != zzgppVar.zza()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (zzgbmVar.zzb() != this.zzc.zza()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.zza.zzg() && this.zzd == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zzg() && this.zzd != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzgbk.zzc) {
            zzgpoVarZzb = zzgpo.zzb(new byte[0]);
        } else if (this.zza.zzf() == zzgbk.zzb) {
            zzgpoVarZzb = zzgpo.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzd.intValue()).array());
        } else {
            if (this.zza.zzf() != zzgbk.zza) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzf()))));
            }
            zzgpoVarZzb = zzgpo.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzd.intValue()).array());
        }
        return new zzgbd(this.zza, this.zzb, this.zzc, zzgpoVarZzb, this.zzd, null);
    }
}
