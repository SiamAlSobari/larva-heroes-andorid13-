package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdfg implements zzgyt {
    private final zzdet zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzdfg(zzdet zzdetVar, zzgzg zzgzgVar, zzgzg zzgzgVar2) {
        this.zza = zzdetVar;
        this.zzb = zzgzgVar;
        this.zzc = zzgzgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbxn zzb() {
        return new zzbxn(((zzchj) this.zzb).zza(), ((zzcvz) this.zzc).zza().zzf);
    }
}
