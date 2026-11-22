package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzegt extends zzegs {
    private final zzchd zza;
    private final zzcvq zzb;
    private final zzdbv zzc;
    private final zzehc zzd;
    private final zzeds zze;

    zzegt(zzchd zzchdVar, zzcvq zzcvqVar, zzdbv zzdbvVar, zzehc zzehcVar, zzeds zzedsVar) {
        this.zza = zzchdVar;
        this.zzb = zzcvqVar;
        this.zzc = zzdbvVar;
        this.zzd = zzehcVar;
        this.zze = zzedsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegs
    protected final ListenableFuture zzc(zzfca zzfcaVar, Bundle bundle, zzfbe zzfbeVar, zzfbr zzfbrVar) {
        zzcvq zzcvqVar = this.zzb;
        zzcvqVar.zzi(zzfcaVar);
        zzcvqVar.zzf(bundle);
        zzcvqVar.zzg(new zzcvk(zzfbrVar, zzfbeVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdo)).booleanValue()) {
            this.zzb.zzd(this.zze);
        }
        zzcpp zzcppVarZzd = this.zza.zzd();
        zzcppVarZzd.zzd(this.zzb.zzj());
        zzcppVarZzd.zzc(this.zzc);
        zzctl zzctlVarZzb = zzcppVarZzd.zze().zzb();
        return zzctlVarZzb.zzi(zzctlVarZzb.zzj());
    }
}
