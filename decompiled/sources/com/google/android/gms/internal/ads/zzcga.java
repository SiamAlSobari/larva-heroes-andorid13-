package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcga implements Runnable {
    final /* synthetic */ zzcgb zza;

    zzcga(zzcgb zzcgbVar) {
        this.zza = zzcgbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
