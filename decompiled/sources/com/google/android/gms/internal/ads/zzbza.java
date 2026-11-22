package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbza {
    public final ListenableFuture zza(Context context, int i) {
        zzcas zzcasVar = new zzcas();
        com.google.android.gms.ads.internal.client.zzay.zzb();
        if (zzbzt.zzt(context)) {
            zzcan.zza.execute(new zzbyz(this, context, zzcasVar));
        }
        return zzcasVar;
    }
}
