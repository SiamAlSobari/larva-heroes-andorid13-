package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgdi extends zzgfv {
    final /* synthetic */ zzgdj zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgdi(zzgdj zzgdjVar, Class cls) {
        super(cls);
        this.zza = zzgdjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* bridge */ /* synthetic */ zzgta zza(zzgta zzgtaVar) throws GeneralSecurityException {
        zzglq zzglqVarZzc = zzglr.zzc();
        byte[] bArrZzb = zzghf.zzb(((zzglu) zzgtaVar).zza());
        zzglqVarZzc.zza(zzgqi.zzv(bArrZzb, 0, bArrZzb.length));
        zzglqVarZzc.zzb(0);
        return (zzglr) zzglqVarZzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* synthetic */ zzgta zzb(zzgqi zzgqiVar) throws zzgsc {
        return zzglu.zzf(zzgqiVar, zzgrc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_GCM_SIV", zzgdj.zzh(16, 1));
        map.put("AES128_GCM_SIV_RAW", zzgdj.zzh(16, 3));
        map.put("AES256_GCM_SIV", zzgdj.zzh(32, 1));
        map.put("AES256_GCM_SIV_RAW", zzgdj.zzh(32, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* synthetic */ void zzd(zzgta zzgtaVar) throws GeneralSecurityException {
        zzgpm.zza(((zzglu) zzgtaVar).zza());
    }
}
