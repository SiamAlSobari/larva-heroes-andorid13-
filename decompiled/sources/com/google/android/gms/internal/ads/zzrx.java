package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzrx {
    public static void zza(zzrr zzrrVar, zzoh zzohVar) {
        LogSessionId logSessionIdZza = zzohVar.zza();
        if (logSessionIdZza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        zzrrVar.zzb.setString("log-session-id", logSessionIdZza.getStringId());
    }
}
