package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdyq implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;
    private final zzgzg zzg;
    private final zzgzg zzh;
    private final zzgzg zzi;

    public zzdyq(zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3, zzgzg zzgzgVar4, zzgzg zzgzgVar5, zzgzg zzgzgVar6, zzgzg zzgzgVar7, zzgzg zzgzgVar8, zzgzg zzgzgVar9) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
        this.zzc = zzgzgVar3;
        this.zzd = zzgzgVar4;
        this.zze = zzgzgVar5;
        this.zzf = zzgzgVar6;
        this.zzg = zzgzgVar7;
        this.zzh = zzgzgVar8;
        this.zzi = zzgzgVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdyp zzb() {
        zzczb zzczbVarZzb = ((zzczc) this.zza).zzb();
        zzdxx zzdxxVarZzb = ((zzdxy) this.zzb).zzb();
        zzfge zzfgeVar = (zzfge) this.zzc.zzb();
        zzfca zzfcaVarZza = ((zzcvz) this.zzd).zza();
        zzcag zzcagVarZza = ((zzchv) this.zze).zza();
        zzfhu zzfhuVar = (zzfhu) this.zzf.zzb();
        zzfhr zzfhrVar = (zzfhr) this.zzg.zzb();
        Context contextZza = ((zzchj) this.zzh).zza();
        zzfyo zzfyoVar = zzcan.zza;
        zzgzb.zzb(zzfyoVar);
        return new zzdyp(zzczbVarZzb, zzdxxVarZzb, zzfgeVar, zzfcaVarZza, zzcagVarZza, zzfhuVar, zzfhrVar, contextZza, zzfyoVar);
    }
}
