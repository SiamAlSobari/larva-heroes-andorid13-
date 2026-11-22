package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzele implements zzelm {
    final /* synthetic */ zzelf zza;

    zzele(zzelf zzelfVar) {
        this.zza = zzelfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzj = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdep zzdepVar = (zzdep) obj;
        synchronized (this.zza) {
            this.zza.zzj = zzdepVar;
            this.zza.zzj.zzj();
        }
    }
}
