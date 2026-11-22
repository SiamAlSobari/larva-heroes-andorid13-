package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcwe implements zzgyt {
    private final zzcwd zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;

    public zzcwe(zzcwd zzcwdVar, zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3, zzgzg zzgzgVar4) {
        this.zza = zzcwdVar;
        this.zzb = zzgzgVar;
        this.zzc = zzgzgVar2;
        this.zzd = zzgzgVar3;
        this.zze = zzgzgVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.zzb.zzb();
        zzcag zzcagVarZza = ((zzchv) this.zzc).zza();
        zzfbe zzfbeVarZza = ((zzcsu) this.zzd).zza();
        zzbwx zzbwxVar = new zzbwx();
        if (zzfbeVarZza.zzB == null) {
            return null;
        }
        zzfbk zzfbkVar = zzfbeVarZza.zzt;
        return new zzbww(context, zzcagVarZza, zzfbeVarZza.zzB, zzfbkVar == null ? null : zzfbkVar.zzb, zzbwxVar);
    }
}
