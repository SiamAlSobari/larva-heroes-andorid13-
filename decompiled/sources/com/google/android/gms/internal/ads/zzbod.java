package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbod extends zzatv implements zzbof {
    zzbod(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbof
    public final zzboi zzb(String str) throws RemoteException {
        zzboi zzbogVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzbg = zzbg(1, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbogVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzbogVar = iInterfaceQueryLocalInterface instanceof zzboi ? (zzboi) iInterfaceQueryLocalInterface : new zzbog(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbogVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbof
    public final zzbqc zzc(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzbg = zzbg(3, parcelZza);
        zzbqc zzbqcVarZzb = zzbqb.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbqcVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbof
    public final boolean zzd(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzbg = zzbg(4, parcelZza);
        boolean zZzg = zzatx.zzg(parcelZzbg);
        parcelZzbg.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbof
    public final boolean zze(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzbg = zzbg(2, parcelZza);
        boolean zZzg = zzatx.zzg(parcelZzbg);
        parcelZzbg.recycle();
        return zZzg;
    }
}
