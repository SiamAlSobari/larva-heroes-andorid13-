package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzff {

    @Nullable
    private zzfp zza = null;

    @Nullable
    private zzzq zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzff() {
    }

    /* synthetic */ zzff(zzfe zzfeVar) {
    }

    public final zzff zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzff zzb(zzzq zzzqVar) {
        this.zzb = zzzqVar;
        return this;
    }

    public final zzff zzc(zzfp zzfpVar) {
        this.zza = zzfpVar;
        return this;
    }

    public final zzfh zzd() throws GeneralSecurityException {
        zzzq zzzqVar;
        zzzo zzzoVarZzb;
        zzfp zzfpVar = this.zza;
        if (zzfpVar == null || (zzzqVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzfpVar.zzb() != zzzqVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzfpVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzc() == zzfn.zzc) {
            zzzoVarZzb = zzzo.zzb(new byte[0]);
        } else if (this.zza.zzc() == zzfn.zzb) {
            zzzoVarZzb = zzzo.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
        } else {
            if (this.zza.zzc() != zzfn.zza) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzc()))));
            }
            zzzoVarZzb = zzzo.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
        }
        return new zzfh(this.zza, this.zzb, zzzoVarZzb, this.zzc, null);
    }
}
