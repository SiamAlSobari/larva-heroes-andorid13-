package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbeb {
    private static final AtomicReference zzb = new AtomicReference();
    private static final AtomicReference zzc = new AtomicReference();
    static final AtomicBoolean zza = new AtomicBoolean();

    static zzbdz zza() {
        return (zzbdz) zzb.get();
    }

    static zzbea zzb() {
        return (zzbea) zzc.get();
    }

    public static void zzc(zzbdz zzbdzVar) {
        zzb.set(zzbdzVar);
    }
}
