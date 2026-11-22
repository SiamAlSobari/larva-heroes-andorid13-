package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfwp extends zzfwq {
    zzfwp(ListenableFuture listenableFuture, Class cls, zzfqw zzfqwVar) {
        super(listenableFuture, cls, zzfqwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfwq
    final /* synthetic */ Object zze(Object obj, Throwable th) throws Exception {
        return ((zzfqw) obj).apply(th);
    }

    @Override // com.google.android.gms.internal.ads.zzfwq
    final void zzf(Object obj) {
        zzc(obj);
    }
}
