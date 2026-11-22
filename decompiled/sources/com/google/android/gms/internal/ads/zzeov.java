package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeov implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzeov(zzgzg zzgzgVar, zzgzg zzgzgVar2) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfui zzfuiVarZzm;
        zzeol zzeolVarZza = zzeon.zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdQ)).booleanValue()) {
            zzfuiVarZzm = zzfui.zzn(new zzeqr(zzeolVarZza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdR)).intValue(), scheduledExecutorService));
        } else {
            zzfuiVarZzm = zzfui.zzm();
        }
        zzgzb.zzb(zzfuiVarZzm);
        return zzfuiVarZzm;
    }
}
