package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzckv implements zzfay {
    private final zzciz zza;
    private final zzckv zzb = this;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;
    private final zzgzg zzh;
    private final zzgzg zzi;
    private final zzgzg zzj;

    /* synthetic */ zzckv(zzciz zzcizVar, Context context, String str, zzcku zzckuVar) {
        this.zza = zzcizVar;
        zzgyt zzgytVarZza = zzgyu.zza(context);
        this.zzc = zzgytVarZza;
        zzeyy zzeyyVar = new zzeyy(zzgytVarZza, zzcizVar.zzaF, zzcizVar.zzaG);
        this.zzd = zzeyyVar;
        zzgzg zzgzgVarZzc = zzgys.zzc(new zzfai(zzcizVar.zzaF));
        this.zze = zzgzgVarZzc;
        zzgzg zzgzgVarZzc2 = zzgys.zzc(zzfbx.zza());
        this.zzf = zzgzgVarZzc2;
        zzgzg zzgzgVarZzc3 = zzgys.zzc(new zzfas(zzgytVarZza, zzcizVar.zzo, zzcizVar.zzU, zzeyyVar, zzgzgVarZzc, zzfcc.zza(), zzgzgVarZzc2));
        this.zzg = zzgzgVarZzc3;
        this.zzh = zzgys.zzc(new zzfbc(zzgzgVarZzc3, zzgzgVarZzc, zzgzgVarZzc2));
        zzgyt zzgytVarZzc = zzgyu.zzc(str);
        this.zzi = zzgytVarZzc;
        this.zzj = zzgys.zzc(new zzfaw(zzgytVarZzc, zzgzgVarZzc3, zzgytVarZza, zzgzgVarZzc, zzgzgVarZzc2, zzcizVar.zzh, zzcizVar.zzV, zzcizVar.zzZ));
    }

    @Override // com.google.android.gms.internal.ads.zzfay
    public final zzfav zza() {
        return (zzfav) this.zzj.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfay
    public final zzfbb zzb() {
        return (zzfbb) this.zzh.zzb();
    }
}
