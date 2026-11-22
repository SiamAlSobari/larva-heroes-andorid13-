package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzlp {
    private static final byte[] zza = new byte[0];
    private final zzlo zzb;
    private final BigInteger zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private BigInteger zzg = BigInteger.ZERO;

    private zzlp(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, zzlo zzloVar) {
        this.zzf = bArr;
        this.zzd = bArr2;
        this.zze = bArr3;
        this.zzc = bigInteger;
        this.zzb = zzloVar;
    }

    static zzlp zza(byte[] bArr, byte[] bArr2, byte[] bArr3, zzlt zzltVar, zzls zzlsVar, zzlo zzloVar, byte[] bArr4) throws GeneralSecurityException {
        byte[] bArrZzc = zzmb.zzc(zzltVar.zzb(), zzlsVar.zzc(), zzloVar.zzb());
        byte[] bArr5 = zzmb.zzm;
        byte[] bArr6 = zza;
        byte[] bArrZzb = zzyf.zzb(bArr, zzlsVar.zze(bArr5, bArr6, "psk_id_hash", bArrZzc), zzlsVar.zze(zzmb.zzm, bArr4, "info_hash", bArrZzc));
        byte[] bArrZze = zzlsVar.zze(bArr3, bArr6, "secret", bArrZzc);
        return new zzlp(bArr2, zzlsVar.zzd(bArrZze, bArrZzb, "key", bArrZzc, zzloVar.zza()), zzlsVar.zzd(bArrZze, bArrZzb, "base_nonce", bArrZzc, 12), BigInteger.ONE.shiftLeft(96).subtract(BigInteger.ONE), zzloVar);
    }

    private final synchronized byte[] zzc() throws GeneralSecurityException {
        byte[] bArrZzc;
        bArrZzc = zzyf.zzc(this.zze, zzmn.zzc(this.zzg, 12));
        if (this.zzg.compareTo(this.zzc) >= 0) {
            throw new GeneralSecurityException("message limit reached");
        }
        this.zzg = this.zzg.add(BigInteger.ONE);
        return bArrZzc;
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.zzb.zzc(this.zzd, zzc(), bArr, bArr2);
    }
}
