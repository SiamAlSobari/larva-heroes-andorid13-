package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdvn implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzdvn(zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
        this.zzc = zzgzgVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        final zzaqx zzaqxVar = (zzaqx) this.zza.zzb();
        final Context contextZza = ((zzchj) this.zzb).zza();
        zzfyo zzfyoVar = zzcan.zza;
        zzgzb.zzb(zzfyoVar);
        ListenableFuture listenableFutureZzb = zzfyoVar.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdvk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzaqx zzaqxVar2 = zzaqxVar;
                return zzaqxVar2.zzc().zzg(contextZza);
            }
        });
        zzgzb.zzb(listenableFutureZzb);
        return listenableFutureZzb;
    }
}
