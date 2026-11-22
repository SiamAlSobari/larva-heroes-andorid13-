package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbmk implements zzcau {
    final /* synthetic */ zzbmt zza;
    final /* synthetic */ zzfhg zzb;
    final /* synthetic */ zzbmu zzc;

    zzbmk(zzbmu zzbmuVar, zzbmt zzbmtVar, zzfhg zzfhgVar) {
        this.zzc = zzbmuVar;
        this.zza = zzbmtVar;
        this.zzb = zzfhgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final void zza() {
        synchronized (this.zzc.zza) {
            this.zzc.zzi = 1;
            com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzb();
            if (((Boolean) zzbdd.zzd.zze()).booleanValue()) {
                zzbmu zzbmuVar = this.zzc;
                if (zzbmuVar.zze != null) {
                    zzfhu zzfhuVar = zzbmuVar.zze;
                    zzfhg zzfhgVar = this.zzb;
                    zzfhgVar.zzc("Failed loading new engine");
                    zzfhgVar.zzf(false);
                    zzfhuVar.zzb(zzfhgVar.zzl());
                }
            }
        }
    }
}
