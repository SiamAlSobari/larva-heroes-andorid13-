package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzjs {
    public static zzoh zza(Context context, zzkb zzkbVar, boolean z) {
        zzod zzodVarZzb = zzod.zzb(context);
        if (zzodVarZzb == null) {
            zzes.zzf("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new zzoh(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z) {
            zzkbVar.zzz(zzodVarZzb);
        }
        return new zzoh(zzodVarZzb.zza());
    }
}
