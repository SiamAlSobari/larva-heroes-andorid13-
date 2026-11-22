package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgpk implements zzgag {
    private static final byte[] zza = {0};
    private final zzgkb zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    private zzgpk(zzghu zzghuVar) throws GeneralSecurityException {
        this.zzb = new zzgph(zzghuVar.zzd().zzc(zzfzo.zza()));
        this.zzc = zzghuVar.zza().zza();
        this.zzd = zzghuVar.zzc().zzc();
        if (zzghuVar.zza().zzd().equals(zzgic.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public static zzgag zzb(zzghu zzghuVar) throws GeneralSecurityException {
        return new zzgpk(zzghuVar);
    }

    public static zzgag zzc(zzgir zzgirVar) throws GeneralSecurityException {
        return new zzgpk(zzgirVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgag
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zze;
        if (!MessageDigest.isEqual(bArr3.length > 0 ? zzgom.zzb(this.zzd, this.zzb.zza(zzgom.zzb(bArr2, bArr3), this.zzc)) : zzgom.zzb(this.zzd, this.zzb.zza(bArr2, this.zzc)), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    private zzgpk(zzgir zzgirVar) throws GeneralSecurityException {
        String strValueOf = String.valueOf(String.valueOf(zzgirVar.zzd().zze()));
        this.zzb = new zzgpj("HMAC".concat(strValueOf), new SecretKeySpec(zzgirVar.zze().zzc(zzfzo.zza()), "HMAC"));
        this.zzc = zzgirVar.zzd().zza();
        this.zzd = zzgirVar.zzc().zzc();
        if (zzgirVar.zzd().zzf().equals(zzgja.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public zzgpk(zzgkb zzgkbVar, int i) throws GeneralSecurityException {
        this.zzb = zzgkbVar;
        this.zzc = i;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        zzgkbVar.zza(new byte[0], i);
    }
}
