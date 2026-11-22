package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcbf implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcbn zzb;

    zzcbf(zzcbn zzcbnVar, MediaPlayer mediaPlayer) {
        this.zzb = zzcbnVar;
        this.zza = mediaPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcbn.zzl(this.zzb, this.zza);
        zzcbn zzcbnVar = this.zzb;
        if (zzcbnVar.zzq != null) {
            zzcbnVar.zzq.zzf();
        }
    }
}
