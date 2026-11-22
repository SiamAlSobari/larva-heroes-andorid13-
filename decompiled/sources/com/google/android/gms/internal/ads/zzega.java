package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzega implements zzedp {
    private final zzdpc zza;

    public zzega(zzdpc zzdpcVar) {
        this.zza = zzdpcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedp
    public final zzedq zza(String str, JSONObject jSONObject) throws zzfcf {
        return new zzedq(this.zza.zzc(str, jSONObject), new zzefj(), str);
    }
}
