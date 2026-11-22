package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzasg implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzash zza;

    zzasg(zzash zzashVar) {
        this.zza = zzashVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        if (z) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzash zzashVar = this.zza;
            if (zzashVar.zzc > 0 && jCurrentTimeMillis >= zzashVar.zzc) {
                zzashVar.zzd = jCurrentTimeMillis - zzashVar.zzc;
            }
            this.zza.zze = false;
        }
    }
}
