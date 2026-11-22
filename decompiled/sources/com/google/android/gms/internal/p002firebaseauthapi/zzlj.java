package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzlj {
    public static String zza(zzvc zzvcVar) throws NoSuchAlgorithmException {
        zzud zzudVar = zzud.UNKNOWN_FORMAT;
        zzux zzuxVar = zzux.UNKNOWN_CURVE;
        zzvc zzvcVar2 = zzvc.UNKNOWN_HASH;
        int iOrdinal = zzvcVar.ordinal();
        if (iOrdinal == 1) {
            return "HmacSha1";
        }
        if (iOrdinal == 2) {
            return "HmacSha384";
        }
        if (iOrdinal == 3) {
            return "HmacSha256";
        }
        if (iOrdinal == 4) {
            return "HmacSha512";
        }
        if (iOrdinal == 5) {
            return "HmacSha224";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(String.valueOf(String.valueOf(zzvcVar))));
    }

    public static void zzb(zzum zzumVar) throws GeneralSecurityException {
        zzym.zzi(zzc(zzumVar.zzf().zzd()));
        zza(zzumVar.zzf().zze());
        if (zzumVar.zza() == zzud.UNKNOWN_FORMAT) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        zzcq.zzb(zzumVar.zzb().zzd());
    }

    public static int zzc(zzux zzuxVar) throws GeneralSecurityException {
        zzud zzudVar = zzud.UNKNOWN_FORMAT;
        zzux zzuxVar2 = zzux.UNKNOWN_CURVE;
        zzvc zzvcVar = zzvc.UNKNOWN_HASH;
        int iOrdinal = zzuxVar.ordinal();
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown curve type: ".concat(String.valueOf(String.valueOf(zzuxVar))));
            }
        }
        return i;
    }

    public static int zzd(zzud zzudVar) throws GeneralSecurityException {
        zzud zzudVar2 = zzud.UNKNOWN_FORMAT;
        zzux zzuxVar = zzux.UNKNOWN_CURVE;
        zzvc zzvcVar = zzvc.UNKNOWN_HASH;
        int iOrdinal = zzudVar.ordinal();
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown point format: ".concat(String.valueOf(String.valueOf(zzudVar))));
            }
        }
        return i;
    }
}
