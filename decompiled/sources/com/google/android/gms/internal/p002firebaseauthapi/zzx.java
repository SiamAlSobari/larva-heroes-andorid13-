package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzx extends zzz {
    final /* synthetic */ zzl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzx(zzy zzyVar, zzab zzabVar, CharSequence charSequence, zzl zzlVar) {
        super(zzabVar, charSequence);
        this.zza = zzlVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzz
    public final int zzc(int i) {
        return ((zzo) this.zza).zza.end();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzz
    public final int zzd(int i) {
        if (((zzo) this.zza).zza.find(i)) {
            return ((zzo) this.zza).zza.start();
        }
        return -1;
    }
}
