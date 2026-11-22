package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfio {
    private boolean zza;

    final void zza(Context context) {
        zzfke.zzb(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzfjo.zzb().zzd(context);
        zzfjg.zza().zzd(context);
        zzfjy.zzb(context);
        zzfjz.zzd(context);
        zzfkc.zza(context);
        zzfjl.zzb().zzc(context);
        zzfjf.zza().zzd(context);
    }

    final boolean zzb() {
        return this.zza;
    }
}
