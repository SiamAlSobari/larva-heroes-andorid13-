package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzjm extends zzog {
    zzjm(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzog
    public final /* bridge */ /* synthetic */ Object zza(zzalp zzalpVar) throws GeneralSecurityException {
        zzus zzusVar = (zzus) zzalpVar;
        zzum zzumVarZzb = zzusVar.zzb();
        zzuv zzuvVarZzf = zzumVarZzb.zzf();
        int iZzc = zzlj.zzc(zzuvVarZzf.zzd());
        byte[] bArrZzq = zzusVar.zzg().zzq();
        byte[] bArrZzq2 = zzusVar.zzh().zzq();
        ECParameterSpec eCParameterSpecZzi = zzym.zzi(iZzc);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArrZzq), new BigInteger(1, bArrZzq2));
        zzmq.zzf(eCPoint, eCParameterSpecZzi.getCurve());
        return new zzyj((ECPublicKey) ((KeyFactory) zzyv.zzg.zza("EC")).generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpecZzi)), zzuvVarZzf.zzf().zzq(), zzlj.zza(zzuvVarZzf.zze()), zzlj.zzd(zzumVarZzb.zza()), new zzlk(zzumVarZzb.zzb().zzd()));
    }
}
