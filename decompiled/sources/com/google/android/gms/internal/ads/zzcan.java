package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcan {
    public static final zzfyo zza;
    public static final zzfyo zzb;
    public static final zzfyo zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzfyo zze;
    public static final zzfyo zzf;

    static {
        Executor threadPoolExecutor;
        ExecutorService executorServiceZzc;
        ExecutorService executorServiceZzb;
        if (ClientLibraryUtils.isPackageSide()) {
            zzfod.zza();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzcaj("Default")));
        } else {
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcaj("Default"));
        }
        zzcal zzcalVar = null;
        zza = new zzcam(threadPoolExecutor, zzcalVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executorServiceZzc = zzfod.zza().zzc(5, new zzcaj("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcaj("Loader"));
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
            executorServiceZzc = threadPoolExecutor2;
        }
        zzb = new zzcam(executorServiceZzc, zzcalVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executorServiceZzb = zzfod.zza().zzb(new zzcaj("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcaj("Activeview"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executorServiceZzb = threadPoolExecutor3;
        }
        zzc = new zzcam(executorServiceZzb, zzcalVar);
        zzd = new zzcai(3, new zzcaj("Schedule"));
        zze = new zzcam(new zzcak(), zzcalVar);
        zzf = new zzcam(zzfyu.zzb(), zzcalVar);
    }
}
