package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzexj implements zzelm {
    final /* synthetic */ zzexk zza;

    zzexj(zzexk zzexkVar) {
        this.zza = zzexkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelm
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcpw zzcpwVar = (zzcpw) obj;
        synchronized (this.zza) {
            zzcpw zzcpwVar2 = this.zza.zza;
            if (zzcpwVar2 != null) {
                zzcpwVar2.zzb();
            }
            zzexk zzexkVar = this.zza;
            zzexkVar.zza = zzcpwVar;
            zzcpwVar.zzc(zzexkVar);
            zzexk zzexkVar2 = this.zza;
            zzexkVar2.zzg.zzk(new zzcpx(zzcpwVar, zzexkVar2, zzexkVar2.zzg, zzexkVar2.zzi));
            zzcpwVar.zzj();
        }
    }
}
