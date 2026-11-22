package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzlb implements zzbk {
    private final zzcl zza;
    private final zzrp zzb;

    public zzlb(zzcl zzclVar) {
        this.zza = zzclVar;
        this.zzb = zzclVar.zzf() ? zznp.zza().zzb().zza(zznm.zza(zzclVar), "hybrid_decrypt", "decrypt") : zznm.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbk
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            for (zzch zzchVar : this.zza.zze(bArrCopyOfRange)) {
                try {
                    byte[] bArrZza = ((zzbk) zzchVar.zze()).zza(bArrCopyOfRange2, null);
                    zzchVar.zza();
                    int length2 = bArrCopyOfRange2.length;
                    return bArrZza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzch zzchVar2 : this.zza.zze(zzbi.zza)) {
            try {
                byte[] bArrZza2 = ((zzbk) zzchVar2.zze()).zza(bArr, null);
                zzchVar2.zza();
                int length3 = bArr.length;
                return bArrZza2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
