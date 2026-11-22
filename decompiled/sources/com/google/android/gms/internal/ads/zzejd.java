package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzejd implements com.google.android.gms.ads.internal.zzf {
    final /* synthetic */ zzcas zza;
    final /* synthetic */ zzfbr zzb;
    final /* synthetic */ zzfbe zzc;
    final /* synthetic */ zzejj zzd;
    final /* synthetic */ zzeje zze;

    zzejd(zzeje zzejeVar, zzcas zzcasVar, zzfbr zzfbrVar, zzfbe zzfbeVar, zzejj zzejjVar) {
        this.zze = zzejeVar;
        this.zza = zzcasVar;
        this.zzb = zzfbrVar;
        this.zzc = zzfbeVar;
        this.zzd = zzejjVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
        this.zza.zzc(this.zze.zzd.zza(this.zzb, this.zzc, view, this.zzd));
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
    }
}
