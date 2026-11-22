package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfzr implements zzfzq {
    private final zzgfw zza;
    private final Class zzb;

    public zzfzr(zzgfw zzgfwVar, Class cls) {
        if (!zzgfwVar.zzl().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", zzgfwVar.toString(), cls.getName()));
        }
        this.zza = zzgfwVar;
        this.zzb = cls;
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    public final zzgmq zza(zzgqi zzgqiVar) throws GeneralSecurityException {
        try {
            zzgfv zzgfvVarZza = this.zza.zza();
            zzgta zzgtaVarZzb = zzgfvVarZza.zzb(zzgqiVar);
            zzgfvVarZza.zzd(zzgtaVarZzb);
            zzgta zzgtaVarZza = zzgfvVarZza.zza(zzgtaVarZzb);
            zzgmn zzgmnVarZza = zzgmq.zza();
            zzgmnVarZza.zzb(this.zza.zzd());
            zzgmnVarZza.zzc(zzgtaVarZza.zzau());
            zzgmnVarZza.zza(this.zza.zzb());
            return (zzgmq) zzgmnVarZza.zzal();
        } catch (zzgsc e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    public final Object zzb(zzgqi zzgqiVar) throws GeneralSecurityException {
        try {
            zzgta zzgtaVarZzc = this.zza.zzc(zzgqiVar);
            if (Void.class.equals(this.zzb)) {
                throw new GeneralSecurityException("Cannot create a primitive for Void");
            }
            this.zza.zze(zzgtaVarZzc);
            return this.zza.zzk(zzgtaVarZzc, this.zzb);
        } catch (zzgsc e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(String.valueOf(this.zza.zzj().getName())), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    public final String zzc() {
        return this.zza.zzd();
    }
}
