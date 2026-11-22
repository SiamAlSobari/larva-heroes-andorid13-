package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfao implements zzfya {
    final /* synthetic */ zzelm zza;
    final /* synthetic */ zzfhr zzb;
    final /* synthetic */ zzfhg zzc;
    final /* synthetic */ zzfaq zzd;
    final /* synthetic */ zzfar zze;

    zzfao(zzfar zzfarVar, zzelm zzelmVar, zzfhr zzfhrVar, zzfhg zzfhgVar, zzfaq zzfaqVar) {
        this.zze = zzfarVar;
        this.zza = zzelmVar;
        this.zzb = zzfhrVar;
        this.zzc = zzfhgVar;
        this.zzd = zzfaqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        zzfhr zzfhrVar;
        zzdnv zzdnvVar = (zzdnv) this.zze.zze.zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzdnvVar == null ? zzfdb.zzb(th, null) : zzdnvVar.zzb().zza(th);
        synchronized (this.zze) {
            try {
                if (zzdnvVar != null) {
                    zzdnvVar.zza().zzbF(zzeVarZzb);
                    this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfan
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzfao zzfaoVar = this.zza;
                            zzfaoVar.zze.zzd.zzbF(zzeVarZzb);
                        }
                    });
                } else {
                    this.zze.zzd.zzbF(zzeVarZzb);
                    this.zze.zzk(this.zzd).zzh().zzb().zzc().zzh();
                }
                zzfcv.zzb(zzeVarZzb.zza, th, "RewardedAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbdd.zzc.zze()).booleanValue() || (zzfhrVar = this.zzb) == null) {
                    zzfhu zzfhuVar = this.zze.zzg;
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfhr zzfhrVar;
        zzdnq zzdnqVar = (zzdnq) obj;
        synchronized (this.zze) {
            zzdnqVar.zzn().zzd(this.zze.zzd);
            this.zza.zzb(zzdnqVar);
            zzfar zzfarVar = this.zze;
            Executor executor = zzfarVar.zzb;
            final zzfah zzfahVar = zzfarVar.zzd;
            zzfahVar.getClass();
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfam
                @Override // java.lang.Runnable
                public final void run() {
                    zzfahVar.zzr();
                }
            });
            this.zze.zzd.onAdMetadataChanged();
            if (!((Boolean) zzbdd.zzc.zze()).booleanValue() || (zzfhrVar = this.zzb) == null) {
                zzfhu zzfhuVar = this.zze.zzg;
                zzfhg zzfhgVar = this.zzc;
                zzfhgVar.zzb(zzdnqVar.zzp().zzb);
                zzfhgVar.zzd(zzdnqVar.zzl().zzg());
                zzfhgVar.zzf(true);
                zzfhuVar.zzb(zzfhgVar.zzl());
            } else {
                zzfhrVar.zzf(zzdnqVar.zzp().zzb);
                zzfhrVar.zze(zzdnqVar.zzl().zzg());
                zzfhg zzfhgVar2 = this.zzc;
                zzfhgVar2.zzf(true);
                zzfhrVar.zza(zzfhgVar2);
                zzfhrVar.zzg();
            }
        }
    }
}
