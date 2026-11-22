package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzesc implements zzesj {
    private final boolean zza;

    zzesc(zzeyz zzeyzVar) {
        this.zza = zzeyzVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 36;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final ListenableFuture zzb() {
        return zzfye.zzh(this.zza ? new zzesi() { // from class: com.google.android.gms.internal.ads.zzesb
            @Override // com.google.android.gms.internal.ads.zzesi
            public final void zzj(Object obj) {
                ((Bundle) obj).putBoolean("sdk_prefetch", true);
            }
        } : null);
    }
}
