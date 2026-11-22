package com.google.android.gms.internal.gtm;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzyi {
    private static final zzyi zza = new zzye(null);
    private static final zzyi zzb = new zzyg(0 == true ? 1 : 0);

    /* synthetic */ zzyi(zzyh zzyhVar) {
    }

    static zzyi zzd() {
        return zza;
    }

    static zzyi zze() {
        return zzb;
    }

    abstract List zza(Object obj, long j);

    abstract void zzb(Object obj, long j);

    abstract void zzc(Object obj, Object obj2, long j);
}
