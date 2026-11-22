package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfzb extends zzfyn {
    final /* synthetic */ zzfzd zza;
    private final zzfxk zzb;

    zzfzb(zzfzd zzfzdVar, zzfxk zzfxkVar) {
        this.zza = zzfzdVar;
        this.zzb = zzfxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyn
    final /* bridge */ /* synthetic */ Object zza() throws Exception {
        ListenableFuture listenableFutureZza = this.zzb.zza();
        zzfri.zzd(listenableFutureZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.zzb);
        return listenableFutureZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfyn
    final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfyn
    final void zzd(Throwable th) {
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzfyn
    final /* synthetic */ void zze(Object obj) {
        this.zza.zzs((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfyn
    final boolean zzg() {
        return this.zza.isDone();
    }
}
