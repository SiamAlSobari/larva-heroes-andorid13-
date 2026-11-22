package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfyu {
    public static zzfyo zza(ExecutorService executorService) {
        if (executorService instanceof zzfyo) {
            return (zzfyo) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new zzfyt((ScheduledExecutorService) executorService) : new zzfyq(executorService);
    }

    public static Executor zzb() {
        return zzfxs.INSTANCE;
    }

    static Executor zzc(Executor executor, zzfws zzfwsVar) {
        executor.getClass();
        return executor == zzfxs.INSTANCE ? executor : new zzfyp(executor, zzfwsVar);
    }
}
