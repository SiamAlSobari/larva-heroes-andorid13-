package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfye extends zzfyg {
    /* JADX WARN: Multi-variable type inference failed */
    public static zzfyd zza(Iterable iterable) {
        return new zzfyd(false, zzfud.zzj(iterable), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzfyd zzb(Iterable iterable) {
        int i = zzfud.zzd;
        iterable.getClass();
        return new zzfyd(true, zzfud.zzj(iterable), null);
    }

    @SafeVarargs
    public static zzfyd zzc(ListenableFuture... listenableFutureArr) {
        return new zzfyd(true, zzfud.zzk(listenableFutureArr), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ListenableFuture zzd(Iterable iterable) {
        return new zzfxm(zzfud.zzj(iterable), true);
    }

    public static ListenableFuture zze(ListenableFuture listenableFuture, Class cls, zzfqw zzfqwVar, Executor executor) {
        zzfwp zzfwpVar = new zzfwp(listenableFuture, cls, zzfqwVar);
        listenableFuture.addListener(zzfwpVar, zzfyu.zzc(executor, zzfwpVar));
        return zzfwpVar;
    }

    public static ListenableFuture zzf(ListenableFuture listenableFuture, Class cls, zzfxl zzfxlVar, Executor executor) {
        zzfwo zzfwoVar = new zzfwo(listenableFuture, cls, zzfxlVar);
        listenableFuture.addListener(zzfwoVar, zzfyu.zzc(executor, zzfwoVar));
        return zzfwoVar;
    }

    public static ListenableFuture zzh(Object obj) {
        return obj == null ? zzfyi.zza : new zzfyi(obj);
    }

    public static ListenableFuture zzi() {
        return zzfyi.zza;
    }

    public static ListenableFuture zzj(Callable callable, Executor executor) {
        zzfzd zzfzdVar = new zzfzd(callable);
        executor.execute(zzfzdVar);
        return zzfzdVar;
    }

    public static ListenableFuture zzk(zzfxk zzfxkVar, Executor executor) {
        zzfzd zzfzdVar = new zzfzd(zzfxkVar);
        executor.execute(zzfzdVar);
        return zzfzdVar;
    }

    @SafeVarargs
    public static ListenableFuture zzl(ListenableFuture... listenableFutureArr) {
        return new zzfxm(zzfud.zzk(listenableFutureArr), false);
    }

    public static ListenableFuture zzm(ListenableFuture listenableFuture, zzfqw zzfqwVar, Executor executor) {
        zzfwz zzfwzVar = new zzfwz(listenableFuture, zzfqwVar);
        listenableFuture.addListener(zzfwzVar, zzfyu.zzc(executor, zzfwzVar));
        return zzfwzVar;
    }

    public static ListenableFuture zzn(ListenableFuture listenableFuture, zzfxl zzfxlVar, Executor executor) {
        int i = zzfxa.zzc;
        executor.getClass();
        zzfwy zzfwyVar = new zzfwy(listenableFuture, zzfxlVar);
        listenableFuture.addListener(zzfwyVar, zzfyu.zzc(executor, zzfwyVar));
        return zzfwyVar;
    }

    public static ListenableFuture zzo(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return listenableFuture.isDone() ? listenableFuture : zzfza.zzf(listenableFuture, j, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzfzf.zza(future);
        }
        throw new IllegalStateException(zzfrx.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return zzfzf.zza(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new zzfxt((Error) cause);
            }
            throw new zzfze(cause);
        }
    }

    public static ListenableFuture zzg(Throwable th) {
        th.getClass();
        return new zzfyh(th);
    }

    public static void zzr(ListenableFuture listenableFuture, zzfya zzfyaVar, Executor executor) {
        zzfyaVar.getClass();
        listenableFuture.addListener(new zzfyb(listenableFuture, zzfyaVar), executor);
    }
}
