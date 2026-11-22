package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzemy {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzemx zzb;

    final zzemx zza() {
        return this.zzb;
    }

    final void zzb(zzemx zzemxVar) {
        this.zzb = zzemxVar;
    }

    public final void zzc(boolean z) {
        this.zza.set(true);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}
