package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbrw extends zzatv implements zzbry {
    zzbrw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbry
    public final zzbrv zze(IObjectWrapper iObjectWrapper, zzbof zzbofVar, int i) throws RemoteException {
        zzbrv zzbrtVar;
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzf(parcelZza, zzbofVar);
        parcelZza.writeInt(233012000);
        Parcel parcelZzbg = zzbg(1, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbrtVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbrtVar = iInterfaceQueryLocalInterface instanceof zzbrv ? (zzbrv) iInterfaceQueryLocalInterface : new zzbrt(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbrtVar;
    }
}
