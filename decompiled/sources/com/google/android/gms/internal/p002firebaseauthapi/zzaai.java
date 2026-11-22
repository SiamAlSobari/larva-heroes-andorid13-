package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzai;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaai implements zzafe {
    final /* synthetic */ EmailAuthCredential zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzadx zzc;
    final /* synthetic */ zzabz zzd;

    zzaai(zzabz zzabzVar, EmailAuthCredential emailAuthCredential, String str, zzadx zzadxVar) {
        this.zzd = zzabzVar;
        this.zza = emailAuthCredential;
        this.zzb = str;
        this.zzc = zzadxVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void zza(String str) {
        this.zzc.zzh(zzai.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzd.zzQ(new zzage(this.zza, ((zzahb) obj).zze(), this.zzb), this.zzc);
    }
}
