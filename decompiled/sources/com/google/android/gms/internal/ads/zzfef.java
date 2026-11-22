package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfef implements zzfya {
    final /* synthetic */ zzfei zza;
    final /* synthetic */ zzfej zzb;

    zzfef(zzfej zzfejVar, zzfei zzfeiVar) {
        this.zzb = zzfejVar;
        this.zza = zzfeiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
            this.zzb.zzd.addFirst(this.zza);
            zzfej zzfejVar = this.zzb;
            if (zzfejVar.zzf == 1) {
                zzfejVar.zzh();
            }
        }
    }
}
