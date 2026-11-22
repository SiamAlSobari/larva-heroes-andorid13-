package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzy implements zzaa {
    final /* synthetic */ zzm zza;

    zzy(zzm zzmVar) {
        this.zza = zzmVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaa
    public final /* bridge */ /* synthetic */ Iterator zza(zzab zzabVar, CharSequence charSequence) {
        return new zzx(this, zzabVar, charSequence, this.zza.zza(charSequence));
    }
}
