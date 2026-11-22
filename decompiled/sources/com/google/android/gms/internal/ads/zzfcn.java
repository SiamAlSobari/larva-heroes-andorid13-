package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfcn {
    public zzfcn() {
        try {
            zzgau.zza();
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        zzgqf zzgqfVarZzt = zzgqi.zzt();
        try {
            zzfzl.zzb(zzgad.zzc(zzfzw.zza("AES128_GCM").zza()), zzfzk.zzb(zzgqfVarZzt));
        } catch (IOException | GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "CryptoUtils.generateKey");
        }
        String strEncodeToString = Base64.encodeToString(zzgqfVarZzt.zzb().zzA(), 11);
        zzgqfVarZzt.zzc();
        return strEncodeToString;
    }

    @Nullable
    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdrc zzdrcVar) {
        zzgad zzgadVarZzc = zzc(str);
        if (zzgadVarZzc == null) {
            return null;
        }
        try {
            byte[] bArrZza = ((zzfzi) zzgadVarZzc.zze(zzghg.zza(), zzfzi.class)).zza(bArr, bArr2);
            zzdrcVar.zza().put("ds", "1");
            return new String(bArrZza, "UTF-8");
        } catch (UnsupportedEncodingException | GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "CryptoUtils.decrypt");
            zzdrcVar.zza().put("dsf", e.toString());
            return null;
        }
    }

    @Nullable
    private static final zzgad zzc(String str) {
        try {
            return zzfzl.zza(zzfzj.zzb(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "CryptoUtils.getHandle");
            return null;
        }
    }
}
