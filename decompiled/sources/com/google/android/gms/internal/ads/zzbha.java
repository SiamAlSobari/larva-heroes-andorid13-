package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbha extends zzbgc {
    final /* synthetic */ zzbhb zza;

    /* synthetic */ zzbha(zzbhb zzbhbVar, zzbgz zzbgzVar) {
        this.zza = zzbhbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgd
    public final void zze(zzbfq zzbfqVar) {
        zzbhb zzbhbVar = this.zza;
        zzbhbVar.zza.onCustomTemplateAdLoaded(zzbhbVar.zzf(zzbfqVar));
    }
}
