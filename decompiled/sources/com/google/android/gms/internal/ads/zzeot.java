package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeot implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzeot(zzgzg zzgzgVar, zzgzg zzgzgVar2) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeoj(((zzesr) this.zza).zzb(), ((Long) zzbda.zza.zze()).longValue(), (Clock) this.zzb.zzb());
    }
}
