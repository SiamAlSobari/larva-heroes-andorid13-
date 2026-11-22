package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzchp implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzchp(zzgzg zzgzgVar, zzgzg zzgzgVar2) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdtl zzdtlVar = (zzdtl) this.zza.zzb();
        zzfyo zzfyoVar = zzcan.zza;
        zzgzb.zzb(zzfyoVar);
        Set setSingleton = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbA)).booleanValue() ? Collections.singleton(new zzddo(zzdtlVar, zzfyoVar)) : Collections.emptySet();
        zzgzb.zzb(setSingleton);
        return setSingleton;
    }
}
