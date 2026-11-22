package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcpa implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzcpa(zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
        this.zzc = zzgzgVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzaub zzaubVar = (zzaub) this.zza.zzb();
        zzbnr zzbnrVar = (zzbnr) this.zzb.zzb();
        zzfyo zzfyoVarZza = zzfer.zza();
        zzgzb.zzb(zzfyoVarZza);
        return new zzcot(zzaubVar.zzc(), zzbnrVar, zzfyoVarZza);
    }
}
