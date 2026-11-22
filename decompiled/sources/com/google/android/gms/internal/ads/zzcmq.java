package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcmq {
    private final Map zza;
    private final Map zzb;

    zzcmq(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfbr zzfbrVar) throws Exception {
        for (zzfbp zzfbpVar : zzfbrVar.zzb.zzc) {
            if (this.zza.containsKey(zzfbpVar.zza)) {
                ((zzcmt) this.zza.get(zzfbpVar.zza)).zza(zzfbpVar.zzb);
            } else if (this.zzb.containsKey(zzfbpVar.zza)) {
                zzcms zzcmsVar = (zzcms) this.zzb.get(zzfbpVar.zza);
                JSONObject jSONObject = zzfbpVar.zzb;
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString = jSONObject.optString(next);
                    if (strOptString != null) {
                        map.put(next, strOptString);
                    }
                }
                zzcmsVar.zza(map);
            }
        }
    }
}
