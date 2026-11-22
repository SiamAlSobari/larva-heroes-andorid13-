package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcvi implements zzcxw, zzcxd {
    private final Context zza;
    private final zzfbe zzb;
    private final zzbsh zzc;

    public zzcvi(Context context, zzfbe zzfbeVar, zzbsh zzbshVar) {
        this.zza = context;
        this.zzb = zzfbeVar;
        this.zzc = zzbshVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxd
    public final void zzbn(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxd
    public final void zzbp(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxd
    public final void zzbq(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final void zzr() {
        zzbsi zzbsiVar = this.zzb.zzae;
        if (zzbsiVar == null || !zzbsiVar.zza) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.zzb.zzae.zzb.isEmpty()) {
            return;
        }
        arrayList.add(this.zzb.zzae.zzb);
    }
}
