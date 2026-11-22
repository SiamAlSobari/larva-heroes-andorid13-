package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgl extends zznf {
    final /* synthetic */ zzgm zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgl(zzgm zzgmVar, Class cls) {
        super(cls);
        this.zza = zzgmVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* bridge */ /* synthetic */ zzalp zza(zzalp zzalpVar) throws GeneralSecurityException {
        zzxi zzxiVarZzb = zzxj.zzb();
        zzxiVarZzb.zza((zzxm) zzalpVar);
        zzxiVarZzb.zzb(0);
        return (zzxj) zzxiVarZzb.zzi();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* synthetic */ zzalp zzb(zzajf zzajfVar) throws zzaks {
        return zzxm.zze(zzajfVar, zzajx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zznf
    public final /* bridge */ /* synthetic */ void zzd(zzalp zzalpVar) throws GeneralSecurityException {
        zzxm zzxmVar = (zzxm) zzalpVar;
        if (zzgj.zzc(zzxmVar.zza().zzg())) {
            if (zzxmVar.zzf().isEmpty() || !zzxmVar.zzi()) {
                throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
            }
        } else {
            throw new GeneralSecurityException("Unsupported DEK key type: " + zzxmVar.zza().zzg() + ". Only Tink AEAD key types are supported.");
        }
    }
}
