package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzegx extends zzegs {
    private final zzchd zza;
    private final zzcvq zzb;
    private final zzejg zzc;
    private final zzdbv zzd;
    private final zzehc zze;
    private final zzeds zzf;

    public zzegx(zzchd zzchdVar, zzcvq zzcvqVar, zzejg zzejgVar, zzdbv zzdbvVar, zzehc zzehcVar, zzeds zzedsVar) {
        this.zza = zzchdVar;
        this.zzb = zzcvqVar;
        this.zzc = zzejgVar;
        this.zzd = zzdbvVar;
        this.zze = zzehcVar;
        this.zzf = zzedsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegs
    protected final ListenableFuture zzc(zzfca zzfcaVar, Bundle bundle, zzfbe zzfbeVar, zzfbr zzfbrVar) {
        zzcvq zzcvqVar = this.zzb;
        zzcvqVar.zzi(zzfcaVar);
        zzcvqVar.zzf(bundle);
        zzcvqVar.zzg(new zzcvk(zzfbrVar, zzfbeVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdo)).booleanValue()) {
            this.zzb.zzd(this.zzf);
        }
        zzdfp zzdfpVarZzg = this.zza.zzg();
        zzdfpVarZzg.zze(this.zzb.zzj());
        zzdfpVarZzg.zzd(this.zzd);
        zzdfpVarZzg.zzc(this.zzc);
        zzctl zzctlVarZza = zzdfpVarZzg.zzf().zza();
        return zzctlVarZza.zzi(zzctlVarZza.zzj());
    }
}
