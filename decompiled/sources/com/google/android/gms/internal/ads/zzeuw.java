package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeuw implements zzesj {
    final zzfyo zza;
    final String zzb;
    final zzbyx zzc;

    public zzeuw(zzbyx zzbyxVar, zzfyo zzfyoVar, String str) {
        this.zzc = zzbyxVar;
        this.zza = zzfyoVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final ListenableFuture zzb() {
        final ListenableFuture listenableFutureZzh = zzfye.zzh(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfH)).booleanValue()) {
            listenableFutureZzh = zzfye.zzh(null);
        }
        final ListenableFuture listenableFutureZzh2 = zzfye.zzh(null);
        return zzfye.zzc(listenableFutureZzh, listenableFutureZzh2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuv
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeux((String) listenableFutureZzh.get(), (String) listenableFutureZzh2.get());
            }
        }, zzcan.zza);
    }
}
