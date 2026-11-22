package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbru extends zzatw implements zzbrv {
    public zzbru() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbrv zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return iInterfaceQueryLocalInterface instanceof zzbrv ? (zzbrv) iInterfaceQueryLocalInterface : new zzbrt(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            Intent intent = (Intent) zzatx.zza(parcel, Intent.CREATOR);
            zzatx.zzc(parcel);
            zze(intent);
        } else if (i == 2) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            zzatx.zzc(parcel);
            zzi(iObjectWrapperAsInterface, string, string2);
        } else if (i == 3) {
            zzh();
        } else if (i == 4) {
            IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzatx.zzc(parcel);
            zzg(iObjectWrapperAsInterface2);
        } else {
            if (i != 5) {
                return false;
            }
            String[] strArrCreateStringArray = parcel.createStringArray();
            int[] iArrCreateIntArray = parcel.createIntArray();
            IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzatx.zzc(parcel);
            zzf(strArrCreateStringArray, iArrCreateIntArray, iObjectWrapperAsInterface3);
        }
        parcel2.writeNoException();
        return true;
    }
}
