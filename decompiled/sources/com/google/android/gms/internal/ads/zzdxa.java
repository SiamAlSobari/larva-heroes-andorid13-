package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdxa implements zzczd {
    private final Context zza;
    private final zzbyf zzb;

    zzdxa(Context context, zzbyf zzbyfVar) {
        this.zza = context;
        this.zzb = zzbyfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzczd
    public final void zzbr(zzbun zzbunVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzczd
    public final void zzbs(zzfbr zzfbrVar) {
        if (TextUtils.isEmpty(zzfbrVar.zzb.zzb.zzd)) {
            return;
        }
        this.zzb.zzp(this.zza, zzfbrVar.zza.zza.zzd);
        this.zzb.zzl(this.zza, zzfbrVar.zzb.zzb.zzd);
    }
}
