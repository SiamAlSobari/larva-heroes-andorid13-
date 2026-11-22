package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzggf {
    private static final zzggf zza = new zzggf();
    private static final zzgge zzb = new zzgge(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzggf zza() {
        return zza;
    }

    public final zzgjv zzb() {
        zzgjv zzgjvVar = (zzgjv) this.zzc.get();
        return zzgjvVar == null ? zzb : zzgjvVar;
    }
}
