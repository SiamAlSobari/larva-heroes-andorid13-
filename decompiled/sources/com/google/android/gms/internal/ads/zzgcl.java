package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgcl {
    public static final /* synthetic */ int zza = 0;
    private static final zzgpo zzb;
    private static final zzggq zzc;
    private static final zzggm zzd;
    private static final zzgft zze;
    private static final zzgfp zzf;

    static {
        zzgpo zzgpoVarZza = zzghq.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zzgpoVarZza;
        zzc = zzggq.zzb(new zzggo() { // from class: com.google.android.gms.internal.ads.zzgch
            @Override // com.google.android.gms.internal.ads.zzggo
            public final zzghh zza(zzgah zzgahVar) throws GeneralSecurityException {
                zzgnw zzgnwVar;
                zzgcg zzgcgVar = (zzgcg) zzgahVar;
                int i = zzgcl.zza;
                zzgmu zzgmuVarZza = zzgmv.zza();
                zzgmuVarZza.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
                zzgle zzgleVarZzc = zzglf.zzc();
                zzglh zzglhVarZzc = zzgli.zzc();
                zzglhVarZzc.zza(zzgcgVar.zza());
                zzgleVarZzc.zzb((zzgli) zzglhVarZzc.zzal());
                zzgleVarZzc.zza(zzgcgVar.zzb());
                zzgmuVarZza.zzc(((zzglf) zzgleVarZzc.zzal()).zzau());
                zzgce zzgceVarZzc = zzgcgVar.zzc();
                if (zzgce.zza.equals(zzgceVarZzc)) {
                    zzgnwVar = zzgnw.TINK;
                } else if (zzgce.zzb.equals(zzgceVarZzc)) {
                    zzgnwVar = zzgnw.CRUNCHY;
                } else {
                    if (!zzgce.zzc.equals(zzgceVarZzc)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzgceVarZzc))));
                    }
                    zzgnwVar = zzgnw.RAW;
                }
                zzgmuVarZza.zza(zzgnwVar);
                return zzghd.zzb((zzgmv) zzgmuVarZza.zzal());
            }
        }, zzgcg.class, zzghd.class);
        zzd = zzggm.zzb(new zzggk() { // from class: com.google.android.gms.internal.ads.zzgci
            @Override // com.google.android.gms.internal.ads.zzggk
            public final zzgah zza(zzghh zzghhVar) {
                return zzgcl.zzb((zzghd) zzghhVar);
            }
        }, zzgpoVarZza, zzghd.class);
        zze = zzgft.zza(new zzgfr() { // from class: com.google.android.gms.internal.ads.zzgcj
        }, zzgby.class, zzghc.class);
        zzf = zzgfp.zzb(new zzgfn() { // from class: com.google.android.gms.internal.ads.zzgck
            @Override // com.google.android.gms.internal.ads.zzgfn
            public final zzfzp zza(zzghh zzghhVar, zzgas zzgasVar) {
                return zzgcl.zza((zzghc) zzghhVar, zzgasVar);
            }
        }, zzgpoVarZza, zzghc.class);
    }

    public static /* synthetic */ zzgby zza(zzghc zzghcVar, zzgas zzgasVar) throws GeneralSecurityException {
        if (!zzghcVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
        }
        try {
            zzglc zzglcVarZze = zzglc.zze(zzghcVar.zze(), zzgrc.zza());
            if (zzglcVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgcd zzgcdVar = new zzgcd(null);
            zzgcdVar.zzb(zzglcVarZze.zzg().zzd());
            zzgcdVar.zza(zzglcVarZze.zzf().zza());
            zzgcdVar.zzc(16);
            zzgcdVar.zzd(zzd(zzghcVar.zzc()));
            zzgcg zzgcgVarZze = zzgcdVar.zze();
            zzgbw zzgbwVar = new zzgbw(null);
            zzgbwVar.zzc(zzgcgVarZze);
            zzgbwVar.zzb(zzgpp.zzb(zzglcVarZze.zzg().zzA(), zzgasVar));
            zzgbwVar.zza(zzghcVar.zzf());
            return zzgbwVar.zzd();
        } catch (zzgsc unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static /* synthetic */ zzgcg zzb(zzghd zzghdVar) throws GeneralSecurityException {
        if (!zzghdVar.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters: ".concat(String.valueOf(zzghdVar.zzc().zzh())));
        }
        try {
            zzglf zzglfVarZze = zzglf.zze(zzghdVar.zzc().zzg(), zzgrc.zza());
            zzgcd zzgcdVar = new zzgcd(null);
            zzgcdVar.zzb(zzglfVarZze.zza());
            zzgcdVar.zza(zzglfVarZze.zzf().zza());
            zzgcdVar.zzc(16);
            zzgcdVar.zzd(zzd(zzghdVar.zzc().zzf()));
            return zzgcdVar.zze();
        } catch (zzgsc e) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e);
        }
    }

    public static void zzc(zzggi zzggiVar) throws GeneralSecurityException {
        zzggiVar.zzh(zzc);
        zzggiVar.zzg(zzd);
        zzggiVar.zzf(zze);
        zzggiVar.zze(zzf);
    }

    private static zzgce zzd(zzgnw zzgnwVar) throws GeneralSecurityException {
        zzgnw zzgnwVar2 = zzgnw.UNKNOWN_PREFIX;
        int iOrdinal = zzgnwVar.ordinal();
        if (iOrdinal == 1) {
            return zzgce.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgce.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgnwVar.zza());
            }
        }
        return zzgce.zzb;
    }
}
