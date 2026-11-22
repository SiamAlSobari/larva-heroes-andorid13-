package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcdv implements zzbir {
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            zzcaa.zzj("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbir
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcdu zzcdxVar;
        zzccj zzccjVar = (zzccj) obj;
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            zzcaa.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzcdn<zzcdm> zzcdnVarZzy = com.google.android.gms.ads.internal.zzt.zzy();
        if (map.containsKey("abort")) {
            if (zzcdnVarZzy.zzd(zzccjVar)) {
                return;
            }
            zzcaa.zzj("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer numZzb = zzb(map, "periodicReportIntervalMs");
        Integer numZzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer numZzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        zzcci zzcciVar = new zzcci((String) map.get("flags"));
        boolean z = zzcciVar.zzl;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            zzcdm zzcdmVarZza = null;
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr2[i] = jSONArray.getString(i);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    zzcaa.zzj("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z) {
                for (zzcdm zzcdmVar : zzcdnVarZzy) {
                    if (zzcdmVar.zza == zzccjVar && str.equals(zzcdmVar.zze())) {
                        zzcdmVarZza = zzcdmVar;
                        break;
                    }
                }
            } else {
                zzcdmVarZza = zzcdnVarZzy.zza(zzccjVar);
            }
            if (zzcdmVarZza != null) {
                zzcaa.zzj("Precache task is already running.");
                return;
            }
            if (zzccjVar.zzj() == null) {
                zzcaa.zzj("Precache requires a dependency provider.");
                return;
            }
            Integer numZzb4 = zzb(map, "player");
            if (numZzb4 == null) {
                numZzb4 = 0;
            }
            if (numZzb != null) {
                zzccjVar.zzA(numZzb.intValue());
            }
            if (numZzb2 != null) {
                zzccjVar.zzy(numZzb2.intValue());
            }
            if (numZzb3 != null) {
                zzccjVar.zzx(numZzb3.intValue());
            }
            int iIntValue = numZzb4.intValue();
            zzcdg zzcdgVar = zzccjVar.zzj().zzb;
            if (iIntValue > 0) {
                int iZzu = zzcca.zzu();
                zzcdxVar = iZzu < zzcciVar.zzh ? new zzced(zzccjVar, zzcciVar) : iZzu < zzcciVar.zzb ? new zzcea(zzccjVar, zzcciVar) : new zzcdy(zzccjVar);
            } else {
                zzcdxVar = new zzcdx(zzccjVar);
            }
            new zzcdm(zzccjVar, zzcdxVar, str, strArr).zzb();
        } else {
            zzcdm zzcdmVarZza2 = zzcdnVarZzy.zza(zzccjVar);
            if (zzcdmVarZza2 == null) {
                zzcaa.zzj("Precache must specify a source.");
                return;
            }
            zzcdxVar = zzcdmVarZza2.zzb;
        }
        Integer numZzb5 = zzb(map, "minBufferMs");
        if (numZzb5 != null) {
            zzcdxVar.zzs(numZzb5.intValue());
        }
        Integer numZzb6 = zzb(map, "maxBufferMs");
        if (numZzb6 != null) {
            zzcdxVar.zzr(numZzb6.intValue());
        }
        Integer numZzb7 = zzb(map, "bufferForPlaybackMs");
        if (numZzb7 != null) {
            zzcdxVar.zzp(numZzb7.intValue());
        }
        Integer numZzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (numZzb8 != null) {
            zzcdxVar.zzq(numZzb8.intValue());
        }
    }
}
