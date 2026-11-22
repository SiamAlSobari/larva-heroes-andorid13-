package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbsi {
    public final boolean zza;
    public final String zzb;

    public zzbsi(boolean z, String str) {
        this.zza = z;
        this.zzb = str;
    }

    public static zzbsi zza(JSONObject jSONObject) {
        return new zzbsi(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
    }
}
