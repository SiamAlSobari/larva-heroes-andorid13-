package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdxe implements zzdxg {
    private final Map zza;
    private final zzfyo zzb;
    private final zzczb zzc;

    public zzdxe(Map map, zzfyo zzfyoVar, zzczb zzczbVar) {
        this.zza = map;
        this.zzb = zzfyoVar;
        this.zzc = zzczbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdxg
    public final ListenableFuture zzb(final zzbun zzbunVar) {
        this.zzc.zzbr(zzbunVar);
        ListenableFuture listenableFutureZzg = zzfye.zzg(new zzdve(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhR)).split(",")) {
            final zzgzg zzgzgVar = (zzgzg) this.zza.get(str.trim());
            if (zzgzgVar != null) {
                listenableFutureZzg = zzfye.zzf(listenableFutureZzg, zzdve.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdxc
                    @Override // com.google.android.gms.internal.ads.zzfxl
                    public final ListenableFuture zza(Object obj) {
                        zzgzg zzgzgVar2 = zzgzgVar;
                        return ((zzdxg) zzgzgVar2.zzb()).zzb(zzbunVar);
                    }
                }, this.zzb);
            }
        }
        zzfye.zzr(listenableFutureZzg, new zzdxd(this), zzcan.zzf);
        return listenableFutureZzg;
    }
}
