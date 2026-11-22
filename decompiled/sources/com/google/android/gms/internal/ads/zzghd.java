package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzghd implements zzghh {
    private final zzgpo zza;
    private final zzgmv zzb;

    private zzghd(zzgmv zzgmvVar, zzgpo zzgpoVar) {
        this.zzb = zzgmvVar;
        this.zza = zzgpoVar;
    }

    public static zzghd zza(zzgmv zzgmvVar) throws GeneralSecurityException {
        String strZzh = zzgmvVar.zzh();
        Charset charset = zzghq.zza;
        byte[] bArr = new byte[strZzh.length()];
        for (int i = 0; i < strZzh.length(); i++) {
            char cCharAt = strZzh.charAt(i);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new GeneralSecurityException("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i] = (byte) cCharAt;
        }
        return new zzghd(zzgmvVar, zzgpo.zzb(bArr));
    }

    public static zzghd zzb(zzgmv zzgmvVar) {
        return new zzghd(zzgmvVar, zzghq.zza(zzgmvVar.zzh()));
    }

    public final zzgmv zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzghh
    public final zzgpo zzd() {
        return this.zza;
    }
}
