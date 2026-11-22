package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbuc extends zzatw implements zzbud {
    public zzbuc() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbug zzbueVar = null;
        if (i == 1) {
            zzbtr zzbtrVar = (zzbtr) zzatx.zza(parcel, zzbtr.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                zzbueVar = iInterfaceQueryLocalInterface instanceof zzbug ? (zzbug) iInterfaceQueryLocalInterface : new zzbue(strongBinder);
            }
            zzatx.zzc(parcel);
            zzf(zzbtrVar, zzbueVar);
        } else if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (iInterfaceQueryLocalInterface2 instanceof zzbug) {
                }
            }
            zzatx.zzc(parcel);
        } else {
            if (i != 3) {
                return false;
            }
            zzbtv zzbtvVar = (zzbtv) zzatx.zza(parcel, zzbtv.CREATOR);
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                zzbueVar = iInterfaceQueryLocalInterface3 instanceof zzbug ? (zzbug) iInterfaceQueryLocalInterface3 : new zzbue(strongBinder3);
            }
            zzatx.zzc(parcel);
            zze(zzbtvVar, zzbueVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
