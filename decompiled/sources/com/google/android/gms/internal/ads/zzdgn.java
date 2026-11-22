package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdgn implements zzgyt {
    private final zzgzg zza;

    public zzdgn(zzgzg zzgzgVar) {
        this.zza = zzgzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((zzdgk) this.zza).zza().zze() != null ? Collections.singleton("banner") : Collections.emptySet();
        zzgzb.zzb(setSingleton);
        return setSingleton;
    }
}
