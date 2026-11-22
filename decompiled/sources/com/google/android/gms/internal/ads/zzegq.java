package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzegq extends zzegs {
    private final zzchd zza;
    private final zzdgh zzb;
    private final zzcvq zzc;
    private final zzdbv zzd;
    private final zzehc zze;
    private final zzeds zzf;

    public zzegq(zzchd zzchdVar, zzdgh zzdghVar, zzcvq zzcvqVar, zzdbv zzdbvVar, zzehc zzehcVar, zzeds zzedsVar) {
        this.zza = zzchdVar;
        this.zzb = zzdghVar;
        this.zzc = zzcvqVar;
        this.zzd = zzdbvVar;
        this.zze = zzehcVar;
        this.zzf = zzedsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegs
    protected final ListenableFuture zzc(zzfca zzfcaVar, Bundle bundle, zzfbe zzfbeVar, zzfbr zzfbrVar) {
        zzcvq zzcvqVar = this.zzc;
        zzcvqVar.zzi(zzfcaVar);
        zzcvqVar.zzf(bundle);
        zzcvqVar.zzg(new zzcvk(zzfbrVar, zzfbeVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdo)).booleanValue()) {
            this.zzc.zzd(this.zzf);
        }
        zzdgl zzdglVarZzh = this.zza.zzh();
        zzdglVarZzh.zzf(this.zzc.zzj());
        zzdglVarZzh.zze(this.zzd);
        zzdglVarZzh.zzd(this.zzb);
        zzdglVarZzh.zzc(new zzcpz(null));
        zzctl zzctlVarZza = zzdglVarZzh.zzg().zza();
        return zzctlVarZza.zzi(zzctlVarZza.zzj());
    }
}
