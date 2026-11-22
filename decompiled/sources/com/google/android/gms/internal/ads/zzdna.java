package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdna implements zzbir {
    final /* synthetic */ zzdnb zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzbir zzd;

    /* synthetic */ zzdna(zzdnb zzdnbVar, WeakReference weakReference, String str, zzbir zzbirVar, zzdmz zzdmzVar) {
        this.zza = zzdnbVar;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbirVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object obj, Map map) {
        Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zzk(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}
