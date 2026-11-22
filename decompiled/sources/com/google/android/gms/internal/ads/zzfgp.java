package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfgp implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzfgp(zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
        this.zzc = zzgzgVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgyn zzgynVarZza = zzgys.zza(this.zza);
        zzgyn zzgynVarZza2 = zzgys.zza(this.zzb);
        Object zzfgrVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzim)).booleanValue() ? new zzfgr((zzfgo) zzgynVarZza.zzb(), (ScheduledExecutorService) this.zzc.zzb()) : (zzfgo) zzgynVarZza2.zzb();
        zzgzb.zzb(zzfgrVar);
        return zzfgrVar;
    }
}
