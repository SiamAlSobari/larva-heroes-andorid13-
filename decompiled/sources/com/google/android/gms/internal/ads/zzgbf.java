package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgbf extends zzgfv {
    final /* synthetic */ zzgbg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgbf(zzgbg zzgbgVar, Class cls) {
        super(cls);
        this.zza = zzgbgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* bridge */ /* synthetic */ zzgta zza(zzgta zzgtaVar) throws GeneralSecurityException {
        zzgkq zzgkqVar = (zzgkq) zzgtaVar;
        new zzgbu();
        zzgkt zzgktVarZzf = zzgbt.zzf(zzgkqVar.zze());
        zzgta zzgtaVarZza = new zzgiw().zza().zza(zzgkqVar.zzf());
        zzgkm zzgkmVarZzc = zzgkn.zzc();
        zzgkmVarZzc.zza(zzgktVarZzf);
        zzgkmVarZzc.zzb((zzgmf) zzgtaVarZza);
        zzgkmVarZzc.zzc(0);
        return (zzgkn) zzgkmVarZzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* synthetic */ zzgta zzb(zzgqi zzgqiVar) throws zzgsc {
        return zzgkq.zzd(zzgqiVar, zzgrc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", zzgbg.zzg(16, 16, 32, 16, 5, 1));
        map.put("AES128_CTR_HMAC_SHA256_RAW", zzgbg.zzg(16, 16, 32, 16, 5, 3));
        map.put("AES256_CTR_HMAC_SHA256", zzgbg.zzg(32, 16, 32, 32, 5, 1));
        map.put("AES256_CTR_HMAC_SHA256_RAW", zzgbg.zzg(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* bridge */ /* synthetic */ void zzd(zzgta zzgtaVar) throws GeneralSecurityException {
        zzgkq zzgkqVar = (zzgkq) zzgtaVar;
        ((zzgbt) new zzgbu().zza()).zzd(zzgkqVar.zze());
        new zzgiw().zza().zzd(zzgkqVar.zzf());
        zzgpm.zza(zzgkqVar.zze().zza());
    }
}
