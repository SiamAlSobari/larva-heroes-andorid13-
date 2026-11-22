package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzai;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzabg implements zzafe {
    final /* synthetic */ zzabh zza;

    zzabg(zzabh zzabhVar) {
        this.zza = zzabhVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void zza(String str) {
        this.zza.zzb.zzh(zzai.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzagh zzaghVar = (zzagh) obj;
        this.zza.zzc.zzR(new zzahb(zzaghVar.zzc(), zzaghVar.zzb(), Long.valueOf(zzahd.zza(zzaghVar.zzb())), "Bearer"), null, null, false, null, this.zza.zzb, this);
    }
}
