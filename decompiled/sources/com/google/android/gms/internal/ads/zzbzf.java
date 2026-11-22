package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbzf extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzbzj zza;

    zzbzf(zzbzj zzbzjVar) {
        this.zza = zzbzjVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        zzbzj zzbzjVar = this.zza;
        zzbbx zzbbxVar = new zzbbx(zzbzjVar.zze, zzbzjVar.zzf.zza);
        synchronized (this.zza.zza) {
            try {
                com.google.android.gms.ads.internal.zzt.zze();
                zzbca.zza(this.zza.zzh, zzbbxVar);
            } catch (IllegalArgumentException e) {
                zzcaa.zzk("Cannot config CSI reporter.", e);
            }
        }
    }
}
