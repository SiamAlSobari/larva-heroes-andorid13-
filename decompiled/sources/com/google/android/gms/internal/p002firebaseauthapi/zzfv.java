package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfv extends zzcv {
    private final zzga zza;
    private final zzzq zzb;
    private final zzzo zzc;

    @Nullable
    private final Integer zzd;

    private zzfv(zzga zzgaVar, zzzq zzzqVar, zzzo zzzoVar, @Nullable Integer num) {
        this.zza = zzgaVar;
        this.zzb = zzzqVar;
        this.zzc = zzzoVar;
        this.zzd = num;
    }

    public static zzfv zza(zzfz zzfzVar, zzzq zzzqVar, @Nullable Integer num) throws GeneralSecurityException {
        zzzo zzzoVarZzb;
        zzfz zzfzVar2 = zzfz.zzc;
        if (zzfzVar != zzfzVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + zzfzVar.toString() + " the value of idRequirement must be non-null");
        }
        if (zzfzVar == zzfzVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzzqVar.zza() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zzzqVar.zza());
        }
        zzga zzgaVarZzc = zzga.zzc(zzfzVar);
        if (zzgaVarZzc.zzb() == zzfzVar2) {
            zzzoVarZzb = zzzo.zzb(new byte[0]);
        } else if (zzgaVarZzc.zzb() == zzfz.zzb) {
            zzzoVarZzb = zzzo.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (zzgaVarZzc.zzb() != zzfz.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzgaVarZzc.zzb().toString()));
            }
            zzzoVarZzb = zzzo.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new zzfv(zzgaVarZzc, zzzqVar, zzzoVarZzb, num);
    }
}
