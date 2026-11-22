package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbhe extends zzbgj {
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener zza;

    public zzbhe(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.zza = onUnifiedNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void zze(zzbgt zzbgtVar) {
        this.zza.onUnifiedNativeAdLoaded(new zzbgu(zzbgtVar));
    }
}
