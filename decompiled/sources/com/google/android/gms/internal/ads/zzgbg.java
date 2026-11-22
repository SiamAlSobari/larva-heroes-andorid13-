package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgbg extends zzgfw {
    zzgbg() {
        super(zzgkn.class, new zzgbe(zzfzi.class));
    }

    static /* bridge */ /* synthetic */ zzgfu zzg(int i, int i2, int i3, int i4, int i5, int i6) {
        zzgkv zzgkvVarZzc = zzgkw.zzc();
        zzgky zzgkyVarZzc = zzgkz.zzc();
        zzgkyVarZzc.zza(16);
        zzgkvVarZzc.zzb((zzgkz) zzgkyVarZzc.zzal());
        zzgkvVarZzc.zza(i);
        zzgkw zzgkwVar = (zzgkw) zzgkvVarZzc.zzal();
        zzgmh zzgmhVarZzd = zzgmi.zzd();
        zzgmk zzgmkVarZzc = zzgml.zzc();
        zzgmkVarZzc.zzb(5);
        zzgmkVarZzc.zza(i4);
        zzgmhVarZzd.zzb((zzgml) zzgmkVarZzc.zzal());
        zzgmhVarZzd.zza(32);
        zzgmi zzgmiVar = (zzgmi) zzgmhVarZzd.zzal();
        zzgkp zzgkpVarZza = zzgkq.zza();
        zzgkpVarZza.zza(zzgkwVar);
        zzgkpVarZza.zzb(zzgmiVar);
        return new zzgfu((zzgkq) zzgkpVarZza.zzal(), i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final zzgfv zza() {
        return new zzgbf(this, zzgkq.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final zzgmp zzb() {
        return zzgmp.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final /* synthetic */ zzgta zzc(zzgqi zzgqiVar) throws zzgsc {
        return zzgkn.zze(zzgqiVar, zzgrc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final /* bridge */ /* synthetic */ void zze(zzgta zzgtaVar) throws GeneralSecurityException {
        zzgkn zzgknVar = (zzgkn) zzgtaVar;
        zzgpm.zzb(zzgknVar.zza(), 0);
        new zzgbu();
        zzgbu.zzh(zzgknVar.zzf());
        new zzgiw();
        zzgiw.zzm(zzgknVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final int zzf() {
        return 2;
    }
}
