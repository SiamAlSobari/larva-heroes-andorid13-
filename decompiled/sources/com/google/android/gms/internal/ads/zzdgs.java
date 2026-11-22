package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdgs implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;
    private final zzgzg zzd;
    private final zzgzg zze;
    private final zzgzg zzf;

    public zzdgs(zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3, zzgzg zzgzgVar4, zzgzg zzgzgVar5, zzgzg zzgzgVar6) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
        this.zzc = zzgzgVar3;
        this.zzd = zzgzgVar4;
        this.zze = zzgzgVar5;
        this.zzf = zzgzgVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzchd zzchdVar = (zzchd) this.zza.zzb();
        zzcvq zzcvqVarZza = ((zzcwa) this.zzb).zza();
        zzdbv zzdbvVarZza = ((zzdco) this.zzc).zza();
        zzdgh zzdghVarZza = ((zzdgj) this.zzd).zza();
        zzcyx zzcyxVarZzb = ((zzcqb) this.zze).zzb();
        zzehc zzehcVar = (zzehc) this.zzf.zzb();
        zzcqy zzcqyVarZze = zzchdVar.zze();
        zzcqyVarZze.zzi(zzcvqVarZza.zzj());
        zzcqyVarZze.zzf(zzdbvVarZza);
        zzcqyVarZze.zzd(zzdghVarZza);
        zzcqyVarZze.zze(new zzejg(null));
        zzcqyVarZze.zzg(new zzcrw(zzcyxVarZzb, null));
        zzcqyVarZze.zzc(new zzcpz(null));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdr)).booleanValue()) {
            zzcqyVarZze.zzj(zzehj.zzb(zzehcVar));
        }
        zzcsh zzcshVarZzc = zzcqyVarZze.zzh().zzc();
        zzgzb.zzb(zzcshVarZzc);
        return zzcshVarZzc;
    }
}
