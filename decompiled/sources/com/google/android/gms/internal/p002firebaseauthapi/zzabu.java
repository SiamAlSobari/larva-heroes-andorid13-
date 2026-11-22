package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzai;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzabu implements zzafe {
    final /* synthetic */ UserProfileChangeRequest zza;
    final /* synthetic */ zzadx zzb;
    final /* synthetic */ zzabz zzc;

    zzabu(zzabz zzabzVar, UserProfileChangeRequest userProfileChangeRequest, zzadx zzadxVar) {
        this.zzc = zzabzVar;
        this.zza = userProfileChangeRequest;
        this.zzb = zzadxVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void zza(String str) {
        this.zzb.zzh(zzai.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzahb zzahbVar = (zzahb) obj;
        zzahn zzahnVar = new zzahn();
        zzahnVar.zze(zzahbVar.zze());
        if (this.zza.zzb() || this.zza.getDisplayName() != null) {
            zzahnVar.zzc(this.zza.getDisplayName());
        }
        if (this.zza.zzc() || this.zza.getPhotoUri() != null) {
            zzahnVar.zzh(this.zza.zza());
        }
        zzabz.zze(this.zzc, this.zzb, zzahbVar, zzahnVar, this);
    }
}
