package com.google.android.gms.internal.gtm;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-analytics-impl@@18.0.3 */
/* JADX INFO: loaded from: classes2.dex */
final class zzzd {
    private static final zzzd zza = new zzzd();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzzi zzb = new zzym();

    private zzzd() {
    }

    public static zzzd zza() {
        return zza;
    }

    public final zzzh zzb(Class cls) {
        zzxs.zzc(cls, "messageType");
        zzzh zzzhVarZza = (zzzh) this.zzc.get(cls);
        if (zzzhVarZza == null) {
            zzzhVarZza = this.zzb.zza(cls);
            zzxs.zzc(cls, "messageType");
            zzzh zzzhVar = (zzzh) this.zzc.putIfAbsent(cls, zzzhVarZza);
            if (zzzhVar != null) {
                return zzzhVar;
            }
        }
        return zzzhVarZza;
    }
}
