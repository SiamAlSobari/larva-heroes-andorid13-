package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzewm implements zzeln {
    protected final zzchd zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzexc zzd;
    private final zzeyv zze;
    private final zzcag zzf;
    private final ViewGroup zzg;
    private final zzfhu zzh;
    private final zzfby zzi;

    @Nullable
    private ListenableFuture zzj;

    protected zzewm(Context context, Executor executor, zzchd zzchdVar, zzeyv zzeyvVar, zzexc zzexcVar, zzfby zzfbyVar, zzcag zzcagVar) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzchdVar;
        this.zze = zzeyvVar;
        this.zzd = zzexcVar;
        this.zzi = zzfbyVar;
        this.zzf = zzcagVar;
        this.zzg = new FrameLayout(context);
        this.zzh = zzchdVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzcvo zzm(zzeyt zzeytVar) {
        zzewl zzewlVar = (zzewl) zzeytVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhP)).booleanValue()) {
            zzcpz zzcpzVar = new zzcpz(this.zzg);
            zzcvq zzcvqVar = new zzcvq();
            zzcvqVar.zze(this.zzb);
            zzcvqVar.zzi(zzewlVar.zza);
            zzcvs zzcvsVarZzj = zzcvqVar.zzj();
            zzdbt zzdbtVar = new zzdbt();
            zzdbtVar.zzc(this.zzd, this.zzc);
            zzdbtVar.zzl(this.zzd, this.zzc);
            return zze(zzcpzVar, zzcvsVarZzj, zzdbtVar.zzn());
        }
        zzexc zzexcVarZzi = zzexc.zzi(this.zzd);
        zzdbt zzdbtVar2 = new zzdbt();
        zzdbtVar2.zzb(zzexcVarZzi, this.zzc);
        zzdbtVar2.zzg(zzexcVarZzi, this.zzc);
        zzdbtVar2.zzh(zzexcVarZzi, this.zzc);
        zzdbtVar2.zzi(zzexcVarZzi, this.zzc);
        zzdbtVar2.zzc(zzexcVarZzi, this.zzc);
        zzdbtVar2.zzl(zzexcVarZzi, this.zzc);
        zzdbtVar2.zzm(zzexcVarZzi);
        zzcpz zzcpzVar2 = new zzcpz(this.zzg);
        zzcvq zzcvqVar2 = new zzcvq();
        zzcvqVar2.zze(this.zzb);
        zzcvqVar2.zzi(zzewlVar.zza);
        return zze(zzcpzVar2, zzcvqVar2.zzj(), zzdbtVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzeln
    public final boolean zza() {
        ListenableFuture listenableFuture = this.zzj;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    @Override // com.google.android.gms.internal.ads.zzeln
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzell zzellVar, zzelm zzelmVar) throws RemoteException {
        boolean z;
        zzfhr zzfhrVar;
        if (((Boolean) zzbdi.zzd.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzkc)).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (this.zzf.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzkd)).intValue() || !z) {
            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        }
        if (str == null) {
            zzcaa.zzg("Ad unit ID should not be null for app open ad.");
            this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewg
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzk();
                }
            });
            return false;
        }
        if (this.zzj != null) {
            return false;
        }
        if (((Boolean) zzbdd.zzc.zze()).booleanValue()) {
            zzeyv zzeyvVar = this.zze;
            if (zzeyvVar.zzd() != null) {
                zzfhr zzfhrVarZzh = ((zzcpm) zzeyvVar.zzd()).zzh();
                zzfhrVarZzh.zzh(7);
                zzfhrVarZzh.zzb(zzlVar.zzp);
                zzfhrVar = zzfhrVarZzh;
            } else {
                zzfhrVar = null;
            }
        } else {
            zzfhrVar = null;
        }
        zzfcv.zza(this.zzb, zzlVar.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziz)).booleanValue() && zzlVar.zzf) {
            this.zza.zzk().zzn(true);
        }
        zzfby zzfbyVar = this.zzi;
        zzfbyVar.zzs(str);
        zzfbyVar.zzr(com.google.android.gms.ads.internal.client.zzq.zzb());
        zzfbyVar.zzE(zzlVar);
        zzfca zzfcaVarZzG = zzfbyVar.zzG();
        zzfhg zzfhgVarZzb = zzfhf.zzb(this.zzb, zzfhq.zzf(zzfcaVarZzG), 7, zzlVar);
        zzewl zzewlVar = new zzewl(null);
        zzewlVar.zza = zzfcaVarZzG;
        ListenableFuture listenableFutureZzc = this.zze.zzc(new zzeyw(zzewlVar, null), new zzeyu() { // from class: com.google.android.gms.internal.ads.zzewh
            @Override // com.google.android.gms.internal.ads.zzeyu
            public final zzcvo zza(zzeyt zzeytVar) {
                return this.zza.zzm(zzeytVar);
            }
        }, null);
        this.zzj = listenableFutureZzc;
        zzfye.zzr(listenableFutureZzc, new zzewj(this, zzelmVar, zzfhrVar, zzfhgVarZzb, zzewlVar), this.zzc);
        return true;
    }

    protected abstract zzcvo zze(zzcpz zzcpzVar, zzcvs zzcvsVar, zzdbv zzdbvVar);

    final /* synthetic */ void zzk() {
        this.zzd.zzbF(zzfdb.zzd(6, null, null));
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi.zzt(zzwVar);
    }
}
