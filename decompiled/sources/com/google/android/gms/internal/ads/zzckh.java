package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzckh implements zzdsq {
    private final Context zza;
    private final zzbjp zzb;
    private final zzciz zzc;
    private final zzckh zzd = this;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;
    private final zzgzg zzh;

    /* synthetic */ zzckh(zzciz zzcizVar, Context context, zzbjp zzbjpVar, zzckg zzckgVar) {
        this.zzc = zzcizVar;
        this.zza = context;
        this.zzb = zzbjpVar;
        zzgyt zzgytVarZza = zzgyu.zza(this);
        this.zze = zzgytVarZza;
        zzgyt zzgytVarZza2 = zzgyu.zza(zzbjpVar);
        this.zzf = zzgytVarZza2;
        zzdsm zzdsmVar = new zzdsm(zzgytVarZza2);
        this.zzg = zzdsmVar;
        this.zzh = zzgys.zzc(new zzdso(zzgytVarZza, zzdsmVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdsq
    public final zzdsh zzb() {
        return new zzckb(this.zzc, this.zzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdsq
    public final zzdsn zzd() {
        return (zzdsn) this.zzh.zzb();
    }
}
