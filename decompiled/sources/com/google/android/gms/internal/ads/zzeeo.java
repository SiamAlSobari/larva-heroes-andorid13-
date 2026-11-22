package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeeo implements zzedn {
    private final zzcqz zza;
    private final Context zzb;
    private final zzdom zzc;
    private final zzfca zzd;
    private final Executor zze;
    private final zzfqw zzf;

    public zzeeo(zzcqz zzcqzVar, Context context, Executor executor, zzdom zzdomVar, zzfca zzfcaVar, zzfqw zzfqwVar) {
        this.zzb = context;
        this.zza = zzcqzVar;
        this.zze = executor;
        this.zzc = zzdomVar;
        this.zzd = zzfcaVar;
        this.zzf = zzfqwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final ListenableFuture zza(final zzfbr zzfbrVar, final zzfbe zzfbeVar) {
        return zzfye.zzn(zzfye.zzh(null), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzeei
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzfbrVar, zzfbeVar, obj);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final boolean zzb(zzfbr zzfbrVar, zzfbe zzfbeVar) {
        zzfbk zzfbkVar = zzfbeVar.zzt;
        return (zzfbkVar == null || zzfbkVar.zza == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ ListenableFuture zzc(zzfbr zzfbrVar, zzfbe zzfbeVar, Object obj) throws Exception {
        View zzdopVar;
        com.google.android.gms.ads.internal.client.zzq zzqVarZza = zzfce.zza(this.zzb, zzfbeVar.zzv);
        final zzcfi zzcfiVarZza = this.zzc.zza(zzqVarZza, zzfbeVar, zzfbrVar.zzb.zzb);
        zzcfiVarZza.zzZ(zzfbeVar.zzX);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhx)).booleanValue() && zzfbeVar.zzah) {
            zzdopVar = zzcrq.zza(this.zzb, (View) zzcfiVarZza, zzfbeVar);
        } else {
            zzdopVar = new zzdop(this.zzb, (View) zzcfiVarZza, (com.google.android.gms.ads.internal.util.zzas) this.zzf.apply(zzfbeVar));
        }
        final zzcqd zzcqdVarZza = this.zza.zza(new zzcst(zzfbrVar, zzfbeVar, null), new zzcqj(zzdopVar, zzcfiVarZza, new zzcsc() { // from class: com.google.android.gms.internal.ads.zzeej
            @Override // com.google.android.gms.internal.ads.zzcsc
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return zzcfiVarZza.zzq();
            }
        }, zzfce.zzb(zzqVarZza)));
        zzcqdVarZza.zzh().zzi(zzcfiVarZza, false, null);
        zzcqdVarZza.zzc().zzo(new zzcxc() { // from class: com.google.android.gms.internal.ads.zzeek
            @Override // com.google.android.gms.internal.ads.zzcxc
            public final void zzq() {
                zzcfi zzcfiVar = zzcfiVarZza;
                if (zzcfiVar.zzN() != null) {
                    zzcfiVar.zzN().zzq();
                }
            }
        }, zzcan.zzf);
        zzcqdVarZza.zzh();
        zzfbk zzfbkVar = zzfbeVar.zzt;
        ListenableFuture listenableFutureZzj = zzdol.zzj(zzcfiVarZza, zzfbkVar.zzb, zzfbkVar.zza);
        if (zzfbeVar.zzN) {
            listenableFutureZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeel
                @Override // java.lang.Runnable
                public final void run() {
                    zzcfiVarZza.zzae();
                }
            }, this.zze);
        }
        listenableFutureZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeem
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd(zzcfiVarZza);
            }
        }, this.zze);
        return zzfye.zzm(listenableFutureZzj, new zzfqw() { // from class: com.google.android.gms.internal.ads.zzeen
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj2) {
                return zzcqdVarZza.zza();
            }
        }, zzcan.zzf);
    }

    final /* synthetic */ void zzd(zzcfi zzcfiVar) {
        zzcfiVar.zzY();
        zzcge zzcgeVarZzq = zzcfiVar.zzq();
        com.google.android.gms.ads.internal.client.zzfl zzflVar = this.zzd.zza;
        if (zzflVar == null || zzcgeVarZzq == null) {
            return;
        }
        zzcgeVarZzq.zzs(zzflVar);
    }
}
