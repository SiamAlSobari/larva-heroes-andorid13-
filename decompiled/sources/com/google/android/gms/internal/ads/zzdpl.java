package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdpl implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;

    public zzdpl(zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3, zzgzg zzgzgVar4, zzgzg zzgzgVar5) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
        this.zzc = zzgzgVar3;
        this.zzd = zzgzgVar4;
        this.zze = zzgzgVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((zzchj) this.zza).zza();
        final String strZzb = ((zzdvw) this.zzb).zzb();
        zzcag zzcagVarZza = ((zzchv) this.zzc).zza();
        final zzaxo zzaxoVar = (zzaxo) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzaxe zzaxeVar = new zzaxe(new zzaxk(contextZza));
        zzbad zzbadVarZza = zzbae.zza();
        zzbadVarZza.zza(zzcagVarZza.zzb);
        zzbadVarZza.zzc(zzcagVarZza.zzc);
        zzbadVarZza.zzb(true != zzcagVarZza.zzd ? 2 : 0);
        final zzbae zzbaeVar = (zzbae) zzbadVarZza.zzal();
        zzaxeVar.zzb(new zzaxd() { // from class: com.google.android.gms.internal.ads.zzdpk
            @Override // com.google.android.gms.internal.ads.zzaxd
            public final void zza(zzayt zzaytVar) {
                zzaxo zzaxoVar2 = zzaxoVar;
                String str2 = strZzb;
                zzbae zzbaeVar2 = zzbaeVar;
                String str3 = str;
                zzaxp zzaxpVar = (zzaxp) zzaytVar.zza().zzaB();
                zzaxpVar.zza(zzaxoVar2);
                zzaytVar.zze(zzaxpVar);
                zzayl zzaylVar = (zzayl) zzaytVar.zzb().zzaB();
                zzaylVar.zza(str2);
                zzaylVar.zzb(zzbaeVar2);
                zzaytVar.zzg(zzaylVar);
                zzaytVar.zzh(str3);
            }
        });
        return zzaxeVar;
    }
}
