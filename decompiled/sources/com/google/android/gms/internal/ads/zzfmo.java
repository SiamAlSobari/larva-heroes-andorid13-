package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfmo extends zzatv implements IInterface {
    zzfmo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfmm zze(zzfmk zzfmkVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzd(parcelZza, zzfmkVar);
        Parcel parcelZzbg = zzbg(1, parcelZza);
        zzfmm zzfmmVar = (zzfmm) zzatx.zza(parcelZzbg, zzfmm.CREATOR);
        parcelZzbg.recycle();
        return zzfmmVar;
    }

    public final zzfmv zzf(zzfmt zzfmtVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzd(parcelZza, zzfmtVar);
        Parcel parcelZzbg = zzbg(3, parcelZza);
        zzfmv zzfmvVar = (zzfmv) zzatx.zza(parcelZzbg, zzfmv.CREATOR);
        parcelZzbg.recycle();
        return zzfmvVar;
    }

    public final void zzg(zzfmh zzfmhVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzd(parcelZza, zzfmhVar);
        zzbh(2, parcelZza);
    }
}
