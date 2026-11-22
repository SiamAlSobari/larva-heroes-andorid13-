package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbzr extends Thread {
    final /* synthetic */ String zza;

    zzbzr(zzbzt zzbztVar, String str) {
        this.zza = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new zzcaf(null).zza(this.zza);
    }
}
