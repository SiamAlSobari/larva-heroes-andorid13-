package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzexp implements zzfya {
    final /* synthetic */ zzelm zza;
    final /* synthetic */ zzfhr zzb;
    final /* synthetic */ zzfhg zzc;
    final /* synthetic */ zzcqz zzd;
    final /* synthetic */ zzexq zze;

    zzexp(zzexq zzexqVar, zzelm zzelmVar, zzfhr zzfhrVar, zzfhg zzfhgVar, zzcqz zzcqzVar) {
        this.zze = zzexqVar;
        this.zza = zzelmVar;
        this.zzb = zzfhrVar;
        this.zzc = zzfhgVar;
        this.zzd = zzcqzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        zzfhr zzfhrVar;
        final com.google.android.gms.ads.internal.client.zze zzeVarZza = this.zzd.zzd().zza(th);
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zzd.zzf().zzbF(zzeVarZza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhO)).booleanValue()) {
                this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexo
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzexp zzexpVar = this.zza;
                        zzexpVar.zze.zzd.zzbF(zzeVarZza);
                    }
                });
            }
            zzexq zzexqVar = this.zze;
            zzexqVar.zzh.zzd(zzexqVar.zzj.zzc());
            zzfcv.zzb(zzeVarZza.zza, th, "BannerAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbdd.zzc.zze()).booleanValue() || (zzfhrVar = this.zzb) == null) {
                zzfhu zzfhuVar = this.zze.zzi;
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
        zzcqc zzcqcVar = (zzcqc) obj;
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zze.zzf.removeAllViews();
            if (zzcqcVar.zzc() != null) {
                ViewParent parent = zzcqcVar.zzc().getParent();
                if (parent instanceof ViewGroup) {
                    zzcaa.zzj("Banner view provided from " + (zzcqcVar.zzl() != null ? zzcqcVar.zzl().zzg() : "") + " already has a parent view. Removing its old parent.");
                    ((ViewGroup) parent).removeView(zzcqcVar.zzc());
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhO)).booleanValue()) {
                zzdan zzdanVarZzn = zzcqcVar.zzn();
                zzdanVarZzn.zza(this.zze.zzd);
                zzdanVarZzn.zzc(this.zze.zze);
            }
            this.zze.zzf.addView(zzcqcVar.zzc());
            this.zza.zzb(zzcqcVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhO)).booleanValue()) {
                zzexq zzexqVar = this.zze;
                Executor executor = zzexqVar.zzb;
                final zzekx zzekxVar = zzexqVar.zzd;
                zzekxVar.getClass();
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexn
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzekxVar.zzr();
                    }
                });
            }
            this.zze.zzh.zzd(zzcqcVar.zza());
            if (!((Boolean) zzbdd.zzc.zze()).booleanValue() || (zzfhrVar = this.zzb) == null) {
                zzfhu zzfhuVar = this.zze.zzi;
                zzfhg zzfhgVar = this.zzc;
                zzfhgVar.zzb(zzcqcVar.zzp().zzb);
                zzfhgVar.zzd(zzcqcVar.zzl().zzg());
                zzfhgVar.zzf(true);
                zzfhuVar.zzb(zzfhgVar.zzl());
            } else {
                zzfhrVar.zzf(zzcqcVar.zzp().zzb);
                zzfhrVar.zze(zzcqcVar.zzl().zzg());
                zzfhg zzfhgVar2 = this.zzc;
                zzfhgVar2.zzf(true);
                zzfhrVar.zza(zzfhgVar2);
                zzfhrVar.zzg();
            }
        }
    }
}
