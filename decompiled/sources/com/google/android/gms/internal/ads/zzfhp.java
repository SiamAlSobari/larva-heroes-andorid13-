package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfhp implements zzfya {
    final /* synthetic */ zzfhr zza;
    final /* synthetic */ zzfhg zzb;

    zzfhp(zzfhr zzfhrVar, zzfhg zzfhgVar) {
        this.zza = zzfhrVar;
        this.zzb = zzfhgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        zzfhr zzfhrVar = this.zza;
        zzfhg zzfhgVar = this.zzb;
        zzfhgVar.zzg(th);
        zzfhgVar.zzf(false);
        zzfhrVar.zza(zzfhgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object obj) {
    }
}
