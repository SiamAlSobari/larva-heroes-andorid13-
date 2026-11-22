package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzlk extends zztg {
    private final zzcv zzd;

    zzlk(zzll zzllVar, zzcw zzcwVar) {
        super(zzcwVar);
        this.zzd = new zzcv();
    }

    @Override // com.google.android.gms.internal.ads.zztg, com.google.android.gms.internal.ads.zzcw
    public final zzct zzd(int i, zzct zzctVar, boolean z) {
        zzct zzctVarZzd = this.zzc.zzd(i, zzctVar, z);
        if (this.zzc.zze(zzctVarZzd.zzd, this.zzd, 0L).zzb()) {
            Object obj = zzctVar.zzb;
            Object obj2 = zzctVar.zzc;
            int i2 = zzctVar.zzd;
            long j = zzctVar.zze;
            long j2 = zzctVar.zzf;
            zzctVarZzd.zzl(obj, obj2, i2, j, 0L, zzd.zza, true);
        } else {
            zzctVarZzd.zzg = true;
        }
        return zzctVarZzd;
    }
}
