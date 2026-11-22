package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgbt extends zzgfv {
    final /* synthetic */ zzgbu zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgbt(zzgbu zzgbuVar, Class cls) {
        super(cls);
        this.zza = zzgbuVar;
    }

    public static final zzgkt zzf(zzgkw zzgkwVar) throws GeneralSecurityException {
        zzgks zzgksVarZzc = zzgkt.zzc();
        zzgksVarZzc.zzb(zzgkwVar.zzg());
        byte[] bArrZzb = zzghf.zzb(zzgkwVar.zza());
        zzgksVarZzc.zza(zzgqi.zzv(bArrZzb, 0, bArrZzb.length));
        zzgksVarZzc.zzc(0);
        return (zzgkt) zzgksVarZzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* bridge */ /* synthetic */ zzgta zza(zzgta zzgtaVar) throws GeneralSecurityException {
        return zzf((zzgkw) zzgtaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* synthetic */ zzgta zzb(zzgqi zzgqiVar) throws zzgsc {
        return zzgkw.zzf(zzgqiVar, zzgrc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final void zzd(zzgkw zzgkwVar) throws GeneralSecurityException {
        zzgpm.zza(zzgkwVar.zza());
        zzgbu zzgbuVar = this.zza;
        zzgbu.zzm(zzgkwVar.zzg());
    }
}
