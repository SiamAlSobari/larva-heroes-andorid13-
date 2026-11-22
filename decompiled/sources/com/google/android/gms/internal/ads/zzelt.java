package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzelt implements zzfya {
    final /* synthetic */ zzelm zza;
    final /* synthetic */ zzfhr zzb;
    final /* synthetic */ zzfhg zzc;
    final /* synthetic */ zzdgm zzd;
    final /* synthetic */ zzelu zze;

    zzelt(zzelu zzeluVar, zzelm zzelmVar, zzfhr zzfhrVar, zzfhg zzfhgVar, zzdgm zzdgmVar) {
        this.zze = zzeluVar;
        this.zza = zzelmVar;
        this.zzb = zzfhrVar;
        this.zzc = zzfhgVar;
        this.zzd = zzdgmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        zzfhr zzfhrVar;
        final com.google.android.gms.ads.internal.client.zze zzeVarZza = this.zzd.zza().zza(th);
        this.zzd.zzb().zzbF(zzeVarZza);
        this.zze.zzb.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzels
            @Override // java.lang.Runnable
            public final void run() {
                zzelt zzeltVar = this.zza;
                zzeltVar.zze.zzd.zza().zzbF(zzeVarZza);
            }
        });
        zzfcv.zzb(zzeVarZza.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbdd.zzc.zze()).booleanValue() || (zzfhrVar = this.zzb) == null) {
            zzfhu zzfhuVar = this.zze.zze;
            zzfhg zzfhgVar = this.zzc;
            zzfhgVar.zza(zzeVarZza);
            zzfhgVar.zzg(th);
            zzfhgVar.zzf(false);
            zzfhuVar.zzb(zzfhgVar.zzl());
            return;
        }
        zzfhrVar.zzc(zzeVarZza);
        zzfhg zzfhgVar2 = this.zzc;
        zzfhgVar2.zzg(th);
        zzfhgVar2.zzf(false);
        zzfhrVar.zza(zzfhgVar2);
        zzfhrVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfhr zzfhrVar;
        zzcse zzcseVar = (zzcse) obj;
        synchronized (this.zze) {
            zzcseVar.zzn().zza(this.zze.zzd.zzd());
            this.zza.zzb(zzcseVar);
            this.zze.zzb.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelr
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zze.zzd.zzb().zzr();
                }
            });
            if (!((Boolean) zzbdd.zzc.zze()).booleanValue() || (zzfhrVar = this.zzb) == null) {
                zzfhu zzfhuVar = this.zze.zze;
                zzfhg zzfhgVar = this.zzc;
                zzfhgVar.zzb(zzcseVar.zzp().zzb);
                zzfhgVar.zzd(zzcseVar.zzl().zzg());
                zzfhgVar.zzf(true);
                zzfhuVar.zzb(zzfhgVar.zzl());
            } else {
                zzfhrVar.zzf(zzcseVar.zzp().zzb);
                zzfhrVar.zze(zzcseVar.zzl().zzg());
                zzfhg zzfhgVar2 = this.zzc;
                zzfhgVar2.zzf(true);
                zzfhrVar.zza(zzfhgVar2);
                zzfhrVar.zzg();
            }
        }
    }
}
