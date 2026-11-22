package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfvi extends zzfsf {
    final transient zzfry zza;

    zzfvi(Map map, zzfry zzfryVar) {
        super(map);
        this.zza = zzfryVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    @Override // com.google.android.gms.internal.ads.zzfsf, com.google.android.gms.internal.ads.zzfsw
    protected final /* bridge */ /* synthetic */ Collection zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfsw, com.google.android.gms.internal.ads.zzfsz
    final Map zzj() {
        return zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzfsw, com.google.android.gms.internal.ads.zzfsz
    final Set zzl() {
        return zzm();
    }
}
