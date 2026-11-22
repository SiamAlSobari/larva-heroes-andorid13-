package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzghy extends zzgfv {
    zzghy(zzghz zzghzVar, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* bridge */ /* synthetic */ zzgta zza(zzgta zzgtaVar) throws GeneralSecurityException {
        zzgkh zzgkhVar = (zzgkh) zzgtaVar;
        zzgkd zzgkdVarZzc = zzgke.zzc();
        zzgkdVarZzc.zzc(0);
        byte[] bArrZzb = zzghf.zzb(zzgkhVar.zza());
        zzgkdVarZzc.zza(zzgqi.zzv(bArrZzb, 0, bArrZzb.length));
        zzgkdVarZzc.zzb(zzgkhVar.zzf());
        return (zzgke) zzgkdVarZzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* synthetic */ zzgta zzb(zzgqi zzgqiVar) throws zzgsc {
        return zzgkh.zze(zzgqiVar, zzgrc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        zzgkg zzgkgVarZzc = zzgkh.zzc();
        zzgkgVarZzc.zza(32);
        zzgkj zzgkjVarZzc = zzgkk.zzc();
        zzgkjVarZzc.zza(16);
        zzgkgVarZzc.zzb((zzgkk) zzgkjVarZzc.zzal());
        map.put("AES_CMAC", new zzgfu((zzgkh) zzgkgVarZzc.zzal(), 1));
        zzgkg zzgkgVarZzc2 = zzgkh.zzc();
        zzgkgVarZzc2.zza(32);
        zzgkj zzgkjVarZzc2 = zzgkk.zzc();
        zzgkjVarZzc2.zza(16);
        zzgkgVarZzc2.zzb((zzgkk) zzgkjVarZzc2.zzal());
        map.put("AES256_CMAC", new zzgfu((zzgkh) zzgkgVarZzc2.zzal(), 1));
        zzgkg zzgkgVarZzc3 = zzgkh.zzc();
        zzgkgVarZzc3.zza(32);
        zzgkj zzgkjVarZzc3 = zzgkk.zzc();
        zzgkjVarZzc3.zza(16);
        zzgkgVarZzc3.zzb((zzgkk) zzgkjVarZzc3.zzal());
        map.put("AES256_CMAC_RAW", new zzgfu((zzgkh) zzgkgVarZzc3.zzal(), 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* bridge */ /* synthetic */ void zzd(zzgta zzgtaVar) throws GeneralSecurityException {
        zzgkh zzgkhVar = (zzgkh) zzgtaVar;
        zzghz.zzn(zzgkhVar.zzf());
        zzghz.zzo(zzgkhVar.zza());
    }
}
