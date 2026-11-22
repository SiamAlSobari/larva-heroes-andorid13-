package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbtx extends zzatv implements zzbtz {
    zzbtx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zze(zzbun zzbunVar, zzbuj zzbujVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzd(parcelZza, zzbunVar);
        zzatx.zzf(parcelZza, zzbujVar);
        zzbh(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzf(zzbun zzbunVar, zzbuj zzbujVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzd(parcelZza, zzbunVar);
        zzatx.zzf(parcelZza, zzbujVar);
        zzbh(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzg(zzbun zzbunVar, zzbuj zzbujVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzd(parcelZza, zzbunVar);
        zzatx.zzf(parcelZza, zzbujVar);
        zzbh(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtz
    public final void zzh(String str, zzbuj zzbujVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzatx.zzf(parcelZza, zzbujVar);
        zzbh(7, parcelZza);
    }
}
