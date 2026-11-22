package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzewj implements zzfya {
    final /* synthetic */ zzelm zza;
    final /* synthetic */ zzfhr zzb;
    final /* synthetic */ zzfhg zzc;
    final /* synthetic */ zzewl zzd;
    final /* synthetic */ zzewm zze;

    zzewj(zzewm zzewmVar, zzelm zzelmVar, zzfhr zzfhrVar, zzfhg zzfhgVar, zzewl zzewlVar) {
        this.zze = zzewmVar;
        this.zza = zzelmVar;
        this.zzb = zzfhrVar;
        this.zzc = zzfhgVar;
        this.zzd = zzewlVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.gms.internal.ads.zzcpm, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        zzfhr zzfhrVar;
        zzcpm zzcpmVar = (zzcpm) this.zze.zze.zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzcpmVar == null ? zzfdb.zzb(th, null) : zzcpmVar.zzb().zza(th);
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (zzcpmVar != null) {
                zzcpmVar.zzc().zzbF(zzeVarZzb);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhP)).booleanValue()) {
                    this.zze.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzewj zzewjVar = this.zza;
                            zzewjVar.zze.zzd.zzbF(zzeVarZzb);
                        }
                    });
                }
            } else {
                this.zze.zzd.zzbF(zzeVarZzb);
                this.zze.zzm(this.zzd).zzh().zzb().zzc().zzh();
            }
            zzfcv.zzb(zzeVarZzb.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbdd.zzc.zze()).booleanValue() || (zzfhrVar = this.zzb) == null) {
                zzfhu zzfhuVar = this.zze.zzh;
                zzfhg zzfhgVar = this.zzc;
                zzfhgVar.zza(zzeVarZzb);
                zzfhgVar.zzg(th);
                zzfhgVar.zzf(false);
                zzfhuVar.zzb(zzfhgVar.zzl());
            } else {
                zzfhrVar.zzc(zzeVarZzb);
                zzfhg zzfhgVar2 = this.zzc;
                zzfhgVar2.zzg(th);
                zzfhgVar2.zzf(false);
                zzfhrVar.zza(zzfhgVar2);
                zzfhrVar.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfhr zzfhrVar;
        zzcse zzcseVar = (zzcse) obj;
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhP)).booleanValue()) {
                zzcseVar.zzn().zzb(this.zze.zzd);
            }
            this.zza.zzb(zzcseVar);
            if (!((Boolean) zzbdd.zzc.zze()).booleanValue() || (zzfhrVar = this.zzb) == null) {
                zzfhu zzfhuVar = this.zze.zzh;
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
