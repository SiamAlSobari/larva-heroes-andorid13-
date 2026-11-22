package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbds {
    public static final zzbcw zza = zzbcw.zzb("gads:dynamite_load:fail:sample_rate", WorkRequest.MIN_BACKOFF_MILLIS);
    public static final zzbcw zzb = zzbcw.zzd("gads:report_dynamite_crash_in_background_thread", false);
    public static final zzbcw zzc = zzbcw.zzc("gads:public_beta:traffic_multiplier", "1.0");
    public static final zzbcw zzd = zzbcw.zzc("gads:sdk_crash_report_class_prefix", "com.google.");
    public static final zzbcw zze = zzbcw.zzd("gads:sdk_crash_report_enabled", false);
    public static final zzbcw zzf = zzbcw.zzd("gads:sdk_crash_report_full_stacktrace", false);
    public static final zzbcw zzg = zzbcw.zza("gads:trapped_exception_sample_rate", 0.01d);
}
