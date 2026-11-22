package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhm extends zzcv {
    private final zzhr zza;
    private final zzzq zzb;
    private final zzzo zzc;

    @Nullable
    private final Integer zzd;

    private zzhm(zzhr zzhrVar, zzzq zzzqVar, zzzo zzzoVar, @Nullable Integer num) {
        this.zza = zzhrVar;
        this.zzb = zzzqVar;
        this.zzc = zzzoVar;
        this.zzd = num;
    }

    public static zzhm zza(zzhq zzhqVar, zzzq zzzqVar, @Nullable Integer num) throws GeneralSecurityException {
        zzzo zzzoVarZzb;
        zzhq zzhqVar2 = zzhq.zzc;
        if (zzhqVar != zzhqVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + zzhqVar.toString() + " the value of idRequirement must be non-null");
        }
        if (zzhqVar == zzhqVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzzqVar.zza() != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zzzqVar.zza());
        }
        zzhr zzhrVarZzd = zzhr.zzd(zzhqVar);
        if (zzhrVarZzd.zzb() == zzhqVar2) {
            zzzoVarZzb = zzzo.zzb(new byte[0]);
        } else if (zzhrVarZzd.zzb() == zzhq.zzb) {
            zzzoVarZzb = zzzo.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (zzhrVarZzd.zzb() != zzhq.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhrVarZzd.zzb().toString()));
            }
            zzzoVarZzb = zzzo.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new zzhm(zzhrVarZzd, zzzqVar, zzzoVarZzb, num);
    }
}
