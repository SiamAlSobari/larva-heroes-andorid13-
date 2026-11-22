package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbhx implements zzbir {
    zzbhx() {
    }

    @Override // com.google.android.gms.internal.ads.zzbir
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZzb;
        zzcfi zzcfiVar = (zzcfi) obj;
        zzbej zzbejVarZzK = zzcfiVar.zzK();
        if (zzbejVarZzK == null || (jSONObjectZzb = zzbejVarZzK.zzb()) == null) {
            zzcfiVar.zze("nativeClickMetaReady", new JSONObject());
        } else {
            zzcfiVar.zze("nativeClickMetaReady", jSONObjectZzb);
        }
    }
}
