package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzegz extends zzegs {
    private final zzchd zza;
    private final zzcvq zzb;
    private final zzdbv zzc;
    private final zzehc zzd;

    @Nullable
    private final zzfbs zze;
    private final zzeds zzf;

    public zzegz(zzchd zzchdVar, zzcvq zzcvqVar, zzdbv zzdbvVar, @Nullable zzfbs zzfbsVar, zzehc zzehcVar, zzeds zzedsVar) {
        this.zza = zzchdVar;
        this.zzb = zzcvqVar;
        this.zzc = zzdbvVar;
        this.zze = zzfbsVar;
        this.zzd = zzehcVar;
        this.zzf = zzedsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegs
    protected final ListenableFuture zzc(zzfca zzfcaVar, Bundle bundle, zzfbe zzfbeVar, zzfbr zzfbrVar) {
        zzfbs zzfbsVar;
        zzcvq zzcvqVar = this.zzb;
        zzcvqVar.zzi(zzfcaVar);
        zzcvqVar.zzf(bundle);
        zzcvqVar.zzg(new zzcvk(zzfbrVar, zzfbeVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdn)).booleanValue() && (zzfbsVar = this.zze) != null) {
            this.zzb.zzh(zzfbsVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdo)).booleanValue()) {
            this.zzb.zzd(this.zzf);
        }
        zzdnu zzdnuVarZzi = this.zza.zzi();
        zzdnuVarZzi.zzd(this.zzb.zzj());
        zzdnuVarZzi.zzc(this.zzc);
        zzctl zzctlVarZzb = zzdnuVarZzi.zze().zzb();
        return zzctlVarZzb.zzi(zzctlVarZzb.zzj());
    }
}
