package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfhq {
    public static void zza(ListenableFuture listenableFuture, zzfhr zzfhrVar, zzfhg zzfhgVar) {
        zzg(listenableFuture, zzfhrVar, zzfhgVar, false);
    }

    public static void zzb(ListenableFuture listenableFuture, zzfhr zzfhrVar, zzfhg zzfhgVar) {
        zzg(listenableFuture, zzfhrVar, zzfhgVar, true);
    }

    public static void zzc(ListenableFuture listenableFuture, zzfhr zzfhrVar, zzfhg zzfhgVar) {
        if (((Boolean) zzbdd.zzc.zze()).booleanValue()) {
            zzfye.zzr(zzfxv.zzu(listenableFuture), new zzfhp(zzfhrVar, zzfhgVar), zzcan.zzf);
        }
    }

    public static void zzd(ListenableFuture listenableFuture, zzfhg zzfhgVar) {
        if (((Boolean) zzbdd.zzc.zze()).booleanValue()) {
            zzfye.zzr(zzfxv.zzu(listenableFuture), new zzfhn(zzfhgVar), zzcan.zzf);
        }
    }

    public static boolean zze(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzit), str);
    }

    public static int zzf(zzfca zzfcaVar) {
        int iZze = com.google.android.gms.ads.nonagon.signalgeneration.zzf.zze(zzfcaVar) - 1;
        return (iZze == 0 || iZze == 1) ? 7 : 23;
    }

    private static void zzg(ListenableFuture listenableFuture, zzfhr zzfhrVar, zzfhg zzfhgVar, boolean z) {
        if (((Boolean) zzbdd.zzc.zze()).booleanValue()) {
            zzfye.zzr(zzfxv.zzu(listenableFuture), new zzfho(zzfhrVar, zzfhgVar, z), zzcan.zzf);
        }
    }
}
