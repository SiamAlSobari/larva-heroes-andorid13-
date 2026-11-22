package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzcri implements Runnable {
    public final /* synthetic */ AtomicReference zza;

    public /* synthetic */ zzcri(AtomicReference atomicReference) {
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcrk.zzi(this.zza);
    }
}
