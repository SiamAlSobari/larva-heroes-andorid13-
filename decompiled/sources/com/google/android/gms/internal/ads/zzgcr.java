package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgcr extends zzgfv {
    final /* synthetic */ zzgcs zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgcr(zzgcs zzgcsVar, Class cls) {
        super(cls);
        this.zza = zzgcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* bridge */ /* synthetic */ zzgta zza(zzgta zzgtaVar) throws GeneralSecurityException {
        zzglk zzglkVarZzc = zzgll.zzc();
        byte[] bArrZzb = zzghf.zzb(((zzglo) zzgtaVar).zza());
        zzglkVarZzc.zza(zzgqi.zzv(bArrZzb, 0, bArrZzb.length));
        zzglkVarZzc.zzb(0);
        return (zzgll) zzglkVarZzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* synthetic */ zzgta zzb(zzgqi zzgqiVar) throws zzgsc {
        return zzglo.zzf(zzgqiVar, zzgrc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_GCM", zzgcs.zzg(16, 1));
        map.put("AES128_GCM_RAW", zzgcs.zzg(16, 3));
        map.put("AES256_GCM", zzgcs.zzg(32, 1));
        map.put("AES256_GCM_RAW", zzgcs.zzg(32, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* synthetic */ void zzd(zzgta zzgtaVar) throws GeneralSecurityException {
        zzgpm.zza(((zzglo) zzgtaVar).zza());
    }
}
