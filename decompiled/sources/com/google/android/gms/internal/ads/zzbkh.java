package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbkh extends zzatv implements IInterface {
    zzbkh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbkb zzbkbVar, zzbkg zzbkgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzd(parcelZza, zzbkbVar);
        zzatx.zzf(parcelZza, zzbkgVar);
        zzbi(2, parcelZza);
    }
}
