package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdny implements zzgyt {
    private final zzgzg zza;

    public zzdny(zzgzg zzgzgVar) {
        this.zza = zzgzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzaxo zzaxoVar = ((zzcvz) this.zza).zza().zzo.zza == 3 ? zzaxo.REWARDED_INTERSTITIAL : zzaxo.REWARD_BASED_VIDEO_AD;
        zzgzb.zzb(zzaxoVar);
        return zzaxoVar;
    }
}
