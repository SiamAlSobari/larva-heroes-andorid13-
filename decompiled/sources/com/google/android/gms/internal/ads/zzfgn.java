package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfgn {
    private final HashMap zza;
    private final zzfgt zzb;

    private zzfgn() {
        HashMap map = new HashMap();
        this.zza = map;
        this.zzb = new zzfgt(com.google.android.gms.ads.internal.zzt.zzB());
        map.put("new_csi", "1");
    }

    public static zzfgn zzb(String str) {
        zzfgn zzfgnVar = new zzfgn();
        zzfgnVar.zza.put("action", str);
        return zzfgnVar;
    }

    public static zzfgn zzc(String str) {
        zzfgn zzfgnVar = new zzfgn();
        zzfgnVar.zza.put("request_id", str);
        return zzfgnVar;
    }

    public final zzfgn zza(String str, String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzfgn zzd(String str) {
        this.zzb.zzb(str);
        return this;
    }

    public final zzfgn zze(String str, String str2) {
        this.zzb.zzc(str, str2);
        return this;
    }

    public final zzfgn zzf(zzfbe zzfbeVar) {
        this.zza.put("aai", zzfbeVar.zzx);
        return this;
    }

    public final zzfgn zzg(zzfbi zzfbiVar) {
        if (!TextUtils.isEmpty(zzfbiVar.zzb)) {
            this.zza.put("gqi", zzfbiVar.zzb);
        }
        return this;
    }

    public final zzfgn zzh(zzfbr zzfbrVar, zzbzn zzbznVar) {
        zzfbq zzfbqVar = zzfbrVar.zzb;
        zzg(zzfbqVar.zzb);
        if (!zzfbqVar.zza.isEmpty()) {
            switch (((zzfbe) zzfbqVar.zza.get(0)).zzb) {
                case 1:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "banner");
                    break;
                case 2:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "interstitial");
                    break;
                case 3:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "native_express");
                    break;
                case 4:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "native_advanced");
                    break;
                case 5:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "rewarded");
                    break;
                case 6:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
                    if (zzbznVar != null) {
                        this.zza.put("as", true != zzbznVar.zzm() ? "0" : "1");
                    }
                    break;
                default:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, EnvironmentCompat.MEDIA_UNKNOWN);
                    break;
            }
        }
        return this;
    }

    public final zzfgn zzi(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final Map zzj() {
        HashMap map = new HashMap(this.zza);
        for (zzfgs zzfgsVar : this.zzb.zza()) {
            map.put(zzfgsVar.zza, zzfgsVar.zzb);
        }
        return map;
    }
}
