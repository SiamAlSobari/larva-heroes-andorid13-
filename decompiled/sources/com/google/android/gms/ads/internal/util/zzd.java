package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.zzbdg;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzd {
    public static void zza(Context context) {
        int i = zzbzz.zza;
        if (((Boolean) zzbdg.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || zzbzz.zzl()) {
                    return;
                }
                ListenableFuture listenableFutureZzb = new zzc(context).zzb();
                zzcaa.zzi("Updating ad debug logging enablement.");
                zzcaq.zza(listenableFutureZzb, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e) {
                zzcaa.zzk("Fail to determine debug setting.", e);
            }
        }
    }
}
