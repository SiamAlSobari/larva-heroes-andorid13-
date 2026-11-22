package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgip {

    @Nullable
    private zzgjc zza = null;

    @Nullable
    private zzgpp zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzgip() {
    }

    /* synthetic */ zzgip(zzgio zzgioVar) {
    }

    public final zzgip zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgip zzb(zzgpp zzgppVar) {
        this.zzb = zzgppVar;
        return this;
    }

    public final zzgip zzc(zzgjc zzgjcVar) {
        this.zza = zzgjcVar;
        return this;
    }

    public final zzgir zzd() throws GeneralSecurityException {
        zzgpp zzgppVar;
        zzgpo zzgpoVarZzb;
        zzgjc zzgjcVar = this.zza;
        if (zzgjcVar == null || (zzgppVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzgjcVar.zzb() != zzgppVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzgjcVar.zzg() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zzg() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzgja.zzd) {
            zzgpoVarZzb = zzgpo.zzb(new byte[0]);
        } else if (this.zza.zzf() == zzgja.zzc || this.zza.zzf() == zzgja.zzb) {
            zzgpoVarZzb = zzgpo.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
        } else {
            if (this.zza.zzf() != zzgja.zza) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzf()))));
            }
            zzgpoVarZzb = zzgpo.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
        }
        return new zzgir(this.zza, this.zzb, zzgpoVarZzb, this.zzc, null);
    }
}
