package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzai;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzabe implements zzafe {
    final /* synthetic */ zzahr zza;
    final /* synthetic */ zzadx zzb;

    zzabe(zzabz zzabzVar, zzahr zzahrVar, zzadx zzadxVar) {
        this.zza = zzahrVar;
        this.zzb = zzadxVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void zza(String str) {
        this.zzb.zzh(zzai.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzahr zzahrVar = this.zza;
        zzahs zzahsVar = (zzahs) obj;
        if (zzahrVar instanceof zzahv) {
            this.zzb.zzb(zzahsVar.zzc());
            return;
        }
        if (zzahrVar instanceof zzahx) {
            this.zzb.zzp(zzahsVar);
            return;
        }
        throw new IllegalArgumentException("startMfaEnrollmentRequest must be an instance of either StartPhoneMfaEnrollmentRequest or StartTotpMfaEnrollmentRequest but was " + zzahrVar.getClass().getName() + ".");
    }
}
