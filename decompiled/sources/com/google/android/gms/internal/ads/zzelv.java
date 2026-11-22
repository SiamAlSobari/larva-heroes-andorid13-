package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzelv implements zzesj {
    private final Context zza;

    zzelv(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final ListenableFuture zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcF)).booleanValue()) {
            return zzfye.zzh(new zzelw(ContextCompat.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
        }
        return zzfye.zzh(null);
    }
}
