package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzim {

    @Nullable
    private zziw zza = null;

    @Nullable
    private zzzq zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzim() {
    }

    /* synthetic */ zzim(zzil zzilVar) {
    }

    public final zzim zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzim zzb(zzzq zzzqVar) {
        this.zzb = zzzqVar;
        return this;
    }

    public final zzim zzc(zziw zziwVar) {
        this.zza = zziwVar;
        return this;
    }

    public final zzio zzd() throws GeneralSecurityException {
        zzzq zzzqVar;
        zzzo zzzoVarZzb;
        zziw zziwVar = this.zza;
        if (zziwVar == null || (zzzqVar = this.zzb) == null) {
            throw new IllegalArgumentException("Cannot build without parameters and/or key material");
        }
        if (zziwVar.zzb() != zzzqVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zziwVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zziu.zzc) {
            zzzoVarZzb = zzzo.zzb(new byte[0]);
        } else if (this.zza.zzd() == zziu.zzb) {
            zzzoVarZzb = zzzo.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
        } else {
            if (this.zza.zzd() != zziu.zza) {
                throw new IllegalStateException("Unknown AesSivParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzd()))));
            }
            zzzoVarZzb = zzzo.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
        }
        return new zzio(this.zza, this.zzb, zzzoVarZzb, this.zzc, null);
    }
}
