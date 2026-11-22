package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzatw;
import com.google.android.gms.internal.ads.zzatx;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbfg;
import com.google.android.gms.internal.ads.zzbjo;
import com.google.android.gms.internal.ads.zzbjp;
import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzboe;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzbrv;
import com.google.android.gms.internal.ads.zzbsc;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzbvw;
import com.google.android.gms.internal.ads.zzbyr;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzcd extends zzatw implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzatx.zza(parcel, zzq.CREATOR);
                String string = parcel.readString();
                zzbof zzbofVarZzf = zzboe.zzf(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                zzatx.zzc(parcel);
                zzbu zzbuVarZzd = zzd(iObjectWrapperAsInterface, zzqVar, string, zzbofVarZzf, i3);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzbuVarZzd);
                return true;
            case 2:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) zzatx.zza(parcel, zzq.CREATOR);
                String string2 = parcel.readString();
                zzbof zzbofVarZzf2 = zzboe.zzf(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                zzatx.zzc(parcel);
                zzbu zzbuVarZze = zze(iObjectWrapperAsInterface2, zzqVar2, string2, zzbofVarZzf2, i4);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzbuVarZze);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string3 = parcel.readString();
                zzbof zzbofVarZzf3 = zzboe.zzf(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                zzatx.zzc(parcel);
                zzbq zzbqVarZzb = zzb(iObjectWrapperAsInterface3, string3, zzbofVarZzf3, i5);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzbqVarZzb);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatx.zzc(parcel);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, null);
                return true;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatx.zzc(parcel);
                zzbfa zzbfaVarZzi = zzi(iObjectWrapperAsInterface4, iObjectWrapperAsInterface5);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzbfaVarZzi);
                return true;
            case 6:
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbof zzbofVarZzf4 = zzboe.zzf(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                zzatx.zzc(parcel);
                zzbvg zzbvgVarZzn = zzn(iObjectWrapperAsInterface6, zzbofVarZzf4, i6);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzbvgVarZzn);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatx.zzc(parcel);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, null);
                return true;
            case 8:
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatx.zzc(parcel);
                zzbsc zzbscVarZzm = zzm(iObjectWrapperAsInterface7);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzbscVarZzm);
                return true;
            case 9:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int i7 = parcel.readInt();
                zzatx.zzc(parcel);
                zzco zzcoVarZzg = zzg(iObjectWrapperAsInterface8, i7);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzcoVarZzg);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) zzatx.zza(parcel, zzq.CREATOR);
                String string4 = parcel.readString();
                int i8 = parcel.readInt();
                zzatx.zzc(parcel);
                zzbu zzbuVarZzf = zzf(iObjectWrapperAsInterface9, zzqVar3, string4, i8);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzbuVarZzf);
                return true;
            case 11:
                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatx.zzc(parcel);
                zzbfg zzbfgVarZzj = zzj(iObjectWrapperAsInterface10, iObjectWrapperAsInterface11, iObjectWrapperAsInterface12);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzbfgVarZzj);
                return true;
            case 12:
                IObjectWrapper iObjectWrapperAsInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string5 = parcel.readString();
                zzbof zzbofVarZzf5 = zzboe.zzf(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                zzatx.zzc(parcel);
                zzbvw zzbvwVarZzo = zzo(iObjectWrapperAsInterface13, string5, zzbofVarZzf5, i9);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzbvwVarZzo);
                return true;
            case 13:
                IObjectWrapper iObjectWrapperAsInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar4 = (zzq) zzatx.zza(parcel, zzq.CREATOR);
                String string6 = parcel.readString();
                zzbof zzbofVarZzf6 = zzboe.zzf(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                zzatx.zzc(parcel);
                zzbu zzbuVarZzc = zzc(iObjectWrapperAsInterface14, zzqVar4, string6, zzbofVarZzf6, i10);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzbuVarZzc);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperAsInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbof zzbofVarZzf7 = zzboe.zzf(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                zzatx.zzc(parcel);
                zzbyr zzbyrVarZzp = zzp(iObjectWrapperAsInterface15, zzbofVarZzf7, i11);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzbyrVarZzp);
                return true;
            case 15:
                IObjectWrapper iObjectWrapperAsInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbof zzbofVarZzf8 = zzboe.zzf(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                zzatx.zzc(parcel);
                zzbrv zzbrvVarZzl = zzl(iObjectWrapperAsInterface16, zzbofVarZzf8, i12);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzbrvVarZzl);
                return true;
            case 16:
                IObjectWrapper iObjectWrapperAsInterface17 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbof zzbofVarZzf9 = zzboe.zzf(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                zzbjp zzbjpVarZzc = zzbjo.zzc(parcel.readStrongBinder());
                zzatx.zzc(parcel);
                zzbjs zzbjsVarZzk = zzk(iObjectWrapperAsInterface17, zzbofVarZzf9, i13, zzbjpVarZzc);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzbjsVarZzk);
                return true;
            case 17:
                IObjectWrapper iObjectWrapperAsInterface18 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbof zzbofVarZzf10 = zzboe.zzf(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                zzatx.zzc(parcel);
                zzdj zzdjVarZzh = zzh(iObjectWrapperAsInterface18, zzbofVarZzf10, i14);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzdjVarZzh);
                return true;
            default:
                return false;
        }
    }
}
