package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzatx;
import com.google.android.gms.internal.ads.zzboe;
import com.google.android.gms.internal.ads.zzbof;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcj extends zzatv implements zzcl {
    zzcj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final zzbof getAdapterCreator() throws RemoteException {
        Parcel parcelZzbg = zzbg(2, zza());
        zzbof zzbofVarZzf = zzboe.zzf(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbofVarZzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final zzen getLiteSdkVersion() throws RemoteException {
        Parcel parcelZzbg = zzbg(1, zza());
        zzen zzenVar = (zzen) zzatx.zza(parcelZzbg, zzen.CREATOR);
        parcelZzbg.recycle();
        return zzenVar;
    }
}
