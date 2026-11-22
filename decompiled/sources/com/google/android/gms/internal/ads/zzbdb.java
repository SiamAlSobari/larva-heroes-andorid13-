package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbdb {
    public static final zzbcw zza = zzbcx.zzf("gads:consent:gmscore:dsid:enabled", true);
    public static final zzbcw zzb = zzbcx.zzf("gads:consent:gmscore:lat:enabled", true);
    public static final zzbcw zzc = new zzbcx("gads:consent:gmscore:backend_url", "https://adservice.google.com/getconfig/pubvendors", 4);
    public static final zzbcw zzd = new zzbcx("gads:consent:gmscore:time_out", Long.valueOf(WorkRequest.MIN_BACKOFF_MILLIS), 2);
    public static final zzbcw zze = zzbcx.zzf("gads:consent:gmscore:enabled", true);
}
