package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfar implements zzeln {
    private final Context zza;
    private final Executor zzb;
    private final zzchd zzc;
    private final zzfah zzd;
    private final zzeyv zze;
    private final zzfbs zzf;
    private final zzfhu zzg;
    private final zzfby zzh;
    private ListenableFuture zzi;

    public zzfar(Context context, Executor executor, zzchd zzchdVar, zzeyv zzeyvVar, zzfah zzfahVar, zzfby zzfbyVar, zzfbs zzfbsVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzchdVar;
        this.zze = zzeyvVar;
        this.zzd = zzfahVar;
        this.zzh = zzfbyVar;
        this.zzf = zzfbsVar;
        this.zzg = zzchdVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzdnu zzk(zzeyt zzeytVar) {
        zzdnu zzdnuVarZzi = this.zzc.zzi();
        zzcvq zzcvqVar = new zzcvq();
        zzcvqVar.zze(this.zza);
        zzcvqVar.zzi(((zzfaq) zzeytVar).zza);
        zzcvqVar.zzh(this.zzf);
        zzdnuVarZzi.zzd(zzcvqVar.zzj());
        zzdnuVarZzi.zzc(new zzdbt().zzn());
        return zzdnuVarZzi;
    }

    @Override // com.google.android.gms.internal.ads.zzeln
    public final boolean zza() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
    @Override // com.google.android.gms.internal.ads.zzeln
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzell zzellVar, zzelm zzelmVar) throws RemoteException {
        zzfhr zzfhrVar;
        zzbvk zzbvkVar = new zzbvk(zzlVar, str);
        if (zzbvkVar.zzb == null) {
            zzcaa.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfak
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzi();
                }
            });
            return false;
        }
        ListenableFuture listenableFuture = this.zzi;
        if (listenableFuture != null && !listenableFuture.isDone()) {
            return false;
        }
        if (((Boolean) zzbdd.zzc.zze()).booleanValue()) {
            zzeyv zzeyvVar = this.zze;
            if (zzeyvVar.zzd() != null) {
                zzfhr zzfhrVarZzh = ((zzdnv) zzeyvVar.zzd()).zzh();
                zzfhrVarZzh.zzh(5);
                zzfhrVarZzh.zzb(zzbvkVar.zza.zzp);
                zzfhrVar = zzfhrVarZzh;
            } else {
                zzfhrVar = null;
            }
        } else {
            zzfhrVar = null;
        }
        zzfcv.zza(this.zza, zzbvkVar.zza.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziz)).booleanValue() && zzbvkVar.zza.zzf) {
            this.zzc.zzk().zzn(true);
        }
        zzfby zzfbyVar = this.zzh;
        zzfbyVar.zzs(zzbvkVar.zzb);
        zzfbyVar.zzr(com.google.android.gms.ads.internal.client.zzq.zzd());
        zzfbyVar.zzE(zzbvkVar.zza);
        zzfca zzfcaVarZzG = zzfbyVar.zzG();
        zzfhg zzfhgVarZzb = zzfhf.zzb(this.zza, zzfhq.zzf(zzfcaVarZzG), 5, zzbvkVar.zza);
        zzfaq zzfaqVar = new zzfaq(null);
        zzfaqVar.zza = zzfcaVarZzG;
        ListenableFuture listenableFutureZzc = this.zze.zzc(new zzeyw(zzfaqVar, null), new zzeyu() { // from class: com.google.android.gms.internal.ads.zzfal
            @Override // com.google.android.gms.internal.ads.zzeyu
            public final zzcvo zza(zzeyt zzeytVar) {
                return this.zza.zzk(zzeytVar);
            }
        }, null);
        this.zzi = listenableFutureZzc;
        zzfye.zzr(listenableFutureZzc, new zzfao(this, zzelmVar, zzfhrVar, zzfhgVarZzb, zzfaqVar), this.zzb);
        return true;
    }

    final /* synthetic */ void zzi() {
        this.zzd.zzbF(zzfdb.zzd(6, null, null));
    }

    final void zzj(int i) {
        this.zzh.zzo().zza(i);
    }
}
