package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbgr extends zzatv implements zzbgt {
    zzbgr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzA() throws RemoteException {
        zzbh(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzB(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzd(parcelZza, bundle);
        zzbh(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzC() throws RemoteException {
        zzbh(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzD(com.google.android.gms.ads.internal.client.zzcs zzcsVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, zzcsVar);
        zzbh(26, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzE(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, zzdgVar);
        zzbh(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzF(zzbgq zzbgqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, zzbgqVar);
        zzbh(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final boolean zzG() throws RemoteException {
        Parcel parcelZzbg = zzbg(30, zza());
        boolean zZzg = zzatx.zzg(parcelZzbg);
        parcelZzbg.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final boolean zzH() throws RemoteException {
        Parcel parcelZzbg = zzbg(24, zza());
        boolean zZzg = zzatx.zzg(parcelZzbg);
        parcelZzbg.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final boolean zzI(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzd(parcelZza, bundle);
        Parcel parcelZzbg = zzbg(16, parcelZza);
        boolean zZzg = zzatx.zzg(parcelZzbg);
        parcelZzbg.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final double zze() throws RemoteException {
        Parcel parcelZzbg = zzbg(8, zza());
        double d = parcelZzbg.readDouble();
        parcelZzbg.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final Bundle zzf() throws RemoteException {
        Parcel parcelZzbg = zzbg(20, zza());
        Bundle bundle = (Bundle) zzatx.zza(parcelZzbg, Bundle.CREATOR);
        parcelZzbg.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final com.google.android.gms.ads.internal.client.zzdn zzg() throws RemoteException {
        Parcel parcelZzbg = zzbg(31, zza());
        com.google.android.gms.ads.internal.client.zzdn zzdnVarZzb = com.google.android.gms.ads.internal.client.zzdm.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzdnVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        Parcel parcelZzbg = zzbg(11, zza());
        com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzdqVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final zzbeo zzi() throws RemoteException {
        zzbeo zzbemVar;
        Parcel parcelZzbg = zzbg(14, zza());
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbemVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbemVar = iInterfaceQueryLocalInterface instanceof zzbeo ? (zzbeo) iInterfaceQueryLocalInterface : new zzbem(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbemVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final zzbet zzj() throws RemoteException {
        zzbet zzberVar;
        Parcel parcelZzbg = zzbg(29, zza());
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzberVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzberVar = iInterfaceQueryLocalInterface instanceof zzbet ? (zzbet) iInterfaceQueryLocalInterface : new zzber(strongBinder);
        }
        parcelZzbg.recycle();
        return zzberVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final zzbew zzk() throws RemoteException {
        zzbew zzbeuVar;
        Parcel parcelZzbg = zzbg(5, zza());
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbeuVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbeuVar = iInterfaceQueryLocalInterface instanceof zzbew ? (zzbew) iInterfaceQueryLocalInterface : new zzbeu(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbeuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final IObjectWrapper zzl() throws RemoteException {
        Parcel parcelZzbg = zzbg(19, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final IObjectWrapper zzm() throws RemoteException {
        Parcel parcelZzbg = zzbg(18, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final String zzn() throws RemoteException {
        Parcel parcelZzbg = zzbg(7, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final String zzo() throws RemoteException {
        Parcel parcelZzbg = zzbg(4, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final String zzp() throws RemoteException {
        Parcel parcelZzbg = zzbg(6, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final String zzq() throws RemoteException {
        Parcel parcelZzbg = zzbg(2, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final String zzr() throws RemoteException {
        Parcel parcelZzbg = zzbg(12, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final String zzs() throws RemoteException {
        Parcel parcelZzbg = zzbg(10, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final String zzt() throws RemoteException {
        Parcel parcelZzbg = zzbg(9, zza());
        String string = parcelZzbg.readString();
        parcelZzbg.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final List zzu() throws RemoteException {
        Parcel parcelZzbg = zzbg(3, zza());
        ArrayList arrayListZzb = zzatx.zzb(parcelZzbg);
        parcelZzbg.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final List zzv() throws RemoteException {
        Parcel parcelZzbg = zzbg(23, zza());
        ArrayList arrayListZzb = zzatx.zzb(parcelZzbg);
        parcelZzbg.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzw() throws RemoteException {
        zzbh(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzx() throws RemoteException {
        zzbh(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzy(com.google.android.gms.ads.internal.client.zzcw zzcwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, zzcwVar);
        zzbh(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgt
    public final void zzz(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzd(parcelZza, bundle);
        zzbh(15, parcelZza);
    }
}
