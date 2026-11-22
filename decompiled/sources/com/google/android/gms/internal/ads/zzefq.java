package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzefq implements zzedn {
    private final Context zza;
    private final zzdom zzb;
    private final zzdfq zzc;
    private final zzfca zzd;
    private final Executor zze;
    private final zzcag zzf;
    private final zzbit zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziy)).booleanValue();
    private final zzecs zzi;

    public zzefq(Context context, zzcag zzcagVar, zzfca zzfcaVar, Executor executor, zzdfq zzdfqVar, zzdom zzdomVar, zzbit zzbitVar, zzecs zzecsVar) {
        this.zza = context;
        this.zzd = zzfcaVar;
        this.zzc = zzdfqVar;
        this.zze = executor;
        this.zzf = zzcagVar;
        this.zzb = zzdomVar;
        this.zzg = zzbitVar;
        this.zzi = zzecsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final ListenableFuture zza(final zzfbr zzfbrVar, final zzfbe zzfbeVar) {
        final zzdoq zzdoqVar = new zzdoq();
        ListenableFuture listenableFutureZzn = zzfye.zzn(zzfye.zzh(null), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzefl
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzfbeVar, zzfbrVar, zzdoqVar, obj);
            }
        }, this.zze);
        listenableFutureZzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzefm
            @Override // java.lang.Runnable
            public final void run() {
                zzdoqVar.zzb();
            }
        }, this.zze);
        return listenableFutureZzn;
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final boolean zzb(zzfbr zzfbrVar, zzfbe zzfbeVar) {
        zzfbk zzfbkVar = zzfbeVar.zzt;
        return (zzfbkVar == null || zzfbkVar.zza == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ ListenableFuture zzc(final zzfbe zzfbeVar, zzfbr zzfbrVar, zzdoq zzdoqVar, Object obj) throws Exception {
        final zzcfi zzcfiVarZza = this.zzb.zza(this.zzd.zze, zzfbeVar, zzfbrVar.zzb.zzb);
        zzcfiVarZza.zzZ(zzfbeVar.zzX);
        zzdoqVar.zza(this.zza, (View) zzcfiVarZza);
        zzcas zzcasVar = new zzcas();
        final zzdeq zzdeqVarZze = this.zzc.zze(new zzcst(zzfbrVar, zzfbeVar, null), new zzdet(new zzefp(this.zza, this.zzf, zzcasVar, zzfbeVar, zzcfiVarZza, this.zzd, this.zzh, this.zzg, this.zzi), zzcfiVarZza));
        zzcasVar.zzc(zzdeqVarZze);
        zzdeqVarZze.zzc().zzo(new zzcxc() { // from class: com.google.android.gms.internal.ads.zzefn
            @Override // com.google.android.gms.internal.ads.zzcxc
            public final void zzq() {
                zzcfi zzcfiVar = zzcfiVarZza;
                if (zzcfiVar.zzN() != null) {
                    zzcfiVar.zzN().zzq();
                }
            }
        }, zzcan.zzf);
        zzdeqVarZze.zzk().zzi(zzcfiVarZza, true, this.zzh ? this.zzg : null);
        zzdeqVarZze.zzk();
        zzfbk zzfbkVar = zzfbeVar.zzt;
        return zzfye.zzm(zzdol.zzj(zzcfiVarZza, zzfbkVar.zzb, zzfbkVar.zza), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzefo
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj2) {
                zzcfi zzcfiVar = zzcfiVarZza;
                zzfbe zzfbeVar2 = zzfbeVar;
                zzdeq zzdeqVar = zzdeqVarZze;
                if (zzfbeVar2.zzN) {
                    zzcfiVar.zzae();
                }
                zzcfiVar.zzY();
                zzcfiVar.onPause();
                return zzdeqVar.zzg();
            }
        }, this.zze);
    }
}
