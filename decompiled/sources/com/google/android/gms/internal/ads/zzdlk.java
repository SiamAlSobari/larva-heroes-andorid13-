package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdlk {
    private final Executor zza;
    private final zzdlf zzb;

    public zzdlk(Executor executor, zzdlf zzdlfVar) {
        this.zza = executor;
        this.zzb = zzdlfVar;
    }

    public final ListenableFuture zza(JSONObject jSONObject, String str) {
        ListenableFuture listenableFutureZzh;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return zzfye.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                listenableFutureZzh = zzfye.zzh(null);
            } else {
                final String strOptString = jSONObjectOptJSONObject.optString("name");
                if (strOptString == null) {
                    listenableFutureZzh = zzfye.zzh(null);
                } else {
                    String strOptString2 = jSONObjectOptJSONObject.optString("type");
                    listenableFutureZzh = "string".equals(strOptString2) ? zzfye.zzh(new zzdlj(strOptString, jSONObjectOptJSONObject.optString("string_value"))) : "image".equals(strOptString2) ? zzfye.zzm(this.zzb.zze(jSONObjectOptJSONObject, "image_value"), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzdlh
                        @Override // com.google.android.gms.internal.ads.zzfqw
                        public final Object apply(Object obj) {
                            return new zzdlj(strOptString, (zzbei) obj);
                        }
                    }, this.zza) : zzfye.zzh(null);
                }
            }
            arrayList.add(listenableFutureZzh);
        }
        return zzfye.zzm(zzfye.zzd(arrayList), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzdli
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzdlj zzdljVar : (List) obj) {
                    if (zzdljVar != null) {
                        arrayList2.add(zzdljVar);
                    }
                }
                return arrayList2;
            }
        }, this.zza);
    }
}
