package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfjw implements Runnable {
    final /* synthetic */ zzfjx zza;
    private final WebView zzb;

    zzfjw(zzfjx zzfjxVar) {
        this.zza = zzfjxVar;
        this.zzb = zzfjxVar.zza;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
