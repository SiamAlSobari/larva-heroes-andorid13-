package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeqr implements zzesj {
    private final zzesj zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzeqr(zzesj zzesjVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzesjVar;
        this.zzb = j;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final ListenableFuture zzb() {
        ListenableFuture listenableFutureZzb = this.zza.zzb();
        long j = this.zzb;
        if (j > 0) {
            listenableFutureZzb = zzfye.zzo(listenableFutureZzb, j, TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzfye.zzf(listenableFutureZzb, Throwable.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzeqq
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return zzfye.zzh(null);
            }
        }, zzcan.zzf);
    }
}
