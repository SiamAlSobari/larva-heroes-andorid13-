package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgca extends zzgfv {
    final /* synthetic */ zzgcb zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgca(zzgcb zzgcbVar, Class cls) {
        super(cls);
        this.zza = zzgcbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* bridge */ /* synthetic */ zzgta zza(zzgta zzgtaVar) throws GeneralSecurityException {
        zzglf zzglfVar = (zzglf) zzgtaVar;
        zzglb zzglbVarZzc = zzglc.zzc();
        byte[] bArrZzb = zzghf.zzb(zzglfVar.zza());
        zzglbVarZzc.zza(zzgqi.zzv(bArrZzb, 0, bArrZzb.length));
        zzglbVarZzc.zzb(zzglfVar.zzf());
        zzglbVarZzc.zzc(0);
        return (zzglc) zzglbVarZzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* synthetic */ zzgta zzb(zzgqi zzgqiVar) throws zzgsc {
        return zzglf.zze(zzgqiVar, zzgrc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("AES128_EAX", zzgcb.zzg(16, 16, 1));
        map.put("AES128_EAX_RAW", zzgcb.zzg(16, 16, 3));
        map.put("AES256_EAX", zzgcb.zzg(32, 16, 1));
        map.put("AES256_EAX_RAW", zzgcb.zzg(32, 16, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* bridge */ /* synthetic */ void zzd(zzgta zzgtaVar) throws GeneralSecurityException {
        zzglf zzglfVar = (zzglf) zzgtaVar;
        zzgpm.zza(zzglfVar.zza());
        if (zzglfVar.zzf().zza() != 12 && zzglfVar.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
