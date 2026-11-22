package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfyt extends zzfyq implements ScheduledExecutorService, zzfyo {
    final ScheduledExecutorService zza;

    zzfyt(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        zzfzd zzfzdVarZze = zzfzd.zze(runnable, null);
        return new zzfyr(zzfzdVarZze, this.zza.schedule(zzfzdVarZze, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzfys zzfysVar = new zzfys(runnable);
        return new zzfyr(zzfysVar, this.zza.scheduleAtFixedRate(zzfysVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzfys zzfysVar = new zzfys(runnable);
        return new zzfyr(zzfysVar, this.zza.scheduleWithFixedDelay(zzfysVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzfzd zzfzdVar = new zzfzd(callable);
        return new zzfyr(zzfzdVar, this.zza.schedule(zzfzdVar, j, timeUnit));
    }
}
