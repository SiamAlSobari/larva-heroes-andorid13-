package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzehs implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzehs(zzgzg zzgzgVar, zzgzg zzgzgVar2) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzehr zzb() {
        return new zzehr((Context) this.zza.zzb(), (zzdnv) this.zzb.zzb());
    }
}
