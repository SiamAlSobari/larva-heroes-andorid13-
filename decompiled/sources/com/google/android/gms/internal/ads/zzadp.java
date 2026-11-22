package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzadp implements zzaca {
    final /* synthetic */ zzaca zza;
    final /* synthetic */ zzadq zzb;

    zzadp(zzadq zzadqVar, zzaca zzacaVar) {
        this.zzb = zzadqVar;
        this.zza = zzacaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long j) {
        zzaby zzabyVarZzg = this.zza.zzg(j);
        zzacb zzacbVar = zzabyVarZzg.zza;
        zzacb zzacbVar2 = new zzacb(zzacbVar.zzb, zzacbVar.zzc + this.zzb.zzb);
        zzacb zzacbVar3 = zzabyVarZzg.zzb;
        return new zzaby(zzacbVar2, new zzacb(zzacbVar3.zzb, zzacbVar3.zzc + this.zzb.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return this.zza.zzh();
    }
}
