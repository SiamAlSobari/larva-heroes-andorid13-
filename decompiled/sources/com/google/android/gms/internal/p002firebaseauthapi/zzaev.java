package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.PhoneAuthProvider;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaev implements Runnable {
    final /* synthetic */ zzaex zza;
    final /* synthetic */ zzaew zzb;

    zzaev(zzaew zzaewVar, zzaex zzaexVar) {
        this.zzb = zzaewVar;
        this.zza = zzaexVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb.zza.zzl) {
            if (!this.zzb.zza.zzl.isEmpty()) {
                this.zza.zza((PhoneAuthProvider.OnVerificationStateChangedCallbacks) this.zzb.zza.zzl.get(0), new Object[0]);
            }
        }
    }
}
