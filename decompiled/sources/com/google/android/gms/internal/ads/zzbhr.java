package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzbhr implements zzbir {
    public final /* synthetic */ zzddw zza;
    public final /* synthetic */ zzcob zzb;

    public /* synthetic */ zzbhr(zzddw zzddwVar, zzcob zzcobVar) {
        this.zza = zzddwVar;
        this.zzb = zzcobVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object obj, Map map) {
        zzddw zzddwVar = this.zza;
        final zzcob zzcobVar = this.zzb;
        zzcfi zzcfiVar = (zzcfi) obj;
        zzbiq.zzc(map, zzddwVar);
        String str = (String) map.get("u");
        if (str == null) {
            zzcaa.zzj("URL missing from click GMSG.");
        } else {
            zzfye.zzr(zzfye.zzn(zzfxv.zzu(zzbiq.zza(zzcfiVar, str)), new zzfxl() { // from class: com.google.android.gms.internal.ads.zzbht
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final ListenableFuture zza(Object obj2) {
                    zzcob zzcobVar2 = zzcobVar;
                    String str2 = (String) obj2;
                    zzbir zzbirVar = zzbiq.zza;
                    return (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjo)).booleanValue() || zzcobVar2 == null) ? zzfye.zzh(str2) : zzcobVar2.zzc(str2, com.google.android.gms.ads.internal.client.zzay.zze());
                }
            }, zzcan.zza), new zzbif(zzcfiVar), zzcan.zza);
        }
    }
}
