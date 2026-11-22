package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzqc {

    @Nullable
    private zzqp zza = null;

    @Nullable
    private zzzq zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzqc() {
    }

    /* synthetic */ zzqc(zzqb zzqbVar) {
    }

    public final zzqc zza(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzqc zzb(zzzq zzzqVar) {
        this.zzb = zzzqVar;
        return this;
    }

    public final zzqc zzc(zzqp zzqpVar) {
        this.zza = zzqpVar;
        return this;
    }

    public final zzqe zzd() throws GeneralSecurityException {
        zzzq zzzqVar;
        zzzo zzzoVarZzb;
        zzqp zzqpVar = this.zza;
        if (zzqpVar == null || (zzzqVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzqpVar.zzc() != zzzqVar.zza()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzqpVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzg() == zzqn.zzd) {
            zzzoVarZzb = zzzo.zzb(new byte[0]);
        } else if (this.zza.zzg() == zzqn.zzc || this.zza.zzg() == zzqn.zzb) {
            zzzoVarZzb = zzzo.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
        } else {
            if (this.zza.zzg() != zzqn.zza) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(String.valueOf(this.zza.zzg()))));
            }
            zzzoVarZzb = zzzo.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
        }
        return new zzqe(this.zza, this.zzb, zzzoVarZzb, this.zzc, null);
    }
}
