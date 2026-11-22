package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbm implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ Runnable zzb;
    final /* synthetic */ zzbs zzc;

    zzbm(zzbs zzbsVar, String str, Runnable runnable) {
        this.zzc = zzbsVar;
        this.zza = str;
        this.zzb = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        this.zzc.zza.zzn(this.zza);
        this.zzb.run();
    }
}
