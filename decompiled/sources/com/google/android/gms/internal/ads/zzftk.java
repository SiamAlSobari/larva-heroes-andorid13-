package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzftk extends zzfsx {
    final /* synthetic */ zzftm zza;
    private final Object zzb;
    private int zzc;

    zzftk(zzftm zzftmVar, int i) {
        this.zza = zzftmVar;
        Object[] objArr = zzftmVar.zzb;
        objArr.getClass();
        this.zzb = objArr[i];
        this.zzc = i;
    }

    private final void zza() {
        int i = this.zzc;
        if (i != -1 && i < this.zza.size()) {
            Object obj = this.zzb;
            zzftm zzftmVar = this.zza;
            int i2 = this.zzc;
            Object[] objArr = zzftmVar.zzb;
            objArr.getClass();
            if (zzfrd.zza(obj, objArr[i2])) {
                return;
            }
        }
        this.zzc = this.zza.zzq(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfsx, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfsx, java.util.Map.Entry
    public final Object getValue() {
        Map mapZzj = this.zza.zzj();
        if (mapZzj != null) {
            return mapZzj.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        Object[] objArr = this.zza.zzc;
        objArr.getClass();
        return objArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzfsx, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map mapZzj = this.zza.zzj();
        if (mapZzj != null) {
            return mapZzj.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        Object[] objArr = this.zza.zzc;
        objArr.getClass();
        Object obj2 = objArr[i];
        objArr.getClass();
        objArr[i] = obj;
        return obj2;
    }
}
