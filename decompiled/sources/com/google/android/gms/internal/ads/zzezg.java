package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzezg implements zzfya {
    final /* synthetic */ zzelm zza;
    final /* synthetic */ zzfhr zzb;
    final /* synthetic */ zzfhg zzc;
    final /* synthetic */ zzdfq zzd;
    final /* synthetic */ zzezh zze;

    zzezg(zzezh zzezhVar, zzelm zzelmVar, zzfhr zzfhrVar, zzfhg zzfhgVar, zzdfq zzdfqVar) {
        this.zze = zzezhVar;
        this.zza = zzelmVar;
        this.zzb = zzfhrVar;
        this.zzc = zzfhgVar;
        this.zzd = zzdfqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        zzfhr zzfhrVar;
        final com.google.android.gms.ads.internal.client.zze zzeVarZza = this.zzd.zza().zza(th);
        synchronized (this.zze) {
            this.zze.zzi = null;
            this.zzd.zzb().zzbF(zzeVarZza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhQ)).booleanValue()) {
                this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeze
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzezg zzezgVar = this.zza;
                        zzezgVar.zze.zzd.zzbF(zzeVarZza);
                    }
                });
                this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezf
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzezg zzezgVar = this.zza;
                        zzezgVar.zze.zze.zzbF(zzeVarZza);
                    }
                });
            }
            zzfcv.zzb(zzeVarZza.zza, th, "InterstitialAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbdd.zzc.zze()).booleanValue() || (zzfhrVar = this.zzb) == null) {
                zzfhu zzfhuVar = this.zze.zzg;
                zzfhg zzfhgVar = this.zzc;
                zzfhgVar.zza(zzeVarZza);
                zzfhgVar.zzg(th);
                zzfhgVar.zzf(false);
                zzfhuVar.zzb(zzfhgVar.zzl());
            } else {
                zzfhrVar.zzc(zzeVarZza);
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
        zzdep zzdepVar = (zzdep) obj;
        synchronized (this.zze) {
            this.zze.zzi = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhQ)).booleanValue()) {
                zzdan zzdanVarZzn = zzdepVar.zzn();
                zzdanVarZzn.zza(this.zze.zzd);
                zzdanVarZzn.zzd(this.zze.zze);
            }
            this.zza.zzb(zzdepVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhQ)).booleanValue()) {
                this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezc
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zze.zzd.zzr();
                    }
                });
                this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezd
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zze.zze.zzr();
                    }
                });
            }
            if (!((Boolean) zzbdd.zzc.zze()).booleanValue() || (zzfhrVar = this.zzb) == null) {
                zzfhu zzfhuVar = this.zze.zzg;
                zzfhg zzfhgVar = this.zzc;
                zzfhgVar.zzb(zzdepVar.zzp().zzb);
                zzfhgVar.zzd(zzdepVar.zzl().zzg());
                zzfhgVar.zzf(true);
                zzfhuVar.zzb(zzfhgVar.zzl());
            } else {
                zzfhrVar.zzf(zzdepVar.zzp().zzb);
                zzfhrVar.zze(zzdepVar.zzl().zzg());
                zzfhg zzfhgVar2 = this.zzc;
                zzfhgVar2.zzf(true);
                zzfhrVar.zza(zzfhgVar2);
                zzfhrVar.zzg();
            }
        }
    }
}
