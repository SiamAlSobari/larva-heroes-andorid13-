package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzees implements zzedt {
    private final Context zza;
    private final zzcqz zzb;
    private final Executor zzc;

    public zzees(Context context, zzcqz zzcqzVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcqzVar;
        this.zzc = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzedt
    public final /* bridge */ /* synthetic */ Object zza(zzfbr zzfbrVar, final zzfbe zzfbeVar, zzedq zzedqVar) throws zzehf, zzfcf {
        final View viewZza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhx)).booleanValue() && zzfbeVar.zzah) {
            zzboo zzbooVarZzc = ((zzfcw) zzedqVar.zzb).zzc();
            if (zzbooVarZzc == null) {
                zzcaa.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfcf(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewZza = (View) ObjectWrapper.unwrap(zzbooVarZzc.zze());
                boolean zZzf = zzbooVarZzc.zzf();
                if (viewZza == null) {
                    throw new zzfcf(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        viewZza = (View) zzfye.zzn(zzfye.zzh(null), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzeer
                            @Override // com.google.android.gms.internal.ads.zzfxl
                            public final ListenableFuture zza(Object obj) {
                                return this.zza.zzc(viewZza, zzfbeVar, obj);
                            }
                        }, zzcan.zze).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfcf(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfcf(e2);
            }
        } else {
            viewZza = ((zzfcw) zzedqVar.zzb).zza();
        }
        zzcqz zzcqzVar = this.zzb;
        zzcst zzcstVar = new zzcst(zzfbrVar, zzfbeVar, zzedqVar.zza);
        final zzfcw zzfcwVar = (zzfcw) zzedqVar.zzb;
        zzcqd zzcqdVarZza = zzcqzVar.zza(zzcstVar, new zzcqj(viewZza, null, new zzcsc() { // from class: com.google.android.gms.internal.ads.zzeeq
            @Override // com.google.android.gms.internal.ads.zzcsc
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return zzfcwVar.zzb();
            }
        }, (zzfbf) zzfbeVar.zzv.get(0)));
        zzcqdVarZza.zzg().zza(viewZza);
        zzcqdVarZza.zzd().zzo(new zzcns((zzfcw) zzedqVar.zzb), this.zzc);
        ((zzefj) zzedqVar.zzc).zzc(zzcqdVarZza.zzj());
        return zzcqdVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedt
    public final void zzb(zzfbr zzfbrVar, zzfbe zzfbeVar, zzedq zzedqVar) throws zzfcf {
        com.google.android.gms.ads.internal.client.zzq zzqVar;
        com.google.android.gms.ads.internal.client.zzq zzqVar2 = zzfbrVar.zza.zza.zze;
        if (zzqVar2.zzn) {
            zzqVar = new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zzd(zzqVar2.zze, zzqVar2.zzb));
        } else {
            zzqVar = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhx)).booleanValue() && zzfbeVar.zzah) ? new com.google.android.gms.ads.internal.client.zzq(this.zza, com.google.android.gms.ads.zzb.zze(zzqVar2.zze, zzqVar2.zzb)) : zzfce.zza(this.zza, zzfbeVar.zzv);
        }
        com.google.android.gms.ads.internal.client.zzq zzqVar3 = zzqVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhx)).booleanValue() && zzfbeVar.zzah) {
            ((zzfcw) zzedqVar.zzb).zzn(this.zza, zzqVar3, zzfbrVar.zza.zza.zzd, zzfbeVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzfbeVar.zzt), (zzbol) zzedqVar.zzc);
        } else {
            ((zzfcw) zzedqVar.zzb).zzm(this.zza, zzqVar3, zzfbrVar.zza.zza.zzd, zzfbeVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzfbeVar.zzt), (zzbol) zzedqVar.zzc);
        }
    }

    final /* synthetic */ ListenableFuture zzc(View view, zzfbe zzfbeVar, Object obj) throws Exception {
        return zzfye.zzh(zzcrq.zza(this.zza, view, zzfbeVar));
    }
}
