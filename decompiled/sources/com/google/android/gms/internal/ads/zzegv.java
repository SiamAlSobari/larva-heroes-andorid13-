package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzegv extends zzegs {
    private final zzchd zza;
    private final zzcvq zzb;
    private final zzejg zzc;
    private final zzdbv zzd;
    private final zzdgh zze;
    private final zzcyx zzf;
    private final ViewGroup zzg;
    private final zzdbe zzh;
    private final zzehc zzi;
    private final zzeds zzj;

    public zzegv(zzchd zzchdVar, zzcvq zzcvqVar, zzejg zzejgVar, zzdbv zzdbvVar, zzdgh zzdghVar, zzcyx zzcyxVar, ViewGroup viewGroup, zzdbe zzdbeVar, zzehc zzehcVar, zzeds zzedsVar) {
        this.zza = zzchdVar;
        this.zzb = zzcvqVar;
        this.zzc = zzejgVar;
        this.zzd = zzdbvVar;
        this.zze = zzdghVar;
        this.zzf = zzcyxVar;
        this.zzg = viewGroup;
        this.zzh = zzdbeVar;
        this.zzi = zzehcVar;
        this.zzj = zzedsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegs
    protected final ListenableFuture zzc(zzfca zzfcaVar, Bundle bundle, zzfbe zzfbeVar, zzfbr zzfbrVar) {
        zzcvq zzcvqVar = this.zzb;
        zzcvqVar.zzi(zzfcaVar);
        zzcvqVar.zzf(bundle);
        zzcvqVar.zzg(new zzcvk(zzfbrVar, zzfbeVar, this.zzi));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdo)).booleanValue()) {
            this.zzb.zzd(this.zzj);
        }
        zzcqy zzcqyVarZze = this.zza.zze();
        zzcqyVarZze.zzi(this.zzb.zzj());
        zzcqyVarZze.zzf(this.zzd);
        zzcqyVarZze.zze(this.zzc);
        zzcqyVarZze.zzd(this.zze);
        zzcqyVarZze.zzg(new zzcrw(this.zzf, this.zzh));
        zzcqyVarZze.zzc(new zzcpz(this.zzg));
        zzctl zzctlVarZzd = zzcqyVarZze.zzk().zzd();
        return zzctlVarZzd.zzi(zzctlVarZzd.zzj());
    }
}
