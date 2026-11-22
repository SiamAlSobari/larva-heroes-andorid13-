package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzqj implements zzpb {
    final /* synthetic */ zzqk zza;

    /* synthetic */ zzqj(zzqk zzqkVar, zzqi zzqiVar) {
        this.zza = zzqkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpb
    public final void zza(Exception exc) {
        zzes.zzd("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzc.zzb(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpb
    public final void zzb() {
        zzqk zzqkVar = this.zza;
        if (zzqkVar.zzm != null) {
            zzqkVar.zzm.zzb();
        }
    }
}
