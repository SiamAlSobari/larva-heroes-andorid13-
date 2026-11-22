package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgcb extends zzgfw {
    zzgcb() {
        super(zzglc.class, new zzgbz(zzfzi.class));
    }

    static /* bridge */ /* synthetic */ zzgfu zzg(int i, int i2, int i3) {
        zzgle zzgleVarZzc = zzglf.zzc();
        zzgleVarZzc.zza(i);
        zzglh zzglhVarZzc = zzgli.zzc();
        zzglhVarZzc.zza(16);
        zzgleVarZzc.zzb((zzgli) zzglhVarZzc.zzal());
        return new zzgfu((zzglf) zzgleVarZzc.zzal(), i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final zzgfv zza() {
        return new zzgca(this, zzglf.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final zzgmp zzb() {
        return zzgmp.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final /* synthetic */ zzgta zzc(zzgqi zzgqiVar) throws zzgsc {
        return zzglc.zze(zzgqiVar, zzgrc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final /* bridge */ /* synthetic */ void zze(zzgta zzgtaVar) throws GeneralSecurityException {
        zzglc zzglcVar = (zzglc) zzgtaVar;
        zzgpm.zzb(zzglcVar.zza(), 0);
        zzgpm.zza(zzglcVar.zzg().zzd());
        if (zzglcVar.zzf().zza() != 12 && zzglcVar.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
