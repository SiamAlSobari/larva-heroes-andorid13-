package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgiu extends zzggv {
    zzgiu(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzggv
    public final /* bridge */ /* synthetic */ Object zza(zzgta zzgtaVar) throws GeneralSecurityException {
        zzgmf zzgmfVar = (zzgmf) zzgtaVar;
        int iZzg = zzgmfVar.zzg().zzg();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzgmfVar.zzh().zzA(), "HMAC");
        int iZza = zzgmfVar.zzg().zza();
        int i = iZzg - 2;
        if (i == 1) {
            return new zzgpk(new zzgpj("HMACSHA1", secretKeySpec), iZza);
        }
        if (i == 2) {
            return new zzgpk(new zzgpj("HMACSHA384", secretKeySpec), iZza);
        }
        if (i == 3) {
            return new zzgpk(new zzgpj("HMACSHA256", secretKeySpec), iZza);
        }
        if (i == 4) {
            return new zzgpk(new zzgpj("HMACSHA512", secretKeySpec), iZza);
        }
        if (i == 5) {
            return new zzgpk(new zzgpj("HMACSHA224", secretKeySpec), iZza);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
