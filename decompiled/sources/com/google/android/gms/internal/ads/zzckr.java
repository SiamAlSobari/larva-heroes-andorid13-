package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzckr implements zzezk {
    private final zzciz zza;
    private final zzckr zzb = this;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;
    private final zzgzg zzh;
    private final zzgzg zzi;

    /* synthetic */ zzckr(zzciz zzcizVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzckq zzckqVar) {
        this.zza = zzcizVar;
        zzgyt zzgytVarZza = zzgyu.zza(context);
        this.zzc = zzgytVarZza;
        zzgyt zzgytVarZza2 = zzgyu.zza(zzqVar);
        this.zzd = zzgytVarZza2;
        zzgyt zzgytVarZza3 = zzgyu.zza(str);
        this.zze = zzgytVarZza3;
        zzgzg zzgzgVarZzc = zzgys.zzc(new zzeky(zzcizVar.zzn));
        this.zzf = zzgzgVarZzc;
        zzgzg zzgzgVarZzc2 = zzgys.zzc(new zzfai(zzcizVar.zzaF));
        this.zzg = zzgzgVarZzc2;
        zzgzg zzgzgVarZzc3 = zzgys.zzc(new zzezi(zzgytVarZza, zzcizVar.zzo, zzcizVar.zzU, zzgzgVarZzc, zzgzgVarZzc2, zzfcc.zza()));
        this.zzh = zzgzgVarZzc3;
        this.zzi = zzgys.zzc(new zzelg(zzgytVarZza, zzgytVarZza2, zzgytVarZza3, zzgzgVarZzc3, zzgzgVarZzc, zzgzgVarZzc2, zzcizVar.zzh, zzcizVar.zzV, zzcizVar.zzZ));
    }

    @Override // com.google.android.gms.internal.ads.zzezk
    public final zzelf zza() {
        return (zzelf) this.zzi.zzb();
    }
}
