package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbgy extends zzbfz {
    final /* synthetic */ zzbhb zza;

    /* synthetic */ zzbgy(zzbhb zzbhbVar, zzbgx zzbgxVar) {
        this.zza = zzbhbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zze(zzbfq zzbfqVar, String str) {
        zzbhb zzbhbVar = this.zza;
        if (zzbhbVar.zzb == null) {
            return;
        }
        zzbhbVar.zzb.onCustomClick(zzbhbVar.zzf(zzbfqVar), str);
    }
}
