package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgdt {
    public static final /* synthetic */ int zza = 0;
    private static final zzgpo zzb;
    private static final zzggq zzc;
    private static final zzggm zzd;
    private static final zzgft zze;
    private static final zzgfp zzf;

    static {
        zzgpo zzgpoVarZza = zzghq.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zzgpoVarZza;
        zzc = zzggq.zzb(new zzggo() { // from class: com.google.android.gms.internal.ads.zzgdp
            @Override // com.google.android.gms.internal.ads.zzggo
            public final zzghh zza(zzgah zzgahVar) throws GeneralSecurityException {
                zzgnw zzgnwVar;
                zzgdo zzgdoVar = (zzgdo) zzgahVar;
                int i = zzgdt.zza;
                zzgmu zzgmuVarZza = zzgmv.zza();
                zzgmuVarZza.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                zzglt zzgltVarZzd = zzglu.zzd();
                zzgltVarZzd.zza(zzgdoVar.zza());
                zzgmuVarZza.zzc(((zzglu) zzgltVarZzd.zzal()).zzau());
                zzgdm zzgdmVarZzb = zzgdoVar.zzb();
                if (zzgdm.zza.equals(zzgdmVarZzb)) {
                    zzgnwVar = zzgnw.TINK;
                } else if (zzgdm.zzb.equals(zzgdmVarZzb)) {
                    zzgnwVar = zzgnw.CRUNCHY;
                } else {
                    if (!zzgdm.zzc.equals(zzgdmVarZzb)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzgdmVarZzb))));
                    }
                    zzgnwVar = zzgnw.RAW;
                }
                zzgmuVarZza.zza(zzgnwVar);
                return zzghd.zzb((zzgmv) zzgmuVarZza.zzal());
            }
        }, zzgdo.class, zzghd.class);
        zzd = zzggm.zzb(new zzggk() { // from class: com.google.android.gms.internal.ads.zzgdq
            @Override // com.google.android.gms.internal.ads.zzggk
            public final zzgah zza(zzghh zzghhVar) {
                return zzgdt.zzb((zzghd) zzghhVar);
            }
        }, zzgpoVarZza, zzghd.class);
        zze = zzgft.zza(new zzgfr() { // from class: com.google.android.gms.internal.ads.zzgdr
        }, zzgdg.class, zzghc.class);
        zzf = zzgfp.zzb(new zzgfn() { // from class: com.google.android.gms.internal.ads.zzgds
            @Override // com.google.android.gms.internal.ads.zzgfn
            public final zzfzp zza(zzghh zzghhVar, zzgas zzgasVar) {
                return zzgdt.zza((zzghc) zzghhVar, zzgasVar);
            }
        }, zzgpoVarZza, zzghc.class);
    }

    public static /* synthetic */ zzgdg zza(zzghc zzghcVar, zzgas zzgasVar) throws GeneralSecurityException {
        if (!zzghcVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
        }
        try {
            zzglr zzglrVarZze = zzglr.zze(zzghcVar.zze(), zzgrc.zza());
            if (zzglrVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgdl zzgdlVar = new zzgdl(null);
            zzgdlVar.zza(zzglrVarZze.zzf().zzd());
            zzgdlVar.zzb(zzd(zzghcVar.zzc()));
            zzgdo zzgdoVarZzc = zzgdlVar.zzc();
            zzgde zzgdeVar = new zzgde(null);
            zzgdeVar.zzc(zzgdoVarZzc);
            zzgdeVar.zzb(zzgpp.zzb(zzglrVarZze.zzf().zzA(), zzgasVar));
            zzgdeVar.zza(zzghcVar.zzf());
            return zzgdeVar.zzd();
        } catch (zzgsc unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static /* synthetic */ zzgdo zzb(zzghd zzghdVar) throws GeneralSecurityException {
        if (!zzghdVar.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters: ".concat(String.valueOf(zzghdVar.zzc().zzh())));
        }
        try {
            zzglu zzgluVarZzf = zzglu.zzf(zzghdVar.zzc().zzg(), zzgrc.zza());
            if (zzgluVarZzf.zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzgdl zzgdlVar = new zzgdl(null);
            zzgdlVar.zza(zzgluVarZzf.zza());
            zzgdlVar.zzb(zzd(zzghdVar.zzc().zzf()));
            return zzgdlVar.zzc();
        } catch (zzgsc e) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e);
        }
    }

    public static void zzc(zzggi zzggiVar) throws GeneralSecurityException {
        zzggiVar.zzh(zzc);
        zzggiVar.zzg(zzd);
        zzggiVar.zzf(zze);
        zzggiVar.zze(zzf);
    }

    private static zzgdm zzd(zzgnw zzgnwVar) throws GeneralSecurityException {
        zzgnw zzgnwVar2 = zzgnw.UNKNOWN_PREFIX;
        int iOrdinal = zzgnwVar.ordinal();
        if (iOrdinal == 1) {
            return zzgdm.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgdm.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgnwVar.zza());
            }
        }
        return zzgdm.zzb;
    }
}
