package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzghz extends zzgfw {
    private static final zzggu zza = zzggu.zzb(new zzggs() { // from class: com.google.android.gms.internal.ads.zzghv
        @Override // com.google.android.gms.internal.ads.zzggs
        public final Object zza(zzfzp zzfzpVar) {
            return new zzgjk((zzghu) zzfzpVar);
        }
    }, zzghu.class, zzgik.class);
    private static final zzggu zzb = zzggu.zzb(new zzggs() { // from class: com.google.android.gms.internal.ads.zzghw
        @Override // com.google.android.gms.internal.ads.zzggs
        public final Object zza(zzfzp zzfzpVar) {
            return zzgpk.zzb((zzghu) zzfzpVar);
        }
    }, zzghu.class, zzgag.class);

    zzghz() {
        super(zzgke.class, new zzghx(zzgag.class));
    }

    public static void zzm(boolean z) throws GeneralSecurityException {
        zzgar.zze(new zzghz(), true);
        int i = zzgij.zza;
        zzgij.zzc(zzggi.zzc());
        zzggg.zza().zze(zza);
        zzggg.zza().zze(zzb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(zzgkk zzgkkVar) throws GeneralSecurityException {
        if (zzgkkVar.zza() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (zzgkkVar.zza() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzo(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final zzgfv zza() {
        return new zzghy(this, zzgkh.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final zzgmp zzb() {
        return zzgmp.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final /* synthetic */ zzgta zzc(zzgqi zzgqiVar) throws zzgsc {
        return zzgke.zze(zzgqiVar, zzgrc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final /* bridge */ /* synthetic */ void zze(zzgta zzgtaVar) throws GeneralSecurityException {
        zzgke zzgkeVar = (zzgke) zzgtaVar;
        zzgpm.zzb(zzgkeVar.zza(), 0);
        zzo(zzgkeVar.zzg().zzd());
        zzn(zzgkeVar.zzf());
    }
}
