package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzatx;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzde extends zzatv implements zzdg {
    zzde(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final void zze(zzs zzsVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzd(parcelZza, zzsVar);
        zzbh(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final boolean zzf() throws RemoteException {
        Parcel parcelZzbg = zzbg(2, zza());
        boolean zZzg = zzatx.zzg(parcelZzbg);
        parcelZzbg.recycle();
        return zZzg;
    }
}
