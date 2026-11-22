package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.EllipticCurve;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzkz extends zzli {
    private final zzkq zza;
    private final zzzo zzb;
    private final zzzo zzc;

    @Nullable
    private final Integer zzd;

    private zzkz(zzkq zzkqVar, zzzo zzzoVar, zzzo zzzoVar2, @Nullable Integer num) {
        this.zza = zzkqVar;
        this.zzb = zzzoVar;
        this.zzc = zzzoVar2;
        this.zzd = num;
    }

    public static zzkz zzb(zzkq zzkqVar, zzzo zzzoVar, @Nullable Integer num) throws GeneralSecurityException {
        EllipticCurve curve;
        zzzo zzzoVarZzb;
        zzko zzkoVarZzf = zzkqVar.zzf();
        if (!zzkoVarZzf.equals(zzko.zzc) && num == null) {
            throw new GeneralSecurityException("'idRequirement' must be non-null for " + zzkoVarZzf.toString() + " variant.");
        }
        if (zzkoVarZzf.equals(zzko.zzc) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
        zzkn zzknVarZze = zzkqVar.zze();
        int iZza = zzzoVar.zza();
        String str = "Encoded public key byte length for " + zzknVarZze.toString() + " must be %d, not " + iZza;
        zzkn zzknVar = zzkn.zza;
        if (zzknVarZze == zzknVar) {
            if (iZza != 65) {
                throw new GeneralSecurityException(String.format(str, 65));
            }
        } else if (zzknVarZze == zzkn.zzb) {
            if (iZza != 97) {
                throw new GeneralSecurityException(String.format(str, 97));
            }
        } else if (zzknVarZze == zzkn.zzc) {
            if (iZza != 133) {
                throw new GeneralSecurityException(String.format(str, 133));
            }
        } else {
            if (zzknVarZze != zzkn.zzf) {
                throw new GeneralSecurityException("Unable to validate public key length for ".concat(zzknVarZze.toString()));
            }
            if (iZza != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        if (zzknVarZze == zzknVar || zzknVarZze == zzkn.zzb || zzknVarZze == zzkn.zzc) {
            if (zzknVarZze == zzknVar) {
                curve = zzmq.zza.getCurve();
            } else if (zzknVarZze == zzkn.zzb) {
                curve = zzmq.zzb.getCurve();
            } else {
                if (zzknVarZze != zzkn.zzc) {
                    throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(zzknVarZze.toString()));
                }
                curve = zzmq.zzc.getCurve();
            }
            zzmq.zzf(zzym.zzj(curve, 1, zzzoVar.zzc()), curve);
        }
        zzko zzkoVarZzf2 = zzkqVar.zzf();
        if (zzkoVarZzf2 == zzko.zzc) {
            zzzoVarZzb = zzzo.zzb(new byte[0]);
        } else {
            if (num == null) {
                throw new IllegalStateException("idRequirement must be non-null for HpkeParameters.Variant ".concat(zzkoVarZzf2.toString()));
            }
            if (zzkoVarZzf2 == zzko.zzb) {
                zzzoVarZzb = zzzo.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
            } else {
                if (zzkoVarZzf2 != zzko.zza) {
                    throw new IllegalStateException("Unknown HpkeParameters.Variant: ".concat(zzkoVarZzf2.toString()));
                }
                zzzoVarZzb = zzzo.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            }
        }
        return new zzkz(zzkqVar, zzzoVar, zzzoVarZzb, num);
    }

    public final zzkq zza() {
        return this.zza;
    }

    public final zzzo zzc() {
        return this.zzb;
    }
}
