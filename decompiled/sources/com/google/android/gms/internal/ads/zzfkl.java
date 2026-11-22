package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfkl implements Runnable {
    zzfkl() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (zzfko.zzc != null) {
            zzfko.zzc.post(zzfko.zzd);
            zzfko.zzc.postDelayed(zzfko.zze, 200L);
        }
    }
}
