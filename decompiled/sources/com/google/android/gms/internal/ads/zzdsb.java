package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdsb implements zzgyt {
    private final zzdru zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzdsb(zzdru zzdruVar, zzgzg zzgzgVar, zzgzg zzgzgVar2) {
        this.zza = zzdruVar;
        this.zzb = zzgzgVar;
        this.zzc = zzgzgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdse zzdseVar = (zzdse) this.zzb.zzb();
        zzfyo zzfyoVar = zzcan.zza;
        zzgzb.zzb(zzfyoVar);
        Set setZzg = zzdru.zzg(zzdseVar, zzfyoVar);
        zzgzb.zzb(setZzg);
        return setZzg;
    }
}
