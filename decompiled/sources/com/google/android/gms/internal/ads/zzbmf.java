package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbmf implements zzbir {
    final /* synthetic */ long zza;
    final /* synthetic */ zzbmt zzb;
    final /* synthetic */ zzblp zzc;
    final /* synthetic */ zzbmu zzd;

    zzbmf(zzbmu zzbmuVar, long j, zzbmt zzbmtVar, zzblp zzblpVar) {
        this.zzd = zzbmuVar;
        this.zza = j;
        this.zzb = zzbmtVar;
        this.zzc = zzblpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbir
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        com.google.android.gms.ads.internal.util.zze.zza("onGmsg /jsLoaded. JsLoaded latency is " + (com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zza) + " ms.");
        synchronized (this.zzd.zza) {
            if (this.zzb.zze() != -1 && this.zzb.zze() != 1) {
                this.zzd.zzi = 0;
                zzblp zzblpVar = this.zzc;
                zzblpVar.zzq("/log", zzbiq.zzg);
                zzblpVar.zzq("/result", zzbiq.zzo);
                this.zzb.zzh(this.zzc);
                this.zzd.zzh = this.zzb;
                com.google.android.gms.ads.internal.util.zze.zza("Successfully loaded JS Engine.");
            }
        }
    }
}
