package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcoa implements zzfya {
    final /* synthetic */ zzfik zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcob zzc;

    zzcoa(zzcob zzcobVar, zzfik zzfikVar, String str) {
        this.zzc = zzcobVar;
        this.zza = zzfikVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(final Throwable th) {
        zzfyo zzfyoVar = this.zzc.zze;
        final zzfik zzfikVar = this.zza;
        final String str = this.zzb;
        zzfyoVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcny
            @Override // java.lang.Runnable
            public final void run() {
                zzcoa zzcoaVar = this.zza;
                Throwable th2 = th;
                zzfik zzfikVar2 = zzfikVar;
                String str2 = str;
                zzcob zzcobVar = zzcoaVar.zzc;
                zzcobVar.zzh = zzbtf.zza(zzcobVar.zza);
                zzcoaVar.zzc.zzh.zzf(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                zzfikVar2.zzc(str2, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final String str = (String) obj;
        zzfyo zzfyoVar = this.zzc.zze;
        final zzfik zzfikVar = this.zza;
        zzfyoVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnz
            @Override // java.lang.Runnable
            public final void run() {
                zzfikVar.zzc(str, null);
            }
        });
    }
}
