package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfkc {
    private static int zza = 2;

    public static void zza(Context context) {
        context.registerReceiver(new zzfkb(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int zzb() {
        if (zzfjy.zza() != zzfiv.CTV) {
            return 2;
        }
        return zza;
    }
}
