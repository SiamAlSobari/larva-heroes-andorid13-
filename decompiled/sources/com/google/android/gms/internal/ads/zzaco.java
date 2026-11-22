package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaco implements zzaca {
    final /* synthetic */ zzacr zza;
    private final long zzb;

    public zzaco(zzacr zzacrVar, long j) {
        this.zza = zzacrVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final long zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final zzaby zzg(long j) {
        zzaby zzabyVarZza = this.zza.zzg[0].zza(j);
        int i = 1;
        while (true) {
            zzacr zzacrVar = this.zza;
            if (i >= zzacrVar.zzg.length) {
                return zzabyVarZza;
            }
            zzaby zzabyVarZza2 = zzacrVar.zzg[i].zza(j);
            if (zzabyVarZza2.zza.zzc < zzabyVarZza.zza.zzc) {
                zzabyVarZza = zzabyVarZza2;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final boolean zzh() {
        return true;
    }
}
