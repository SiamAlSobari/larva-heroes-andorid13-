package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfyd {
    private final boolean zza;
    private final zzfud zzb;

    /* synthetic */ zzfyd(boolean z, zzfud zzfudVar, zzfyc zzfycVar) {
        this.zza = z;
        this.zzb = zzfudVar;
    }

    public final ListenableFuture zza(Callable callable, Executor executor) {
        return new zzfxr(this.zzb, this.zza, executor, callable);
    }
}
