package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgbr {
    public static final /* synthetic */ int zza = 0;
    private static final zzgpo zzb;
    private static final zzggq zzc;
    private static final zzggm zzd;
    private static final zzgft zze;
    private static final zzgfp zzf;

    static {
        zzgpo zzgpoVarZza = zzghq.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zzgpoVarZza;
        zzc = zzggq.zzb(new zzggo() { // from class: com.google.android.gms.internal.ads.zzgbn
            @Override // com.google.android.gms.internal.ads.zzggo
            public final zzghh zza(zzgah zzgahVar) throws GeneralSecurityException {
                int i;
                zzgnw zzgnwVar;
                zzgbm zzgbmVar = (zzgbm) zzgahVar;
                int i2 = zzgbr.zza;
                zzgmu zzgmuVarZza = zzgmv.zza();
                zzgmuVarZza.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                zzgkp zzgkpVarZza = zzgkq.zza();
                zzgkv zzgkvVarZzc = zzgkw.zzc();
                zzgky zzgkyVarZzc = zzgkz.zzc();
                zzgkyVarZzc.zza(zzgbmVar.zzc());
                zzgkvVarZzc.zzb((zzgkz) zzgkyVarZzc.zzal());
                zzgkvVarZzc.zza(zzgbmVar.zza());
                zzgkpVarZza.zza((zzgkw) zzgkvVarZzc.zzal());
                zzgmh zzgmhVarZzd = zzgmi.zzd();
                zzgmk zzgmkVarZzc = zzgml.zzc();
                zzgmkVarZzc.zza(zzgbmVar.zzd());
                zzgbj zzgbjVarZze = zzgbmVar.zze();
                if (zzgbj.zza.equals(zzgbjVarZze)) {
                    i = 3;
                } else if (zzgbj.zzb.equals(zzgbjVarZze)) {
                    i = 7;
                } else if (zzgbj.zzc.equals(zzgbjVarZze)) {
                    i = 5;
                } else if (zzgbj.zzd.equals(zzgbjVarZze)) {
                    i = 4;
                } else {
                    if (!zzgbj.zze.equals(zzgbjVarZze)) {
                        throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(String.valueOf(zzgbjVarZze))));
                    }
                    i = 6;
                }
                zzgmkVarZzc.zzb(i);
                zzgmhVarZzd.zzb((zzgml) zzgmkVarZzc.zzal());
                zzgmhVarZzd.zza(zzgbmVar.zzb());
                zzgkpVarZza.zzb((zzgmi) zzgmhVarZzd.zzal());
                zzgmuVarZza.zzc(((zzgkq) zzgkpVarZza.zzal()).zzau());
                zzgbk zzgbkVarZzf = zzgbmVar.zzf();
                if (zzgbk.zza.equals(zzgbkVarZzf)) {
                    zzgnwVar = zzgnw.TINK;
                } else if (zzgbk.zzb.equals(zzgbkVarZzf)) {
                    zzgnwVar = zzgnw.CRUNCHY;
                } else {
                    if (!zzgbk.zzc.equals(zzgbkVarZzf)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzgbkVarZzf))));
                    }
                    zzgnwVar = zzgnw.RAW;
                }
                zzgmuVarZza.zza(zzgnwVar);
                return zzghd.zzb((zzgmv) zzgmuVarZza.zzal());
            }
        }, zzgbm.class, zzghd.class);
        zzd = zzggm.zzb(new zzggk() { // from class: com.google.android.gms.internal.ads.zzgbo
            @Override // com.google.android.gms.internal.ads.zzggk
            public final zzgah zza(zzghh zzghhVar) {
                return zzgbr.zzb((zzghd) zzghhVar);
            }
        }, zzgpoVarZza, zzghd.class);
        zze = zzgft.zza(new zzgfr() { // from class: com.google.android.gms.internal.ads.zzgbp
        }, zzgbd.class, zzghc.class);
        zzf = zzgfp.zzb(new zzgfn() { // from class: com.google.android.gms.internal.ads.zzgbq
            @Override // com.google.android.gms.internal.ads.zzgfn
            public final zzfzp zza(zzghh zzghhVar, zzgas zzgasVar) {
                return zzgbr.zza((zzghc) zzghhVar, zzgasVar);
            }
        }, zzgpoVarZza, zzghc.class);
    }

    public static /* synthetic */ zzgbd zza(zzghc zzghcVar, zzgas zzgasVar) throws GeneralSecurityException {
        if (!zzghcVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zzgkn zzgknVarZze = zzgkn.zze(zzghcVar.zze(), zzgrc.zza());
            if (zzgknVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzgknVarZze.zzf().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zzgknVarZze.zzg().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            zzgbi zzgbiVar = new zzgbi(null);
            zzgbiVar.zza(zzgknVarZze.zzf().zzh().zzd());
            zzgbiVar.zzc(zzgknVarZze.zzg().zzh().zzd());
            zzgbiVar.zzd(zzgknVarZze.zzf().zzg().zza());
            zzgbiVar.zze(zzgknVarZze.zzg().zzg().zza());
            zzgbiVar.zzb(zze(zzgknVarZze.zzg().zzg().zzg()));
            zzgbiVar.zzf(zzd(zzghcVar.zzc()));
            zzgbm zzgbmVarZzg = zzgbiVar.zzg();
            zzgbb zzgbbVar = new zzgbb(null);
            zzgbbVar.zzd(zzgbmVarZzg);
            zzgbbVar.zza(zzgpp.zzb(zzgknVarZze.zzf().zzh().zzA(), zzgasVar));
            zzgbbVar.zzb(zzgpp.zzb(zzgknVarZze.zzg().zzh().zzA(), zzgasVar));
            zzgbbVar.zzc(zzghcVar.zzf());
            return zzgbbVar.zze();
        } catch (zzgsc unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    public static /* synthetic */ zzgbm zzb(zzghd zzghdVar) throws GeneralSecurityException {
        if (!zzghdVar.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzghdVar.zzc().zzh())));
        }
        try {
            zzgkq zzgkqVarZzd = zzgkq.zzd(zzghdVar.zzc().zzg(), zzgrc.zza());
            if (zzgkqVarZzd.zzf().zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgbi zzgbiVar = new zzgbi(null);
            zzgbiVar.zza(zzgkqVarZzd.zze().zza());
            zzgbiVar.zzc(zzgkqVarZzd.zzf().zza());
            zzgbiVar.zzd(zzgkqVarZzd.zze().zzg().zza());
            zzgbiVar.zze(zzgkqVarZzd.zzf().zzh().zza());
            zzgbiVar.zzb(zze(zzgkqVarZzd.zzf().zzh().zzg()));
            zzgbiVar.zzf(zzd(zzghdVar.zzc().zzf()));
            return zzgbiVar.zzg();
        } catch (zzgsc e) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e);
        }
    }

    public static void zzc(zzggi zzggiVar) throws GeneralSecurityException {
        zzggiVar.zzh(zzc);
        zzggiVar.zzg(zzd);
        zzggiVar.zzf(zze);
        zzggiVar.zze(zzf);
    }

    private static zzgbk zzd(zzgnw zzgnwVar) throws GeneralSecurityException {
        zzgnw zzgnwVar2 = zzgnw.UNKNOWN_PREFIX;
        int iOrdinal = zzgnwVar.ordinal();
        if (iOrdinal == 1) {
            return zzgbk.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgbk.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgnwVar.zza());
            }
        }
        return zzgbk.zzb;
    }

    private static zzgbj zze(int i) throws GeneralSecurityException {
        zzgnw zzgnwVar = zzgnw.UNKNOWN_PREFIX;
        int i2 = i - 2;
        if (i2 == 1) {
            return zzgbj.zza;
        }
        if (i2 == 2) {
            return zzgbj.zzd;
        }
        if (i2 == 3) {
            return zzgbj.zzc;
        }
        if (i2 == 4) {
            return zzgbj.zze;
        }
        if (i2 == 5) {
            return zzgbj.zzb;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + zzgmc.zza(i));
    }
}
