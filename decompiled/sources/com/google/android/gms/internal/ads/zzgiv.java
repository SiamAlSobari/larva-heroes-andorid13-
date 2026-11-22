package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgiv extends zzgfv {
    final /* synthetic */ zzgiw zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgiv(zzgiw zzgiwVar, Class cls) {
        super(cls);
        this.zza = zzgiwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* bridge */ /* synthetic */ zzgta zza(zzgta zzgtaVar) throws GeneralSecurityException {
        zzgmi zzgmiVar = (zzgmi) zzgtaVar;
        zzgme zzgmeVarZzc = zzgmf.zzc();
        zzgmeVarZzc.zzc(0);
        zzgmeVarZzc.zzb(zzgmiVar.zzh());
        byte[] bArrZzb = zzghf.zzb(zzgmiVar.zza());
        zzgmeVarZzc.zza(zzgqi.zzv(bArrZzb, 0, bArrZzb.length));
        return (zzgmf) zzgmeVarZzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* synthetic */ zzgta zzb(zzgqi zzgqiVar) throws zzgsc {
        return zzgmi.zzg(zzgqiVar, zzgrc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", zzgiw.zzn(32, 16, 5, 1));
        map.put("HMAC_SHA256_128BITTAG_RAW", zzgiw.zzn(32, 16, 5, 3));
        map.put("HMAC_SHA256_256BITTAG", zzgiw.zzn(32, 32, 5, 1));
        map.put("HMAC_SHA256_256BITTAG_RAW", zzgiw.zzn(32, 32, 5, 3));
        map.put("HMAC_SHA512_128BITTAG", zzgiw.zzn(64, 16, 6, 1));
        map.put("HMAC_SHA512_128BITTAG_RAW", zzgiw.zzn(64, 16, 6, 3));
        map.put("HMAC_SHA512_256BITTAG", zzgiw.zzn(64, 32, 6, 1));
        map.put("HMAC_SHA512_256BITTAG_RAW", zzgiw.zzn(64, 32, 6, 3));
        map.put("HMAC_SHA512_512BITTAG", zzgiw.zzn(64, 64, 6, 1));
        map.put("HMAC_SHA512_512BITTAG_RAW", zzgiw.zzn(64, 64, 6, 3));
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* bridge */ /* synthetic */ void zzd(zzgta zzgtaVar) throws GeneralSecurityException {
        zzgmi zzgmiVar = (zzgmi) zzgtaVar;
        if (zzgmiVar.zza() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zzgiw.zzo(zzgmiVar.zzh());
    }
}
