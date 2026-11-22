package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfwy extends zzfxa {
    zzfwy(ListenableFuture listenableFuture, zzfxl zzfxlVar) {
        super(listenableFuture, zzfxlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfxa
    final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) throws Exception {
        zzfxl zzfxlVar = (zzfxl) obj;
        ListenableFuture listenableFutureZza = zzfxlVar.zza(obj2);
        zzfri.zzd(listenableFutureZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfxlVar);
        return listenableFutureZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfxa
    final /* synthetic */ void zzf(Object obj) {
        zzs((ListenableFuture) obj);
    }
}
