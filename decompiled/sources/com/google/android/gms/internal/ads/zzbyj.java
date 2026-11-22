package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbyj implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzbyk zza;
    private final String zzb;

    public zzbyj(zzbyk zzbykVar, String str) {
        this.zza = zzbykVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.zza) {
            for (zzbyi zzbyiVar : this.zza.zzb) {
                zzbyiVar.zza.zzb(zzbyiVar.zzb, sharedPreferences, this.zzb, str);
            }
        }
    }
}
