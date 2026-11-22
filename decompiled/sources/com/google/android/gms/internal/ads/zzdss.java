package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdss implements zzdsg {
    private final long zza;
    private final zzelf zzb;

    zzdss(long j, Context context, zzdsl zzdslVar, zzchd zzchdVar, String str) {
        this.zza = j;
        zzezj zzezjVarZzu = zzchdVar.zzu();
        zzezjVarZzu.zzc(context);
        zzezjVarZzu.zza(new com.google.android.gms.ads.internal.client.zzq());
        zzezjVarZzu.zzb(str);
        zzelf zzelfVarZza = zzezjVarZzu.zzd().zza();
        this.zzb = zzelfVarZza;
        zzelfVarZza.zzD(new zzdsr(this, zzdslVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdsg
    public final void zza() {
        this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzdsg
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zzb.zzaa(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdsg
    public final void zzc() {
        this.zzb.zzW(ObjectWrapper.wrap(null));
    }
}
