package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgjh implements zzgag {
    private final zzgao zza;
    private final zzgju zzb;
    private final zzgju zzc;

    /* synthetic */ zzgjh(zzgao zzgaoVar, zzgjg zzgjgVar) {
        zzgju zzgjuVarZza;
        this.zza = zzgaoVar;
        if (zzgaoVar.zzf()) {
            zzgjv zzgjvVarZzb = zzggf.zza().zzb();
            zzgka zzgkaVarZza = zzggc.zza(zzgaoVar);
            this.zzb = zzgjvVarZzb.zza(zzgkaVarZza, "mac", "compute");
            zzgjuVarZza = zzgjvVarZzb.zza(zzgkaVarZza, "mac", "verify");
        } else {
            zzgjuVarZza = zzggc.zza;
            this.zzb = zzgjuVarZza;
        }
        this.zzc = zzgjuVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgag
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length <= 5) {
            throw new GeneralSecurityException("tag too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, length);
        for (zzgak zzgakVar : this.zza.zze(bArrCopyOf)) {
            try {
                ((zzgag) zzgakVar.zze()).zza(bArrCopyOfRange, zzgakVar.zzc().equals(zzgnw.LEGACY) ? zzgom.zzb(bArr2, zzgji.zzb) : bArr2);
                zzgakVar.zza();
                return;
            } catch (GeneralSecurityException e) {
                zzgji.zza.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e.toString()));
            }
        }
        for (zzgak zzgakVar2 : this.zza.zze(zzfzn.zza)) {
            try {
                ((zzgag) zzgakVar2.zze()).zza(bArr, bArr2);
                zzgakVar2.zza();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
