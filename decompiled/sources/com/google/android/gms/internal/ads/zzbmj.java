package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbmj implements zzcaw {
    final /* synthetic */ zzbmt zza;
    final /* synthetic */ zzfhg zzb;
    final /* synthetic */ zzbmu zzc;

    zzbmj(zzbmu zzbmuVar, zzbmt zzbmtVar, zzfhg zzfhgVar) {
        this.zzc = zzbmuVar;
        this.zza = zzbmtVar;
        this.zzb = zzfhgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        synchronized (this.zzc.zza) {
            this.zzc.zzi = 0;
            zzbmu zzbmuVar = this.zzc;
            if (zzbmuVar.zzh != null && this.zza != zzbmuVar.zzh) {
                com.google.android.gms.ads.internal.util.zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                this.zzc.zzh.zzb();
            }
            this.zzc.zzh = this.zza;
            if (((Boolean) zzbdd.zzd.zze()).booleanValue()) {
                zzbmu zzbmuVar2 = this.zzc;
                if (zzbmuVar2.zze != null) {
                    zzfhu zzfhuVar = zzbmuVar2.zze;
                    zzfhg zzfhgVar = this.zzb;
                    zzfhgVar.zzf(true);
                    zzfhuVar.zzb(zzfhgVar.zzl());
                }
            }
        }
    }
}
