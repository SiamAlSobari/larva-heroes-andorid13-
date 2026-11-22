package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzauw implements Runnable {
    final /* synthetic */ zzaux zza;

    zzauw(zzaux zzauxVar) {
        this.zza = zzauxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza.zzc) {
            zzaux zzauxVar = this.zza;
            if (zzauxVar.zzd && zzauxVar.zze) {
                zzauxVar.zzd = false;
                zzcaa.zze("App went background");
                Iterator it = this.zza.zzf.iterator();
                while (it.hasNext()) {
                    try {
                        ((zzauy) it.next()).zza(false);
                    } catch (Exception e) {
                        zzcaa.zzh("", e);
                    }
                }
            } else {
                zzcaa.zze("App is still foreground");
            }
        }
    }
}
