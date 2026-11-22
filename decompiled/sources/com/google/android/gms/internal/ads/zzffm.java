package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzffm {
    final /* synthetic */ zzffw zza;
    private final Object zzb;
    private final List zzc;

    /* synthetic */ zzffm(zzffw zzffwVar, Object obj, List list, zzffl zzfflVar) {
        this.zza = zzffwVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzffv zza(Callable callable) {
        zzfyd zzfydVarZzb = zzfye.zzb(this.zzc);
        ListenableFuture listenableFutureZza = zzfydVarZzb.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzffk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, zzcan.zzf);
        zzffw zzffwVar = this.zza;
        return new zzffv(zzffwVar, this.zzb, listenableFutureZza, this.zzc, zzfydVarZzb.zza(callable, zzffwVar.zzb));
    }
}
