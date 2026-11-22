package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcbw implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcbx zzb;

    zzcbw(zzcbx zzcbxVar, boolean z) {
        this.zzb = zzcbxVar;
        this.zza = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
