package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzfxv extends zzfyf {
    zzfxv() {
    }

    public static zzfxv zzu(ListenableFuture listenableFuture) {
        return listenableFuture instanceof zzfxv ? (zzfxv) listenableFuture : new zzfxw(listenableFuture);
    }
}
