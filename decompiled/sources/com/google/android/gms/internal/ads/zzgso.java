package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzgso {
    private static final zzgso zza = new zzgsk(null);
    private static final zzgso zzb = new zzgsm(0 == true ? 1 : 0);

    /* synthetic */ zzgso(zzgsn zzgsnVar) {
    }

    static zzgso zzd() {
        return zza;
    }

    static zzgso zze() {
        return zzb;
    }

    abstract List zza(Object obj, long j);

    abstract void zzb(Object obj, long j);

    abstract void zzc(Object obj, Object obj2, long j);
}
