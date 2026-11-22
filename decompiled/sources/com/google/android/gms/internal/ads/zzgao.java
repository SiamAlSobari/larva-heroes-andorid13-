package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgao {
    private final ConcurrentMap zza;
    private final List zzb;
    private final zzgak zzc;
    private final Class zzd;
    private final zzgjt zze;

    /* synthetic */ zzgao(ConcurrentMap concurrentMap, List list, zzgak zzgakVar, zzgjt zzgjtVar, Class cls, zzgan zzganVar) {
        this.zza = concurrentMap;
        this.zzb = list;
        this.zzc = zzgakVar;
        this.zzd = cls;
        this.zze = zzgjtVar;
    }

    @Nullable
    public final zzgak zza() {
        return this.zzc;
    }

    public final zzgjt zzb() {
        return this.zze;
    }

    public final Class zzc() {
        return this.zzd;
    }

    public final Collection zzd() {
        return this.zza.values();
    }

    public final List zze(byte[] bArr) {
        List list = (List) this.zza.get(new zzgam(bArr, null));
        return list != null ? list : Collections.emptyList();
    }

    public final boolean zzf() {
        return !this.zze.zza().isEmpty();
    }
}
