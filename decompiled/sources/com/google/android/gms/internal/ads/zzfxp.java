package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfxp extends zzfxq {
    final /* synthetic */ zzfxr zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfxp(zzfxr zzfxrVar, Callable callable, Executor executor) {
        super(zzfxrVar, executor);
        this.zza = zzfxrVar;
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzfyn
    final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzfyn
    final String zzb() {
        return this.zzc.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    final void zzc(Object obj) {
        this.zza.zzc(obj);
    }
}
