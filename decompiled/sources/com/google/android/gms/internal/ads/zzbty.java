package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbty extends zzatw implements zzbtz {
    public zzbty() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbuj zzbuhVar = null;
        if (i == 1) {
            zzatx.zzc(parcel);
            parcel2.writeNoException();
            zzatx.zze(parcel2, null);
        } else if (i == 2) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (iInterfaceQueryLocalInterface instanceof zzbua) {
                }
            }
            zzatx.zzc(parcel);
            parcel2.writeNoException();
        } else if (i == 4) {
            zzbun zzbunVar = (zzbun) zzatx.zza(parcel, zzbun.CREATOR);
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbuhVar = iInterfaceQueryLocalInterface2 instanceof zzbuj ? (zzbuj) iInterfaceQueryLocalInterface2 : new zzbuh(strongBinder2);
            }
            zzatx.zzc(parcel);
            zzg(zzbunVar, zzbuhVar);
            parcel2.writeNoException();
        } else if (i == 5) {
            zzbun zzbunVar2 = (zzbun) zzatx.zza(parcel, zzbun.CREATOR);
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbuhVar = iInterfaceQueryLocalInterface3 instanceof zzbuj ? (zzbuj) iInterfaceQueryLocalInterface3 : new zzbuh(strongBinder3);
            }
            zzatx.zzc(parcel);
            zzf(zzbunVar2, zzbuhVar);
            parcel2.writeNoException();
        } else if (i == 6) {
            zzbun zzbunVar3 = (zzbun) zzatx.zza(parcel, zzbun.CREATOR);
            IBinder strongBinder4 = parcel.readStrongBinder();
            if (strongBinder4 != null) {
                IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbuhVar = iInterfaceQueryLocalInterface4 instanceof zzbuj ? (zzbuj) iInterfaceQueryLocalInterface4 : new zzbuh(strongBinder4);
            }
            zzatx.zzc(parcel);
            zze(zzbunVar3, zzbuhVar);
            parcel2.writeNoException();
        } else {
            if (i != 7) {
                return false;
            }
            String string = parcel.readString();
            IBinder strongBinder5 = parcel.readStrongBinder();
            if (strongBinder5 != null) {
                IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbuhVar = iInterfaceQueryLocalInterface5 instanceof zzbuj ? (zzbuj) iInterfaceQueryLocalInterface5 : new zzbuh(strongBinder5);
            }
            zzatx.zzc(parcel);
            zzh(string, zzbuhVar);
            parcel2.writeNoException();
        }
        return true;
    }
}
