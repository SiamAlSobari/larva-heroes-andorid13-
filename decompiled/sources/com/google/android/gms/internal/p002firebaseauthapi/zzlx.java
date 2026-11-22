package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzlx extends zznf {
    final /* synthetic */ zzly zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzlx(zzly zzlyVar, Class cls) {
        super(cls);
        this.zza = zzlyVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* bridge */ /* synthetic */ zzalp zza(zzalp zzalpVar) throws GeneralSecurityException {
        byte[] bArrZzb;
        byte[] bArrZzb2;
        zzvu zzvuVar = (zzvu) zzalpVar;
        zzvr zzvrVarZzc = zzvuVar.zzd().zzc();
        zzvr zzvrVar = zzvr.KEM_UNKNOWN;
        int iOrdinal = zzvrVarZzc.ordinal();
        if (iOrdinal == 1) {
            bArrZzb = zzor.zzb(32);
            bArrZzb[0] = (byte) (bArrZzb[0] | 7);
            int i = bArrZzb[31] & 63;
            bArrZzb[31] = (byte) i;
            bArrZzb[31] = (byte) (i | 128);
            bArrZzb2 = zzzm.zzb(bArrZzb);
        } else {
            if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
                throw new GeneralSecurityException("Invalid KEM");
            }
            int iZzh = zzmb.zzh(zzvuVar.zzd().zzc());
            KeyPair keyPairZzc = zzym.zzc(zzym.zzi(iZzh));
            ECPoint w = ((ECPublicKey) keyPairZzc.getPublic()).getW();
            EllipticCurve curve = zzym.zzi(iZzh).getCurve();
            zzmq.zzf(w, curve);
            int iZza = zzym.zza(curve);
            int i2 = iZza + iZza + 1;
            bArrZzb2 = new byte[i2];
            byte[] bArrZzb3 = zzmn.zzb(w.getAffineX());
            byte[] bArrZzb4 = zzmn.zzb(w.getAffineY());
            int length = bArrZzb4.length;
            System.arraycopy(bArrZzb4, 0, bArrZzb2, i2 - length, length);
            int length2 = bArrZzb3.length;
            System.arraycopy(bArrZzb3, 0, bArrZzb2, (iZza + 1) - length2, length2);
            bArrZzb2[0] = 4;
            bArrZzb = zzmn.zzc(((ECPrivateKey) keyPairZzc.getPrivate()).getS(), zzmb.zza(zzvrVarZzc));
        }
        zzwc zzwcVarZzc = zzwd.zzc();
        zzwcVarZzc.zzc(0);
        zzwcVarZzc.zza(zzvuVar.zzd());
        zzwcVarZzc.zzb(zzajf.zzn(bArrZzb2, 0, bArrZzb2.length));
        zzwd zzwdVar = (zzwd) zzwcVarZzc.zzi();
        zzvz zzvzVarZzb = zzwa.zzb();
        zzvzVarZzb.zzc(0);
        zzvzVarZzb.zzb(zzwdVar);
        zzvzVarZzb.zza(zzajf.zzn(bArrZzb, 0, bArrZzb.length));
        return (zzwa) zzvzVarZzb.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* synthetic */ zzalp zzb(zzajf zzajfVar) throws zzaks {
        return zzvu.zzc(zzajfVar, zzajx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final Map zzc() throws GeneralSecurityException {
        HashMap map = new HashMap();
        zzkl zzklVarZzc = zzkq.zzc();
        zzklVarZzc.zzd(zzko.zza);
        zzklVarZzc.zzc(zzkn.zzf);
        zzklVarZzc.zzb(zzkm.zza);
        zzklVarZzc.zza(zzkh.zza);
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzklVarZzc.zze());
        zzkl zzklVarZzc2 = zzkq.zzc();
        zzklVarZzc2.zzd(zzko.zzc);
        zzklVarZzc2.zzc(zzkn.zzf);
        zzklVarZzc2.zzb(zzkm.zza);
        zzklVarZzc2.zza(zzkh.zza);
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzklVarZzc2.zze());
        zzkl zzklVarZzc3 = zzkq.zzc();
        zzklVarZzc3.zzd(zzko.zza);
        zzklVarZzc3.zzc(zzkn.zzf);
        zzklVarZzc3.zzb(zzkm.zza);
        zzklVarZzc3.zza(zzkh.zzb);
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzklVarZzc3.zze());
        zzkl zzklVarZzc4 = zzkq.zzc();
        zzklVarZzc4.zzd(zzko.zzc);
        zzklVarZzc4.zzc(zzkn.zzf);
        zzklVarZzc4.zzb(zzkm.zza);
        zzklVarZzc4.zza(zzkh.zzb);
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzklVarZzc4.zze());
        zzkl zzklVarZzc5 = zzkq.zzc();
        zzklVarZzc5.zzd(zzko.zza);
        zzklVarZzc5.zzc(zzkn.zzf);
        zzklVarZzc5.zzb(zzkm.zza);
        zzklVarZzc5.zza(zzkh.zzc);
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", zzklVarZzc5.zze());
        zzkl zzklVarZzc6 = zzkq.zzc();
        zzklVarZzc6.zzd(zzko.zzc);
        zzklVarZzc6.zzc(zzkn.zzf);
        zzklVarZzc6.zzb(zzkm.zza);
        zzklVarZzc6.zza(zzkh.zzc);
        map.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", zzklVarZzc6.zze());
        zzkl zzklVarZzc7 = zzkq.zzc();
        zzklVarZzc7.zzd(zzko.zza);
        zzklVarZzc7.zzc(zzkn.zza);
        zzklVarZzc7.zzb(zzkm.zza);
        zzklVarZzc7.zza(zzkh.zza);
        map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzklVarZzc7.zze());
        zzkl zzklVarZzc8 = zzkq.zzc();
        zzklVarZzc8.zzd(zzko.zzc);
        zzklVarZzc8.zzc(zzkn.zza);
        zzklVarZzc8.zzb(zzkm.zza);
        zzklVarZzc8.zza(zzkh.zza);
        map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzklVarZzc8.zze());
        zzkl zzklVarZzc9 = zzkq.zzc();
        zzklVarZzc9.zzd(zzko.zza);
        zzklVarZzc9.zzc(zzkn.zza);
        zzklVarZzc9.zzb(zzkm.zza);
        zzklVarZzc9.zza(zzkh.zzb);
        map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzklVarZzc9.zze());
        zzkl zzklVarZzc10 = zzkq.zzc();
        zzklVarZzc10.zzd(zzko.zzc);
        zzklVarZzc10.zzc(zzkn.zza);
        zzklVarZzc10.zzb(zzkm.zza);
        zzklVarZzc10.zza(zzkh.zzb);
        map.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzklVarZzc10.zze());
        zzkl zzklVarZzc11 = zzkq.zzc();
        zzklVarZzc11.zzd(zzko.zza);
        zzklVarZzc11.zzc(zzkn.zzb);
        zzklVarZzc11.zzb(zzkm.zzb);
        zzklVarZzc11.zza(zzkh.zza);
        map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", zzklVarZzc11.zze());
        zzkl zzklVarZzc12 = zzkq.zzc();
        zzklVarZzc12.zzd(zzko.zzc);
        zzklVarZzc12.zzc(zzkn.zzb);
        zzklVarZzc12.zzb(zzkm.zzb);
        zzklVarZzc12.zza(zzkh.zza);
        map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", zzklVarZzc12.zze());
        zzkl zzklVarZzc13 = zzkq.zzc();
        zzklVarZzc13.zzd(zzko.zza);
        zzklVarZzc13.zzc(zzkn.zzb);
        zzklVarZzc13.zzb(zzkm.zzb);
        zzklVarZzc13.zza(zzkh.zzb);
        map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", zzklVarZzc13.zze());
        zzkl zzklVarZzc14 = zzkq.zzc();
        zzklVarZzc14.zzd(zzko.zzc);
        zzklVarZzc14.zzc(zzkn.zzb);
        zzklVarZzc14.zzb(zzkm.zzb);
        zzklVarZzc14.zza(zzkh.zzb);
        map.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", zzklVarZzc14.zze());
        zzkl zzklVarZzc15 = zzkq.zzc();
        zzklVarZzc15.zzd(zzko.zza);
        zzklVarZzc15.zzc(zzkn.zzc);
        zzklVarZzc15.zzb(zzkm.zzc);
        zzklVarZzc15.zza(zzkh.zza);
        map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", zzklVarZzc15.zze());
        zzkl zzklVarZzc16 = zzkq.zzc();
        zzklVarZzc16.zzd(zzko.zzc);
        zzklVarZzc16.zzc(zzkn.zzc);
        zzklVarZzc16.zzb(zzkm.zzc);
        zzklVarZzc16.zza(zzkh.zza);
        map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", zzklVarZzc16.zze());
        zzkl zzklVarZzc17 = zzkq.zzc();
        zzklVarZzc17.zzd(zzko.zza);
        zzklVarZzc17.zzc(zzkn.zzc);
        zzklVarZzc17.zzb(zzkm.zzc);
        zzklVarZzc17.zza(zzkh.zzb);
        map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", zzklVarZzc17.zze());
        zzkl zzklVarZzc18 = zzkq.zzc();
        zzklVarZzc18.zzd(zzko.zzc);
        zzklVarZzc18.zzc(zzkn.zzc);
        zzklVarZzc18.zzb(zzkm.zzc);
        zzklVarZzc18.zza(zzkh.zzb);
        map.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", zzklVarZzc18.zze());
        return Collections.unmodifiableMap(map);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* synthetic */ void zzd(zzalp zzalpVar) throws GeneralSecurityException {
        zzmb.zzb(((zzvu) zzalpVar).zzd());
    }
}
