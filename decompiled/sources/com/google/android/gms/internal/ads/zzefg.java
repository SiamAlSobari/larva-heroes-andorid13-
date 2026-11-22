package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzefg implements zzfya {
    final /* synthetic */ zzefh zza;

    zzefg(zzefh zzefhVar) {
        this.zza = zzefhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.client.zze zzeVarZza = this.zza.zza.zzd().zza(th);
        this.zza.zzd.zzbF(zzeVarZza);
        zzfcv.zzb(zzeVarZza.zza, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* synthetic */ void zzb(Object obj) {
        ((zzcqc) obj).zzj();
    }
}
