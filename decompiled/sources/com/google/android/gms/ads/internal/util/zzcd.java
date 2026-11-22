package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.zzbbr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcd {
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final Context zzc;

    zzcd(Context context) {
        this.zzc = context;
    }

    final synchronized void zzb(String str) {
        if (this.zza.containsKey(str)) {
            return;
        }
        SharedPreferences defaultSharedPreferences = (str == "__default__" || (str != null && str.equals("__default__"))) ? PreferenceManager.getDefaultSharedPreferences(this.zzc) : this.zzc.getSharedPreferences(str, 0);
        zzcc zzccVar = new zzcc(this, str);
        this.zza.put(str, zzccVar);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzccVar);
    }

    public final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjw)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            Map mapZzs = zzs.zzs((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjz));
            Iterator it = mapZzs.keySet().iterator();
            while (it.hasNext()) {
                zzb((String) it.next());
            }
            zzd(new zzcb(mapZzs));
        }
    }

    final synchronized void zzd(zzcb zzcbVar) {
        this.zzb.add(zzcbVar);
    }
}
