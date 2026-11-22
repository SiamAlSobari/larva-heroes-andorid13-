package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgdj extends zzgfw {
    zzgdj() {
        super(zzglr.class, new zzgdh(zzfzi.class));
    }

    public static void zzg(boolean z) throws GeneralSecurityException {
        if (zzm()) {
            zzgar.zze(new zzgdj(), true);
            int i = zzgdt.zza;
            zzgdt.zzc(zzggi.zzc());
        }
    }

    static /* bridge */ /* synthetic */ zzgfu zzh(int i, int i2) {
        zzglt zzgltVarZzd = zzglu.zzd();
        zzgltVarZzd.zza(i);
        return new zzgfu((zzglu) zzgltVarZzd.zzal(), i2);
    }

    private static boolean zzm() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final zzgfv zza() {
        return new zzgdi(this, zzglu.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final zzgmp zzb() {
        return zzgmp.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final /* synthetic */ zzgta zzc(zzgqi zzgqiVar) throws zzgsc {
        return zzglr.zze(zzgqiVar, zzgrc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final /* bridge */ /* synthetic */ void zze(zzgta zzgtaVar) throws GeneralSecurityException {
        zzglr zzglrVar = (zzglr) zzgtaVar;
        zzgpm.zzb(zzglrVar.zza(), 0);
        zzgpm.zza(zzglrVar.zzf().zzd());
    }
}
