package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@22.1.2 */
/* JADX INFO: loaded from: classes2.dex */
public final class zznp {
    private static final zznp zza = new zznp();
    private static final zzno zzb = new zzno(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zznp zza() {
        return zza;
    }

    public final zzrq zzb() {
        zzrq zzrqVar = (zzrq) this.zzc.get();
        return zzrqVar == null ? zzb : zzrqVar;
    }
}
