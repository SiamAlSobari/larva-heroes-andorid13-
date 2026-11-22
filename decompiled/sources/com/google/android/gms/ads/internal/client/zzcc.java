package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzatx;
import com.google.android.gms.internal.ads.zzbez;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbff;
import com.google.android.gms.internal.ads.zzbfg;
import com.google.android.gms.internal.ads.zzbjp;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzbru;
import com.google.android.gms.internal.ads.zzbrv;
import com.google.android.gms.internal.ads.zzbsb;
import com.google.android.gms.internal.ads.zzbsc;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzbvv;
import com.google.android.gms.internal.ads.zzbvw;
import com.google.android.gms.internal.ads.zzbyq;
import com.google.android.gms.internal.ads.zzbyr;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcc extends zzatv implements zzce {
    zzcc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(IObjectWrapper iObjectWrapper, String str, zzbof zzbofVar, int i) throws RemoteException {
        zzbq zzboVar;
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzatx.zzf(parcelZza, zzbofVar);
        parcelZza.writeInt(233012000);
        Parcel parcelZzbg = zzbg(3, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzboVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzboVar = iInterfaceQueryLocalInterface instanceof zzbq ? (zzbq) iInterfaceQueryLocalInterface : new zzbo(strongBinder);
        }
        parcelZzbg.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbof zzbofVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzd(parcelZza, zzqVar);
        parcelZza.writeString(str);
        zzatx.zzf(parcelZza, zzbofVar);
        parcelZza.writeInt(233012000);
        Parcel parcelZzbg = zzbg(13, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbof zzbofVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzd(parcelZza, zzqVar);
        parcelZza.writeString(str);
        zzatx.zzf(parcelZza, zzbofVar);
        parcelZza.writeInt(233012000);
        Parcel parcelZzbg = zzbg(1, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbof zzbofVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzd(parcelZza, zzqVar);
        parcelZza.writeString(str);
        zzatx.zzf(parcelZza, zzbofVar);
        parcelZza.writeInt(233012000);
        Parcel parcelZzbg = zzbg(2, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzd(parcelZza, zzqVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(233012000);
        Parcel parcelZzbg = zzbg(10, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelZzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzco zzcmVar;
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeInt(233012000);
        Parcel parcelZzbg = zzbg(9, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzcmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzcmVar = iInterfaceQueryLocalInterface instanceof zzco ? (zzco) iInterfaceQueryLocalInterface : new zzcm(strongBinder);
        }
        parcelZzbg.recycle();
        return zzcmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(IObjectWrapper iObjectWrapper, zzbof zzbofVar, int i) throws RemoteException {
        zzdj zzdhVar;
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzf(parcelZza, zzbofVar);
        parcelZza.writeInt(233012000);
        Parcel parcelZzbg = zzbg(17, parcelZza);
        IBinder strongBinder = parcelZzbg.readStrongBinder();
        if (strongBinder == null) {
            zzdhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdhVar = iInterfaceQueryLocalInterface instanceof zzdj ? (zzdj) iInterfaceQueryLocalInterface : new zzdh(strongBinder);
        }
        parcelZzbg.recycle();
        return zzdhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbfa zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzf(parcelZza, iObjectWrapper2);
        Parcel parcelZzbg = zzbg(5, parcelZza);
        zzbfa zzbfaVarZzbE = zzbez.zzbE(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbfaVarZzbE;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbfg zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzf(parcelZza, iObjectWrapper2);
        zzatx.zzf(parcelZza, iObjectWrapper3);
        Parcel parcelZzbg = zzbg(11, parcelZza);
        zzbfg zzbfgVarZze = zzbff.zze(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbfgVarZze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbjs zzk(IObjectWrapper iObjectWrapper, zzbof zzbofVar, int i, zzbjp zzbjpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzf(parcelZza, zzbofVar);
        parcelZza.writeInt(233012000);
        zzatx.zzf(parcelZza, zzbjpVar);
        Parcel parcelZzbg = zzbg(16, parcelZza);
        zzbjs zzbjsVarZzb = zzbjr.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbjsVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbrv zzl(IObjectWrapper iObjectWrapper, zzbof zzbofVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzf(parcelZza, zzbofVar);
        parcelZza.writeInt(233012000);
        Parcel parcelZzbg = zzbg(15, parcelZza);
        zzbrv zzbrvVarZzb = zzbru.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbrvVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbsc zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzbg = zzbg(8, parcelZza);
        zzbsc zzbscVarZzH = zzbsb.zzH(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbscVarZzH;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbvg zzn(IObjectWrapper iObjectWrapper, zzbof zzbofVar, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbvw zzo(IObjectWrapper iObjectWrapper, String str, zzbof zzbofVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzatx.zzf(parcelZza, zzbofVar);
        parcelZza.writeInt(233012000);
        Parcel parcelZzbg = zzbg(12, parcelZza);
        zzbvw zzbvwVarZzq = zzbvv.zzq(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbvwVarZzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbyr zzp(IObjectWrapper iObjectWrapper, zzbof zzbofVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzf(parcelZza, zzbofVar);
        parcelZza.writeInt(233012000);
        Parcel parcelZzbg = zzbg(14, parcelZza);
        zzbyr zzbyrVarZzb = zzbyq.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzbyrVarZzb;
    }
}
