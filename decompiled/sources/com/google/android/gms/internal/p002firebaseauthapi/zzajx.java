package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzajx {
    static final zzajx zza = new zzajx(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private final Map zzd;

    zzajx() {
        this.zzd = new HashMap();
    }

    public static zzajx zza() {
        return zza;
    }

    public final zzaki zzb(zzalp zzalpVar, int i) {
        return (zzaki) this.zzd.get(new zzajw(zzalpVar, i));
    }

    zzajx(boolean z) {
        this.zzd = Collections.emptyMap();
    }
}
