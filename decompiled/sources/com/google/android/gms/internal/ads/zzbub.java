package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbub extends zzatv implements zzbud {
    zzbub(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zze(zzbtv zzbtvVar, zzbug zzbugVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzd(parcelZza, zzbtvVar);
        zzatx.zzf(parcelZza, zzbugVar);
        zzbh(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zzf(zzbtr zzbtrVar, zzbug zzbugVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzd(parcelZza, zzbtrVar);
        zzatx.zzf(parcelZza, zzbugVar);
        zzbh(1, parcelZza);
    }
}
