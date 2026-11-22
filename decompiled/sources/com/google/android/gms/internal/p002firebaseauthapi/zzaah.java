package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzai;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaah implements zzafe {
    final /* synthetic */ zzadx zza;
    final /* synthetic */ zzabz zzb;

    zzaah(zzabz zzabzVar, zzadx zzadxVar) {
        this.zzb = zzabzVar;
        this.zza = zzadxVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void zza(String str) {
        this.zza.zzh(zzai.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzaii zzaiiVar = (zzaii) obj;
        if (zzaiiVar.zzg()) {
            this.zza.zzf(new zzaaf(zzaiiVar.zzd(), zzaiiVar.zzf(), null));
        } else {
            this.zzb.zzR(new zzahb(zzaiiVar.zze(), zzaiiVar.zzc(), Long.valueOf(zzaiiVar.zzb()), "Bearer"), null, null, false, null, this.zza, this);
        }
    }
}
