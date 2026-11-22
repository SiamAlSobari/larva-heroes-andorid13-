package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbyp extends zzatv implements zzbyr {
    zzbyp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zze(IObjectWrapper iObjectWrapper, zzbyv zzbyvVar, zzbyo zzbyoVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzd(parcelZza, zzbyvVar);
        zzatx.zzf(parcelZza, zzbyoVar);
        zzbh(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzf(zzbta zzbtaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzd(parcelZza, zzbtaVar);
        zzbh(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbsr zzbsrVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzf(parcelZza, zzbsrVar);
        zzbh(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbsr zzbsrVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzf(parcelZza, zzbsrVar);
        zzbh(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzbh(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzbh(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbsr zzbsrVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzf(parcelZza, zzbsrVar);
        zzbh(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbsr zzbsrVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzf(parcelZza, zzbsrVar);
        zzbh(5, parcelZza);
    }
}
