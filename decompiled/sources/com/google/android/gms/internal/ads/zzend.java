package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzend implements zzesj {
    private final zzfyo zza;
    private final zzfca zzb;
    private final zzcag zzc;
    private final zzbzn zzd;

    public zzend(zzfyo zzfyoVar, zzfca zzfcaVar, zzcag zzcagVar, zzbzn zzbznVar) {
        this.zza = zzfyoVar;
        this.zzb = zzfcaVar;
        this.zzc = zzcagVar;
        this.zzd = zzbznVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 9;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzene zzc() throws Exception {
        return new zzene(this.zzb.zzj, this.zzc, this.zzd.zzm());
    }
}
