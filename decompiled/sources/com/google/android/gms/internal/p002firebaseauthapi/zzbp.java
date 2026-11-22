package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
class zzbp implements zzbo {
    private final zzng zza;
    private final Class zzb;

    public zzbp(zzng zzngVar, Class cls) {
        if (!zzngVar.zzl().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", zzngVar.toString(), cls.getName()));
        }
        this.zza = zzngVar;
        this.zzb = cls;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbo
    public final zzwi zza(zzajf zzajfVar) throws GeneralSecurityException {
        try {
            zznf zznfVarZza = this.zza.zza();
            zzalp zzalpVarZzb = zznfVarZza.zzb(zzajfVar);
            zznfVarZza.zzd(zzalpVarZzb);
            zzalp zzalpVarZza = zznfVarZza.zza(zzalpVarZzb);
            zzwf zzwfVarZza = zzwi.zza();
            zzwfVarZza.zzb(this.zza.zzd());
            zzwfVarZza.zzc(zzalpVarZza.zzo());
            zzwfVarZza.zza(this.zza.zzb());
            return (zzwi) zzwfVarZza.zzi();
        } catch (zzaks e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbo
    public final Object zzb(zzajf zzajfVar) throws GeneralSecurityException {
        try {
            zzalp zzalpVarZzc = this.zza.zzc(zzajfVar);
            if (Void.class.equals(this.zzb)) {
                throw new GeneralSecurityException("Cannot create a primitive for Void");
            }
            this.zza.zze(zzalpVarZzc);
            return this.zza.zzk(zzalpVarZzc, this.zzb);
        } catch (zzaks e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(String.valueOf(this.zza.zzj().getName())), e);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbo
    public final String zzc() {
        return this.zza.zzd();
    }
}
