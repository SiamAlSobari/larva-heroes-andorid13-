package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfgr implements zzfgo {
    private final zzfgo zza;
    private final Queue zzb = new LinkedBlockingQueue();
    private final int zzc = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzio)).intValue();
    private final AtomicBoolean zzd = new AtomicBoolean(false);

    public zzfgr(zzfgo zzfgoVar, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzfgoVar;
        long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzin)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgq
            @Override // java.lang.Runnable
            public final void run() {
                zzfgr.zzc(this.zza);
            }
        }, jIntValue, jIntValue, TimeUnit.MILLISECONDS);
    }

    public static /* synthetic */ void zzc(zzfgr zzfgrVar) {
        while (!zzfgrVar.zzb.isEmpty()) {
            zzfgrVar.zza.zzb((zzfgn) zzfgrVar.zzb.remove());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final String zza(zzfgn zzfgnVar) {
        return this.zza.zza(zzfgnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzb(zzfgn zzfgnVar) {
        if (this.zzb.size() < this.zzc) {
            this.zzb.offer(zzfgnVar);
            return;
        }
        if (this.zzd.getAndSet(true)) {
            return;
        }
        Queue queue = this.zzb;
        zzfgn zzfgnVarZzb = zzfgn.zzb("dropped_event");
        Map mapZzj = zzfgnVar.zzj();
        if (mapZzj.containsKey("action")) {
            zzfgnVarZzb.zza("dropped_action", (String) mapZzj.get("action"));
        }
        queue.offer(zzfgnVarZzb);
    }
}
