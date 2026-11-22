package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcjt implements zzext {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzq zzb;
    private final String zzc;
    private final zzciz zzd;
    private final zzcjt zze = this;
    private final zzgzg zzf;
    private final zzgzg zzg;
    private final zzgzg zzh;
    private final zzgzg zzi;
    private final zzgzg zzj;
    private final zzgzg zzk;

    /* synthetic */ zzcjt(zzciz zzcizVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcjs zzcjsVar) {
        this.zzd = zzcizVar;
        this.zza = context;
        this.zzb = zzqVar;
        this.zzc = str;
        zzgyt zzgytVarZza = zzgyu.zza(context);
        this.zzf = zzgytVarZza;
        zzgyt zzgytVarZza2 = zzgyu.zza(zzqVar);
        this.zzg = zzgytVarZza2;
        zzgzg zzgzgVarZzc = zzgys.zzc(new zzeky(zzcizVar.zzn));
        this.zzh = zzgzgVarZzc;
        zzgzg zzgzgVarZzc2 = zzgys.zzc(zzeld.zza());
        this.zzi = zzgzgVarZzc2;
        zzgzg zzgzgVarZzc3 = zzgys.zzc(zzdbg.zza());
        this.zzj = zzgzgVarZzc3;
        this.zzk = zzgys.zzc(new zzexr(zzgytVarZza, zzcizVar.zzo, zzgytVarZza2, zzcizVar.zzU, zzgzgVarZzc, zzgzgVarZzc2, zzfcc.zza(), zzgzgVarZzc3));
    }

    @Override // com.google.android.gms.internal.ads.zzext
    public final zzekd zza() {
        Context context = this.zza;
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzb;
        String str = this.zzc;
        zzexq zzexqVar = (zzexq) this.zzk.zzb();
        zzekx zzekxVar = (zzekx) this.zzh.zzb();
        zzcag zzcagVarZzd = this.zzd.zza.zzd();
        zzgzb.zzb(zzcagVarZzd);
        return new zzekd(context, zzqVar, str, zzexqVar, zzekxVar, zzcagVarZzd, (zzdrh) this.zzd.zzZ.zzb());
    }
}
