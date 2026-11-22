package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdez implements zzgyt {
    private final zzdet zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;

    public zzdez(zzdet zzdetVar, zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3, zzgzg zzgzgVar4) {
        this.zza = zzdetVar;
        this.zzb = zzgzgVar;
        this.zzc = zzgzgVar2;
        this.zzd = zzgzgVar3;
        this.zze = zzgzgVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zzb.zzb();
        final zzcag zzcagVarZza = ((zzchv) this.zzc).zza();
        final zzfbe zzfbeVarZza = ((zzcsu) this.zzd).zza();
        final zzfca zzfcaVarZza = ((zzcvz) this.zze).zza();
        return new zzddo(new zzcxw() { // from class: com.google.android.gms.internal.ads.zzdes
            @Override // com.google.android.gms.internal.ads.zzcxw
            public final void zzr() {
                com.google.android.gms.ads.internal.zzt.zzs().zzn(context, zzcagVarZza.zza, zzfbeVarZza.zzD.toString(), zzfcaVarZza.zzf);
            }
        }, zzcan.zzf);
    }
}
