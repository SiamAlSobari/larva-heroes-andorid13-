package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeop implements zzesj {
    private final zzfyo zza;
    private final zzdph zzb;
    private final String zzc;
    private final zzfca zzd;

    public zzeop(zzfyo zzfyoVar, zzdph zzdphVar, zzfca zzfcaVar, String str) {
        this.zza = zzfyoVar;
        this.zzb = zzdphVar;
        this.zzd = zzfcaVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeoo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzeoq zzc() throws Exception {
        return new zzeoq(this.zzb.zzb(this.zzd.zzf, this.zzc), this.zzb.zza());
    }
}
