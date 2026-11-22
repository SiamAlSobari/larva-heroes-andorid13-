package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzbjg implements zzbir {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String strConcat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.zza) {
            zzbjf zzbjfVar = (zzbjf) this.zzb.remove(str);
            if (zzbjfVar == null) {
                zzcaa.zzj("Received result for unexpected method invocation: " + str);
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                zzbjfVar.zza(str3 + strConcat);
                return;
            }
            if (str5 == null) {
                zzbjfVar.zzb(null);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str5);
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Result GMSG: " + jSONObject.toString(2));
                }
                zzbjfVar.zzb(jSONObject);
            } catch (JSONException e) {
                zzbjfVar.zza(e.getMessage());
            }
        }
    }

    public final ListenableFuture zzb(zzbly zzblyVar, String str, JSONObject jSONObject) {
        zzcas zzcasVar = new zzcas();
        com.google.android.gms.ads.internal.zzt.zzp();
        String string = UUID.randomUUID().toString();
        zzc(string, new zzbje(this, zzcasVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", string);
            jSONObject2.put("args", jSONObject);
            zzblyVar.zzl(str, jSONObject2);
        } catch (Exception e) {
            zzcasVar.zzd(e);
        }
        return zzcasVar;
    }

    public final void zzc(String str, zzbjf zzbjfVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbjfVar);
        }
    }
}
