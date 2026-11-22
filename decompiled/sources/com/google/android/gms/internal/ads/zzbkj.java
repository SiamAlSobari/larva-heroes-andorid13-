package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbkj implements zzfxl {
    final /* synthetic */ zzbkb zza;

    zzbkj(zzbkn zzbknVar, zzbkb zzbkbVar) {
        this.zza = zzbkbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxl
    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        zzcas zzcasVar = new zzcas();
        ((zzbkh) obj).zze(this.zza, new zzbki(this, zzcasVar));
        return zzcasVar;
    }
}
