package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcon implements zzcwi, zzcxw, zzcxc, com.google.android.gms.ads.internal.client.zza, zzcwy {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzfbr zze;
    private final zzfbe zzf;
    private final zzfig zzg;
    private final zzfck zzh;
    private final zzaqx zzi;
    private final zzbct zzj;
    private final zzfhr zzk;
    private final WeakReference zzl;
    private final WeakReference zzm;
    private final zzcvk zzn;
    private boolean zzo;
    private final AtomicBoolean zzp = new AtomicBoolean();
    private final zzbcv zzq;

    zzcon(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfbr zzfbrVar, zzfbe zzfbeVar, zzfig zzfigVar, zzfck zzfckVar, View view, zzcfi zzcfiVar, zzaqx zzaqxVar, zzbct zzbctVar, zzbcv zzbcvVar, zzfhr zzfhrVar, zzcvk zzcvkVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfbrVar;
        this.zzf = zzfbeVar;
        this.zzg = zzfigVar;
        this.zzh = zzfckVar;
        this.zzi = zzaqxVar;
        this.zzl = new WeakReference(view);
        this.zzm = new WeakReference(zzcfiVar);
        this.zzj = zzbctVar;
        this.zzq = zzbcvVar;
        this.zzk = zzfhrVar;
        this.zzn = zzcvkVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzs() {
        int i;
        List list;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzks)).booleanValue() && ((list = this.zzf.zzd) == null || list.isEmpty())) {
            return;
        }
        String strZzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdl)).booleanValue() ? this.zzi.zzc().zzh(this.zza, (View) this.zzl.get(), null) : null;
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzao)).booleanValue() && this.zze.zzb.zzb.zzg) || !((Boolean) zzbdj.zzh.zze()).booleanValue()) {
            zzfck zzfckVar = this.zzh;
            zzfig zzfigVar = this.zzg;
            zzfbr zzfbrVar = this.zze;
            zzfbe zzfbeVar = this.zzf;
            zzfckVar.zza(zzfigVar.zzd(zzfbrVar, zzfbeVar, false, strZzh, null, zzfbeVar.zzd));
            return;
        }
        if (((Boolean) zzbdj.zzg.zze()).booleanValue() && ((i = this.zzf.zzb) == 1 || i == 2 || i == 5)) {
        }
        zzfye.zzr((zzfxv) zzfye.zzo(zzfxv.zzu(zzfye.zzh(null)), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaT)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcom(this, strZzh), this.zzb);
    }

    private final void zzt(final int i, final int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.zzl.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzs();
        } else {
            this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcog
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzo(i, i2);
                }
            }, i2, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzao)).booleanValue() && this.zze.zzb.zzb.zzg) && ((Boolean) zzbdj.zzd.zze()).booleanValue()) {
            zzfye.zzr(zzfye.zze(zzfxv.zzu(this.zzj.zza()), Throwable.class, new zzfqw() { // from class: com.google.android.gms.internal.ads.zzcoh
                @Override // com.google.android.gms.internal.ads.zzfqw
                public final Object apply(Object obj) {
                    return "failure_click_attok";
                }
            }, zzcan.zzf), new zzcol(this), this.zzb);
            return;
        }
        zzfck zzfckVar = this.zzh;
        zzfig zzfigVar = this.zzg;
        zzfbr zzfbrVar = this.zze;
        zzfbe zzfbeVar = this.zzf;
        zzfckVar.zzc(zzfigVar.zzc(zzfbrVar, zzfbeVar, zzfbeVar.zzc), true == com.google.android.gms.ads.internal.zzt.zzo().zzx(this.zza) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzbw(zzbvd zzbvdVar, String str, String str2) {
        zzfck zzfckVar = this.zzh;
        zzfig zzfigVar = this.zzg;
        zzfbe zzfbeVar = this.zzf;
        zzfckVar.zza(zzfigVar.zze(zzfbeVar, zzfbeVar.zzi, zzbvdVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zze() {
        zzfck zzfckVar = this.zzh;
        zzfig zzfigVar = this.zzg;
        zzfbr zzfbrVar = this.zze;
        zzfbe zzfbeVar = this.zzf;
        zzfckVar.zza(zzfigVar.zzc(zzfbrVar, zzfbeVar, zzfbeVar.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzf() {
        zzfck zzfckVar = this.zzh;
        zzfig zzfigVar = this.zzg;
        zzfbr zzfbrVar = this.zze;
        zzfbe zzfbeVar = this.zzf;
        zzfckVar.zza(zzfigVar.zzc(zzfbrVar, zzfbeVar, zzfbeVar.zzh));
    }

    final /* synthetic */ void zzm() {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcok
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzs();
            }
        });
    }

    final /* synthetic */ void zzn(int i, int i2) {
        zzt(i - 1, i2);
    }

    final /* synthetic */ void zzo(final int i, final int i2) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcoi
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzn(i, i2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwy
    public final void zzp(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbs)).booleanValue()) {
            this.zzh.zza(this.zzg.zzc(this.zze, this.zzf, zzfig.zzf(2, zzeVar.zza, this.zzf.zzp)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzq() {
        if (this.zzp.compareAndSet(false, true)) {
            int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdu)).intValue();
            if (iIntValue > 0) {
                zzt(iIntValue, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdv)).intValue());
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdt)).booleanValue()) {
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcoj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzm();
                    }
                });
            } else {
                zzs();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final synchronized void zzr() {
        zzcvk zzcvkVar;
        if (this.zzo) {
            ArrayList arrayList = new ArrayList(this.zzf.zzd);
            arrayList.addAll(this.zzf.zzg);
            this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, true, null, null, arrayList));
        } else {
            zzfck zzfckVar = this.zzh;
            zzfig zzfigVar = this.zzg;
            zzfbr zzfbrVar = this.zze;
            zzfbe zzfbeVar = this.zzf;
            zzfckVar.zza(zzfigVar.zzc(zzfbrVar, zzfbeVar, zzfbeVar.zzn));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdq)).booleanValue() && (zzcvkVar = this.zzn) != null) {
                this.zzh.zza(this.zzg.zzc(this.zzn.zzc(), this.zzn.zzb(), zzfig.zzg(zzcvkVar.zzb().zzn, zzcvkVar.zza().zzf())));
            }
            zzfck zzfckVar2 = this.zzh;
            zzfig zzfigVar2 = this.zzg;
            zzfbr zzfbrVar2 = this.zze;
            zzfbe zzfbeVar2 = this.zzf;
            zzfckVar2.zza(zzfigVar2.zzc(zzfbrVar2, zzfbeVar2, zzfbeVar2.zzg));
        }
        this.zzo = true;
    }
}
