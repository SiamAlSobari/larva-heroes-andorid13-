package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzzg implements zzrw {
    private final SecretKey zza;
    private final byte[] zzb;
    private final byte[] zzc;

    public zzzg(byte[] bArr) throws GeneralSecurityException {
        zzzl.zzb(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zza = secretKeySpec;
        Cipher cipherZzb = zzb();
        cipherZzb.init(1, secretKeySpec);
        byte[] bArrZzb = zzrd.zzb(cipherZzb.doFinal(new byte[16]));
        this.zzb = bArrZzb;
        this.zzc = zzrd.zzb(bArrZzb);
    }

    private static Cipher zzb() throws GeneralSecurityException {
        if (zzij.zza(1)) {
            return (Cipher) zzyv.zza.zza("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzrw
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKey secretKey = this.zza;
        Cipher cipherZzb = zzb();
        cipherZzb.init(1, secretKey);
        int length = bArr.length;
        double d = length;
        Double.isNaN(d);
        int iMax = Math.max(1, (int) Math.ceil(d / 16.0d));
        int i2 = iMax - 1;
        int i3 = i2 * 16;
        byte[] bArrZzd = iMax * 16 == length ? zzyf.zzd(bArr, i3, this.zzb, 0, 16) : zzyf.zzc(zzrd.zza(Arrays.copyOfRange(bArr, i3, length)), this.zzc);
        byte[] bArrDoFinal = new byte[16];
        for (int i4 = 0; i4 < i2; i4++) {
            bArrDoFinal = cipherZzb.doFinal(zzyf.zzd(bArrDoFinal, 0, bArr, i4 * 16, 16));
        }
        return Arrays.copyOf(cipherZzb.doFinal(zzyf.zzc(bArrZzd, bArrDoFinal)), i);
    }
}
