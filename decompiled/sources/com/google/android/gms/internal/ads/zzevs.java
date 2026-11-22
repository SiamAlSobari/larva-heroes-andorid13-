package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzevs {
    public static zzesj zza(zzeuw zzeuwVar, zzeqj zzeqjVar, ScheduledExecutorService scheduledExecutorService, int i) {
        return i == 0 ? new zzeqr(zzeqjVar, 0L, scheduledExecutorService) : new zzeqr(zzeuwVar, 0L, scheduledExecutorService);
    }

    public static zzesj zzb(zzevg zzevgVar, ScheduledExecutorService scheduledExecutorService) {
        return new zzeqr(zzevgVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdU)).longValue(), scheduledExecutorService);
    }

    public static zzesj zzc(zzewb zzewbVar, ScheduledExecutorService scheduledExecutorService) {
        return new zzeqr(zzewbVar, 0L, scheduledExecutorService);
    }
}
