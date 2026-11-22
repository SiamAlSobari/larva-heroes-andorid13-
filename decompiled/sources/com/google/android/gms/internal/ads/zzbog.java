package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbog extends zzatv implements zzboi {
    zzbog(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzA(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbol zzbolVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        zzatx.zzf(parcelZza, zzbolVar);
        zzbh(28, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzB(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzC(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbol zzbolVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        zzatx.zzf(parcelZza, zzbolVar);
        zzbh(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzbh(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzE() throws RemoteException {
        zzbh(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzF() throws RemoteException {
        zzbh(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzG(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzatx.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzbh(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzbh(39, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzI() throws RemoteException {
        zzbh(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzbh(37, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzbh(30, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzL() throws RemoteException {
        zzbh(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final boolean zzM() throws RemoteException {
        Parcel parcelZzbg = zzbg(22, zza());
        boolean zZzg = zzatx.zzg(parcelZzbg);
        parcelZzbg.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final boolean zzN() throws RemoteException {
        Parcel parcelZzbg = zzbg(13, zza());
        boolean zZzg = zzatx.zzg(parcelZzbg);
        parcelZzbg.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final zzboq zzO() throws RemoteException {
        zzboq zzboqVar;
        Parcel parcelZzbg = zzbg(15, zza());
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzboqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzboqVar = iInterfaceQueryLocalInterface instanceof zzboq ? (zzboq) iInterfaceQueryLocalInterface : new zzboq(strongBinder);
        }
        parcelZzbg.recycle();
        return zzboqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final zzbor zzP() throws RemoteException {
        zzbor zzborVar;
        Parcel parcelZzbg = zzbg(16, zza());
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzborVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzborVar = iInterfaceQueryLocalInterface instanceof zzbor ? (zzbor) iInterfaceQueryLocalInterface : new zzbor(strongBinder);
        }
        parcelZzbg.recycle();
        return zzborVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final Bundle zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        Parcel parcelZzbg = zzbg(26, zza());
        com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzdqVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final zzbfq zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final zzboo zzj() throws RemoteException {
        zzboo zzbomVar;
        Parcel parcelZzbg = zzbg(36, zza());
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbomVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbomVar = iInterfaceQueryLocalInterface instanceof zzboo ? (zzboo) iInterfaceQueryLocalInterface : new zzbom(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbomVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final zzbou zzk() throws RemoteException {
        zzbou zzbosVar;
        Parcel parcelZzbg = zzbg(27, zza());
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbosVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbosVar = iInterfaceQueryLocalInterface instanceof zzbou ? (zzbou) iInterfaceQueryLocalInterface : new zzbos(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbosVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final zzbqq zzl() throws RemoteException {
        Parcel parcelZzbg = zzbg(33, zza());
        zzbqq zzbqqVar = (zzbqq) zzatx.zza(parcelZzbg, zzbqq.CREATOR);
        parcelZzbg.recycle();
        return zzbqqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final zzbqq zzm() throws RemoteException {
        Parcel parcelZzbg = zzbg(34, zza());
        zzbqq zzbqqVar = (zzbqq) zzatx.zza(parcelZzbg, zzbqq.CREATOR);
        parcelZzbg.recycle();
        return zzbqqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final IObjectWrapper zzn() throws RemoteException {
        Parcel parcelZzbg = zzbg(2, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzo() throws RemoteException {
        zzbh(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbvo zzbvoVar, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzd(parcelZza, zzlVar);
        parcelZza.writeString(null);
        zzatx.zzf(parcelZza, zzbvoVar);
        parcelZza.writeString(str2);
        zzbh(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzq(IObjectWrapper iObjectWrapper, zzbks zzbksVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzf(parcelZza, zzbksVar);
        parcelZza.writeTypedList(list);
        zzbh(31, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzr(IObjectWrapper iObjectWrapper, zzbvo zzbvoVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzf(parcelZza, zzbvoVar);
        parcelZza.writeStringList(list);
        zzbh(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzs(com.google.android.gms.ads.internal.client.zzl zzlVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        zzbh(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbol zzbolVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        zzatx.zzf(parcelZza, zzbolVar);
        zzbh(38, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbol zzbolVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbol zzbolVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzd(parcelZza, zzqVar);
        zzatx.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzatx.zzf(parcelZza, zzbolVar);
        zzbh(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbol zzbolVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzd(parcelZza, zzqVar);
        zzatx.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzatx.zzf(parcelZza, zzbolVar);
        zzbh(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbol zzbolVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbol zzbolVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzatx.zzf(parcelZza, zzbolVar);
        zzbh(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzboi
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbol zzbolVar, zzbek zzbekVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzatx.zzf(parcelZza, zzbolVar);
        zzatx.zzd(parcelZza, zzbekVar);
        parcelZza.writeStringList(list);
        zzbh(14, parcelZza);
    }
}
