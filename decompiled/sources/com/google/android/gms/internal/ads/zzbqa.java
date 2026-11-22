package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbqa extends zzatv implements zzbqc {
    zzbqa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final com.google.android.gms.ads.internal.client.zzdq zze() throws RemoteException {
        Parcel parcelZzbg = zzbg(5, zza());
        com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcelZzbg.readStrongBinder());
        parcelZzbg.recycle();
        return zzdqVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final zzbqq zzf() throws RemoteException {
        Parcel parcelZzbg = zzbg(2, zza());
        zzbqq zzbqqVar = (zzbqq) zzatx.zza(parcelZzbg, zzbqq.CREATOR);
        parcelZzbg.recycle();
        return zzbqqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final zzbqq zzg() throws RemoteException {
        Parcel parcelZzbg = zzbg(3, zza());
        zzbqq zzbqqVar = (zzbqq) zzatx.zza(parcelZzbg, zzbqq.CREATOR);
        parcelZzbg.recycle();
        return zzbqqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzq zzqVar, zzbqf zzbqfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzatx.zzd(parcelZza, bundle);
        zzatx.zzd(parcelZza, bundle2);
        zzatx.zzd(parcelZza, zzqVar);
        zzatx.zzf(parcelZza, zzbqfVar);
        zzbh(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpn zzbpnVar, zzbol zzbolVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzatx.zzd(parcelZza, zzlVar);
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzf(parcelZza, zzbpnVar);
        zzatx.zzf(parcelZza, zzbolVar);
        zzbh(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpq zzbpqVar, zzbol zzbolVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzatx.zzd(parcelZza, zzlVar);
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzf(parcelZza, zzbpqVar);
        zzatx.zzf(parcelZza, zzbolVar);
        zzatx.zzd(parcelZza, zzqVar);
        zzbh(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpq zzbpqVar, zzbol zzbolVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzatx.zzd(parcelZza, zzlVar);
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzf(parcelZza, zzbpqVar);
        zzatx.zzf(parcelZza, zzbolVar);
        zzatx.zzd(parcelZza, zzqVar);
        zzbh(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpt zzbptVar, zzbol zzbolVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzatx.zzd(parcelZza, zzlVar);
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzf(parcelZza, zzbptVar);
        zzatx.zzf(parcelZza, zzbolVar);
        zzbh(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpw zzbpwVar, zzbol zzbolVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzatx.zzd(parcelZza, zzlVar);
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzf(parcelZza, zzbpwVar);
        zzatx.zzf(parcelZza, zzbolVar);
        zzbh(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpw zzbpwVar, zzbol zzbolVar, zzbek zzbekVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzatx.zzd(parcelZza, zzlVar);
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzf(parcelZza, zzbpwVar);
        zzatx.zzf(parcelZza, zzbolVar);
        zzatx.zzd(parcelZza, zzbekVar);
        zzbh(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpz zzbpzVar, zzbol zzbolVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzatx.zzd(parcelZza, zzlVar);
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzf(parcelZza, zzbpzVar);
        zzatx.zzf(parcelZza, zzbolVar);
        zzbh(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpz zzbpzVar, zzbol zzbolVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzatx.zzd(parcelZza, zzlVar);
        zzatx.zzf(parcelZza, iObjectWrapper);
        zzatx.zzf(parcelZza, zzbpzVar);
        zzatx.zzf(parcelZza, zzbolVar);
        zzbh(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final void zzq(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbh(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzbg = zzbg(24, parcelZza);
        boolean zZzg = zzatx.zzg(parcelZzbg);
        parcelZzbg.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzbg = zzbg(15, parcelZza);
        boolean zZzg = zzatx.zzg(parcelZzbg);
        parcelZzbg.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbqc
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzbg = zzbg(17, parcelZza);
        boolean zZzg = zzatx.zzg(parcelZzbg);
        parcelZzbg.recycle();
        return zZzg;
    }
}
