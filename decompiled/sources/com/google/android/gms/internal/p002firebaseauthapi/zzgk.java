package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgk extends zzog {
    zzgk(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzog
    public final /* bridge */ /* synthetic */ Object zza(zzalp zzalpVar) throws GeneralSecurityException {
        zzxj zzxjVar = (zzxj) zzalpVar;
        String strZzf = zzxjVar.zze().zzf();
        return new zzgj(zzxjVar.zze().zza(), zzcc.zza(strZzf).zza(strZzf));
    }
}
