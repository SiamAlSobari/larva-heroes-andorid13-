package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgdu extends zzgav {
    private final zzgdz zza;
    private final zzgpp zzb;
    private final zzgpo zzc;

    @Nullable
    private final Integer zzd;

    private zzgdu(zzgdz zzgdzVar, zzgpp zzgppVar, zzgpo zzgpoVar, @Nullable Integer num) {
        this.zza = zzgdzVar;
        this.zzb = zzgppVar;
        this.zzc = zzgpoVar;
        this.zzd = num;
    }

    public static zzgdu zza(zzgdy zzgdyVar, zzgpp zzgppVar, @Nullable Integer num) throws GeneralSecurityException {
        zzgpo zzgpoVarZzb;
        zzgdy zzgdyVar2 = zzgdy.zzc;
        if (zzgdyVar != zzgdyVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + zzgdyVar.toString() + " the value of idRequirement must be non-null");
        }
        if (zzgdyVar == zzgdyVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgppVar.zza() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zzgppVar.zza());
        }
        zzgdz zzgdzVarZzb = zzgdz.zzb(zzgdyVar);
        if (zzgdzVarZzb.zza() == zzgdyVar2) {
            zzgpoVarZzb = zzgpo.zzb(new byte[0]);
        } else if (zzgdzVarZzb.zza() == zzgdy.zzb) {
            zzgpoVarZzb = zzgpo.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (zzgdzVarZzb.zza() != zzgdy.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzgdzVarZzb.zza().toString()));
            }
            zzgpoVarZzb = zzgpo.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new zzgdu(zzgdzVarZzb, zzgppVar, zzgpoVarZzb, num);
    }
}
