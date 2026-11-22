package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzarw implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzary zzb;

    zzarw(zzary zzaryVar, int i, boolean z) {
        this.zzb = zzaryVar;
        this.zza = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaos zzaosVarZza;
        zzary zzaryVar = this.zzb;
        int i = this.zza;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = zzaryVar.zza.getPackageManager().getPackageInfo(zzaryVar.zza.getPackageName(), 0);
            Context context = zzaryVar.zza;
            zzaosVarZza = zzflk.zza(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            zzaosVarZza = null;
        }
        this.zzb.zzm = zzaosVarZza;
        if (this.zza < 4) {
            if (zzaosVarZza != null && zzaosVarZza.zzaj() && !zzaosVarZza.zzh().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzaosVarZza.zzak() && zzaosVarZza.zzf().zze() && zzaosVarZza.zzf().zza() != -2) {
                return;
            }
            this.zzb.zzo(this.zza + 1, true);
        }
    }
}
