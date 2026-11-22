package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzelu implements zzeln {
    private final zzfby zza;
    private final zzchd zzb;
    private final Context zzc;
    private final zzelk zzd;
    private final zzfhu zze;
    private zzcss zzf;

    public zzelu(zzchd zzchdVar, Context context, zzelk zzelkVar, zzfby zzfbyVar) {
        this.zzb = zzchdVar;
        this.zzc = context;
        this.zzd = zzelkVar;
        this.zza = zzfbyVar;
        this.zze = zzchdVar.zzz();
        zzfbyVar.zzu(zzelkVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzeln
    public final boolean zza() {
        zzcss zzcssVar = this.zzf;
        return zzcssVar != null && zzcssVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzeln
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzell zzellVar, zzelm zzelmVar) throws RemoteException {
        zzfhr zzfhrVar;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzE(this.zzc) && zzlVar.zzs == null) {
            zzcaa.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelp
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzf();
                }
            });
            return false;
        }
        if (str == null) {
            zzcaa.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzB().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelq
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzg();
                }
            });
            return false;
        }
        zzfcv.zza(this.zzc, zzlVar.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziz)).booleanValue() && zzlVar.zzf) {
            this.zzb.zzk().zzn(true);
        }
        int i = ((zzelo) zzellVar).zza;
        zzfby zzfbyVar = this.zza;
        zzfbyVar.zzE(zzlVar);
        zzfbyVar.zzz(i);
        zzfca zzfcaVarZzG = zzfbyVar.zzG();
        zzfhg zzfhgVarZzb = zzfhf.zzb(this.zzc, zzfhq.zzf(zzfcaVarZzG), 8, zzlVar);
        com.google.android.gms.ads.internal.client.zzcb zzcbVar = zzfcaVarZzG.zzn;
        if (zzcbVar != null) {
            this.zzd.zzd().zzm(zzcbVar);
        }
        zzdgl zzdglVarZzh = this.zzb.zzh();
        zzcvq zzcvqVar = new zzcvq();
        zzcvqVar.zze(this.zzc);
        zzcvqVar.zzi(zzfcaVarZzG);
        zzdglVarZzh.zzf(zzcvqVar.zzj());
        zzdbt zzdbtVar = new zzdbt();
        zzdbtVar.zzk(this.zzd.zzd(), this.zzb.zzB());
        zzdglVarZzh.zze(zzdbtVar.zzn());
        zzdglVarZzh.zzd(this.zzd.zzc());
        zzdglVarZzh.zzc(new zzcpz(null));
        zzdgm zzdgmVarZzg = zzdglVarZzh.zzg();
        if (((Boolean) zzbdd.zzc.zze()).booleanValue()) {
            zzfhr zzfhrVarZzf = zzdgmVarZzg.zzf();
            zzfhrVarZzf.zzh(8);
            zzfhrVarZzf.zzb(zzlVar.zzp);
            zzfhrVar = zzfhrVarZzf;
        } else {
            zzfhrVar = null;
        }
        this.zzb.zzx().zzc(1);
        zzfyo zzfyoVar = zzcan.zza;
        zzgzb.zzb(zzfyoVar);
        ScheduledExecutorService scheduledExecutorServiceZzC = this.zzb.zzC();
        zzctl zzctlVarZza = zzdgmVarZzg.zza();
        zzcss zzcssVar = new zzcss(zzfyoVar, scheduledExecutorServiceZzC, zzctlVarZza.zzi(zzctlVarZza.zzj()));
        this.zzf = zzcssVar;
        zzcssVar.zze(new zzelt(this, zzelmVar, zzfhrVar, zzfhgVarZzb, zzdgmVarZzg));
        return true;
    }

    final /* synthetic */ void zzf() {
        this.zzd.zza().zzbF(zzfdb.zzd(4, null, null));
    }

    final /* synthetic */ void zzg() {
        this.zzd.zza().zzbF(zzfdb.zzd(6, null, null));
    }
}
