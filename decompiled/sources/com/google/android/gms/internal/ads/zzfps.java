package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfps extends zzatv implements zzfpu {
    zzfps(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzfpu
    public final void zze(Bundle bundle, zzfpw zzfpwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzd(parcelZza, bundle);
        zzatx.zzf(parcelZza, zzfpwVar);
        zzbi(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfpu
    public final void zzf(String str, Bundle bundle, zzfpw zzfpwVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzatx.zzd(parcelZza, bundle);
        zzatx.zzf(parcelZza, zzfpwVar);
        zzbi(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfpu
    public final void zzg(Bundle bundle, zzfpw zzfpwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzatx.zzd(parcelZza, bundle);
        zzatx.zzf(parcelZza, zzfpwVar);
        zzbi(3, parcelZza);
    }
}
