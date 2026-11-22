package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgay implements zzfzi {
    private final zzgao zza;
    private final zzgju zzb;
    private final zzgju zzc;

    /* synthetic */ zzgay(zzgao zzgaoVar, zzgax zzgaxVar) {
        zzgju zzgjuVarZza;
        this.zza = zzgaoVar;
        if (zzgaoVar.zzf()) {
            zzgjv zzgjvVarZzb = zzggf.zza().zzb();
            zzgka zzgkaVarZza = zzggc.zza(zzgaoVar);
            this.zzb = zzgjvVarZzb.zza(zzgkaVarZza, "aead", "encrypt");
            zzgjuVarZza = zzgjvVarZzb.zza(zzgkaVarZza, "aead", "decrypt");
        } else {
            zzgjuVarZza = zzggc.zza;
            this.zzb = zzgjuVarZza;
        }
        this.zzc = zzgjuVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfzi
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzgak zzgakVar : this.zza.zze(bArrCopyOf)) {
                try {
                    byte[] bArrZza = ((zzfzi) zzgakVar.zze()).zza(bArrCopyOfRange, bArr2);
                    zzgakVar.zza();
                    int length2 = bArrCopyOfRange.length;
                    return bArrZza;
                } catch (GeneralSecurityException e) {
                    zzgaz.zza.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e.toString()));
                }
            }
        }
        for (zzgak zzgakVar2 : this.zza.zze(zzfzn.zza)) {
            try {
                byte[] bArrZza2 = ((zzfzi) zzgakVar2.zze()).zza(bArr, bArr2);
                zzgakVar2.zza();
                int length3 = bArr.length;
                return bArrZza2;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
