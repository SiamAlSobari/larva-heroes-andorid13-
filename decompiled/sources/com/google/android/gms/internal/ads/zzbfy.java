package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbfy extends zzatv implements zzbga {
    zzbfy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zze(zzbfq zzbfqVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzf(parcelZza, zzbfqVar);
        parcelZza.writeString(str);
        zzbh(1, parcelZza);
    }
}
