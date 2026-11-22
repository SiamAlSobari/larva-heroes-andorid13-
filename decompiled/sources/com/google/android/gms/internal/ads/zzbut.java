package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbut implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbuv zzb;

    zzbut(zzbuv zzbuvVar, Context context) {
        this.zzb = zzbuvVar;
        this.zza = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzbuu zzbuuVar = (zzbuu) this.zzb.zza.get(this.zza);
        zzbus zzbusVarZza = (zzbuuVar == null || zzbuuVar.zza + ((Long) zzbda.zza.zze()).longValue() < com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()) ? new zzbur(this.zza).zza() : new zzbur(this.zza, zzbuuVar.zzb).zza();
        zzbuv zzbuvVar = this.zzb;
        zzbuvVar.zza.put(this.zza, new zzbuu(zzbuvVar, zzbusVarZza));
        return zzbusVarZza;
    }
}
