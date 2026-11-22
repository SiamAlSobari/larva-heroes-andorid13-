package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfft implements zzfya {
    final /* synthetic */ zzffj zza;
    final /* synthetic */ zzffv zzb;

    zzfft(zzffv zzffvVar, zzffj zzffjVar) {
        this.zzb = zzffvVar;
        this.zza = zzffjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        this.zzb.zza.zzd.zzb(this.zza, th);
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object obj) {
        this.zzb.zza.zzd.zzd(this.zza);
    }
}
