package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgjq {
    public static final /* synthetic */ int zza = 0;
    private static final zzgpo zzb;
    private static final zzggq zzc;
    private static final zzggm zzd;
    private static final zzgft zze;
    private static final zzgfp zzf;

    static {
        zzgpo zzgpoVarZza = zzghq.zza("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zzgpoVarZza;
        zzc = zzggq.zzb(new zzggo() { // from class: com.google.android.gms.internal.ads.zzgjm
            @Override // com.google.android.gms.internal.ads.zzggo
            public final zzghh zza(zzgah zzgahVar) throws GeneralSecurityException {
                int i;
                zzgnw zzgnwVar;
                zzgjc zzgjcVar = (zzgjc) zzgahVar;
                int i2 = zzgjq.zza;
                zzgmu zzgmuVarZza = zzgmv.zza();
                zzgmuVarZza.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
                zzgmh zzgmhVarZzd = zzgmi.zzd();
                zzgmk zzgmkVarZzc = zzgml.zzc();
                zzgmkVarZzc.zza(zzgjcVar.zza());
                zzgiz zzgizVarZze = zzgjcVar.zze();
                if (zzgiz.zza.equals(zzgizVarZze)) {
                    i = 3;
                } else if (zzgiz.zzb.equals(zzgizVarZze)) {
                    i = 7;
                } else if (zzgiz.zzc.equals(zzgizVarZze)) {
                    i = 5;
                } else if (zzgiz.zzd.equals(zzgizVarZze)) {
                    i = 4;
                } else {
                    if (!zzgiz.zze.equals(zzgizVarZze)) {
                        throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(String.valueOf(zzgizVarZze))));
                    }
                    i = 6;
                }
                zzgmkVarZzc.zzb(i);
                zzgmhVarZzd.zzb((zzgml) zzgmkVarZzc.zzal());
                zzgmhVarZzd.zza(zzgjcVar.zzb());
                zzgmuVarZza.zzc(((zzgmi) zzgmhVarZzd.zzal()).zzau());
                zzgja zzgjaVarZzf = zzgjcVar.zzf();
                if (zzgja.zza.equals(zzgjaVarZzf)) {
                    zzgnwVar = zzgnw.TINK;
                } else if (zzgja.zzb.equals(zzgjaVarZzf)) {
                    zzgnwVar = zzgnw.CRUNCHY;
                } else if (zzgja.zzd.equals(zzgjaVarZzf)) {
                    zzgnwVar = zzgnw.RAW;
                } else {
                    if (!zzgja.zzc.equals(zzgjaVarZzf)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzgjaVarZzf))));
                    }
                    zzgnwVar = zzgnw.LEGACY;
                }
                zzgmuVarZza.zza(zzgnwVar);
                return zzghd.zzb((zzgmv) zzgmuVarZza.zzal());
            }
        }, zzgjc.class, zzghd.class);
        zzd = zzggm.zzb(new zzggk() { // from class: com.google.android.gms.internal.ads.zzgjn
            @Override // com.google.android.gms.internal.ads.zzggk
            public final zzgah zza(zzghh zzghhVar) {
                return zzgjq.zzb((zzghd) zzghhVar);
            }
        }, zzgpoVarZza, zzghd.class);
        zze = zzgft.zza(new zzgfr() { // from class: com.google.android.gms.internal.ads.zzgjo
        }, zzgir.class, zzghc.class);
        zzf = zzgfp.zzb(new zzgfn() { // from class: com.google.android.gms.internal.ads.zzgjp
            @Override // com.google.android.gms.internal.ads.zzgfn
            public final zzfzp zza(zzghh zzghhVar, zzgas zzgasVar) {
                return zzgjq.zza((zzghc) zzghhVar, zzgasVar);
            }
        }, zzgpoVarZza, zzghc.class);
    }

    public static /* synthetic */ zzgir zza(zzghc zzghcVar, zzgas zzgasVar) throws GeneralSecurityException {
        if (!zzghcVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzgmf zzgmfVarZzf = zzgmf.zzf(zzghcVar.zze(), zzgrc.zza());
            if (zzgmfVarZzf.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgiy zzgiyVarZzd = zzgjc.zzd();
            zzgiyVarZzd.zzb(zzgmfVarZzf.zzh().zzd());
            zzgiyVarZzd.zzc(zzgmfVarZzf.zzg().zza());
            zzgiyVarZzd.zza(zze(zzgmfVarZzf.zzg().zzg()));
            zzgiyVarZzd.zzd(zzd(zzghcVar.zzc()));
            zzgjc zzgjcVarZze = zzgiyVarZzd.zze();
            zzgip zzgipVarZza = zzgir.zza();
            zzgipVarZza.zzc(zzgjcVarZze);
            zzgipVarZza.zzb(zzgpp.zzb(zzgmfVarZzf.zzh().zzA(), zzgasVar));
            zzgipVarZza.zza(zzghcVar.zzf());
            return zzgipVarZza.zzd();
        } catch (zzgsc | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static /* synthetic */ zzgjc zzb(zzghd zzghdVar) throws GeneralSecurityException {
        if (!zzghdVar.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzghdVar.zzc().zzh())));
        }
        try {
            zzgmi zzgmiVarZzg = zzgmi.zzg(zzghdVar.zzc().zzg(), zzgrc.zza());
            if (zzgmiVarZzg.zzc() != 0) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + zzgmiVarZzg.zzc());
            }
            zzgiy zzgiyVarZzd = zzgjc.zzd();
            zzgiyVarZzd.zzb(zzgmiVarZzg.zza());
            zzgiyVarZzd.zzc(zzgmiVarZzg.zzh().zza());
            zzgiyVarZzd.zza(zze(zzgmiVarZzg.zzh().zzg()));
            zzgiyVarZzd.zzd(zzd(zzghdVar.zzc().zzf()));
            return zzgiyVarZzd.zze();
        } catch (zzgsc e) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e);
        }
    }

    public static void zzc(zzggi zzggiVar) throws GeneralSecurityException {
        zzggiVar.zzh(zzc);
        zzggiVar.zzg(zzd);
        zzggiVar.zzf(zze);
        zzggiVar.zze(zzf);
    }

    private static zzgja zzd(zzgnw zzgnwVar) throws GeneralSecurityException {
        zzgnw zzgnwVar2 = zzgnw.UNKNOWN_PREFIX;
        int iOrdinal = zzgnwVar.ordinal();
        if (iOrdinal == 1) {
            return zzgja.zza;
        }
        if (iOrdinal == 2) {
            return zzgja.zzc;
        }
        if (iOrdinal == 3) {
            return zzgja.zzd;
        }
        if (iOrdinal == 4) {
            return zzgja.zzb;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgnwVar.zza());
    }

    private static zzgiz zze(int i) throws GeneralSecurityException {
        zzgnw zzgnwVar = zzgnw.UNKNOWN_PREFIX;
        int i2 = i - 2;
        if (i2 == 1) {
            return zzgiz.zza;
        }
        if (i2 == 2) {
            return zzgiz.zzd;
        }
        if (i2 == 3) {
            return zzgiz.zzc;
        }
        if (i2 == 4) {
            return zzgiz.zze;
        }
        if (i2 == 5) {
            return zzgiz.zzb;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + zzgmc.zza(i));
    }
}
