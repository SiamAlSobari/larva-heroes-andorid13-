package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzahb;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
class zzac implements com.google.firebase.auth.internal.zzg {
    final /* synthetic */ FirebaseAuth zza;

    zzac(FirebaseAuth firebaseAuth) {
        this.zza = firebaseAuth;
    }

    @Override // com.google.firebase.auth.internal.zzg
    public final void zza(zzahb zzahbVar, FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(zzahbVar);
        Preconditions.checkNotNull(firebaseUser);
        firebaseUser.zzh(zzahbVar);
        this.zza.zzQ(firebaseUser, zzahbVar, true);
    }
}
