package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzoh {
    public static final zzoh zza;
    private final zzog zzb;

    static {
        zza = zzfk.zza < 31 ? new zzoh() : new zzoh(zzog.zza);
    }

    public zzoh() {
        this.zzb = null;
        zzdy.zzf(zzfk.zza < 31);
    }

    private zzoh(zzog zzogVar) {
        this.zzb = zzogVar;
    }

    public final LogSessionId zza() {
        zzog zzogVar = this.zzb;
        zzogVar.getClass();
        return zzogVar.zzb;
    }

    public zzoh(LogSessionId logSessionId) {
        this.zzb = new zzog(logSessionId);
    }
}
