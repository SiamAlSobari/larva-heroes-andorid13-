package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfd implements zzdz {
    protected zzfd() {
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final long zza() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final zzej zzb(Looper looper, Handler.Callback callback) {
        return new zzfg(new Handler(looper, callback));
    }
}
