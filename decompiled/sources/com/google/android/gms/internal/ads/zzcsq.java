package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcsq implements zzfya {
    final /* synthetic */ zzfya zza;
    final /* synthetic */ zzcss zzb;

    zzcsq(zzcss zzcssVar, zzfya zzfyaVar) {
        this.zzb = zzcssVar;
        this.zza = zzfyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        this.zza.zza(th);
        zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsp
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcss.zzb(this.zzb, ((zzcsl) obj).zza, this.zza);
    }
}
