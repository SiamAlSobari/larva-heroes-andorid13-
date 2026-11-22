package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdou implements zzcxd {
    private final zzcfi zza;

    zzdou(zzcfi zzcfiVar) {
        this.zza = zzcfiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcxd
    public final void zzbn(Context context) {
        zzcfi zzcfiVar = this.zza;
        if (zzcfiVar != null) {
            zzcfiVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxd
    public final void zzbp(Context context) {
        zzcfi zzcfiVar = this.zza;
        if (zzcfiVar != null) {
            zzcfiVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxd
    public final void zzbq(Context context) {
        zzcfi zzcfiVar = this.zza;
        if (zzcfiVar != null) {
            zzcfiVar.onResume();
        }
    }
}
