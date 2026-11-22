package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeps implements zzesj {
    private final zzfyo zza;
    private final zzdue zzb;

    zzeps(zzfyo zzfyoVar, zzdue zzdueVar) {
        this.zza = zzfyoVar;
        this.zzb = zzdueVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzept zzc() throws Exception {
        return new zzept(this.zzb.zzc(), this.zzb.zzq(), com.google.android.gms.ads.internal.zzt.zzs().zzl(), this.zzb.zzo(), this.zzb.zzr());
    }
}
