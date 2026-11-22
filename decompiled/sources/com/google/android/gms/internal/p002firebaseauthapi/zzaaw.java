package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzai;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaaw implements zzafe {
    final /* synthetic */ zzaij zza;
    final /* synthetic */ zzadx zzb;
    final /* synthetic */ zzabz zzc;

    zzaaw(zzabz zzabzVar, zzaij zzaijVar, zzadx zzadxVar) {
        this.zzc = zzabzVar;
        this.zza = zzaijVar;
        this.zzb = zzadxVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void zza(String str) {
        this.zzb.zzh(zzai.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zza.zzd(((zzahb) obj).zze());
        this.zzc.zza.zzv(this.zza, new zzaav(this, this));
    }
}
