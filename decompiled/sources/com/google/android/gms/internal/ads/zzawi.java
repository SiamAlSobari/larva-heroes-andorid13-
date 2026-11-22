package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzawi implements Runnable {
    final /* synthetic */ zzawm zza;

    zzawi(zzawm zzawmVar) {
        this.zza = zzawmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzawm.zzh(this.zza);
    }
}
