package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzezh implements zzeln {
    private final Context zza;
    private final Executor zzb;
    private final zzchd zzc;
    private final zzekx zzd;
    private final zzfah zze;
    private zzbcp zzf;
    private final zzfhu zzg;
    private final zzfby zzh;
    private ListenableFuture zzi;

    public zzezh(Context context, Executor executor, zzchd zzchdVar, zzekx zzekxVar, zzfah zzfahVar, zzfby zzfbyVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzchdVar;
        this.zzd = zzekxVar;
        this.zzh = zzfbyVar;
        this.zze = zzfahVar;
        this.zzg = zzchdVar.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzeln
    public final boolean zza() {
        ListenableFuture listenableFuture = this.zzi;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeln
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzell zzellVar, zzelm zzelmVar) {
        zzdfq zzdfqVarZzf;
        zzfhr zzfhrVar;
        if (str == null) {
            zzcaa.zzg("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezb
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzh();
                }
            });
            return false;
        }
        if (zza()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziz)).booleanValue() && zzlVar.zzf) {
            this.zzc.zzk().zzn(true);
        }
        com.google.android.gms.ads.internal.client.zzq zzqVar = ((zzeza) zzellVar).zza;
        zzfby zzfbyVar = this.zzh;
        zzfbyVar.zzs(str);
        zzfbyVar.zzr(zzqVar);
        zzfbyVar.zzE(zzlVar);
        zzfca zzfcaVarZzG = zzfbyVar.zzG();
        zzfhg zzfhgVarZzb = zzfhf.zzb(this.zza, zzfhq.zzf(zzfcaVarZzG), 4, zzlVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhQ)).booleanValue()) {
            zzdfp zzdfpVarZzg = this.zzc.zzg();
            zzcvq zzcvqVar = new zzcvq();
            zzcvqVar.zze(this.zza);
            zzcvqVar.zzi(zzfcaVarZzG);
            zzdfpVarZzg.zze(zzcvqVar.zzj());
            zzdbt zzdbtVar = new zzdbt();
            zzdbtVar.zzj(this.zzd, this.zzb);
            zzdbtVar.zzk(this.zzd, this.zzb);
            zzdfpVarZzg.zzd(zzdbtVar.zzn());
            zzdfpVarZzg.zzc(new zzejg(this.zzf));
            zzdfqVarZzf = zzdfpVarZzg.zzh();
        } else {
            zzdbt zzdbtVar2 = new zzdbt();
            zzfah zzfahVar = this.zze;
            if (zzfahVar != null) {
                zzdbtVar2.zze(zzfahVar, this.zzb);
                zzdbtVar2.zzf(this.zze, this.zzb);
                zzdbtVar2.zzb(this.zze, this.zzb);
            }
            zzdfp zzdfpVarZzg2 = this.zzc.zzg();
            zzcvq zzcvqVar2 = new zzcvq();
            zzcvqVar2.zze(this.zza);
            zzcvqVar2.zzi(zzfcaVarZzG);
            zzdfpVarZzg2.zze(zzcvqVar2.zzj());
            zzdbtVar2.zzj(this.zzd, this.zzb);
            zzdbtVar2.zze(this.zzd, this.zzb);
            zzdbtVar2.zzf(this.zzd, this.zzb);
            zzdbtVar2.zzb(this.zzd, this.zzb);
            zzdbtVar2.zza(this.zzd, this.zzb);
            zzdbtVar2.zzl(this.zzd, this.zzb);
            zzdbtVar2.zzk(this.zzd, this.zzb);
            zzdbtVar2.zzi(this.zzd, this.zzb);
            zzdbtVar2.zzc(this.zzd, this.zzb);
            zzdfpVarZzg2.zzd(zzdbtVar2.zzn());
            zzdfpVarZzg2.zzc(new zzejg(this.zzf));
            zzdfqVarZzf = zzdfpVarZzg2.zzh();
        }
        zzdfq zzdfqVar = zzdfqVarZzf;
        if (((Boolean) zzbdd.zzc.zze()).booleanValue()) {
            zzfhr zzfhrVarZzf = zzdfqVar.zzf();
            zzfhrVarZzf.zzh(4);
            zzfhrVarZzf.zzb(zzlVar.zzp);
            zzfhrVar = zzfhrVarZzf;
        } else {
            zzfhrVar = null;
        }
        zzctl zzctlVarZza = zzdfqVar.zza();
        ListenableFuture listenableFutureZzi = zzctlVarZza.zzi(zzctlVarZza.zzj());
        this.zzi = listenableFutureZzi;
        zzfye.zzr(listenableFutureZzi, new zzezg(this, zzelmVar, zzfhrVar, zzfhgVarZzb, zzdfqVar), this.zzb);
        return true;
    }

    final /* synthetic */ void zzh() {
        this.zzd.zzbF(zzfdb.zzd(6, null, null));
    }

    public final void zzi(zzbcp zzbcpVar) {
        this.zzf = zzbcpVar;
    }
}
