package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzemd implements zzesj {
    private final Clock zza;
    private final zzfca zzb;

    zzemd(Clock clock, zzfca zzfcaVar) {
        this.zza = clock;
        this.zzb = zzfcaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final ListenableFuture zzb() {
        return zzfye.zzh(new zzeme(this.zzb, this.zza.currentTimeMillis()));
    }
}
