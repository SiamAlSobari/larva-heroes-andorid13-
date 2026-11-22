package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbjt extends zzatv implements zzbjv {
    zzbjt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbjv
    public final zzbjs zze(IObjectWrapper iObjectWrapper, zzbof zzbofVar, int i, zzbjp zzbjpVar) throws RemoteException {
        zzbjs zzbjqVar;
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzf(parcelZza, zzbofVar);
        parcelZza.writeInt(233012000);
        zzatx.zzf(parcelZza, zzbjpVar);
        Parcel parcelZzbg = zzbg(1, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbjqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbjqVar = iInterfaceQueryLocalInterface instanceof zzbjs ? (zzbjs) iInterfaceQueryLocalInterface : new zzbjq(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbjqVar;
    }
}
