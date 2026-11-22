package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzehj {
    private zzehc zza;

    zzehj() {
    }

    private zzehj(zzehc zzehcVar) {
        this.zza = zzehcVar;
    }

    public static zzehj zzb(zzehc zzehcVar) {
        return new zzehj(zzehcVar);
    }

    public final zzehc zza(Clock clock, zzehd zzehdVar, zzeds zzedsVar, zzfik zzfikVar) {
        zzehc zzehcVar = this.zza;
        return zzehcVar != null ? zzehcVar : new zzehc(clock, zzehdVar, zzedsVar, zzfikVar);
    }
}
