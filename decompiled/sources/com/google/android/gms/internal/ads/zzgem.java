package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgem extends zzgav {
    private final zzger zza;
    private final zzgpp zzb;
    private final zzgpo zzc;

    @Nullable
    private final Integer zzd;

    private zzgem(zzger zzgerVar, zzgpp zzgppVar, zzgpo zzgpoVar, @Nullable Integer num) {
        this.zza = zzgerVar;
        this.zzb = zzgppVar;
        this.zzc = zzgpoVar;
        this.zzd = num;
    }

    public static zzgem zza(zzgeq zzgeqVar, zzgpp zzgppVar, @Nullable Integer num) throws GeneralSecurityException {
        zzgpo zzgpoVarZzb;
        zzgeq zzgeqVar2 = zzgeq.zzc;
        if (zzgeqVar != zzgeqVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + zzgeqVar.toString() + " the value of idRequirement must be non-null");
        }
        if (zzgeqVar == zzgeqVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgppVar.zza() != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zzgppVar.zza());
        }
        zzger zzgerVarZzb = zzger.zzb(zzgeqVar);
        if (zzgerVarZzb.zza() == zzgeqVar2) {
            zzgpoVarZzb = zzgpo.zzb(new byte[0]);
        } else if (zzgerVarZzb.zza() == zzgeq.zzb) {
            zzgpoVarZzb = zzgpo.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (zzgerVarZzb.zza() != zzgeq.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzgerVarZzb.zza().toString()));
            }
            zzgpoVarZzb = zzgpo.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new zzgem(zzgerVarZzb, zzgppVar, zzgpoVarZzb, num);
    }
}
