package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfwo extends zzfwq {
    zzfwo(ListenableFuture listenableFuture, Class cls, zzfxl zzfxlVar) {
        super(listenableFuture, cls, zzfxlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfwq
    final /* bridge */ /* synthetic */ Object zze(Object obj, Throwable th) throws Exception {
        zzfxl zzfxlVar = (zzfxl) obj;
        ListenableFuture listenableFutureZza = zzfxlVar.zza(th);
        zzfri.zzd(listenableFutureZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfxlVar);
        return listenableFutureZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfwq
    final /* synthetic */ void zzf(Object obj) {
        zzs((ListenableFuture) obj);
    }
}
