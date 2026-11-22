package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdkm implements zzgyt {
    private final zzdkf zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzdkm(zzdkf zzdkfVar, zzgzg zzgzgVar, zzgzg zzgzgVar2) {
        this.zza = zzdkfVar;
        this.zzb = zzgzgVar;
        this.zzc = zzgzgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzddo(((zzdnm) this.zzb).zzb(), (Executor) this.zzc.zzb());
    }
}
