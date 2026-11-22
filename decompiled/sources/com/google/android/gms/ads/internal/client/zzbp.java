package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzatw;
import com.google.android.gms.internal.ads.zzatx;
import com.google.android.gms.internal.ads.zzbek;
import com.google.android.gms.internal.ads.zzbft;
import com.google.android.gms.internal.ads.zzbfu;
import com.google.android.gms.internal.ads.zzbfw;
import com.google.android.gms.internal.ads.zzbfx;
import com.google.android.gms.internal.ads.zzbfz;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbgh;
import com.google.android.gms.internal.ads.zzbgj;
import com.google.android.gms.internal.ads.zzbgk;
import com.google.android.gms.internal.ads.zzbla;
import com.google.android.gms.internal.ads.zzbli;
import com.google.android.gms.internal.ads.zzblj;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzbp extends zzatw implements zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbh zzbfVar = null;
        zzcf zzcfVar = null;
        switch (i) {
            case 1:
                zzbn zzbnVarZze = zze();
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzbnVarZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbfVar = iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbf(strongBinder);
                }
                zzatx.zzc(parcel);
                zzl(zzbfVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbfu zzbfuVarZzb = zzbft.zzb(parcel.readStrongBinder());
                zzatx.zzc(parcel);
                zzf(zzbfuVarZzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbfx zzbfxVarZzb = zzbfw.zzb(parcel.readStrongBinder());
                zzatx.zzc(parcel);
                zzg(zzbfxVarZzb);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                zzbgd zzbgdVarZzb = zzbgc.zzb(parcel.readStrongBinder());
                zzbga zzbgaVarZzb = zzbfz.zzb(parcel.readStrongBinder());
                zzatx.zzc(parcel);
                zzh(string, zzbgdVarZzb, zzbgaVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbek zzbekVar = (zzbek) zzatx.zza(parcel, zzbek.CREATOR);
                zzatx.zzc(parcel);
                zzo(zzbekVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcfVar = iInterfaceQueryLocalInterface2 instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface2 : new zzcf(strongBinder2);
                }
                zzatx.zzc(parcel);
                zzq(zzcfVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbgh zzbghVarZzb = zzbgg.zzb(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzatx.zza(parcel, zzq.CREATOR);
                zzatx.zzc(parcel);
                zzj(zzbghVarZzb, zzqVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) zzatx.zza(parcel, PublisherAdViewOptions.CREATOR);
                zzatx.zzc(parcel);
                zzp(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbgk zzbgkVarZzb = zzbgj.zzb(parcel.readStrongBinder());
                zzatx.zzc(parcel);
                zzk(zzbgkVarZzb);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbla zzblaVar = (zzbla) zzatx.zza(parcel, zzbla.CREATOR);
                zzatx.zzc(parcel);
                zzn(zzblaVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzblj zzbljVarZzb = zzbli.zzb(parcel.readStrongBinder());
                zzatx.zzc(parcel);
                zzi(zzbljVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) zzatx.zza(parcel, AdManagerAdViewOptions.CREATOR);
                zzatx.zzc(parcel);
                zzm(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
