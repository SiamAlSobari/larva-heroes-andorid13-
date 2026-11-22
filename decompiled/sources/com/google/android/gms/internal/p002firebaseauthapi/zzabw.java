package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzai;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzabw implements zzafe {
    final /* synthetic */ String zza;
    final /* synthetic */ zzadx zzb;
    final /* synthetic */ zzabz zzc;

    zzabw(zzabz zzabzVar, String str, zzadx zzadxVar) {
        this.zzc = zzabzVar;
        this.zza = str;
        this.zzb = zzadxVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void zza(String str) {
        this.zzb.zzh(zzai.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzahb zzahbVar = (zzahb) obj;
        String strZze = zzahbVar.zze();
        zzahn zzahnVar = new zzahn();
        zzahnVar.zze(strZze);
        zzahnVar.zzg(this.zza);
        zzabz.zze(this.zzc, this.zzb, zzahbVar, zzahnVar, this);
    }
}
