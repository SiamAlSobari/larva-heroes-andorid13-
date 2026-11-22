package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfzv {

    @Nullable
    private final zzgmv zza;

    private zzfzv(zzgmv zzgmvVar) {
        this.zza = zzgmvVar;
    }

    public static zzfzv zzc(String str, byte[] bArr, int i) {
        zzgnw zzgnwVar;
        zzgmu zzgmuVarZza = zzgmv.zza();
        zzgmuVarZza.zzb(str);
        zzgmuVarZza.zzc(zzgqi.zzv(bArr, 0, bArr.length));
        int i2 = i - 1;
        if (i2 != 0) {
            zzgnwVar = i2 != 1 ? zzgnw.RAW : zzgnw.LEGACY;
        } else {
            zzgnwVar = zzgnw.TINK;
        }
        zzgmuVarZza.zza(zzgnwVar);
        return new zzfzv((zzgmv) zzgmuVarZza.zzal());
    }

    public final zzgah zza() throws GeneralSecurityException {
        try {
            zzgmv zzgmvVarZze = zzgmv.zze(zzb().zzax(), zzgrc.zza());
            zzggi zzggiVarZzc = zzggi.zzc();
            zzghd zzghdVarZza = zzghd.zza(zzgmvVarZze);
            return !zzggiVarZzc.zzi(zzghdVarZza) ? new zzgfz(zzghdVarZza) : zzggiVarZzc.zzb(zzghdVarZza);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    final zzgmv zzb() {
        try {
            zzgmv zzgmvVar = this.zza;
            return zzgmvVar == null ? ((zzghd) zzggi.zzc().zzd(null, zzghd.class)).zzc() : zzgmvVar;
        } catch (GeneralSecurityException e) {
            throw new zzghp("Parsing parameters failed in getProto(). You probably want to call some Tink register function for null", e);
        }
    }
}
