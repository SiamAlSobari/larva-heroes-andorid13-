package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdnn implements zzbjh {
    private final zzcxp zza;
    private final zzbvp zzb;
    private final String zzc;
    private final String zzd;

    public zzdnn(zzcxp zzcxpVar, zzfbe zzfbeVar) {
        this.zza = zzcxpVar;
        this.zzb = zzfbeVar.zzm;
        this.zzc = zzfbeVar.zzk;
        this.zzd = zzfbeVar.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbjh
    @ParametersAreNonnullByDefault
    public final void zza(zzbvp zzbvpVar) {
        int i;
        String str;
        zzbvp zzbvpVar2 = this.zzb;
        if (zzbvpVar2 != null) {
            zzbvpVar = zzbvpVar2;
        }
        if (zzbvpVar != null) {
            str = zzbvpVar.zza;
            i = zzbvpVar.zzb;
        } else {
            i = 1;
            str = "";
        }
        this.zza.zzd(new zzbva(str, i), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbjh
    public final void zzb() {
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbjh
    public final void zzc() {
        this.zza.zzf();
    }
}
