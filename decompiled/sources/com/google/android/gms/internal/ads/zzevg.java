package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzevg implements zzesj {
    final ScheduledExecutorService zza;
    final Context zzb;
    final zzbsg zzc;

    public zzevg(zzbsg zzbsgVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zzc = zzbsgVar;
        this.zza = scheduledExecutorService;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final ListenableFuture zzb() {
        return zzfye.zzm(zzfye.zzo(zzfye.zzh(new Bundle()), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdU)).longValue(), TimeUnit.MILLISECONDS, this.zza), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzevf
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                return new zzevh((Bundle) obj);
            }
        }, zzcan.zza);
    }
}
