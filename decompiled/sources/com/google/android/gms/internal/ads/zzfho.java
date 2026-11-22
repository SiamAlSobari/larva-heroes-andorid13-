package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfho implements zzfya {
    final /* synthetic */ zzfhr zza;
    final /* synthetic */ zzfhg zzb;
    final /* synthetic */ boolean zzc;

    zzfho(zzfhr zzfhrVar, zzfhg zzfhgVar, boolean z) {
        this.zza = zzfhrVar;
        this.zzb = zzfhgVar;
        this.zzc = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        zzfhg zzfhgVar = this.zzb;
        if (zzfhgVar.zzj()) {
            zzfhr zzfhrVar = this.zza;
            zzfhgVar.zzg(th);
            zzfhgVar.zzf(false);
            zzfhrVar.zza(zzfhgVar);
            if (this.zzc) {
                this.zza.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object obj) {
        zzfhr zzfhrVar = this.zza;
        zzfhg zzfhgVar = this.zzb;
        zzfhgVar.zzf(true);
        zzfhrVar.zza(zzfhgVar);
        if (this.zzc) {
            this.zza.zzg();
        }
    }
}
