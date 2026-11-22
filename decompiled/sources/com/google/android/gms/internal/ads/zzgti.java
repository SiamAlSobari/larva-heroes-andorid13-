package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgti {
    private static final zzgti zza = new zzgti();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzgtu zzb = new zzgss();

    private zzgti() {
    }

    public static zzgti zza() {
        return zza;
    }

    public final zzgtt zzb(Class cls) {
        zzgsa.zzc(cls, "messageType");
        zzgtt zzgttVarZza = (zzgtt) this.zzc.get(cls);
        if (zzgttVarZza == null) {
            zzgttVarZza = this.zzb.zza(cls);
            zzgsa.zzc(cls, "messageType");
            zzgtt zzgttVar = (zzgtt) this.zzc.putIfAbsent(cls, zzgttVarZza);
            if (zzgttVar != null) {
                return zzgttVar;
            }
        }
        return zzgttVarZza;
    }
}
