package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaws extends zzatv implements IInterface {
    zzaws(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzawq zzawqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzd(parcelZza, zzawqVar);
        Parcel parcelZzbg = zzbg(3, parcelZza);
        long j = parcelZzbg.readLong();
        parcelZzbg.recycle();
        return j;
    }

    public final zzawn zzf(zzawq zzawqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzd(parcelZza, zzawqVar);
        Parcel parcelZzbg = zzbg(1, parcelZza);
        zzawn zzawnVar = (zzawn) zzatx.zza(parcelZzbg, zzawn.CREATOR);
        parcelZzbg.recycle();
        return zzawnVar;
    }

    public final zzawn zzg(zzawq zzawqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzd(parcelZza, zzawqVar);
        Parcel parcelZzbg = zzbg(2, parcelZza);
        zzawn zzawnVar = (zzawn) zzatx.zza(parcelZzbg, zzawn.CREATOR);
        parcelZzbg.recycle();
        return zzawnVar;
    }
}
