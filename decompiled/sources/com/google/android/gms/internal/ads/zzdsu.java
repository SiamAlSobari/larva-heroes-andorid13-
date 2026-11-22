package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdsu extends zzbwc {
    final /* synthetic */ zzdsw zza;

    zzdsu(zzdsw zzdswVar) {
        this.zza = zzdswVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zze(int i) throws RemoteException {
        zzdsw zzdswVar = this.zza;
        zzdswVar.zzb.zzm(zzdswVar.zza, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdsw zzdswVar = this.zza;
        zzdswVar.zzb.zzm(zzdswVar.zza, zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzg() throws RemoteException {
        zzdsw zzdswVar = this.zza;
        zzdswVar.zzb.zzp(zzdswVar.zza);
    }
}
