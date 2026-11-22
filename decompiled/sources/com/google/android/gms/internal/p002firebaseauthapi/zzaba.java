package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzai;
import java.util.List;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaba implements zzafe {
    final /* synthetic */ zzafe zza;
    final /* synthetic */ zzahb zzb;
    final /* synthetic */ zzabb zzc;

    zzaba(zzabb zzabbVar, zzafe zzafeVar, zzahb zzahbVar) {
        this.zzc = zzabbVar;
        this.zza = zzafeVar;
        this.zzb = zzahbVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void zza(String str) {
        this.zzc.zzb.zzh(zzai.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List listZzb = ((zzagr) obj).zzb();
        if (listZzb == null || listZzb.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        zzags zzagsVar = (zzags) listZzb.get(0);
        zzahn zzahnVar = new zzahn();
        zzahnVar.zze(this.zzb.zze());
        zzahnVar.zzb(this.zzc.zza);
        zzabb zzabbVar = this.zzc;
        zzabz.zzf(zzabbVar.zzc, zzabbVar.zzb, this.zzb, zzagsVar, zzahnVar, this.zza);
    }
}
