package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzffw {
    private static final ListenableFuture zza = zzfye.zzh(null);
    private final zzfyo zzb;
    private final ScheduledExecutorService zzc;
    private final zzffx zzd;

    public zzffw(zzfyo zzfyoVar, ScheduledExecutorService scheduledExecutorService, zzffx zzffxVar) {
        this.zzb = zzfyoVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzffxVar;
    }

    public final zzffm zza(Object obj, ListenableFuture... listenableFutureArr) {
        return new zzffm(this, obj, Arrays.asList(listenableFutureArr), null);
    }

    public final zzffv zzb(Object obj, ListenableFuture listenableFuture) {
        return new zzffv(this, obj, listenableFuture, Collections.singletonList(listenableFuture), listenableFuture);
    }

    protected abstract String zzf(Object obj);
}
