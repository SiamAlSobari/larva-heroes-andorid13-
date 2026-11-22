package com.google.android.gms.ads.internal.util;

import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzcc implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzcd zza;
    private final String zzb;

    public zzcc(zzcd zzcdVar, String str) {
        this.zza = zzcdVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.zza) {
            for (zzcb zzcbVar : this.zza.zzb) {
                String str2 = this.zzb;
                Map map = zzcbVar.zza;
                if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzh().zzI(false);
                }
            }
        }
    }
}
