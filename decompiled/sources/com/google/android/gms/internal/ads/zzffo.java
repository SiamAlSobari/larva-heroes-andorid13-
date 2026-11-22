package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzffo {
    public static final zzffv zza(Callable callable, Object obj, zzffw zzffwVar) {
        return zzb(callable, zzffwVar.zzb, obj, zzffwVar);
    }

    public static final zzffv zzb(Callable callable, zzfyo zzfyoVar, Object obj, zzffw zzffwVar) {
        return new zzffv(zzffwVar, obj, zzffw.zza, Collections.emptyList(), zzfyoVar.zzb(callable));
    }

    public static final zzffv zzc(ListenableFuture listenableFuture, Object obj, zzffw zzffwVar) {
        return new zzffv(zzffwVar, obj, zzffw.zza, Collections.emptyList(), listenableFuture);
    }

    public static final zzffv zzd(final zzffi zzffiVar, zzfyo zzfyoVar, Object obj, zzffw zzffwVar) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzffn
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                zzffiVar.zza();
                return null;
            }
        }, zzfyoVar, obj, zzffwVar);
    }
}
