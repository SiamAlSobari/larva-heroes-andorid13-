package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbqs implements com.google.android.gms.ads.internal.overlay.zzo {
    final /* synthetic */ zzbqu zza;

    zzbqs(zzbqu zzbquVar) {
        this.zza = zzbquVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
        zzcaa.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
        zzcaa.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
        zzcaa.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        zzcaa.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbqu zzbquVar = this.zza;
        zzbquVar.zzb.onAdOpened(zzbquVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(int i) {
        zzcaa.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbqu zzbquVar = this.zza;
        zzbquVar.zzb.onAdClosed(zzbquVar);
    }
}
