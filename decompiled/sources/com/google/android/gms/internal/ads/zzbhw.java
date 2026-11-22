package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbhw implements zzbir {
    zzbhw() {
    }

    @Override // com.google.android.gms.internal.ads.zzbir
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZza;
        zzcfi zzcfiVar = (zzcfi) obj;
        zzbej zzbejVarZzK = zzcfiVar.zzK();
        if (zzbejVarZzK == null || (jSONObjectZza = zzbejVarZzK.zza()) == null) {
            zzcfiVar.zze("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcfiVar.zze("nativeAdViewSignalsReady", jSONObjectZza);
        }
    }
}
