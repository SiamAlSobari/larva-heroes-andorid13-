package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgij {
    public static final /* synthetic */ int zza = 0;
    private static final zzgpo zzb;
    private static final zzggq zzc;
    private static final zzggm zzd;
    private static final zzgft zze;
    private static final zzgfp zzf;

    static {
        zzgpo zzgpoVarZza = zzghq.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zzgpoVarZza;
        zzc = zzggq.zzb(new zzggo() { // from class: com.google.android.gms.internal.ads.zzgif
            @Override // com.google.android.gms.internal.ads.zzggo
            public final zzghh zza(zzgah zzgahVar) throws GeneralSecurityException {
                zzgnw zzgnwVar;
                zzgie zzgieVar = (zzgie) zzgahVar;
                int i = zzgij.zza;
                zzgmu zzgmuVarZza = zzgmv.zza();
                zzgmuVarZza.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
                zzgkg zzgkgVarZzc = zzgkh.zzc();
                zzgkj zzgkjVarZzc = zzgkk.zzc();
                zzgkjVarZzc.zza(zzgieVar.zza());
                zzgkgVarZzc.zzb((zzgkk) zzgkjVarZzc.zzal());
                zzgkgVarZzc.zza(zzgieVar.zzb());
                zzgmuVarZza.zzc(((zzgkh) zzgkgVarZzc.zzal()).zzau());
                zzgic zzgicVarZzd = zzgieVar.zzd();
                if (zzgic.zza.equals(zzgicVarZzd)) {
                    zzgnwVar = zzgnw.TINK;
                } else if (zzgic.zzb.equals(zzgicVarZzd)) {
                    zzgnwVar = zzgnw.CRUNCHY;
                } else if (zzgic.zzd.equals(zzgicVarZzd)) {
                    zzgnwVar = zzgnw.RAW;
                } else {
                    if (!zzgic.zzc.equals(zzgicVarZzd)) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(zzgicVarZzd))));
                    }
                    zzgnwVar = zzgnw.LEGACY;
                }
                zzgmuVarZza.zza(zzgnwVar);
                return zzghd.zzb((zzgmv) zzgmuVarZza.zzal());
            }
        }, zzgie.class, zzghd.class);
        zzd = zzggm.zzb(new zzggk() { // from class: com.google.android.gms.internal.ads.zzgig
            @Override // com.google.android.gms.internal.ads.zzggk
            public final zzgah zza(zzghh zzghhVar) {
                return zzgij.zzb((zzghd) zzghhVar);
            }
        }, zzgpoVarZza, zzghd.class);
        zze = zzgft.zza(new zzgfr() { // from class: com.google.android.gms.internal.ads.zzgih
        }, zzghu.class, zzghc.class);
        zzf = zzgfp.zzb(new zzgfn() { // from class: com.google.android.gms.internal.ads.zzgii
            @Override // com.google.android.gms.internal.ads.zzgfn
            public final zzfzp zza(zzghh zzghhVar, zzgas zzgasVar) {
                return zzgij.zza((zzghc) zzghhVar, zzgasVar);
            }
        }, zzgpoVarZza, zzghc.class);
    }

    public static /* synthetic */ zzghu zza(zzghc zzghcVar, zzgas zzgasVar) throws GeneralSecurityException {
        if (!zzghcVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }
        try {
            zzgke zzgkeVarZze = zzgke.zze(zzghcVar.zze(), zzgrc.zza());
            if (zzgkeVarZze.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgib zzgibVar = new zzgib(null);
            zzgibVar.zza(zzgkeVarZze.zzg().zzd());
            zzgibVar.zzb(zzgkeVarZze.zzf().zza());
            zzgibVar.zzc(zzd(zzghcVar.zzc()));
            zzgie zzgieVarZzd = zzgibVar.zzd();
            zzghs zzghsVar = new zzghs(null);
            zzghsVar.zzc(zzgieVarZzd);
            zzghsVar.zza(zzgpp.zzb(zzgkeVarZze.zzg().zzA(), zzgasVar));
            zzghsVar.zzb(zzghcVar.zzf());
            return zzghsVar.zzd();
        } catch (zzgsc | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static /* synthetic */ zzgie zzb(zzghd zzghdVar) throws GeneralSecurityException {
        if (!zzghdVar.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters: ".concat(String.valueOf(zzghdVar.zzc().zzh())));
        }
        try {
            zzgkh zzgkhVarZze = zzgkh.zze(zzghdVar.zzc().zzg(), zzgrc.zza());
            zzgib zzgibVar = new zzgib(null);
            zzgibVar.zza(zzgkhVarZze.zza());
            zzgibVar.zzb(zzgkhVarZze.zzf().zza());
            zzgibVar.zzc(zzd(zzghdVar.zzc().zzf()));
            return zzgibVar.zzd();
        } catch (zzgsc e) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
        }
    }

    public static void zzc(zzggi zzggiVar) throws GeneralSecurityException {
        zzggiVar.zzh(zzc);
        zzggiVar.zzg(zzd);
        zzggiVar.zzf(zze);
        zzggiVar.zze(zzf);
    }

    private static zzgic zzd(zzgnw zzgnwVar) throws GeneralSecurityException {
        zzgnw zzgnwVar2 = zzgnw.UNKNOWN_PREFIX;
        int iOrdinal = zzgnwVar.ordinal();
        if (iOrdinal == 1) {
            return zzgic.zza;
        }
        if (iOrdinal == 2) {
            return zzgic.zzc;
        }
        if (iOrdinal == 3) {
            return zzgic.zzd;
        }
        if (iOrdinal == 4) {
            return zzgic.zzb;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgnwVar.zza());
    }
}
