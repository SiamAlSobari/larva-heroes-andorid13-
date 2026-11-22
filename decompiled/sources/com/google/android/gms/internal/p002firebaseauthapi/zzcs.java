package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcs {
    public static zzce zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzwn zzwnVarZzd = zzwn.zzd(bArr, zzajx.zza());
            zznt zzntVarZzc = zznt.zzc();
            zzop zzopVarZza = zzop.zza(zzwnVarZzd);
            return !zzntVarZzc.zzi(zzopVarZza) ? new zznj(zzopVarZza) : zzntVarZzc.zzb(zzopVarZza);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    public static byte[] zzb(zzce zzceVar) throws GeneralSecurityException {
        return zzceVar instanceof zznj ? ((zznj) zzceVar).zzb().zzc().zzq() : ((zzop) zznt.zzc().zzd(zzceVar, zzop.class)).zzc().zzq();
    }
}
