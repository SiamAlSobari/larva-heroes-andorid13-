package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcqt implements zzgyt {
    private final zzcqj zza;
    private final zzgzg zzb;

    public zzcqt(zzcqj zzcqjVar, zzgzg zzgzgVar) {
        this.zza = zzcqjVar;
        this.zzb = zzgzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new zzddo((zzcrt) this.zzb.zzb(), zzcan.zzf));
        zzgzb.zzb(setSingleton);
        return setSingleton;
    }
}
