package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbp implements Runnable {
    final /* synthetic */ zzbs zza;

    zzbp(zzbs zzbsVar) {
        this.zza = zzbsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza.zzh();
    }
}
