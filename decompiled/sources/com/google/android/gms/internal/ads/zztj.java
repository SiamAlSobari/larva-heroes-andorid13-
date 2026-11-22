package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zztj {
    private static final AtomicLong zzd = new AtomicLong();
    public final zzgn zza;
    public final Uri zzb;
    public final Map zzc;

    public zztj(long j, zzgn zzgnVar, Uri uri, Map map, long j2, long j3, long j4) {
        this.zza = zzgnVar;
        this.zzb = uri;
        this.zzc = map;
    }

    public static long zza() {
        return zzd.getAndIncrement();
    }
}
