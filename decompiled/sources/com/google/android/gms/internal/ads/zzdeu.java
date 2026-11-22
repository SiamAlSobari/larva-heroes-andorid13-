package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdeu implements zzgyt {
    private final zzdet zza;
    private final zzgzg zzb;

    public zzdeu(zzdet zzdetVar, zzgzg zzgzgVar) {
        this.zza = zzdetVar;
        this.zzb = zzgzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzddo((zzcvf) this.zzb.zzb(), zzcan.zzf));
        zzgzb.zzb(setSingleton);
        return setSingleton;
    }
}
