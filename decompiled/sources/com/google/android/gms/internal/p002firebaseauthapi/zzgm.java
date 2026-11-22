package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgm extends zzng {
    zzgm() {
        super(zzxj.class, new zzgk(zzbd.class));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzng
    public final zznf zza() {
        return new zzgl(this, zzxm.class);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzng
    public final zzwh zzb() {
        return zzwh.REMOTE;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzng
    public final /* synthetic */ zzalp zzc(zzajf zzajfVar) throws zzaks {
        return zzxj.zzd(zzajfVar, zzajx.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzng
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzng
    public final /* bridge */ /* synthetic */ void zze(zzalp zzalpVar) throws GeneralSecurityException {
        zzxj zzxjVar = (zzxj) zzalpVar;
        zzzl.zzc(zzxjVar.zza(), 0);
        if (zzgj.zzc(zzxjVar.zze().zza().zzg())) {
            return;
        }
        throw new GeneralSecurityException("Unsupported DEK key type: " + zzxjVar.zze().zza().zzg() + ". Only Tink AEAD key types are supported.");
    }
}
