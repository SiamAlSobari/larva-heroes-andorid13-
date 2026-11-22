package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeoj implements zzesj {
    private final AtomicReference zza = new AtomicReference();
    private final Clock zzb;
    private final zzesj zzc;
    private final long zzd;

    public zzeoj(zzesj zzesjVar, long j, Clock clock) {
        this.zzb = clock;
        this.zzc = zzesjVar;
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 16;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final ListenableFuture zzb() {
        zzeoi zzeoiVar = (zzeoi) this.zza.get();
        if (zzeoiVar == null || zzeoiVar.zza()) {
            zzeoiVar = new zzeoi(this.zzc.zzb(), this.zzd, this.zzb);
            this.zza.set(zzeoiVar);
        }
        return zzeoiVar.zza;
    }
}
