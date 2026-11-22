package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzckl implements zzdfp {
    private final zzciz zza;
    private zzeyz zzb;
    private zzeyc zzc;
    private zzdbv zzd;
    private zzcvs zze;
    private zzejg zzf;

    /* synthetic */ zzckl(zzciz zzcizVar, zzckk zzckkVar) {
        this.zza = zzcizVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvo
    public final /* synthetic */ zzcvo zza(zzeyc zzeycVar) {
        this.zzc = zzeycVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvo
    public final /* synthetic */ zzcvo zzb(zzeyz zzeyzVar) {
        this.zzb = zzeyzVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdfp
    public final /* synthetic */ zzdfp zzc(zzejg zzejgVar) {
        this.zzf = zzejgVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdfp
    public final /* synthetic */ zzdfp zzd(zzdbv zzdbvVar) {
        this.zzd = zzdbvVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdfp
    public final /* synthetic */ zzdfp zze(zzcvs zzcvsVar) {
        this.zze = zzcvsVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcvo
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzdfq zzh() {
        zzgzb.zzc(this.zzd, zzdbv.class);
        zzgzb.zzc(this.zze, zzcvs.class);
        zzgzb.zzc(this.zzf, zzejg.class);
        return new zzckn(this.zza, new zzctn(), new zzfdf(), new zzcuy(), new zzdru(), this.zzd, this.zze, zzehl.zza(), this.zzf, null, this.zzb, this.zzc, null);
    }
}
