package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcom implements zzfya {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcon zzb;

    zzcom(zzcon zzconVar, String str) {
        this.zzb = zzconVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        zzcon zzconVar = this.zzb;
        zzconVar.zzh.zza(zzconVar.zzg.zzd(zzconVar.zze, zzconVar.zzf, false, this.zza, null, zzconVar.zzf.zzd));
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        zzcon zzconVar = this.zzb;
        zzconVar.zzh.zza(zzconVar.zzg.zzd(zzconVar.zze, zzconVar.zzf, false, this.zza, str, zzconVar.zzf.zzd));
    }
}
