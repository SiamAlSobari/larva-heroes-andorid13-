package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzjk extends zznf {
    final /* synthetic */ zzjl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzjk(zzjl zzjlVar, Class cls) {
        super(cls);
        this.zza = zzjlVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* bridge */ /* synthetic */ zzalp zza(zzalp zzalpVar) throws GeneralSecurityException {
        zzuj zzujVar = (zzuj) zzalpVar;
        KeyPair keyPairZzc = zzym.zzc(zzym.zzi(zzlj.zzc(zzujVar.zzd().zzf().zzd())));
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairZzc.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairZzc.getPrivate();
        ECPoint w = eCPublicKey.getW();
        zzur zzurVarZzc = zzus.zzc();
        zzurVarZzc.zzb(0);
        zzurVarZzc.zza(zzujVar.zzd());
        byte[] byteArray = w.getAffineX().toByteArray();
        zzajf zzajfVar = zzajf.zzb;
        zzurVarZzc.zzc(zzajf.zzn(byteArray, 0, byteArray.length));
        byte[] byteArray2 = w.getAffineY().toByteArray();
        zzurVarZzc.zzd(zzajf.zzn(byteArray2, 0, byteArray2.length));
        zzus zzusVar = (zzus) zzurVarZzc.zzi();
        zzuo zzuoVarZzb = zzup.zzb();
        zzuoVarZzb.zzc(0);
        zzuoVarZzb.zzb(zzusVar);
        byte[] byteArray3 = eCPrivateKey.getS().toByteArray();
        zzuoVarZzb.zza(zzajf.zzn(byteArray3, 0, byteArray3.length));
        return (zzup) zzuoVarZzb.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* synthetic */ zzalp zzb(zzajf zzajfVar) throws zzaks {
        return zzuj.zzc(zzajfVar, zzajx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        zzjr zzjrVar = new zzjr(null);
        zzjrVar.zza(zzjs.zza);
        zzjrVar.zzc(zzjt.zzc);
        zzjrVar.zzd(zzju.zzb);
        zzjrVar.zzf(zzjv.zza);
        zzev zzevVarZzc = zzey.zzc();
        zzevVarZzc.zza(12);
        zzevVarZzc.zzb(16);
        zzevVarZzc.zzc(16);
        zzevVarZzc.zzd(zzew.zzc);
        zzjrVar.zzb(zzevVarZzc.zze());
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zzjrVar.zzg());
        zzjr zzjrVar2 = new zzjr(null);
        zzjrVar2.zza(zzjs.zza);
        zzjrVar2.zzc(zzjt.zzc);
        zzjrVar2.zzd(zzju.zzb);
        zzjrVar2.zzf(zzjv.zzc);
        zzev zzevVarZzc2 = zzey.zzc();
        zzevVarZzc2.zza(12);
        zzevVarZzc2.zzb(16);
        zzevVarZzc2.zzc(16);
        zzevVarZzc2.zzd(zzew.zzc);
        zzjrVar2.zzb(zzevVarZzc2.zze());
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzjrVar2.zzg());
        zzjr zzjrVar3 = new zzjr(null);
        zzjrVar3.zza(zzjs.zza);
        zzjrVar3.zzc(zzjt.zzc);
        zzjrVar3.zzd(zzju.zza);
        zzjrVar3.zzf(zzjv.zza);
        zzev zzevVarZzc3 = zzey.zzc();
        zzevVarZzc3.zza(12);
        zzevVarZzc3.zzb(16);
        zzevVarZzc3.zzc(16);
        zzevVarZzc3.zzd(zzew.zzc);
        zzjrVar3.zzb(zzevVarZzc3.zze());
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zzjrVar3.zzg());
        zzjr zzjrVar4 = new zzjr(null);
        zzjrVar4.zza(zzjs.zza);
        zzjrVar4.zzc(zzjt.zzc);
        zzjrVar4.zzd(zzju.zza);
        zzjrVar4.zzf(zzjv.zzc);
        zzev zzevVarZzc4 = zzey.zzc();
        zzevVarZzc4.zza(12);
        zzevVarZzc4.zzb(16);
        zzevVarZzc4.zzc(16);
        zzevVarZzc4.zzd(zzew.zzc);
        zzjrVar4.zzb(zzevVarZzc4.zze());
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzjrVar4.zzg());
        zzjr zzjrVar5 = new zzjr(null);
        zzjrVar5.zza(zzjs.zza);
        zzjrVar5.zzc(zzjt.zzc);
        zzjrVar5.zzd(zzju.zza);
        zzjrVar5.zzf(zzjv.zzc);
        zzev zzevVarZzc5 = zzey.zzc();
        zzevVarZzc5.zza(12);
        zzevVarZzc5.zzb(16);
        zzevVarZzc5.zzc(16);
        zzevVarZzc5.zzd(zzew.zzc);
        zzjrVar5.zzb(zzevVarZzc5.zze());
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzjrVar5.zzg());
        zzjr zzjrVar6 = new zzjr(null);
        zzjrVar6.zza(zzjs.zza);
        zzjrVar6.zzc(zzjt.zzc);
        zzjrVar6.zzd(zzju.zzb);
        zzjrVar6.zzf(zzjv.zza);
        zzdj zzdjVarZzf = zzdn.zzf();
        zzdjVarZzf.zza(16);
        zzdjVarZzf.zzc(32);
        zzdjVarZzf.zze(16);
        zzdjVarZzf.zzd(16);
        zzdjVarZzf.zzb(zzdk.zzc);
        zzdjVarZzf.zzf(zzdl.zzc);
        zzjrVar6.zzb(zzdjVarZzf.zzg());
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzjrVar6.zzg());
        zzjr zzjrVar7 = new zzjr(null);
        zzjrVar7.zza(zzjs.zza);
        zzjrVar7.zzc(zzjt.zzc);
        zzjrVar7.zzd(zzju.zzb);
        zzjrVar7.zzf(zzjv.zzc);
        zzdj zzdjVarZzf2 = zzdn.zzf();
        zzdjVarZzf2.zza(16);
        zzdjVarZzf2.zzc(32);
        zzdjVarZzf2.zze(16);
        zzdjVarZzf2.zzd(16);
        zzdjVarZzf2.zzb(zzdk.zzc);
        zzdjVarZzf2.zzf(zzdl.zzc);
        zzjrVar7.zzb(zzdjVarZzf2.zzg());
        map.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzjrVar7.zzg());
        zzjr zzjrVar8 = new zzjr(null);
        zzjrVar8.zza(zzjs.zza);
        zzjrVar8.zzc(zzjt.zzc);
        zzjrVar8.zzd(zzju.zza);
        zzjrVar8.zzf(zzjv.zza);
        zzdj zzdjVarZzf3 = zzdn.zzf();
        zzdjVarZzf3.zza(16);
        zzdjVarZzf3.zzc(32);
        zzdjVarZzf3.zze(16);
        zzdjVarZzf3.zzd(16);
        zzdjVarZzf3.zzb(zzdk.zzc);
        zzdjVarZzf3.zzf(zzdl.zzc);
        zzjrVar8.zzb(zzdjVarZzf3.zzg());
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzjrVar8.zzg());
        zzjr zzjrVar9 = new zzjr(null);
        zzjrVar9.zza(zzjs.zza);
        zzjrVar9.zzc(zzjt.zzc);
        zzjrVar9.zzd(zzju.zza);
        zzjrVar9.zzf(zzjv.zzc);
        zzdj zzdjVarZzf4 = zzdn.zzf();
        zzdjVarZzf4.zza(16);
        zzdjVarZzf4.zzc(32);
        zzdjVarZzf4.zze(16);
        zzdjVarZzf4.zzd(16);
        zzdjVarZzf4.zzb(zzdk.zzc);
        zzdjVarZzf4.zzf(zzdl.zzc);
        zzjrVar9.zzb(zzdjVarZzf4.zzg());
        map.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzjrVar9.zzg());
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* synthetic */ void zzd(zzalp zzalpVar) throws GeneralSecurityException {
        zzlj.zzb(((zzuj) zzalpVar).zzd());
    }
}
