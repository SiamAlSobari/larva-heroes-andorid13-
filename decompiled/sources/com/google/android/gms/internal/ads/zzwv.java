package com.google.android.gms.internal.ads;

import android.media.Spatializer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzwv implements Spatializer.OnSpatializerStateChangedListener {
    final /* synthetic */ zzxd zza;

    zzwv(zzww zzwwVar, zzxd zzxdVar) {
        this.zza = zzxdVar;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.zza.zzu();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.zza.zzu();
    }
}
