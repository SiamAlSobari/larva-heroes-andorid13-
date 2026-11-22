package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzava implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzave zzb;

    zzava(zzave zzaveVar, View view) {
        this.zzb = zzaveVar;
        this.zza = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc(this.zza);
    }
}
