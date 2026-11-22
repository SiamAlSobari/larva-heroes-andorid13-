package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzala implements Runnable {
    final /* synthetic */ zzalp zza;
    final /* synthetic */ zzalb zzb;

    zzala(zzalb zzalbVar, zzalp zzalpVar) {
        this.zzb = zzalbVar;
        this.zza = zzalpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
