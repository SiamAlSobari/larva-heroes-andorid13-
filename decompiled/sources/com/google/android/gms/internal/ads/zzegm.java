package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzegm extends zzbpv {
    final /* synthetic */ zzegn zza;
    private final zzedq zzb;

    /* synthetic */ zzegm(zzegn zzegnVar, zzedq zzedqVar, zzegl zzeglVar) {
        this.zza = zzegnVar;
        this.zzb = zzedqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpw
    public final void zze(String str) throws RemoteException {
        ((zzefj) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbpw
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzefj) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpw
    public final void zzg(zzbou zzbouVar) throws RemoteException {
        this.zza.zzc = zzbouVar;
        ((zzefj) this.zzb.zzc).zzo();
    }
}
