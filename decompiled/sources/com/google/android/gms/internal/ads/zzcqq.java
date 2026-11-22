package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcqq implements zzgyt {
    private final zzcqj zza;
    private final zzgzg zzb;

    public zzcqq(zzcqj zzcqjVar, zzgzg zzgzgVar) {
        this.zza = zzcqjVar;
        this.zzb = zzgzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setZzg = zzcqj.zzg((zzcrt) this.zzb.zzb());
        zzgzb.zzb(setZzg);
        return setZzg;
    }
}
