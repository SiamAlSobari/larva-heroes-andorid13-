package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzduv extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ zzduy zzb;

    zzduv(zzduy zzduyVar, String str) {
        this.zzb = zzduyVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.zzb.zzm(zzduy.zzl(loadAdError), this.zza);
    }
}
