package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzalx {
    private static final zzalx zza = new zzalx();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzamc zzb = new zzalh();

    private zzalx() {
    }

    public static zzalx zza() {
        return zza;
    }

    public final zzamb zzb(Class cls) {
        zzakq.zzc(cls, "messageType");
        zzamb zzambVarZza = (zzamb) this.zzc.get(cls);
        if (zzambVarZza == null) {
            zzambVarZza = this.zzb.zza(cls);
            zzakq.zzc(cls, "messageType");
            zzamb zzambVar = (zzamb) this.zzc.putIfAbsent(cls, zzambVarZza);
            if (zzambVar != null) {
                return zzambVar;
            }
        }
        return zzambVarZza;
    }
}
