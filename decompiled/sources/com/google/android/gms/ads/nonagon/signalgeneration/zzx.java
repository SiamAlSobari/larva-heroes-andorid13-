package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzfya;
import java.util.ArrayList;
import javax.annotation.Nonnull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzx implements zzfya {
    final /* synthetic */ zzbsr zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzaa zzc;

    zzx(zzaa zzaaVar, zzbsr zzbsrVar, boolean z) {
        this.zzc = zzaaVar;
        this.zza = zzbsrVar;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        try {
            this.zza.zze("Internal error: " + th.getMessage());
        } catch (RemoteException e) {
            zzcaa.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(@Nonnull Object obj) {
        ArrayList<Uri> arrayList = (ArrayList) obj;
        try {
            this.zza.zzf(arrayList);
            if (this.zzc.zzt || this.zzb) {
                for (Uri uri : arrayList) {
                    if (this.zzc.zzO(uri)) {
                        this.zzc.zzs.zzc(zzaa.zzW(uri, this.zzc.zzC, "1").toString(), null);
                    } else {
                        if (((Boolean) zzba.zzc().zzb(zzbbr.zzhp)).booleanValue()) {
                            this.zzc.zzs.zzc(uri.toString(), null);
                        }
                    }
                }
            }
        } catch (RemoteException e) {
            zzcaa.zzh("", e);
        }
    }
}
