package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfgu implements zzfgo {
    private final zzfgy zza;
    private final zzfgw zzb;
    private final zzfgl zzc;

    public zzfgu(zzfgl zzfglVar, zzfgy zzfgyVar, zzfgw zzfgwVar) {
        this.zzc = zzfglVar;
        this.zza = zzfgyVar;
        this.zzb = zzfgwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final String zza(zzfgn zzfgnVar) {
        zzfgy zzfgyVar = this.zza;
        Map mapZzj = zzfgnVar.zzj();
        this.zzb.zza(mapZzj);
        return zzfgyVar.zza(mapZzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzb(zzfgn zzfgnVar) {
        this.zzc.zzb(zza(zzfgnVar));
    }
}
