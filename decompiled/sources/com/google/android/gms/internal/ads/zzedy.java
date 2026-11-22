package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzedy implements zzedn {
    private final zzcpq zza;
    private final Context zzb;
    private final zzdom zzc;
    private final zzfca zzd;
    private final Executor zze;
    private final zzcag zzf;
    private final zzbit zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziy)).booleanValue();
    private final zzecs zzi;

    public zzedy(zzcpq zzcpqVar, Context context, Executor executor, zzdom zzdomVar, zzfca zzfcaVar, zzcag zzcagVar, zzbit zzbitVar, zzecs zzecsVar) {
        this.zzb = context;
        this.zza = zzcpqVar;
        this.zze = executor;
        this.zzc = zzdomVar;
        this.zzd = zzfcaVar;
        this.zzf = zzcagVar;
        this.zzg = zzbitVar;
        this.zzi = zzecsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedn
    public final ListenableFuture zza(final zzfbr zzfbrVar, final zzfbe zzfbeVar) {
        final zzdoq zzdoqVar = new zzdoq();
        ListenableFuture listenableFutureZzn = zzfye.zzn(zzfye.zzh(null), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzedw
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzfbeVar, zzfbrVar, zzdoqVar, obj);
            }
        }, this.zze);
        listenableFutureZzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedx
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
        final zzcfi zzcfiVarZza = this.zzc.zza(this.zzd.zze, zzfbeVar, zzfbrVar.zzb.zzb);
        zzcfiVarZza.zzZ(zzfbeVar.zzX);
        zzdoqVar.zza(this.zzb, (View) zzcfiVarZza);
        zzcas zzcasVar = new zzcas();
        final zzcpn zzcpnVarZza = this.zza.zza(new zzcst(zzfbrVar, zzfbeVar, null), new zzdet(new zzeea(this.zzf, zzcasVar, zzfbeVar, zzcfiVarZza, this.zzd, this.zzh, this.zzg, this.zzi), zzcfiVarZza), new zzcpo(zzfbeVar.zzab));
        zzcpnVarZza.zzh().zzi(zzcfiVarZza, false, this.zzh ? this.zzg : null);
        zzcasVar.zzc(zzcpnVarZza);
        zzcpnVarZza.zzc().zzo(new zzcxc() { // from class: com.google.android.gms.internal.ads.zzedu
            @Override // com.google.android.gms.internal.ads.zzcxc
            public final void zzq() {
                zzcfi zzcfiVar = zzcfiVarZza;
                if (zzcfiVar.zzN() != null) {
                    zzcfiVar.zzN().zzq();
                }
            }
        }, zzcan.zzf);
        zzcpnVarZza.zzh();
        zzfbk zzfbkVar = zzfbeVar.zzt;
        return zzfye.zzm(zzdol.zzj(zzcfiVarZza, zzfbkVar.zzb, zzfbkVar.zza), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzedv
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj2) {
                zzcfi zzcfiVar = zzcfiVarZza;
                zzfbe zzfbeVar2 = zzfbeVar;
                zzcpn zzcpnVar = zzcpnVarZza;
                if (zzfbeVar2.zzN) {
                    zzcfiVar.zzae();
                }
                zzcfiVar.zzY();
                zzcfiVar.onPause();
                return zzcpnVar.zza();
            }
        }, this.zze);
    }
}
