package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbys extends zzatv implements zzbyu {
    zzbys(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final zzbyr zze(IObjectWrapper iObjectWrapper, zzbof zzbofVar, int i) throws RemoteException {
        zzbyr zzbypVar;
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzf(parcelZza, zzbofVar);
        parcelZza.writeInt(233012000);
        Parcel parcelZzbg = zzbg(2, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbypVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzbypVar = iInterfaceQueryLocalInterface instanceof zzbyr ? (zzbyr) iInterfaceQueryLocalInterface : new zzbyp(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbypVar;
    }
}
