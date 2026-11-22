package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcjj implements zzewf {
    private final zzciz zza;
    private final zzcjj zzb = this;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;
    private final zzgzg zzh;

    /* synthetic */ zzcjj(zzciz zzcizVar, Context context, String str, zzcji zzcjiVar) {
        this.zza = zzcizVar;
        zzgyt zzgytVarZza = zzgyu.zza(context);
        this.zzc = zzgytVarZza;
        zzgyt zzgytVarZza2 = zzgyu.zza(str);
        this.zzd = zzgytVarZza2;
        zzeyx zzeyxVar = new zzeyx(zzgytVarZza, zzcizVar.zzaF, zzcizVar.zzaG);
        this.zze = zzeyxVar;
        zzgzg zzgzgVarZzc = zzgys.zzc(new zzexd(zzcizVar.zzaF));
        this.zzf = zzgzgVarZzc;
        zzgzg zzgzgVarZzc2 = zzgys.zzc(new zzexf(zzgytVarZza, zzcizVar.zzo, zzcizVar.zzU, zzeyxVar, zzgzgVarZzc, zzfcc.zza(), zzcizVar.zzh));
        this.zzg = zzgzgVarZzc2;
        this.zzh = zzgys.zzc(new zzexl(zzcizVar.zzU, zzgytVarZza, zzgytVarZza2, zzgzgVarZzc2, zzgzgVarZzc, zzcizVar.zzh, zzcizVar.zzZ));
    }

    @Override // com.google.android.gms.internal.ads.zzewf
    public final zzexk zza() {
        return (zzexk) this.zzh.zzb();
    }
}
