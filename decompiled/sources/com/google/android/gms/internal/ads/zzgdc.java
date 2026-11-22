package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgdc {
    public static final /* synthetic */ int zza = 0;
    private static final zzgpo zzb;
    private static final zzggq zzc;
    private static final zzggm zzd;
    private static final zzgft zze;
    private static final zzgfp zzf;

    static {
        zzgpo zzgpoVarZza = zzghq.zza("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zzgpoVarZza;
        zzc = zzggq.zzb(new zzggo() { // from class: com.google.android.gms.internal.ads.zzgcy
            @Override // com.google.android.gms.internal.ads.zzggo
            public final zzghh zza(zzgah zzgahVar) throws GeneralSecurityException {
                zzgnw zzgnwVar;
                zzgcx zzgcxVar = (zzgcx) zzgahVar;
                int i = zzgdc.zza;
                zzgmu zzgmuVarZza = zzgmv.zza();
                zzgmuVarZza.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
                zzgln zzglnVarZzd = zzglo.zzd();
                zzglnVarZzd.zza(zzgcxVar.zza());
                zzgmuVarZza.zzc(((zzglo) zzglnVarZzd.zzal()).zzau());
                zzgcv zzgcvVarZzb = zzgcxVar.zzb();
                if (zzgcv.zza.equals(zzgcvVarZzb)) {
                    zzgnwVar = zzgnw.TINK;
                } else if (zzgcv.zzb.equals(zzgcvVarZzb)) {
                    zzgnwVar = zzgnw.CRUNCHY;
                } else {
                    if (!zzgcv.zzc.equals(zzgcvVarZzb)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzgcvVarZzb))));
                    }
                    zzgnwVar = zzgnw.RAW;
                }
                zzgmuVarZza.zza(zzgnwVar);
                return zzghd.zzb((zzgmv) zzgmuVarZza.zzal());
            }
        }, zzgcx.class, zzghd.class);
        zzd = zzggm.zzb(new zzggk() { // from class: com.google.android.gms.internal.ads.zzgcz
            @Override // com.google.android.gms.internal.ads.zzggk
            public final zzgah zza(zzghh zzghhVar) {
                return zzgdc.zzb((zzghd) zzghhVar);
            }
        }, zzgpoVarZza, zzghd.class);
        zze = zzgft.zza(new zzgfr() { // from class: com.google.android.gms.internal.ads.zzgda
        }, zzgcp.class, zzghc.class);
        zzf = zzgfp.zzb(new zzgfn() { // from class: com.google.android.gms.internal.ads.zzgdb
            @Override // com.google.android.gms.internal.ads.zzgfn
            public final zzfzp zza(zzghh zzghhVar, zzgas zzgasVar) {
                return zzgdc.zza((zzghc) zzghhVar, zzgasVar);
            }
        }, zzgpoVarZza, zzghc.class);
    }

    public static /* synthetic */ zzgcp zza(zzghc zzghcVar, zzgas zzgasVar) throws GeneralSecurityException {
        if (!zzghcVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
        }
        try {
            zzgll zzgllVarZze = zzgll.zze(zzghcVar.zze(), zzgrc.zza());
            if (zzgllVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgcu zzgcuVar = new zzgcu(null);
            zzgcuVar.zzb(zzgllVarZze.zzf().zzd());
            zzgcuVar.zza(12);
            zzgcuVar.zzc(16);
            zzgcuVar.zzd(zzd(zzghcVar.zzc()));
            zzgcx zzgcxVarZze = zzgcuVar.zze();
            zzgcn zzgcnVar = new zzgcn(null);
            zzgcnVar.zzc(zzgcxVarZze);
            zzgcnVar.zzb(zzgpp.zzb(zzgllVarZze.zzf().zzA(), zzgasVar));
            zzgcnVar.zza(zzghcVar.zzf());
            return zzgcnVar.zzd();
        } catch (zzgsc unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static /* synthetic */ zzgcx zzb(zzghd zzghdVar) throws GeneralSecurityException {
        if (!zzghdVar.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters: ".concat(String.valueOf(zzghdVar.zzc().zzh())));
        }
        try {
            zzglo zzgloVarZzf = zzglo.zzf(zzghdVar.zzc().zzg(), zzgrc.zza());
            if (zzgloVarZzf.zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzgcu zzgcuVar = new zzgcu(null);
            zzgcuVar.zzb(zzgloVarZzf.zza());
            zzgcuVar.zza(12);
            zzgcuVar.zzc(16);
            zzgcuVar.zzd(zzd(zzghdVar.zzc().zzf()));
            return zzgcuVar.zze();
        } catch (zzgsc e) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
        }
    }

    public static void zzc(zzggi zzggiVar) throws GeneralSecurityException {
        zzggiVar.zzh(zzc);
        zzggiVar.zzg(zzd);
        zzggiVar.zzf(zze);
        zzggiVar.zze(zzf);
    }

    private static zzgcv zzd(zzgnw zzgnwVar) throws GeneralSecurityException {
        zzgnw zzgnwVar2 = zzgnw.UNKNOWN_PREFIX;
        int iOrdinal = zzgnwVar.ordinal();
        if (iOrdinal == 1) {
            return zzgcv.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgcv.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgnwVar.zza());
            }
        }
        return zzgcv.zzb;
    }
}
