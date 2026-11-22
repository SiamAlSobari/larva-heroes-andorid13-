package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgiw extends zzgfw {
    private static final zzggu zza = zzggu.zzb(new zzggs() { // from class: com.google.android.gms.internal.ads.zzgis
        @Override // com.google.android.gms.internal.ads.zzggs
        public final Object zza(zzfzp zzfzpVar) {
            return new zzgjl((zzgir) zzfzpVar);
        }
    }, zzgir.class, zzgik.class);
    private static final zzggu zzb = zzggu.zzb(new zzggs() { // from class: com.google.android.gms.internal.ads.zzgit
        @Override // com.google.android.gms.internal.ads.zzggs
        public final Object zza(zzfzp zzfzpVar) {
            return zzgpk.zzc((zzgir) zzfzpVar);
        }
    }, zzgir.class, zzgag.class);

    public zzgiw() {
        super(zzgmf.class, new zzgiu(zzgag.class));
    }

    public static void zzh(boolean z) throws GeneralSecurityException {
        zzgar.zze(new zzgiw(), true);
        int i = zzgjq.zza;
        zzgjq.zzc(zzggi.zzc());
        zzggg.zza().zze(zza);
        zzggg.zza().zze(zzb);
    }

    public static final void zzm(zzgmf zzgmfVar) throws GeneralSecurityException {
        zzgpm.zzb(zzgmfVar.zza(), 0);
        if (zzgmfVar.zzh().zzd() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zzo(zzgmfVar.zzg());
    }

    static /* bridge */ /* synthetic */ zzgfu zzn(int i, int i2, int i3, int i4) {
        zzgmh zzgmhVarZzd = zzgmi.zzd();
        zzgmk zzgmkVarZzc = zzgml.zzc();
        zzgmkVarZzc.zzb(i3);
        zzgmkVarZzc.zza(i2);
        zzgmhVarZzd.zzb((zzgml) zzgmkVarZzc.zzal());
        zzgmhVarZzd.zza(i);
        return new zzgfu((zzgmi) zzgmhVarZzd.zzal(), i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzo(zzgml zzgmlVar) throws GeneralSecurityException {
        if (zzgmlVar.zza() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int iZzg = zzgmlVar.zzg() - 2;
        if (iZzg == 1) {
            if (zzgmlVar.zza() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iZzg == 2) {
            if (zzgmlVar.zza() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iZzg == 3) {
            if (zzgmlVar.zza() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (iZzg == 4) {
            if (zzgmlVar.zza() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (iZzg != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (zzgmlVar.zza() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final zzgfv zza() {
        return new zzgiv(this, zzgmi.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final zzgmp zzb() {
        return zzgmp.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final /* synthetic */ zzgta zzc(zzgqi zzgqiVar) throws zzgsc {
        return zzgmf.zzf(zzgqiVar, zzgrc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final /* bridge */ /* synthetic */ void zze(zzgta zzgtaVar) throws GeneralSecurityException {
        zzm((zzgmf) zzgtaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final int zzf() {
        return 2;
    }
}
