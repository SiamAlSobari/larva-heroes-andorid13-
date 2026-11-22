package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcax implements zzfya {
    final /* synthetic */ zzcaz zza;

    zzcax(zzcaz zzcazVar) {
        this.zza = zzcazVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        this.zza.zzb.set(-1);
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zzb(Object obj) {
        this.zza.zzb.set(1);
    }
}
